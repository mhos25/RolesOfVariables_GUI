// Generated from JavaGrammar.g4 by ANTLR 4.7.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, MINUS=50, NUM=51, NEWLINE=52, 
		IDENTIFIER=53, WHITESPACE=54, STRING=55;
	public static final int
		RULE_program = 0, RULE_class_statement = 1, RULE_main_method = 2, RULE_statement = 3, 
		RULE_expression = 4, RULE_varDeclaration = 5, RULE_varDeclarationList = 6, 
		RULE_assignment = 7, RULE_println = 8, RULE_print = 9, RULE_branch = 10, 
		RULE_do_while = 11, RULE_while_statement = 12, RULE_block = 13, RULE_userInput = 14, 
		RULE_incrementation = 15, RULE_decrement = 16, RULE_forLoop = 17, RULE_forInitialization = 18, 
		RULE_forChange = 19, RULE_booleanVarDeclaration = 20, RULE_booleanVarAssignment = 21, 
		RULE_booleanValue = 22, RULE_inverseBoolean = 23, RULE_charArray = 24, 
		RULE_arrayAssignment = 25, RULE_arrayElement = 26, RULE_comparingArrayElements = 27, 
		RULE_comparingBooleanAndArrayElement = 28, RULE_printSyntax = 29;
	public static final String[] ruleNames = {
		"program", "class_statement", "main_method", "statement", "expression", 
		"varDeclaration", "varDeclarationList", "assignment", "println", "print", 
		"branch", "do_while", "while_statement", "block", "userInput", "incrementation", 
		"decrement", "forLoop", "forInitialization", "forChange", "booleanVarDeclaration", 
		"booleanVarAssignment", "booleanValue", "inverseBoolean", "charArray", 
		"arrayAssignment", "arrayElement", "comparingArrayElements", "comparingBooleanAndArrayElement", 
		"printSyntax"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'public'", "'class'", "'{'", "'}'", "'static'", "'void'", "'main'", 
		"'('", "'String'", "'[]'", "'args'", "')'", "';'", "'/'", "'*'", "'+'", 
		"'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'final'", "'int'", "'='", 
		"','", "'println('", "'print('", "'if'", "'else'", "'do'", "'while'", 
		"'UserInputReader.readInt()'", "'UserInputReader.readChar()'", "'++'", 
		"'--'", "'for'", "'boolean'", "'true'", "'false'", "'!'", "'char'", "'new'", 
		"'['", "']'", "'=='", "'System'", "'.'", "'out'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "MINUS", "NUM", "NEWLINE", "IDENTIFIER", "WHITESPACE", "STRING"
	};
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
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Class_statementContext class_statement() {
			return getRuleContext(Class_statementContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			class_statement();
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

	public static class Class_statementContext extends ParserRuleContext {
		public Token className;
		public Main_methodContext method;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public Main_methodContext main_method() {
			return getRuleContext(Main_methodContext.class,0);
		}
		public Class_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitClass_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_statementContext class_statement() throws RecognitionException {
		Class_statementContext _localctx = new Class_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			match(T__1);
			setState(64);
			((Class_statementContext)_localctx).className = match(IDENTIFIER);
			setState(65);
			match(T__2);
			setState(66);
			((Class_statementContext)_localctx).method = main_method();
			setState(67);
			match(T__3);
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

	public static class Main_methodContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Main_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitMain_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_methodContext main_method() throws RecognitionException {
		Main_methodContext _localctx = new Main_methodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			match(T__4);
			setState(71);
			match(T__5);
			setState(72);
			match(T__6);
			setState(73);
			match(T__7);
			setState(74);
			match(T__8);
			setState(75);
			match(T__9);
			setState(76);
			match(T__10);
			setState(77);
			match(T__11);
			setState(78);
			match(T__2);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__23) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__41) | (1L << T__46) | (1L << IDENTIFIER))) != 0) );
			setState(84);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public IncrementationContext incrementation() {
			return getRuleContext(IncrementationContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public BooleanVarDeclarationContext booleanVarDeclaration() {
			return getRuleContext(BooleanVarDeclarationContext.class,0);
		}
		public BooleanVarAssignmentContext booleanVarAssignment() {
			return getRuleContext(BooleanVarAssignmentContext.class,0);
		}
		public CharArrayContext charArray() {
			return getRuleContext(CharArrayContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				println();
				setState(87);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				print();
				setState(90);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				varDeclarationList(0);
				setState(93);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				varDeclaration();
				setState(96);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				assignment();
				setState(99);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				branch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				do_while();
				setState(103);
				match(T__12);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				incrementation();
				setState(107);
				match(T__12);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
				decrement();
				setState(110);
				match(T__12);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				forLoop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				booleanVarDeclaration();
				setState(114);
				match(T__12);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(116);
				booleanVarAssignment();
				setState(117);
				match(T__12);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(119);
				charArray();
				setState(120);
				match(T__12);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(122);
				arrayAssignment();
				setState(123);
				match(T__12);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InverseBoolContext extends ExpressionContext {
		public InverseBooleanContext inverseBoolean() {
			return getRuleContext(InverseBooleanContext.class,0);
		}
		public InverseBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitInverseBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeNumberContext extends ExpressionContext {
		public Token subSign;
		public Token number;
		public TerminalNode MINUS() { return getToken(JavaGrammarParser.MINUS, 0); }
		public TerminalNode NUM() { return getToken(JavaGrammarParser.NUM, 0); }
		public NegativeNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitNegativeNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUM() { return getToken(JavaGrammarParser.NUM, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExpressionContext {
		public ExpressionContext lft;
		public Token operator;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public Token txt;
		public TerminalNode STRING() { return getToken(JavaGrammarParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128);
				((NumberContext)_localctx).number = match(NUM);
				}
				break;
			case MINUS:
				{
				_localctx = new NegativeNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				((NegativeNumberContext)_localctx).subSign = match(MINUS);
				setState(130);
				((NegativeNumberContext)_localctx).number = match(NUM);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case T__40:
				{
				_localctx = new InverseBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				inverseBoolean();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(137);
						match(T__13);
						setState(138);
						((DivContext)_localctx).rght = expression(13);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(139);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(140);
						match(T__14);
						setState(141);
						((MultContext)_localctx).rght = expression(12);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(143);
						match(MINUS);
						setState(144);
						((MinusContext)_localctx).rght = expression(11);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(146);
						match(T__15);
						setState(147);
						((PlusContext)_localctx).rght = expression(10);
						}
						break;
					case 5:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(149);
						((RelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
							((RelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						((RelationalContext)_localctx).rght = expression(9);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(152);
						match(T__20);
						setState(153);
						((AndContext)_localctx).rght = expression(8);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						match(T__21);
						setState(156);
						((OrContext)_localctx).rght = expression(7);
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleVarDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public SimpleVarDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitSimpleVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationAndAssignmentContext extends VarDeclarationContext {
		public Token varName;
		public ExpressionContext exp;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationAndAssignmentContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitVarDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public ListDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StaticIntDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public StaticIntDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitStaticIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StaticIntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__4);
				setState(163);
				match(T__22);
				setState(164);
				match(T__23);
				setState(165);
				((StaticIntDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new VarDeclarationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__23);
				setState(167);
				((VarDeclarationAndAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(168);
				match(T__24);
				setState(169);
				((VarDeclarationAndAssignmentContext)_localctx).exp = expression(0);
				}
				break;
			case 3:
				_localctx = new SimpleVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(T__23);
				setState(171);
				((SimpleVarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new ListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__25);
				setState(173);
				((ListDeclarationContext)_localctx).varName = match(IDENTIFIER);
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

	public static class VarDeclarationListContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitVarDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationListContext varDeclarationList() throws RecognitionException {
		return varDeclarationList(0);
	}

	private VarDeclarationListContext varDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDeclarationListContext _localctx = new VarDeclarationListContext(_ctx, _parentState);
		VarDeclarationListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_varDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			varDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varDeclarationList);
					setState(179);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(180);
					varDeclaration();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputVarContext extends AssignmentContext {
		public Token varName;
		public UserInputContext input;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public UserInputContext userInput() {
			return getRuleContext(UserInputContext.class,0);
		}
		public InputVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitInputVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectVarAssignmentContext extends AssignmentContext {
		public Token varName;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DirectVarAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitDirectVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DirectVarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				((DirectVarAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(187);
				match(T__24);
				setState(188);
				((DirectVarAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				_localctx = new InputVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((InputVarContext)_localctx).varName = match(IDENTIFIER);
				setState(190);
				match(T__24);
				setState(191);
				((InputVarContext)_localctx).input = userInput();
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

	public static class PrintlnContext extends ParserRuleContext {
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	 
		public PrintlnContext() { }
		public void copyFrom(PrintlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementAndVariableContext extends PrintlnContext {
		public Token txt;
		public Token varName;
		public PrintSyntaxContext printSyntax() {
			return getRuleContext(PrintSyntaxContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JavaGrammarParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public PrintStatementAndVariableContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPrintStatementAndVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementandVariable3Context extends PrintlnContext {
		public Token varName;
		public Token txt;
		public Token variableName;
		public PrintSyntaxContext printSyntax() {
			return getRuleContext(PrintSyntaxContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode STRING() { return getToken(JavaGrammarParser.STRING, 0); }
		public PrintStatementandVariable3Context(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPrintStatementandVariable3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementandVariable2Context extends PrintlnContext {
		public Token txt;
		public Token varName;
		public Token text;
		public PrintSyntaxContext printSyntax() {
			return getRuleContext(PrintSyntaxContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(JavaGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JavaGrammarParser.STRING, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public PrintStatementandVariable2Context(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPrintStatementandVariable2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementandExpressionContext extends PrintlnContext {
		public Token txt;
		public Token varName;
		public Token text;
		public ExpressionContext expr;
		public PrintSyntaxContext printSyntax() {
			return getRuleContext(PrintSyntaxContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(JavaGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JavaGrammarParser.STRING, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementandExpressionContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPrintStatementandExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplePrintStatementContext extends PrintlnContext {
		public ExpressionContext argument;
		public PrintSyntaxContext printSyntax() {
			return getRuleContext(PrintSyntaxContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimplePrintStatementContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitSimplePrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_println);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintStatementAndVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				printSyntax();
				setState(195);
				match(T__26);
				setState(196);
				((PrintStatementAndVariableContext)_localctx).txt = match(STRING);
				setState(197);
				match(T__15);
				setState(198);
				((PrintStatementAndVariableContext)_localctx).varName = match(IDENTIFIER);
				setState(199);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new PrintStatementandVariable2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				printSyntax();
				setState(202);
				match(T__26);
				setState(203);
				((PrintStatementandVariable2Context)_localctx).txt = match(STRING);
				setState(204);
				match(T__15);
				setState(205);
				((PrintStatementandVariable2Context)_localctx).varName = match(IDENTIFIER);
				setState(206);
				match(T__15);
				setState(207);
				((PrintStatementandVariable2Context)_localctx).text = match(STRING);
				setState(208);
				match(T__11);
				}
				break;
			case 3:
				_localctx = new PrintStatementandVariable3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				printSyntax();
				setState(211);
				match(T__26);
				setState(212);
				((PrintStatementandVariable3Context)_localctx).varName = match(IDENTIFIER);
				setState(213);
				match(T__15);
				setState(214);
				((PrintStatementandVariable3Context)_localctx).txt = match(STRING);
				setState(215);
				match(T__15);
				setState(216);
				((PrintStatementandVariable3Context)_localctx).variableName = match(IDENTIFIER);
				setState(217);
				match(T__11);
				}
				break;
			case 4:
				_localctx = new PrintStatementandExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				printSyntax();
				setState(220);
				match(T__26);
				setState(221);
				((PrintStatementandExpressionContext)_localctx).txt = match(STRING);
				setState(222);
				match(T__15);
				setState(223);
				((PrintStatementandExpressionContext)_localctx).varName = match(IDENTIFIER);
				setState(224);
				match(T__15);
				setState(225);
				((PrintStatementandExpressionContext)_localctx).text = match(STRING);
				setState(226);
				match(T__15);
				setState(227);
				((PrintStatementandExpressionContext)_localctx).expr = expression(0);
				setState(228);
				match(T__11);
				}
				break;
			case 5:
				_localctx = new SimplePrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				printSyntax();
				setState(231);
				match(T__26);
				setState(232);
				((SimplePrintStatementContext)_localctx).argument = expression(0);
				setState(233);
				match(T__11);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintComplexStatementContext extends PrintContext {
		public Token txt;
		public Token varName;
		public Token text;
		public PrintSyntaxContext printSyntax() {
			return getRuleContext(PrintSyntaxContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(JavaGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JavaGrammarParser.STRING, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public PrintComplexStatementContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPrintComplexStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStringContext extends PrintContext {
		public ExpressionContext argument;
		public PrintSyntaxContext printSyntax() {
			return getRuleContext(PrintSyntaxContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStringContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PrintComplexStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				printSyntax();
				setState(238);
				match(T__27);
				setState(239);
				((PrintComplexStatementContext)_localctx).txt = match(STRING);
				setState(240);
				match(T__15);
				setState(241);
				((PrintComplexStatementContext)_localctx).varName = match(IDENTIFIER);
				setState(242);
				match(T__15);
				setState(243);
				((PrintComplexStatementContext)_localctx).text = match(STRING);
				setState(244);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				printSyntax();
				setState(247);
				match(T__27);
				setState(248);
				((PrintStringContext)_localctx).argument = expression(0);
				setState(249);
				match(T__11);
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

	public static class BranchContext extends ParserRuleContext {
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
	 
		public BranchContext() { }
		public void copyFrom(BranchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompareStatements_ifContext extends BranchContext {
		public ExpressionContext lft;
		public Token operator;
		public ExpressionContext rght;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CompareStatements_ifContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitCompareStatements_if(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OtherIfStatementsContext extends BranchContext {
		public ExpressionContext condition;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public OtherIfStatementsContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitOtherIfStatements(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_statement_Or_OperatorContext extends BranchContext {
		public ExpressionContext left_condition;
		public Token operator;
		public ExpressionContext right_condition;
		public BlockContext onTrue;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_statement_Or_OperatorContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitIf_statement_Or_Operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_branch);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new CompareStatements_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__28);
				setState(254);
				match(T__7);
				setState(255);
				((CompareStatements_ifContext)_localctx).lft = expression(0);
				setState(256);
				((CompareStatements_ifContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
					((CompareStatements_ifContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				((CompareStatements_ifContext)_localctx).rght = expression(0);
				setState(258);
				match(T__11);
				setState(259);
				((CompareStatements_ifContext)_localctx).onTrue = block();
				setState(260);
				match(T__29);
				setState(261);
				((CompareStatements_ifContext)_localctx).onFalse = block();
				}
				break;
			case 2:
				_localctx = new If_statement_Or_OperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(T__28);
				setState(264);
				match(T__7);
				setState(265);
				match(T__7);
				setState(266);
				((If_statement_Or_OperatorContext)_localctx).left_condition = expression(0);
				setState(267);
				match(T__11);
				setState(268);
				((If_statement_Or_OperatorContext)_localctx).operator = match(T__21);
				setState(269);
				match(T__7);
				setState(270);
				((If_statement_Or_OperatorContext)_localctx).right_condition = expression(0);
				setState(271);
				match(T__11);
				setState(272);
				match(T__11);
				setState(273);
				((If_statement_Or_OperatorContext)_localctx).onTrue = block();
				}
				break;
			case 3:
				_localctx = new OtherIfStatementsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T__28);
				setState(276);
				match(T__7);
				setState(277);
				((OtherIfStatementsContext)_localctx).condition = expression(0);
				setState(278);
				match(T__11);
				setState(279);
				((OtherIfStatementsContext)_localctx).onTrue = block();
				setState(280);
				match(T__29);
				setState(281);
				((OtherIfStatementsContext)_localctx).onFalse = block();
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

	public static class Do_whileContext extends ParserRuleContext {
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
	 
		public Do_whileContext() { }
		public void copyFrom(Do_whileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhile_Or_OperatorContext extends Do_whileContext {
		public BlockContext loop;
		public ExpressionContext left_condition;
		public Token operator;
		public ExpressionContext right_condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DoWhile_Or_OperatorContext(Do_whileContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitDoWhile_Or_Operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleDoWhileContext extends Do_whileContext {
		public BlockContext loop;
		public ExpressionContext condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleDoWhileContext(Do_whileContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitSimpleDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_do_while);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new DoWhile_Or_OperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(T__30);
				setState(286);
				((DoWhile_Or_OperatorContext)_localctx).loop = block();
				setState(287);
				match(T__31);
				setState(288);
				match(T__7);
				setState(289);
				match(T__7);
				setState(290);
				((DoWhile_Or_OperatorContext)_localctx).left_condition = expression(0);
				setState(291);
				match(T__11);
				setState(292);
				((DoWhile_Or_OperatorContext)_localctx).operator = match(T__21);
				setState(293);
				match(T__7);
				setState(294);
				((DoWhile_Or_OperatorContext)_localctx).right_condition = expression(0);
				setState(295);
				match(T__11);
				setState(296);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new SimpleDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(T__30);
				setState(299);
				((SimpleDoWhileContext)_localctx).loop = block();
				setState(300);
				match(T__31);
				setState(301);
				match(T__7);
				setState(302);
				((SimpleDoWhileContext)_localctx).condition = expression(0);
				setState(303);
				match(T__11);
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

	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext loopCondition;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__31);
			setState(308);
			match(T__7);
			setState(309);
			((While_statementContext)_localctx).condition = expression(0);
			setState(310);
			match(T__11);
			setState(311);
			((While_statementContext)_localctx).loopCondition = block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__2);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__23) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__41) | (1L << T__46) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(314);
				statement();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(T__3);
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

	public static class UserInputContext extends ParserRuleContext {
		public UserInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userInput; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitUserInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserInputContext userInput() throws RecognitionException {
		UserInputContext _localctx = new UserInputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_userInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__33) ) {
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

	public static class IncrementationContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public IncrementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitIncrementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementationContext incrementation() throws RecognitionException {
		IncrementationContext _localctx = new IncrementationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_incrementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((IncrementationContext)_localctx).varName = match(IDENTIFIER);
			setState(325);
			match(T__34);
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

	public static class DecrementContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((DecrementContext)_localctx).varName = match(IDENTIFIER);
			setState(328);
			match(T__35);
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

	public static class ForLoopContext extends ParserRuleContext {
		public ForInitializationContext initialization;
		public ExpressionContext condition;
		public ForChangeContext change;
		public BlockContext loopCondition;
		public ForInitializationContext forInitialization() {
			return getRuleContext(ForInitializationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForChangeContext forChange() {
			return getRuleContext(ForChangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__36);
			setState(331);
			match(T__7);
			setState(332);
			((ForLoopContext)_localctx).initialization = forInitialization();
			setState(333);
			match(T__12);
			setState(334);
			((ForLoopContext)_localctx).condition = expression(0);
			setState(335);
			match(T__12);
			setState(336);
			((ForLoopContext)_localctx).change = forChange();
			setState(337);
			match(T__11);
			setState(338);
			((ForLoopContext)_localctx).loopCondition = block();
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

	public static class ForInitializationContext extends ParserRuleContext {
		public ForInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitialization; }
	 
		public ForInitializationContext() { }
		public void copyFrom(ForInitializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareVariable_ForContext extends ForInitializationContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclareVariable_ForContext(ForInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitDeclareVariable_For(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVariable_ForContext extends ForInitializationContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignVariable_ForContext(ForInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitAssignVariable_For(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitializationContext forInitialization() throws RecognitionException {
		ForInitializationContext _localctx = new ForInitializationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forInitialization);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__23:
			case T__25:
				_localctx = new DeclareVariable_ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				varDeclaration();
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignVariable_ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				assignment();
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

	public static class ForChangeContext extends ParserRuleContext {
		public IncrementationContext incrementation() {
			return getRuleContext(IncrementationContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ForChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitForChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForChangeContext forChange() throws RecognitionException {
		ForChangeContext _localctx = new ForChangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forChange);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				incrementation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				decrement();
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

	public static class BooleanVarDeclarationContext extends ParserRuleContext {
		public BooleanVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanVarDeclaration; }
	 
		public BooleanVarDeclarationContext() { }
		public void copyFrom(BooleanVarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleBooleanVariableDeclarationContext extends BooleanVarDeclarationContext {
		public Token variableName;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public SimpleBooleanVariableDeclarationContext(BooleanVarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitSimpleBooleanVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVariableDeclarationAndAssignmentContext extends BooleanVarDeclarationContext {
		public Token variableName;
		public BooleanValueContext value;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanVariableDeclarationAndAssignmentContext(BooleanVarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitBooleanVariableDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanVarDeclarationContext booleanVarDeclaration() throws RecognitionException {
		BooleanVarDeclarationContext _localctx = new BooleanVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanVarDeclaration);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new SimpleBooleanVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(T__37);
				setState(349);
				((SimpleBooleanVariableDeclarationContext)_localctx).variableName = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new BooleanVariableDeclarationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(T__37);
				setState(351);
				((BooleanVariableDeclarationAndAssignmentContext)_localctx).variableName = match(IDENTIFIER);
				setState(352);
				match(T__24);
				setState(353);
				((BooleanVariableDeclarationAndAssignmentContext)_localctx).value = booleanValue();
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

	public static class BooleanVarAssignmentContext extends ParserRuleContext {
		public BooleanVarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanVarAssignment; }
	 
		public BooleanVarAssignmentContext() { }
		public void copyFrom(BooleanVarAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleBooleanVariableAssignmentContext extends BooleanVarAssignmentContext {
		public Token variableName;
		public BooleanValueContext value;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public SimpleBooleanVariableAssignmentContext(BooleanVarAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitSimpleBooleanVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVariableEvaluationAndAssignmentContext extends BooleanVarAssignmentContext {
		public Token variableName;
		public ComparingBooleanAndArrayElementContext value;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public ComparingBooleanAndArrayElementContext comparingBooleanAndArrayElement() {
			return getRuleContext(ComparingBooleanAndArrayElementContext.class,0);
		}
		public BooleanVariableEvaluationAndAssignmentContext(BooleanVarAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitBooleanVariableEvaluationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanVarAssignmentContext booleanVarAssignment() throws RecognitionException {
		BooleanVarAssignmentContext _localctx = new BooleanVarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanVarAssignment);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new BooleanVariableEvaluationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				((BooleanVariableEvaluationAndAssignmentContext)_localctx).variableName = match(IDENTIFIER);
				setState(357);
				match(T__24);
				setState(358);
				((BooleanVariableEvaluationAndAssignmentContext)_localctx).value = comparingBooleanAndArrayElement();
				}
				break;
			case 2:
				_localctx = new SimpleBooleanVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				((SimpleBooleanVariableAssignmentContext)_localctx).variableName = match(IDENTIFIER);
				setState(360);
				match(T__24);
				setState(361);
				((SimpleBooleanVariableAssignmentContext)_localctx).value = booleanValue();
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

	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	 
		public BooleanValueContext() { }
		public void copyFrom(BooleanValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueContext extends BooleanValueContext {
		public TrueContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends BooleanValueContext {
		public FalseContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanValue);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(T__38);
				}
				break;
			case T__39:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(T__39);
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

	public static class InverseBooleanContext extends ParserRuleContext {
		public Token variableName;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public InverseBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inverseBoolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitInverseBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InverseBooleanContext inverseBoolean() throws RecognitionException {
		InverseBooleanContext _localctx = new InverseBooleanContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inverseBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__40);
			setState(369);
			((InverseBooleanContext)_localctx).variableName = match(IDENTIFIER);
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

	public static class CharArrayContext extends ParserRuleContext {
		public Token arrayName;
		public Token varName;
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaGrammarParser.IDENTIFIER, i);
		}
		public CharArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitCharArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharArrayContext charArray() throws RecognitionException {
		CharArrayContext _localctx = new CharArrayContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_charArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__41);
			setState(372);
			match(T__9);
			setState(373);
			((CharArrayContext)_localctx).arrayName = match(IDENTIFIER);
			setState(374);
			match(T__24);
			setState(375);
			match(T__42);
			setState(376);
			match(T__41);
			setState(377);
			match(T__43);
			setState(378);
			((CharArrayContext)_localctx).varName = match(IDENTIFIER);
			setState(379);
			match(T__44);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public Token arrayName;
		public ExpressionContext number;
		public UserInputContext InputCharacter;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UserInputContext userInput() {
			return getRuleContext(UserInputContext.class,0);
		}
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((ArrayAssignmentContext)_localctx).arrayName = match(IDENTIFIER);
			setState(382);
			match(T__43);
			setState(383);
			((ArrayAssignmentContext)_localctx).number = expression(0);
			setState(384);
			match(T__44);
			setState(385);
			match(T__24);
			setState(386);
			((ArrayAssignmentContext)_localctx).InputCharacter = userInput();
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

	public static class ArrayElementContext extends ParserRuleContext {
		public Token arrayName;
		public ExpressionContext number;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((ArrayElementContext)_localctx).arrayName = match(IDENTIFIER);
			setState(389);
			match(T__43);
			setState(390);
			((ArrayElementContext)_localctx).number = expression(0);
			setState(391);
			match(T__44);
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

	public static class ComparingArrayElementsContext extends ParserRuleContext {
		public ArrayElementContext left_element;
		public ArrayElementContext right_element;
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ComparingArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparingArrayElements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitComparingArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparingArrayElementsContext comparingArrayElements() throws RecognitionException {
		ComparingArrayElementsContext _localctx = new ComparingArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comparingArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(T__7);
			setState(394);
			((ComparingArrayElementsContext)_localctx).left_element = arrayElement();
			setState(395);
			match(T__45);
			setState(396);
			((ComparingArrayElementsContext)_localctx).right_element = arrayElement();
			setState(397);
			match(T__11);
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

	public static class ComparingBooleanAndArrayElementContext extends ParserRuleContext {
		public Token variableName;
		public ComparingArrayElementsContext booleanReturned;
		public TerminalNode IDENTIFIER() { return getToken(JavaGrammarParser.IDENTIFIER, 0); }
		public ComparingArrayElementsContext comparingArrayElements() {
			return getRuleContext(ComparingArrayElementsContext.class,0);
		}
		public ComparingBooleanAndArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparingBooleanAndArrayElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitComparingBooleanAndArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparingBooleanAndArrayElementContext comparingBooleanAndArrayElement() throws RecognitionException {
		ComparingBooleanAndArrayElementContext _localctx = new ComparingBooleanAndArrayElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparingBooleanAndArrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__7);
			setState(400);
			((ComparingBooleanAndArrayElementContext)_localctx).variableName = match(IDENTIFIER);
			setState(401);
			match(T__20);
			setState(402);
			((ComparingBooleanAndArrayElementContext)_localctx).booleanReturned = comparingArrayElements();
			setState(403);
			match(T__11);
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

	public static class PrintSyntaxContext extends ParserRuleContext {
		public PrintSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSyntax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPrintSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSyntaxContext printSyntax() throws RecognitionException {
		PrintSyntaxContext _localctx = new PrintSyntaxContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_printSyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__46);
			setState(406);
			match(T__47);
			setState(407);
			match(T__48);
			setState(408);
			match(T__47);
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return varDeclarationList_sempred((VarDeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean varDeclarationList_sempred(VarDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u019d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\6\4S\n\4\r\4\16\4T\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0089\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b1\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00b8\n\b\f\b\16\b\u00bb\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00c3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fe"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011e\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0134\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17"+
		"\u013e\n\17\f\17\16\17\u0141\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\5\24\u0159\n\24\3\25\3\25\5\25\u015d\n\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0165\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u016d\n\27"+
		"\3\30\3\30\5\30\u0171\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\2\4\n\16 \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\4\3\2\23\26\3\2#$\2\u01ab\2>\3\2\2"+
		"\2\4@\3\2\2\2\6G\3\2\2\2\b\177\3\2\2\2\n\u0088\3\2\2\2\f\u00b0\3\2\2\2"+
		"\16\u00b2\3\2\2\2\20\u00c2\3\2\2\2\22\u00ed\3\2\2\2\24\u00fd\3\2\2\2\26"+
		"\u011d\3\2\2\2\30\u0133\3\2\2\2\32\u0135\3\2\2\2\34\u013b\3\2\2\2\36\u0144"+
		"\3\2\2\2 \u0146\3\2\2\2\"\u0149\3\2\2\2$\u014c\3\2\2\2&\u0158\3\2\2\2"+
		"(\u015c\3\2\2\2*\u0164\3\2\2\2,\u016c\3\2\2\2.\u0170\3\2\2\2\60\u0172"+
		"\3\2\2\2\62\u0175\3\2\2\2\64\u017f\3\2\2\2\66\u0186\3\2\2\28\u018b\3\2"+
		"\2\2:\u0191\3\2\2\2<\u0197\3\2\2\2>?\5\4\3\2?\3\3\2\2\2@A\7\3\2\2AB\7"+
		"\4\2\2BC\7\67\2\2CD\7\5\2\2DE\5\6\4\2EF\7\6\2\2F\5\3\2\2\2GH\7\3\2\2H"+
		"I\7\7\2\2IJ\7\b\2\2JK\7\t\2\2KL\7\n\2\2LM\7\13\2\2MN\7\f\2\2NO\7\r\2\2"+
		"OP\7\16\2\2PR\7\5\2\2QS\5\b\5\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2UV\3\2\2\2VW\7\6\2\2W\7\3\2\2\2XY\5\22\n\2YZ\7\17\2\2Z\u0080\3\2\2\2"+
		"[\\\5\24\13\2\\]\7\17\2\2]\u0080\3\2\2\2^_\5\16\b\2_`\7\17\2\2`\u0080"+
		"\3\2\2\2ab\5\f\7\2bc\7\17\2\2c\u0080\3\2\2\2de\5\20\t\2ef\7\17\2\2f\u0080"+
		"\3\2\2\2g\u0080\5\26\f\2hi\5\30\r\2ij\7\17\2\2j\u0080\3\2\2\2k\u0080\5"+
		"\32\16\2lm\5 \21\2mn\7\17\2\2n\u0080\3\2\2\2op\5\"\22\2pq\7\17\2\2q\u0080"+
		"\3\2\2\2r\u0080\5$\23\2st\5*\26\2tu\7\17\2\2u\u0080\3\2\2\2vw\5,\27\2"+
		"wx\7\17\2\2x\u0080\3\2\2\2yz\5\62\32\2z{\7\17\2\2{\u0080\3\2\2\2|}\5\64"+
		"\33\2}~\7\17\2\2~\u0080\3\2\2\2\177X\3\2\2\2\177[\3\2\2\2\177^\3\2\2\2"+
		"\177a\3\2\2\2\177d\3\2\2\2\177g\3\2\2\2\177h\3\2\2\2\177k\3\2\2\2\177"+
		"l\3\2\2\2\177o\3\2\2\2\177r\3\2\2\2\177s\3\2\2\2\177v\3\2\2\2\177y\3\2"+
		"\2\2\177|\3\2\2\2\u0080\t\3\2\2\2\u0081\u0082\b\6\1\2\u0082\u0089\7\65"+
		"\2\2\u0083\u0084\7\64\2\2\u0084\u0089\7\65\2\2\u0085\u0089\79\2\2\u0086"+
		"\u0089\7\67\2\2\u0087\u0089\5\60\31\2\u0088\u0081\3\2\2\2\u0088\u0083"+
		"\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u00a1\3\2\2\2\u008a\u008b\f\16\2\2\u008b\u008c\7\20\2\2\u008c\u00a0\5"+
		"\n\6\17\u008d\u008e\f\r\2\2\u008e\u008f\7\21\2\2\u008f\u00a0\5\n\6\16"+
		"\u0090\u0091\f\f\2\2\u0091\u0092\7\64\2\2\u0092\u00a0\5\n\6\r\u0093\u0094"+
		"\f\13\2\2\u0094\u0095\7\22\2\2\u0095\u00a0\5\n\6\f\u0096\u0097\f\n\2\2"+
		"\u0097\u0098\t\2\2\2\u0098\u00a0\5\n\6\13\u0099\u009a\f\t\2\2\u009a\u009b"+
		"\7\27\2\2\u009b\u00a0\5\n\6\n\u009c\u009d\f\b\2\2\u009d\u009e\7\30\2\2"+
		"\u009e\u00a0\5\n\6\t\u009f\u008a\3\2\2\2\u009f\u008d\3\2\2\2\u009f\u0090"+
		"\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0099\3\2\2\2\u009f"+
		"\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\13\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6"+
		"\7\31\2\2\u00a6\u00a7\7\32\2\2\u00a7\u00b1\7\67\2\2\u00a8\u00a9\7\32\2"+
		"\2\u00a9\u00aa\7\67\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00b1\5\n\6\2\u00ac"+
		"\u00ad\7\32\2\2\u00ad\u00b1\7\67\2\2\u00ae\u00af\7\34\2\2\u00af\u00b1"+
		"\7\67\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ac\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b3\b\b\1\2\u00b3\u00b4\5"+
		"\f\7\2\u00b4\u00b9\3\2\2\2\u00b5\u00b6\f\4\2\2\u00b6\u00b8\5\f\7\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\17\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\67\2\2\u00bd\u00be"+
		"\7\33\2\2\u00be\u00c3\5\n\6\2\u00bf\u00c0\7\67\2\2\u00c0\u00c1\7\33\2"+
		"\2\u00c1\u00c3\5\36\20\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3"+
		"\21\3\2\2\2\u00c4\u00c5\5<\37\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\79\2"+
		"\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9\7\67\2\2\u00c9\u00ca\7\16\2\2\u00ca"+
		"\u00ee\3\2\2\2\u00cb\u00cc\5<\37\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\7"+
		"9\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\7\67\2\2\u00d0\u00d1\7\22\2\2\u00d1"+
		"\u00d2\79\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00ee\3\2\2\2\u00d4\u00d5\5<"+
		"\37\2\u00d5\u00d6\7\35\2\2\u00d6\u00d7\7\67\2\2\u00d7\u00d8\7\22\2\2\u00d8"+
		"\u00d9\79\2\2\u00d9\u00da\7\22\2\2\u00da\u00db\7\67\2\2\u00db\u00dc\7"+
		"\16\2\2\u00dc\u00ee\3\2\2\2\u00dd\u00de\5<\37\2\u00de\u00df\7\35\2\2\u00df"+
		"\u00e0\79\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e2\7\67\2\2\u00e2\u00e3\7"+
		"\22\2\2\u00e3\u00e4\79\2\2\u00e4\u00e5\7\22\2\2\u00e5\u00e6\5\n\6\2\u00e6"+
		"\u00e7\7\16\2\2\u00e7\u00ee\3\2\2\2\u00e8\u00e9\5<\37\2\u00e9\u00ea\7"+
		"\35\2\2\u00ea\u00eb\5\n\6\2\u00eb\u00ec\7\16\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00c4\3\2\2\2\u00ed\u00cb\3\2\2\2\u00ed\u00d4\3\2\2\2\u00ed\u00dd\3\2"+
		"\2\2\u00ed\u00e8\3\2\2\2\u00ee\23\3\2\2\2\u00ef\u00f0\5<\37\2\u00f0\u00f1"+
		"\7\36\2\2\u00f1\u00f2\79\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\7\67\2\2"+
		"\u00f4\u00f5\7\22\2\2\u00f5\u00f6\79\2\2\u00f6\u00f7\7\16\2\2\u00f7\u00fe"+
		"\3\2\2\2\u00f8\u00f9\5<\37\2\u00f9\u00fa\7\36\2\2\u00fa\u00fb\5\n\6\2"+
		"\u00fb\u00fc\7\16\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ef\3\2\2\2\u00fd\u00f8"+
		"\3\2\2\2\u00fe\25\3\2\2\2\u00ff\u0100\7\37\2\2\u0100\u0101\7\n\2\2\u0101"+
		"\u0102\5\n\6\2\u0102\u0103\t\2\2\2\u0103\u0104\5\n\6\2\u0104\u0105\7\16"+
		"\2\2\u0105\u0106\5\34\17\2\u0106\u0107\7 \2\2\u0107\u0108\5\34\17\2\u0108"+
		"\u011e\3\2\2\2\u0109\u010a\7\37\2\2\u010a\u010b\7\n\2\2\u010b\u010c\7"+
		"\n\2\2\u010c\u010d\5\n\6\2\u010d\u010e\7\16\2\2\u010e\u010f\7\30\2\2\u010f"+
		"\u0110\7\n\2\2\u0110\u0111\5\n\6\2\u0111\u0112\7\16\2\2\u0112\u0113\7"+
		"\16\2\2\u0113\u0114\5\34\17\2\u0114\u011e\3\2\2\2\u0115\u0116\7\37\2\2"+
		"\u0116\u0117\7\n\2\2\u0117\u0118\5\n\6\2\u0118\u0119\7\16\2\2\u0119\u011a"+
		"\5\34\17\2\u011a\u011b\7 \2\2\u011b\u011c\5\34\17\2\u011c\u011e\3\2\2"+
		"\2\u011d\u00ff\3\2\2\2\u011d\u0109\3\2\2\2\u011d\u0115\3\2\2\2\u011e\27"+
		"\3\2\2\2\u011f\u0120\7!\2\2\u0120\u0121\5\34\17\2\u0121\u0122\7\"\2\2"+
		"\u0122\u0123\7\n\2\2\u0123\u0124\7\n\2\2\u0124\u0125\5\n\6\2\u0125\u0126"+
		"\7\16\2\2\u0126\u0127\7\30\2\2\u0127\u0128\7\n\2\2\u0128\u0129\5\n\6\2"+
		"\u0129\u012a\7\16\2\2\u012a\u012b\7\16\2\2\u012b\u0134\3\2\2\2\u012c\u012d"+
		"\7!\2\2\u012d\u012e\5\34\17\2\u012e\u012f\7\"\2\2\u012f\u0130\7\n\2\2"+
		"\u0130\u0131\5\n\6\2\u0131\u0132\7\16\2\2\u0132\u0134\3\2\2\2\u0133\u011f"+
		"\3\2\2\2\u0133\u012c\3\2\2\2\u0134\31\3\2\2\2\u0135\u0136\7\"\2\2\u0136"+
		"\u0137\7\n\2\2\u0137\u0138\5\n\6\2\u0138\u0139\7\16\2\2\u0139\u013a\5"+
		"\34\17\2\u013a\33\3\2\2\2\u013b\u013f\7\5\2\2\u013c\u013e\5\b\5\2\u013d"+
		"\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7\6\2\2\u0143"+
		"\35\3\2\2\2\u0144\u0145\t\3\2\2\u0145\37\3\2\2\2\u0146\u0147\7\67\2\2"+
		"\u0147\u0148\7%\2\2\u0148!\3\2\2\2\u0149\u014a\7\67\2\2\u014a\u014b\7"+
		"&\2\2\u014b#\3\2\2\2\u014c\u014d\7\'\2\2\u014d\u014e\7\n\2\2\u014e\u014f"+
		"\5&\24\2\u014f\u0150\7\17\2\2\u0150\u0151\5\n\6\2\u0151\u0152\7\17\2\2"+
		"\u0152\u0153\5(\25\2\u0153\u0154\7\16\2\2\u0154\u0155\5\34\17\2\u0155"+
		"%\3\2\2\2\u0156\u0159\5\f\7\2\u0157\u0159\5\20\t\2\u0158\u0156\3\2\2\2"+
		"\u0158\u0157\3\2\2\2\u0159\'\3\2\2\2\u015a\u015d\5 \21\2\u015b\u015d\5"+
		"\"\22\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d)\3\2\2\2\u015e\u015f"+
		"\7(\2\2\u015f\u0165\7\67\2\2\u0160\u0161\7(\2\2\u0161\u0162\7\67\2\2\u0162"+
		"\u0163\7\33\2\2\u0163\u0165\5.\30\2\u0164\u015e\3\2\2\2\u0164\u0160\3"+
		"\2\2\2\u0165+\3\2\2\2\u0166\u0167\7\67\2\2\u0167\u0168\7\33\2\2\u0168"+
		"\u016d\5:\36\2\u0169\u016a\7\67\2\2\u016a\u016b\7\33\2\2\u016b\u016d\5"+
		".\30\2\u016c\u0166\3\2\2\2\u016c\u0169\3\2\2\2\u016d-\3\2\2\2\u016e\u0171"+
		"\7)\2\2\u016f\u0171\7*\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"/\3\2\2\2\u0172\u0173\7+\2\2\u0173\u0174\7\67\2\2\u0174\61\3\2\2\2\u0175"+
		"\u0176\7,\2\2\u0176\u0177\7\f\2\2\u0177\u0178\7\67\2\2\u0178\u0179\7\33"+
		"\2\2\u0179\u017a\7-\2\2\u017a\u017b\7,\2\2\u017b\u017c\7.\2\2\u017c\u017d"+
		"\7\67\2\2\u017d\u017e\7/\2\2\u017e\63\3\2\2\2\u017f\u0180\7\67\2\2\u0180"+
		"\u0181\7.\2\2\u0181\u0182\5\n\6\2\u0182\u0183\7/\2\2\u0183\u0184\7\33"+
		"\2\2\u0184\u0185\5\36\20\2\u0185\65\3\2\2\2\u0186\u0187\7\67\2\2\u0187"+
		"\u0188\7.\2\2\u0188\u0189\5\n\6\2\u0189\u018a\7/\2\2\u018a\67\3\2\2\2"+
		"\u018b\u018c\7\n\2\2\u018c\u018d\5\66\34\2\u018d\u018e\7\60\2\2\u018e"+
		"\u018f\5\66\34\2\u018f\u0190\7\16\2\2\u01909\3\2\2\2\u0191\u0192\7\n\2"+
		"\2\u0192\u0193\7\67\2\2\u0193\u0194\7\27\2\2\u0194\u0195\58\35\2\u0195"+
		"\u0196\7\16\2\2\u0196;\3\2\2\2\u0197\u0198\7\61\2\2\u0198\u0199\7\62\2"+
		"\2\u0199\u019a\7\63\2\2\u019a\u019b\7\62\2\2\u019b=\3\2\2\2\24T\177\u0088"+
		"\u009f\u00a1\u00b0\u00b9\u00c2\u00ed\u00fd\u011d\u0133\u013f\u0158\u015c"+
		"\u0164\u016c\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}