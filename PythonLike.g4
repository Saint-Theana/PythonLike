grammar PythonLike; 

tokens { INDENT, DEDENT }

@parser::header {
package com.sainttheana.pythonlike.antlr4;
}

@lexer::header {
package com.sainttheana.pythonlike.antlr4;
import org.antlr.v4.runtime.misc.Interval;
import java.util.*;
}


@lexer::members {
private Stack<Integer> indentLengths = new Stack<>();

private LinkedList<Token> pendingTokens = new LinkedList<>();

private int lastPendingTokenType;

private int opened = 0;

private boolean wasSpaceIndentation = false;

private boolean wasTabIndentation = false;

private List<String> warnings = new ArrayList<>();

private List<String> errors = new ArrayList<>();

public static final String TEXT_LEXER = "lexer --> ";
public static final String TEXT_INSERTED_INDENT = "inserted INDENT";

@Override
public Token nextToken() {
    if (_input.size() == 0) {
        return new CommonToken(EOF, "<EOF>"); 
    } else {
        checkNextToken();
        return this.pendingTokens.pollFirst(); 
    }
}

private void checkNextToken() {
    if (this.indentLengths != null) { 
        final int startSize = this.pendingTokens.size();
        Token curToken;
        do {
            curToken = super.nextToken(); 
            checkStartOfInput(curToken);
            switch (curToken.getType()) {
                case OPEN_PAREN:
                case OPEN_BRACK:
                case OPEN_BRACE:
                    this.opened++;
                    this.pendingTokens.addLast(curToken);
                    break;
                case CLOSE_PAREN:
                case CLOSE_BRACK:
                case CLOSE_BRACE:
                    this.opened--;
                    this.pendingTokens.addLast(curToken);
                    break;
                case NEWLINE:
                    handleNewLineToken(curToken);
                    break;
                case EOF:
                    handleEofToken(curToken); 
                    break;
                default:
                    this.pendingTokens.addLast(curToken); 
            }
        } while (this.pendingTokens.size() == startSize);
        this.lastPendingTokenType = curToken.getType();
    }
}

private void checkStartOfInput(Token curToken) {
    if (indentLengths.size() == 0) { 
        indentLengths.push(0);  
        if (_input.getText(new Interval(0, 0)).trim().length() == 0) { 
            this.insertLeadingTokens(curToken.getType(), curToken.getStartIndex());
        }
    }
}

private void handleNewLineToken(Token curToken) {
    if (this.opened == 0) { 
        switch (_input.LA(1) /* next symbol */) { 
            case '\r':
            case '\n':
            case '\f':
            case '#':   
            case EOF:   
                return; 
            default:
                this.pendingTokens.addLast(curToken); 
                this.insertIndentDedentTokens(this.getIndentationLength(curToken.getText())); 
        }
    }
}

private void handleEofToken(Token curToken) {
    this.insertTrailingTokens(this.lastPendingTokenType); 
    this.pendingTokens.addLast(curToken); 
    this.checkSpaceAndTabIndentation();
}

private void insertLeadingTokens(int type, int startIndex) {
    if (type != NEWLINE && type != EOF) { 
        this.insertToken(0, startIndex - 1, "<inserted leading NEWLINE>" + repeat(startIndex," "), NEWLINE, 1, 0);
        this.insertToken(startIndex, startIndex - 1, "<" + TEXT_INSERTED_INDENT + ", " + this.getIndentationDescription(startIndex) + ">", PythonLikeParser.INDENT, 1, startIndex);
        this.indentLengths.push(startIndex);
    }
}

private String repeat(int startIndex, String p1)
	{
		StringBuffer buf=new StringBuffer();
		for (int i=0;i < startIndex;i++)
		{
			buf.append(p1);
		}
		return buf.toString();
	}


private void insertIndentDedentTokens(int curIndentLength) {
    int prevIndentLength = this.indentLengths.peek();
    if (curIndentLength > prevIndentLength) { 
        this.insertToken("<" + TEXT_INSERTED_INDENT + ", " + this.getIndentationDescription(curIndentLength) + ">", PythonLikeParser.INDENT);
        this.indentLengths.push(curIndentLength);
    } else {
        while (curIndentLength < prevIndentLength) {   
            this.indentLengths.pop();
            prevIndentLength = this.indentLengths.peek();
            if (curIndentLength <= prevIndentLength) {
                this.insertToken("<inserted DEDENT, " + this.getIndentationDescription(prevIndentLength) + ">", PythonLikeParser.DEDENT);
            } else {
                this.insertToken("<inserted inconsistent DEDENT, " + "length=" + curIndentLength + ">", PythonLikeParser.DEDENT);
                this.errors.add(TEXT_LEXER + "line " + getLine() + ":" + getCharPositionInLine() + "\t IndentationError: unindent does not match any outer indentation level");
            }
        }
    }
}

private void insertTrailingTokens(int type) {
    if (type != NEWLINE && type != PythonLikeParser.DEDENT) { 
        this.insertToken("<inserted trailing NEWLINE>", NEWLINE); 
    }

    while (this.indentLengths.size() > 1) { 
        this.insertToken("<inserted trailing DEDENT, " + this.getIndentationDescription(this.indentLengths.pop()) + ">", PythonLikeParser.DEDENT);
    }
    this.indentLengths = null; 
}

private String getIndentationDescription(int lengthOfIndent) {
    return "length=" + lengthOfIndent + ", level=" + this.indentLengths.size();
}

private void insertToken(String text, int type) {
    final int startIndex = _tokenStartCharIndex + getText().length(); 
    this.insertToken(startIndex, startIndex - 1, text, type, getLine(), getCharPositionInLine());
}

private void insertToken(int startIndex, int stopIndex, String text, int type, int line, int charPositionInLine) {
    CommonToken token = new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, startIndex, stopIndex); 
    token.setText(text);
    token.setLine(line);
    token.setCharPositionInLine(charPositionInLine);
    this.pendingTokens.addLast(token);
}

