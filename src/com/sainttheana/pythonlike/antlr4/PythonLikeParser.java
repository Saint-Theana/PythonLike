// Generated from PythonLike.g4 by ANTLR 4.8

package com.sainttheana.pythonlike.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonLikeParser extends Parser {
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
		Reverse=45, Dot=46, AssignDecrese=47, AssignIncrese=48, SKIP_=49, UNKNOWN_CHAR=50, 
		INDENT=51, DEDENT=52;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_if_stmt = 2, RULE_ifBlock = 3, RULE_assign_stmt = 4, 
		RULE_while_stmt = 5, RULE_for_stmt = 6, RULE_foreach_stmt = 7, RULE_break_stmt = 8, 
		RULE_continue_stmt = 9, RULE_return_stmt = 10, RULE_expr_stmt = 11, RULE_function_stmt = 12, 
		RULE_selfcrease_stmt = 13, RULE_assigndecrese_stmt = 14, RULE_assignincrese_stmt = 15, 
		RULE_import_stmt = 16, RULE_arguments = 17, RULE_suite = 18, RULE_quoteExpr = 19, 
		RULE_assignable = 20, RULE_assign = 21, RULE_assignIncrease = 22, RULE_assignDecrease = 23, 
		RULE_expr = 24, RULE_sufix = 25, RULE_primaryExpr = 26, RULE_variableExpr = 27, 
		RULE_newobject = 28, RULE_array = 29, RULE_element = 30, RULE_selfIncrease = 31, 
		RULE_selfDecrease = 32, RULE_member = 33, RULE_argument = 34, RULE_arrayaccess = 35, 
		RULE_classpath = 36, RULE_values = 37, RULE_md = 38, RULE_as = 39, RULE_cp = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "if_stmt", "ifBlock", "assign_stmt", "while_stmt", 
			"for_stmt", "foreach_stmt", "break_stmt", "continue_stmt", "return_stmt", 
			"expr_stmt", "function_stmt", "selfcrease_stmt", "assigndecrese_stmt", 
			"assignincrese_stmt", "import_stmt", "arguments", "suite", "quoteExpr", 
			"assignable", "assign", "assignIncrease", "assignDecrease", "expr", "sufix", 
			"primaryExpr", "variableExpr", "newobject", "array", "element", "selfIncrease", 
			"selfDecrease", "member", "argument", "arrayaccess", "classpath", "values", 
			"md", "as", "cp"
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
			"AND", "Reverse", "Dot", "AssignDecrese", "AssignIncrese", "SKIP_", "UNKNOWN_CHAR", 
			"INDENT", "DEDENT"
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

	@Override
	public String getGrammarFileName() { return "PythonLike.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonLikeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonLikeParser.EOF, 0); }
		public List<Function_stmtContext> function_stmt() {
			return getRuleContexts(Function_stmtContext.class);
		}
		public Function_stmtContext function_stmt(int i) {
			return getRuleContext(Function_stmtContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonLikeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonLikeParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Def || _la==NEWLINE) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Def:
					{
					setState(82);
					function_stmt();
					}
					break;
				case NEWLINE:
					{
					setState(83);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Foreach_stmtContext foreach_stmt() {
			return getRuleContext(Foreach_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Function_stmtContext function_stmt() {
			return getRuleContext(Function_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Selfcrease_stmtContext selfcrease_stmt() {
			return getRuleContext(Selfcrease_stmtContext.class,0);
		}
		public Assignincrese_stmtContext assignincrese_stmt() {
			return getRuleContext(Assignincrese_stmtContext.class,0);
		}
		public Assigndecrese_stmtContext assigndecrese_stmt() {
			return getRuleContext(Assigndecrese_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				assign_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				foreach_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				break_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				function_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				continue_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				return_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				expr_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(101);
				selfcrease_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(102);
				assignincrese_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(103);
				assigndecrese_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(104);
				import_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PythonLikeParser.If, 0); }
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<TerminalNode> Elif() { return getTokens(PythonLikeParser.Elif); }
		public TerminalNode Elif(int i) {
			return getToken(PythonLikeParser.Elif, i);
		}
		public TerminalNode Else() { return getToken(PythonLikeParser.Else, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_stmt);
		try {
			int _alt;
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(If);
				setState(108);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(If);
				setState(110);
				ifBlock();
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(111);
						match(Elif);
						setState(112);
						ifBlock();
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(118);
					match(Else);
					setState(119);
					suite();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public QuoteExprContext quoteExpr() {
			return getRuleContext(QuoteExprContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			quoteExpr();
			setState(125);
			match(T__0);
			setState(126);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonLikeParser.NEWLINE, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			assign();
			setState(129);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PythonLikeParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(While);
			setState(132);
			expr(0);
			setState(133);
			match(T__0);
			setState(134);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PythonLikeParser.For, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonLikeParser.OPEN_PAREN, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonLikeParser.CLOSE_PAREN, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(For);
			setState(137);
			match(OPEN_PAREN);
			setState(138);
			assign();
			setState(139);
			match(T__1);
			setState(140);
			expr(0);
			setState(141);
			match(T__1);
			setState(142);
			assignable();
			setState(143);
			match(CLOSE_PAREN);
			setState(144);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_stmtContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PythonLikeParser.For, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonLikeParser.OPEN_PAREN, 0); }
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonLikeParser.CLOSE_PAREN, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitForeach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_foreach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(For);
			setState(147);
			match(OPEN_PAREN);
			setState(148);
			match(NAME);
			setState(149);
			match(T__0);
			setState(150);
			expr(0);
			setState(151);
			match(CLOSE_PAREN);
			setState(152);
			match(T__0);
			setState(153);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(PythonLikeParser.Break, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonLikeParser.NEWLINE, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Break);
			setState(156);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PythonLikeParser.Continue, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonLikeParser.NEWLINE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Continue);
			setState(159);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PythonLikeParser.Return, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonLikeParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Return);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << NullPoint) | (1L << New) | (1L << STRING) | (1L << NUMBER) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << Reverse))) != 0)) {
				{
				setState(162);
				expr(0);
				}
			}

			setState(165);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonLikeParser.NEWLINE, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expr(0);
			setState(168);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_stmtContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(PythonLikeParser.Def, 0); }
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonLikeParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonLikeParser.CLOSE_PAREN, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitFunction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_stmtContext function_stmt() throws RecognitionException {
		Function_stmtContext _localctx = new Function_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Def);
			setState(171);
			match(NAME);
			setState(172);
			match(OPEN_PAREN);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(173);
				arguments();
				}
			}

			setState(176);
			match(CLOSE_PAREN);
			setState(177);
			match(T__0);
			setState(178);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selfcrease_stmtContext extends ParserRuleContext {
		public SelfDecreaseContext selfDecrease() {
			return getRuleContext(SelfDecreaseContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonLikeParser.NEWLINE, 0); }
		public SelfIncreaseContext selfIncrease() {
			return getRuleContext(SelfIncreaseContext.class,0);
		}
		public Selfcrease_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfcrease_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitSelfcrease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selfcrease_stmtContext selfcrease_stmt() throws RecognitionException {
		Selfcrease_stmtContext _localctx = new Selfcrease_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selfcrease_stmt);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				selfDecrease();
				setState(181);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				selfIncrease();
				setState(184);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assigndecrese_stmtContext extends ParserRuleContext {
		public AssignDecreaseContext assignDecrease() {
			return getRuleContext(AssignDecreaseContext.class,0);
		}
		public Assigndecrese_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigndecrese_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitAssigndecrese_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assigndecrese_stmtContext assigndecrese_stmt() throws RecognitionException {
		Assigndecrese_stmtContext _localctx = new Assigndecrese_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assigndecrese_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			assignDecrease();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignincrese_stmtContext extends ParserRuleContext {
		public AssignIncreaseContext assignIncrease() {
			return getRuleContext(AssignIncreaseContext.class,0);
		}
		public Assignincrese_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignincrese_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitAssignincrese_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignincrese_stmtContext assignincrese_stmt() throws RecognitionException {
		Assignincrese_stmtContext _localctx = new Assignincrese_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignincrese_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			assignIncrease();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(PythonLikeParser.Import, 0); }
		public ClasspathContext classpath() {
			return getRuleContext(ClasspathContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonLikeParser.NEWLINE, 0); }
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_import_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Import);
			setState(193);
			classpath();
			setState(194);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonLikeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonLikeParser.NAME, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(NAME);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(197);
				match(T__2);
				setState(198);
				match(NAME);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuiteContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonLikeParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonLikeParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonLikeParser.DEDENT, 0); }
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_suite);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case NullPoint:
			case If:
			case While:
			case For:
			case Break:
			case Continue:
			case Return:
			case Import:
			case New:
			case Def:
			case STRING:
			case NUMBER:
			case NAME:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case Reverse:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(NEWLINE);
				setState(206);
				match(INDENT);
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					stmt();
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << NullPoint) | (1L << If) | (1L << While) | (1L << For) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << Import) | (1L << New) | (1L << Def) | (1L << STRING) | (1L << NUMBER) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << Reverse))) != 0) );
				setState(212);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuoteExprContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonLikeParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonLikeParser.CLOSE_PAREN, 0); }
		public QuoteExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoteExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitQuoteExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuoteExprContext quoteExpr() throws RecognitionException {
		QuoteExprContext _localctx = new QuoteExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_quoteExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(OPEN_PAREN);
			setState(217);
			expr(0);
			setState(218);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignableContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public SelfIncreaseContext selfIncrease() {
			return getRuleContext(SelfIncreaseContext.class,0);
		}
		public SelfDecreaseContext selfDecrease() {
			return getRuleContext(SelfDecreaseContext.class,0);
		}
		public AssignDecreaseContext assignDecrease() {
			return getRuleContext(AssignDecreaseContext.class,0);
		}
		public AssignIncreaseContext assignIncrease() {
			return getRuleContext(AssignIncreaseContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignable);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				selfIncrease();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				selfDecrease();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				assignDecrease();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				assignIncrease();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(NAME);
			setState(228);
			match(T__3);
			setState(229);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignIncreaseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public TerminalNode AssignIncrese() { return getToken(PythonLikeParser.AssignIncrese, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignIncreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignIncrease; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitAssignIncrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignIncreaseContext assignIncrease() throws RecognitionException {
		AssignIncreaseContext _localctx = new AssignIncreaseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignIncrease);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(NAME);
			setState(232);
			match(AssignIncrese);
			setState(233);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignDecreaseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public TerminalNode AssignDecrese() { return getToken(PythonLikeParser.AssignDecrese, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignDecreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignDecrease; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitAssignDecrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignDecreaseContext assignDecrease() throws RecognitionException {
		AssignDecreaseContext _localctx = new AssignDecreaseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignDecrease);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(NAME);
			setState(236);
			match(AssignDecrese);
			setState(237);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonLikeParser.OPEN_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonLikeParser.CLOSE_PAREN, 0); }
		public TerminalNode Reverse() { return getToken(PythonLikeParser.Reverse, 0); }
		public MdContext md() {
			return getRuleContext(MdContext.class,0);
		}
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public CpContext cp() {
			return getRuleContext(CpContext.class,0);
		}
		public TerminalNode AND() { return getToken(PythonLikeParser.AND, 0); }
		public TerminalNode OR() { return getToken(PythonLikeParser.OR, 0); }
		public SufixContext sufix() {
			return getRuleContext(SufixContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case NullPoint:
			case New:
			case STRING:
			case NUMBER:
			case NAME:
			case OPEN_BRACK:
				{
				setState(240);
				primaryExpr();
				}
				break;
			case OPEN_PAREN:
				{
				setState(241);
				match(OPEN_PAREN);
				setState(242);
				expr(0);
				setState(243);
				match(CLOSE_PAREN);
				}
				break;
			case Reverse:
				{
				setState(245);
				match(Reverse);
				setState(246);
				expr(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(250);
						md();
						setState(251);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(254);
						as();
						setState(255);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(258);
						cp();
						setState(259);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(262);
						match(AND);
						setState(263);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(265);
						match(OR);
						setState(266);
						expr(2);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(268);
						sufix();
						}
						break;
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SufixContext extends ParserRuleContext {
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public SufixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sufix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitSufix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SufixContext sufix() throws RecognitionException {
		SufixContext _localctx = new SufixContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sufix);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				arrayaccess();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				member();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				argument();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public NewobjectContext newobject() {
			return getRuleContext(NewobjectContext.class,0);
		}
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primaryExpr);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				newobject();
				}
				break;
			case Boolean:
			case NullPoint:
			case STRING:
			case NUMBER:
			case NAME:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				variableExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableExprContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(PythonLikeParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(PythonLikeParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode Boolean() { return getToken(PythonLikeParser.Boolean, 0); }
		public TerminalNode NullPoint() { return getToken(PythonLikeParser.NullPoint, 0); }
		public VariableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExprContext variableExpr() throws RecognitionException {
		VariableExprContext _localctx = new VariableExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableExpr);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(NAME);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(STRING);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				array();
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(Boolean);
				}
				break;
			case NullPoint:
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
				match(NullPoint);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewobjectContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PythonLikeParser.New, 0); }
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonLikeParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonLikeParser.CLOSE_PAREN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public NewobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newobject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitNewobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewobjectContext newobject() throws RecognitionException {
		NewobjectContext _localctx = new NewobjectContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_newobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(New);
			setState(292);
			match(NAME);
			setState(293);
			match(OPEN_PAREN);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << NullPoint) | (1L << New) | (1L << STRING) | (1L << NUMBER) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << Reverse))) != 0)) {
				{
				setState(294);
				values();
				}
			}

			setState(297);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(PythonLikeParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PythonLikeParser.CLOSE_BRACK, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(OPEN_BRACK);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << NullPoint) | (1L << New) | (1L << STRING) | (1L << NUMBER) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << Reverse))) != 0)) {
				{
				setState(300);
				element();
				}
			}

			setState(303);
			match(CLOSE_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			expr(0);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(306);
				match(T__2);
				setState(307);
				expr(0);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfIncreaseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public TerminalNode DoublePlus() { return getToken(PythonLikeParser.DoublePlus, 0); }
		public SelfIncreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfIncrease; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitSelfIncrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfIncreaseContext selfIncrease() throws RecognitionException {
		SelfIncreaseContext _localctx = new SelfIncreaseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selfIncrease);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(NAME);
			setState(314);
			match(DoublePlus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfDecreaseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public TerminalNode DoubleDecrease() { return getToken(PythonLikeParser.DoubleDecrease, 0); }
		public SelfDecreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfDecrease; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitSelfDecrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfDecreaseContext selfDecrease() throws RecognitionException {
		SelfDecreaseContext _localctx = new SelfDecreaseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selfDecrease);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(NAME);
			setState(317);
			match(DoubleDecrease);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(PythonLikeParser.Dot, 0); }
		public TerminalNode NAME() { return getToken(PythonLikeParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonLikeParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonLikeParser.CLOSE_PAREN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(Dot);
			setState(320);
			match(NAME);
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(321);
				match(OPEN_PAREN);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << NullPoint) | (1L << New) | (1L << STRING) | (1L << NUMBER) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << Reverse))) != 0)) {
					{
					setState(322);
					values();
					}
				}

				setState(325);
				match(CLOSE_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonLikeParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonLikeParser.CLOSE_PAREN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(OPEN_PAREN);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << NullPoint) | (1L << New) | (1L << STRING) | (1L << NUMBER) | (1L << NAME) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << Reverse))) != 0)) {
				{
				setState(329);
				values();
				}
			}

			setState(332);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayaccessContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(PythonLikeParser.OPEN_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonLikeParser.CLOSE_BRACK, 0); }
		public ArrayaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayaccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitArrayaccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayaccessContext arrayaccess() throws RecognitionException {
		ArrayaccessContext _localctx = new ArrayaccessContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arrayaccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(OPEN_BRACK);
			setState(335);
			expr(0);
			setState(336);
			match(CLOSE_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasspathContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonLikeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonLikeParser.NAME, i);
		}
		public List<TerminalNode> Dot() { return getTokens(PythonLikeParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(PythonLikeParser.Dot, i);
		}
		public ClasspathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classpath; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitClasspath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasspathContext classpath() throws RecognitionException {
		ClasspathContext _localctx = new ClasspathContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classpath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(NAME);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(339);
				match(Dot);
				setState(340);
				match(NAME);
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			expr(0);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(347);
				match(T__2);
				setState(348);
				expr(0);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(PythonLikeParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(PythonLikeParser.DIV, 0); }
		public MdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MdContext md() throws RecognitionException {
		MdContext _localctx = new MdContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_md);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==MULTI || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PythonLikeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PythonLikeParser.SUB, 0); }
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitAs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_as);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CpContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PythonLikeParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PythonLikeParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(PythonLikeParser.LESSTHAN, 0); }
		public TerminalNode LESSEQUAL() { return getToken(PythonLikeParser.LESSEQUAL, 0); }
		public TerminalNode BIGGERTHAN() { return getToken(PythonLikeParser.BIGGERTHAN, 0); }
		public TerminalNode BIGEQUAL() { return getToken(PythonLikeParser.BIGEQUAL, 0); }
		public CpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonLikeVisitor ) return ((PythonLikeVisitor<? extends T>)visitor).visitCp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CpContext cp() throws RecognitionException {
		CpContext _localctx = new CpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LESSTHAN) | (1L << BIGGERTHAN) | (1L << LESSEQUAL) | (1L << BIGEQUAL) | (1L << NOTEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u016b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4t\n\4\f\4\16\4"+
		"w\13\4\3\4\3\4\5\4{\n\4\5\4}\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f\u00a6\n\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00ca\n\23\f\23\16\23\u00cd\13"+
		"\23\3\24\3\24\3\24\3\24\6\24\u00d3\n\24\r\24\16\24\u00d4\3\24\3\24\5\24"+
		"\u00d9\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00e4\n"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00fa\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0110\n\32\f\32\16\32\u0113\13\32\3\33\3\33\3\33\5\33"+
		"\u0118\n\33\3\34\3\34\5\34\u011c\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u0124\n\35\3\36\3\36\3\36\3\36\5\36\u012a\n\36\3\36\3\36\3\37\3\37"+
		"\5\37\u0130\n\37\3\37\3\37\3 \3 \3 \7 \u0137\n \f \16 \u013a\13 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0146\n#\3#\5#\u0149\n#\3$\3$\5$\u014d"+
		"\n$\3$\3$\3%\3%\3%\3%\3&\3&\3&\7&\u0158\n&\f&\16&\u015b\13&\3\'\3\'\3"+
		"\'\7\'\u0160\n\'\f\'\16\'\u0163\13\'\3(\3(\3)\3)\3*\3*\3*\2\3\62+\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"R\2\5\3\2#$\3\2!\"\3\2%*\2\u0175\2X\3\2\2\2\4k\3\2\2\2\6|\3\2\2\2\b~\3"+
		"\2\2\2\n\u0082\3\2\2\2\f\u0085\3\2\2\2\16\u008a\3\2\2\2\20\u0094\3\2\2"+
		"\2\22\u009d\3\2\2\2\24\u00a0\3\2\2\2\26\u00a3\3\2\2\2\30\u00a9\3\2\2\2"+
		"\32\u00ac\3\2\2\2\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00c0\3\2\2\2\"\u00c2"+
		"\3\2\2\2$\u00c6\3\2\2\2&\u00d8\3\2\2\2(\u00da\3\2\2\2*\u00e3\3\2\2\2,"+
		"\u00e5\3\2\2\2.\u00e9\3\2\2\2\60\u00ed\3\2\2\2\62\u00f9\3\2\2\2\64\u0117"+
		"\3\2\2\2\66\u011b\3\2\2\28\u0123\3\2\2\2:\u0125\3\2\2\2<\u012d\3\2\2\2"+
		">\u0133\3\2\2\2@\u013b\3\2\2\2B\u013e\3\2\2\2D\u0141\3\2\2\2F\u014a\3"+
		"\2\2\2H\u0150\3\2\2\2J\u0154\3\2\2\2L\u015c\3\2\2\2N\u0164\3\2\2\2P\u0166"+
		"\3\2\2\2R\u0168\3\2\2\2TW\5\32\16\2UW\7\27\2\2VT\3\2\2\2VU\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\2\2\3\\\3\3\2\2\2"+
		"]l\5\6\4\2^l\5\n\6\2_l\5\f\7\2`l\5\16\b\2al\5\20\t\2bl\5\22\n\2cl\5\32"+
		"\16\2dl\5\24\13\2el\5\26\f\2fl\5\30\r\2gl\5\34\17\2hl\5 \21\2il\5\36\20"+
		"\2jl\5\"\22\2k]\3\2\2\2k^\3\2\2\2k_\3\2\2\2k`\3\2\2\2ka\3\2\2\2kb\3\2"+
		"\2\2kc\3\2\2\2kd\3\2\2\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2"+
		"\2\2kj\3\2\2\2l\5\3\2\2\2mn\7\n\2\2n}\5\b\5\2op\7\n\2\2pu\5\b\5\2qr\7"+
		"\13\2\2rt\5\b\5\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vz\3\2\2\2wu"+
		"\3\2\2\2xy\7\t\2\2y{\5&\24\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|m\3\2\2\2|"+
		"o\3\2\2\2}\7\3\2\2\2~\177\5(\25\2\177\u0080\7\3\2\2\u0080\u0081\5&\24"+
		"\2\u0081\t\3\2\2\2\u0082\u0083\5,\27\2\u0083\u0084\7\27\2\2\u0084\13\3"+
		"\2\2\2\u0085\u0086\7\f\2\2\u0086\u0087\5\62\32\2\u0087\u0088\7\3\2\2\u0088"+
		"\u0089\5&\24\2\u0089\r\3\2\2\2\u008a\u008b\7\r\2\2\u008b\u008c\7\33\2"+
		"\2\u008c\u008d\5,\27\2\u008d\u008e\7\4\2\2\u008e\u008f\5\62\32\2\u008f"+
		"\u0090\7\4\2\2\u0090\u0091\5*\26\2\u0091\u0092\7\34\2\2\u0092\u0093\5"+
		"&\24\2\u0093\17\3\2\2\2\u0094\u0095\7\r\2\2\u0095\u0096\7\33\2\2\u0096"+
		"\u0097\7\30\2\2\u0097\u0098\7\3\2\2\u0098\u0099\5\62\32\2\u0099\u009a"+
		"\7\34\2\2\u009a\u009b\7\3\2\2\u009b\u009c\5&\24\2\u009c\21\3\2\2\2\u009d"+
		"\u009e\7\16\2\2\u009e\u009f\7\27\2\2\u009f\23\3\2\2\2\u00a0\u00a1\7\17"+
		"\2\2\u00a1\u00a2\7\27\2\2\u00a2\25\3\2\2\2\u00a3\u00a5\7\20\2\2\u00a4"+
		"\u00a6\5\62\32\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a8\7\27\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\5\62\32\2\u00aa"+
		"\u00ab\7\27\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\7\30"+
		"\2\2\u00ae\u00b0\7\33\2\2\u00af\u00b1\5$\23\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\34\2\2\u00b3\u00b4\7"+
		"\3\2\2\u00b4\u00b5\5&\24\2\u00b5\33\3\2\2\2\u00b6\u00b7\5B\"\2\u00b7\u00b8"+
		"\7\27\2\2\u00b8\u00bd\3\2\2\2\u00b9\u00ba\5@!\2\u00ba\u00bb\7\27\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\35\3\2\2"+
		"\2\u00be\u00bf\5\60\31\2\u00bf\37\3\2\2\2\u00c0\u00c1\5.\30\2\u00c1!\3"+
		"\2\2\2\u00c2\u00c3\7\21\2\2\u00c3\u00c4\5J&\2\u00c4\u00c5\7\27\2\2\u00c5"+
		"#\3\2\2\2\u00c6\u00cb\7\30\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00ca\7\30\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc%\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d9\5\4\3\2\u00cf"+
		"\u00d0\7\27\2\2\u00d0\u00d2\7\65\2\2\u00d1\u00d3\5\4\3\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\7\66\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00ce\3"+
		"\2\2\2\u00d8\u00cf\3\2\2\2\u00d9\'\3\2\2\2\u00da\u00db\7\33\2\2\u00db"+
		"\u00dc\5\62\32\2\u00dc\u00dd\7\34\2\2\u00dd)\3\2\2\2\u00de\u00e4\5,\27"+
		"\2\u00df\u00e4\5@!\2\u00e0\u00e4\5B\"\2\u00e1\u00e4\5\60\31\2\u00e2\u00e4"+
		"\5.\30\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4+\3\2\2\2\u00e5\u00e6\7\30\2\2"+
		"\u00e6\u00e7\7\6\2\2\u00e7\u00e8\5\62\32\2\u00e8-\3\2\2\2\u00e9\u00ea"+
		"\7\30\2\2\u00ea\u00eb\7\62\2\2\u00eb\u00ec\5\62\32\2\u00ec/\3\2\2\2\u00ed"+
		"\u00ee\7\30\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\5\62\32\2\u00f0\61\3"+
		"\2\2\2\u00f1\u00f2\b\32\1\2\u00f2\u00fa\5\66\34\2\u00f3\u00f4\7\33\2\2"+
		"\u00f4\u00f5\5\62\32\2\u00f5\u00f6\7\34\2\2\u00f6\u00fa\3\2\2\2\u00f7"+
		"\u00f8\7/\2\2\u00f8\u00fa\5\62\32\b\u00f9\u00f1\3\2\2\2\u00f9\u00f3\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0111\3\2\2\2\u00fb\u00fc\f\7\2\2\u00fc"+
		"\u00fd\5N(\2\u00fd\u00fe\5\62\32\b\u00fe\u0110\3\2\2\2\u00ff\u0100\f\6"+
		"\2\2\u0100\u0101\5P)\2\u0101\u0102\5\62\32\7\u0102\u0110\3\2\2\2\u0103"+
		"\u0104\f\5\2\2\u0104\u0105\5R*\2\u0105\u0106\5\62\32\6\u0106\u0110\3\2"+
		"\2\2\u0107\u0108\f\4\2\2\u0108\u0109\7.\2\2\u0109\u0110\5\62\32\5\u010a"+
		"\u010b\f\3\2\2\u010b\u010c\7+\2\2\u010c\u0110\5\62\32\4\u010d\u010e\f"+
		"\t\2\2\u010e\u0110\5\64\33\2\u010f\u00fb\3\2\2\2\u010f\u00ff\3\2\2\2\u010f"+
		"\u0103\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\63\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0118\5H%\2\u0115\u0118\5D#\2\u0116"+
		"\u0118\5F$\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2"+
		"\2\u0118\65\3\2\2\2\u0119\u011c\5:\36\2\u011a\u011c\58\35\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011a\3\2\2\2\u011c\67\3\2\2\2\u011d\u0124\7\30\2\2\u011e"+
		"\u0124\7\25\2\2\u011f\u0124\7\24\2\2\u0120\u0124\5<\37\2\u0121\u0124\7"+
		"\7\2\2\u0122\u0124\7\b\2\2\u0123\u011d\3\2\2\2\u0123\u011e\3\2\2\2\u0123"+
		"\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2"+
		"\2\2\u01249\3\2\2\2\u0125\u0126\7\22\2\2\u0126\u0127\7\30\2\2\u0127\u0129"+
		"\7\33\2\2\u0128\u012a\5L\'\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\7\34\2\2\u012c;\3\2\2\2\u012d\u012f\7\35\2"+
		"\2\u012e\u0130\5> \2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\7\36\2\2\u0132=\3\2\2\2\u0133\u0138\5\62\32\2\u0134"+
		"\u0135\7\5\2\2\u0135\u0137\5\62\32\2\u0136\u0134\3\2\2\2\u0137\u013a\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139?\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013b\u013c\7\30\2\2\u013c\u013d\7-\2\2\u013dA\3\2\2\2\u013e"+
		"\u013f\7\30\2\2\u013f\u0140\7,\2\2\u0140C\3\2\2\2\u0141\u0142\7\60\2\2"+
		"\u0142\u0148\7\30\2\2\u0143\u0145\7\33\2\2\u0144\u0146\5L\'\2\u0145\u0144"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\7\34\2\2"+
		"\u0148\u0143\3\2\2\2\u0148\u0149\3\2\2\2\u0149E\3\2\2\2\u014a\u014c\7"+
		"\33\2\2\u014b\u014d\5L\'\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\7\34\2\2\u014fG\3\2\2\2\u0150\u0151\7\35\2"+
		"\2\u0151\u0152\5\62\32\2\u0152\u0153\7\36\2\2\u0153I\3\2\2\2\u0154\u0159"+
		"\7\30\2\2\u0155\u0156\7\60\2\2\u0156\u0158\7\30\2\2\u0157\u0155\3\2\2"+
		"\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015aK"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0161\5\62\32\2\u015d\u015e\7\5\2\2"+
		"\u015e\u0160\5\62\32\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162M\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0165\t\2\2\2\u0165O\3\2\2\2\u0166\u0167\t\3\2\2\u0167Q\3\2\2\2\u0168"+
		"\u0169\t\4\2\2\u0169S\3\2\2\2\35VXkuz|\u00a5\u00b0\u00bc\u00cb\u00d4\u00d8"+
		"\u00e3\u00f9\u010f\u0111\u0117\u011b\u0123\u0129\u012f\u0138\u0145\u0148"+
		"\u014c\u0159\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}