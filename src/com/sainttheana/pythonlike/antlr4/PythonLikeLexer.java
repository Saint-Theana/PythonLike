// Generated from PythonLike.g4 by ANTLR 4.8

package com.sainttheana.pythonlike.antlr4;
import org.antlr.v4.runtime.misc.Interval;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonLikeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Boolean=5, NullPoint=6, Else=7, If=8, 
		Elif=9, While=10, For=11, Break=12, Continue=13, Return=14, Import=15, 
		New=16, Def=17, STRING=18, NUMBER=19, INTEGER=20, NEWLINE=21, NAME=22, 
		STRING_LITERAL=23, DECIMAL_INTEGER=24, OPEN_PAREN=25, CLOSE_PAREN=26, 
		OPEN_BRACK=27, CLOSE_BRACK=28, OPEN_BRACE=29, CLOSE_BRACE=30, ADD=31, 
		SUB=32, MULTI=33, DIV=34, EQUAL=35, LESSTHAN=36, BIGGERTHAN=37, LESSEQUAL=38, 
		BIGEQUAL=39, NOTEQUAL=40, OR=41, DoubleDecrease=42, DoublePlus=43, AND=44, 
		Reverse=45, Dot=46, AssignDecrese=47, AssignIncrese=48, SKIP_=49, UNKNOWN_CHAR=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Boolean", "NullPoint", "Else", "If", 
			"Elif", "While", "For", "Break", "Continue", "Return", "Import", "New", 
			"Def", "STRING", "NUMBER", "INTEGER", "NEWLINE", "NAME", "STRING_LITERAL", 
			"DECIMAL_INTEGER", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "ADD", "SUB", "MULTI", "DIV", "EQUAL", "LESSTHAN", 
			"BIGGERTHAN", "LESSEQUAL", "BIGEQUAL", "NOTEQUAL", "OR", "DoubleDecrease", 
			"DoublePlus", "AND", "Reverse", "Dot", "AssignDecrese", "AssignIncrese", 
			"SKIP_", "UNKNOWN_CHAR", "NON_ZERO_DIGIT", "DIGIT", "SPACES", "COMMENT", 
			"LINE_JOINING", "ID_START", "ID_CONTINUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "','", "'='", null, "'null'", "'else'", "'if'", "'elif'", 
			"'while'", "'for'", "'break'", "'continue'", "'return'", "'import'", 
			"'new'", "'def'", null, null, null, null, null, null, null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'=='", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'||'", "'--'", "'++'", "'&&'", "'!'", 
			"'.'", "'-='", "'+='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Boolean", "NullPoint", "Else", "If", "Elif", 
			"While", "For", "Break", "Continue", "Return", "Import", "New", "Def", 
			"STRING", "NUMBER", "INTEGER", "NEWLINE", "NAME", "STRING_LITERAL", "DECIMAL_INTEGER", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", 
			"CLOSE_BRACE", "ADD", "SUB", "MULTI", "DIV", "EQUAL", "LESSTHAN", "BIGGERTHAN", 
			"LESSEQUAL", "BIGEQUAL", "NOTEQUAL", "OR", "DoubleDecrease", "DoublePlus", 
			"AND", "Reverse", "Dot", "AssignDecrese", "AssignIncrese", "SKIP_", "UNKNOWN_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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


	public PythonLikeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonLike.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u015c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0087\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26\u00d1\n\26\3\26"+
		"\3\26\5\26\u00d5\n\26\3\26\5\26\u00d8\n\26\3\27\3\27\7\27\u00dc\n\27\f"+
		"\27\16\27\u00df\13\27\3\30\3\30\7\30\u00e3\n\30\f\30\16\30\u00e6\13\30"+
		"\3\30\3\30\3\31\3\31\7\31\u00ec\n\31\f\31\16\31\u00ef\13\31\3\31\6\31"+
		"\u00f2\n\31\r\31\16\31\u00f3\5\31\u00f6\n\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3"+
		",\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\5"+
		"\62\u0135\n\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u0140"+
		"\n\66\r\66\16\66\u0141\3\67\3\67\7\67\u0146\n\67\f\67\16\67\u0149\13\67"+
		"\38\38\58\u014d\n8\38\58\u0150\n8\38\38\58\u0154\n8\39\59\u0157\n9\3:"+
		"\3:\5:\u015b\n:\3\u00e4\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\2i\2k\2m\2o\2q\2s\2\3\2\7\3\2\63;\3\2\62;\4\2\13\13\"\"\4"+
		"\2\f\f\16\17\5\2C\\aac|\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3u\3\2\2\2"+
		"\5w\3\2\2\2\7y\3\2\2\2\t{\3\2\2\2\13\u0086\3\2\2\2\r\u0088\3\2\2\2\17"+
		"\u008d\3\2\2\2\21\u0092\3\2\2\2\23\u0095\3\2\2\2\25\u009a\3\2\2\2\27\u00a0"+
		"\3\2\2\2\31\u00a4\3\2\2\2\33\u00aa\3\2\2\2\35\u00b3\3\2\2\2\37\u00ba\3"+
		"\2\2\2!\u00c1\3\2\2\2#\u00c5\3\2\2\2%\u00c9\3\2\2\2\'\u00cb\3\2\2\2)\u00cd"+
		"\3\2\2\2+\u00d4\3\2\2\2-\u00d9\3\2\2\2/\u00e0\3\2\2\2\61\u00f5\3\2\2\2"+
		"\63\u00f7\3\2\2\2\65\u00f9\3\2\2\2\67\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff"+
		"\3\2\2\2=\u0101\3\2\2\2?\u0103\3\2\2\2A\u0105\3\2\2\2C\u0107\3\2\2\2E"+
		"\u0109\3\2\2\2G\u010b\3\2\2\2I\u010e\3\2\2\2K\u0110\3\2\2\2M\u0112\3\2"+
		"\2\2O\u0115\3\2\2\2Q\u0118\3\2\2\2S\u011b\3\2\2\2U\u011e\3\2\2\2W\u0121"+
		"\3\2\2\2Y\u0124\3\2\2\2[\u0127\3\2\2\2]\u0129\3\2\2\2_\u012b\3\2\2\2a"+
		"\u012e\3\2\2\2c\u0134\3\2\2\2e\u0138\3\2\2\2g\u013a\3\2\2\2i\u013c\3\2"+
		"\2\2k\u013f\3\2\2\2m\u0143\3\2\2\2o\u014a\3\2\2\2q\u0156\3\2\2\2s\u015a"+
		"\3\2\2\2uv\7<\2\2v\4\3\2\2\2wx\7=\2\2x\6\3\2\2\2yz\7.\2\2z\b\3\2\2\2{"+
		"|\7?\2\2|\n\3\2\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7w\2\2\u0080\u0087"+
		"\7g\2\2\u0081\u0082\7h\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0087\7g\2\2\u0086}\3\2\2\2\u0086\u0081\3\2\2\2\u0087"+
		"\f\3\2\2\2\u0088\u0089\7p\2\2\u0089\u008a\7w\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7n\2\2\u008c\16\3\2\2\2\u008d\u008e\7g\2\2\u008e\u008f\7n\2\2\u008f"+
		"\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091\20\3\2\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7h\2\2\u0094\22\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7k\2\2\u0098\u0099\7h\2\2\u0099\24\3\2\2\2\u009a\u009b\7y\2\2\u009b"+
		"\u009c\7j\2\2\u009c\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2"+
		"\u009f\26\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7"+
		"t\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7m\2\2\u00a9\32\3\2\2\2\u00aa\u00ab"+
		"\7e\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\34\3\2\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7"+
		"v\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7p\2\2\u00b9\36"+
		"\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7r\2\2\u00bd"+
		"\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7v\2\2\u00c0 \3\2\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7y\2\2\u00c4\"\3\2\2\2\u00c5"+
		"\u00c6\7f\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7h\2\2\u00c8$\3\2\2\2\u00c9"+
		"\u00ca\5/\30\2\u00ca&\3\2\2\2\u00cb\u00cc\5)\25\2\u00cc(\3\2\2\2\u00cd"+
		"\u00ce\5\61\31\2\u00ce*\3\2\2\2\u00cf\u00d1\7\17\2\2\u00d0\u00cf\3\2\2"+
		"\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\7\f\2\2\u00d3\u00d5"+
		"\4\16\17\2\u00d4\u00d0\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d7\3\2\2\2"+
		"\u00d6\u00d8\5k\66\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8,\3"+
		"\2\2\2\u00d9\u00dd\5q9\2\u00da\u00dc\5s:\2\u00db\u00da\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de.\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e4\7$\2\2\u00e1\u00e3\13\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8\60\3\2\2\2"+
		"\u00e9\u00ed\5g\64\2\u00ea\u00ec\5i\65\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f6\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f2\7\62\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00e9\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\7*\2\2"+
		"\u00f8\64\3\2\2\2\u00f9\u00fa\7+\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7]\2"+
		"\2\u00fc8\3\2\2\2\u00fd\u00fe\7_\2\2\u00fe:\3\2\2\2\u00ff\u0100\7}\2\2"+
		"\u0100<\3\2\2\2\u0101\u0102\7\177\2\2\u0102>\3\2\2\2\u0103\u0104\7-\2"+
		"\2\u0104@\3\2\2\2\u0105\u0106\7/\2\2\u0106B\3\2\2\2\u0107\u0108\7,\2\2"+
		"\u0108D\3\2\2\2\u0109\u010a\7\61\2\2\u010aF\3\2\2\2\u010b\u010c\7?\2\2"+
		"\u010c\u010d\7?\2\2\u010dH\3\2\2\2\u010e\u010f\7>\2\2\u010fJ\3\2\2\2\u0110"+
		"\u0111\7@\2\2\u0111L\3\2\2\2\u0112\u0113\7>\2\2\u0113\u0114\7?\2\2\u0114"+
		"N\3\2\2\2\u0115\u0116\7@\2\2\u0116\u0117\7?\2\2\u0117P\3\2\2\2\u0118\u0119"+
		"\7#\2\2\u0119\u011a\7?\2\2\u011aR\3\2\2\2\u011b\u011c\7~\2\2\u011c\u011d"+
		"\7~\2\2\u011dT\3\2\2\2\u011e\u011f\7/\2\2\u011f\u0120\7/\2\2\u0120V\3"+
		"\2\2\2\u0121\u0122\7-\2\2\u0122\u0123\7-\2\2\u0123X\3\2\2\2\u0124\u0125"+
		"\7(\2\2\u0125\u0126\7(\2\2\u0126Z\3\2\2\2\u0127\u0128\7#\2\2\u0128\\\3"+
		"\2\2\2\u0129\u012a\7\60\2\2\u012a^\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d"+
		"\7?\2\2\u012d`\3\2\2\2\u012e\u012f\7-\2\2\u012f\u0130\7?\2\2\u0130b\3"+
		"\2\2\2\u0131\u0135\5k\66\2\u0132\u0135\5m\67\2\u0133\u0135\5o8\2\u0134"+
		"\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\b\62\2\2\u0137d\3\2\2\2\u0138\u0139\13\2\2\2\u0139f\3"+
		"\2\2\2\u013a\u013b\t\2\2\2\u013bh\3\2\2\2\u013c\u013d\t\3\2\2\u013dj\3"+
		"\2\2\2\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142l\3\2\2\2\u0143\u0147\7%\2\2\u0144"+
		"\u0146\n\5\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148n\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c"+
		"\7^\2\2\u014b\u014d\5k\66\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u0153\3\2\2\2\u014e\u0150\7\17\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\7\f\2\2\u0152\u0154\4\16\17\2\u0153"+
		"\u014f\3\2\2\2\u0153\u0152\3\2\2\2\u0154p\3\2\2\2\u0155\u0157\t\6\2\2"+
		"\u0156\u0155\3\2\2\2\u0157r\3\2\2\2\u0158\u015b\5q9\2\u0159\u015b\t\3"+
		"\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015bt\3\2\2\2\24\2\u0086"+
		"\u00d0\u00d4\u00d7\u00dd\u00e4\u00ed\u00f3\u00f5\u0134\u0141\u0147\u014c"+
		"\u014f\u0153\u0156\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}