private int getIndentationLength(String textOfMatchedNEWLINE) {
    int count = 0;
    for (char ch : textOfMatchedNEWLINE.toCharArray()) {
        switch (ch) {
            case ' ': 
                this.wasSpaceIndentation = true;
                count++;
                break;
            case '\t':
                this.wasTabIndentation = true;
                count += 8 - (count % 8);
                break;
        }
    }
    return count;
}

private void checkSpaceAndTabIndentation() {
    if (this.wasSpaceIndentation && this.wasTabIndentation) {
        this.warnings.add("Mixture of space and tab were used for indentation.");
    }
}

public List<String> getWarnings() {
    return this.warnings;
}

public List<String> getErrorMessages() {
    return this.errors;
}
}

//parser rule 
program
	: (function_stmt | NEWLINE)* EOF
	;



stmt:
    if_stmt
    |assign_stmt
    |while_stmt
    |for_stmt
    |foreach_stmt
    |break_stmt
    |function_stmt
    |continue_stmt
    |return_stmt
    |expr_stmt
    |selfcrease_stmt
    |assignincrese_stmt
    |assigndecrese_stmt
    |import_stmt
    ;


if_stmt
 : If ifBlock
 | If ifBlock (Elif ifBlock)* (Else suite)?
 ;
 
ifBlock
 : quoteExpr ':' suite
 ;

assign_stmt
 : assign NEWLINE
 ;
while_stmt
 : While expr ':' suite
 ;
for_stmt
	: For OPEN_PAREN assign ';' expr ';' assignable CLOSE_PAREN suite
	;
foreach_stmt
 : For OPEN_PAREN NAME ':' expr CLOSE_PAREN ':' suite
 ;
break_stmt
 : Break NEWLINE
 ;
continue_stmt
 : Continue NEWLINE
 ;
return_stmt
 : Return expr? NEWLINE
 ;
expr_stmt
 : expr NEWLINE
 ;
function_stmt
 : Def NAME OPEN_PAREN arguments? CLOSE_PAREN ':' suite
 ;
selfcrease_stmt
    : selfDecrease NEWLINE
    | selfIncrease NEWLINE
    ;
assigndecrese_stmt
    :assignDecrease
    ;

assignincrese_stmt
    :assignIncrease
    ;
import_stmt
    : Import classpath NEWLINE
    ;
arguments
 : NAME (',' NAME)*
 ;
suite: stmt | NEWLINE INDENT stmt+ DEDENT;

quoteExpr
	: OPEN_PAREN expr CLOSE_PAREN
	;
assignable
	: assign
	| selfIncrease
	| selfDecrease
	| assignDecrease
	| assignIncrease
	;
assign
    : NAME '=' expr 
    ;
assignIncrease
	: NAME AssignIncrese expr
    ;
assignDecrease
	: NAME AssignDecrese expr
	;
expr
 : primaryExpr
 | OPEN_PAREN expr CLOSE_PAREN
 | expr sufix
 | Reverse expr
 | expr md expr
 | expr as expr
 | expr cp expr
 | expr AND expr
 | expr OR expr
 ;

sufix
    : arrayaccess
    | member
    | argument
    ;

primaryExpr
 : newobject
 | variableExpr
 ;
variableExpr
 : NAME
 | NUMBER
 | STRING
 | array
 | Boolean
 | NullPoint
 ;
newobject
    : New NAME OPEN_PAREN values? CLOSE_PAREN
    ;

array
    : OPEN_BRACK element? CLOSE_BRACK
    ; 
element
    : expr (',' expr)*
    ;
selfIncrease
    : NAME DoublePlus
    ;
selfDecrease
    : NAME DoubleDecrease
    ;
member
    : Dot NAME (OPEN_PAREN values? CLOSE_PAREN)?
    ;
argument
    : OPEN_PAREN values? CLOSE_PAREN
    ;
arrayaccess
    : OPEN_BRACK expr CLOSE_BRACK
    ;
classpath
    : NAME (Dot NAME)*
    ;
values
    : expr (',' expr)*
    ;
Boolean
    : 'true'
    | 'false'
    ;
NullPoint
    : 'null'
    ;
Else : 'else';
If : 'if';
Elif : 'elif';
While: 'while';
For: 'for';
Break: 'break';
Continue: 'continue';
Return: 'return';
Import: 'import';
New: 'new';
Def: 'def';
md : (MULTI | DIV);
as : (ADD | SUB);
cp : (EQUAL | NOTEQUAL | LESSTHAN | LESSEQUAL | BIGGERTHAN | BIGEQUAL);

/*
 * lexer rules
 */

STRING
 : STRING_LITERAL
 ;

NUMBER
 : INTEGER
 ;

INTEGER
 : DECIMAL_INTEGER
 ;

NEWLINE
 : ( '\r'? '\n' | '\r' | '\f' ) SPACES?
 ;

NAME
 : ID_START ID_CONTINUE*
 ;

STRING_LITERAL
 : '"' .*? '"' 
 ;

DECIMAL_INTEGER
 : NON_ZERO_DIGIT DIGIT*
 | '0'+
 ;

OPEN_PAREN : '(';
CLOSE_PAREN : ')';
OPEN_BRACK : '[';
CLOSE_BRACK : ']';
OPEN_BRACE : '{';
CLOSE_BRACE : '}';
ADD : '+' ;
SUB : '-' ;
MULTI : '*' ;
DIV : '/' ;
EQUAL : '==' ;
LESSTHAN : '<' ;
BIGGERTHAN : '>' ;
LESSEQUAL : '<=' ;
BIGEQUAL : '>=' ;
NOTEQUAL : '!=' ;
OR : '||' ;
DoubleDecrease: '--';
DoublePlus: '++';
AND : '&&' ;
Reverse : '!' ;
Dot : '.' ;
AssignDecrese: '-=';
AssignIncrese: '+=';

SKIP_
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
 ;

UNKNOWN_CHAR
 : .
 ;


/* 
 * fragments 
 */

fragment NON_ZERO_DIGIT
 : [1-9]
 ;

fragment DIGIT
 : [0-9]
 ;

fragment SPACES
 : [ \t]+
 ;

fragment COMMENT
 : '#' ~[\r\n\f]*
 ;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f' )
 ;

fragment ID_START
 : '_'
 | [A-Z]
 | [a-z]
 ;

fragment ID_CONTINUE
 : ID_START
 | [0-9]
 ;

