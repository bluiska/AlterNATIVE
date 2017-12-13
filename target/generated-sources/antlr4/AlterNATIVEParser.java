// Generated from AlterNATIVE.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlterNATIVEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, TEXT=19, NUMBER=20, BOOL=21, LINE_COMMENT=22, ML_COMMENT=23, 
		CHARACTER=24, FLOAT=25, SHORTFLOAT=26, UNDERSCORE=27, LETTER=28, LABEL=29, 
		DIGIT=30, OR=31, AND=32, CONST=33, WHITESPACE=34, EQUALS=35, BOOLEQUALS=36, 
		DOUBLEQUOTE=37, MINUS=38, DOT=39, SEMICOLON=40, LPARENS=41, RPARENS=42, 
		LARROW=43, RARROW=44, LT=45, GT=46, EXCLAIM=47, POW=48, MUL=49, DIV=50, 
		ADD=51, SUB=52, MOD=53, INC=54, DEC=55, COLON=56, COMMA=57, PRINTLN=58, 
		PRINT=59, RETURN=60, INPUT=61, TEXTTYPE=62, FLOATTYPE=63, BOOLTYPE=64, 
		VOIDTYPE=65, NULL=66, WHILE=67, NULLABLE=68;
	public static final String[] tokenNames = {
		"<INVALID>", "'START'", "'or when'", "'terminate'", "'extract'", "'otherwise'", 
		"'for'", "'by default'", "'call'", "'until'", "'check'", "'when'", "'FINISH'", 
		"'execute'", "'from'", "'is'", "'quantity'", "'merge'", "'join'", "TEXT", 
		"NUMBER", "BOOL", "LINE_COMMENT", "ML_COMMENT", "CHARACTER", "FLOAT", 
		"SHORTFLOAT", "'_'", "LETTER", "LABEL", "DIGIT", "'or'", "'and'", "'constant'", 
		"WHITESPACE", "'==>'", "'<==>'", "'\"'", "'-'", "'.'", "';'", "'('", "')'", 
		"'<-'", "'->'", "'<<'", "'>>'", "'!'", "'^^'", "'**'", "'//'", "'++'", 
		"'--'", "'%%'", "INC", "DEC", "':'", "','", "'nloutput'", "'output'", 
		"'return'", "'userinput'", "'text'", "'decimal'", "'logical'", "'void'", 
		"'null'", "'as long as'", "'nullable'"
	};
	public static final int
		RULE_program = 0, RULE_function_def = 1, RULE_funcall = 2, RULE_stmt = 3, 
		RULE_print_stmt = 4, RULE_input_stmt = 5, RULE_case_stmt = 6, RULE_block = 7, 
		RULE_return_block = 8, RULE_case_block = 9, RULE_case_condition = 10, 
		RULE_if_stmt = 11, RULE_bool_stmt = 12, RULE_logic_connector = 13, RULE_operations = 14, 
		RULE_array_functions = 15, RULE_number_operation = 16, RULE_number_functions = 17, 
		RULE_text_operation = 18, RULE_text_function = 19, RULE_bool_operation = 20, 
		RULE_bool_operator = 21, RULE_loop = 22, RULE_forloop = 23, RULE_whileloop = 24, 
		RULE_dountil = 25, RULE_operand = 26, RULE_value = 27, RULE_var_type = 28, 
		RULE_array = 29, RULE_variable = 30, RULE_declaration = 31, RULE_assignment = 32;
	public static final String[] ruleNames = {
		"program", "function_def", "funcall", "stmt", "print_stmt", "input_stmt", 
		"case_stmt", "block", "return_block", "case_block", "case_condition", 
		"if_stmt", "bool_stmt", "logic_connector", "operations", "array_functions", 
		"number_operation", "number_functions", "text_operation", "text_function", 
		"bool_operation", "bool_operator", "loop", "forloop", "whileloop", "dountil", 
		"operand", "value", "var_type", "array", "variable", "declaration", "assignment"
	};

	@Override
	public String getGrammarFileName() { return "AlterNATIVE.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlterNATIVEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public TerminalNode EOF() { return getToken(AlterNATIVEParser.EOF, 0); }
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(66); match(T__6);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (TEXT - 19)) | (1L << (NUMBER - 19)) | (1L << (BOOL - 19)) | (1L << (UNDERSCORE - 19)) | (1L << (LETTER - 19)) | (1L << (LPARENS - 19)) | (1L << (RARROW - 19)) | (1L << (LT - 19)) | (1L << (INC - 19)) | (1L << (DEC - 19)) | (1L << (NULL - 19)))) != 0)) {
				{
				{
				setState(67); stmt();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73); match(T__17);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (TEXT - 19)) | (1L << (NUMBER - 19)) | (1L << (BOOL - 19)) | (1L << (UNDERSCORE - 19)) | (1L << (LETTER - 19)) | (1L << (LPARENS - 19)) | (1L << (RARROW - 19)) | (1L << (LT - 19)) | (1L << (INC - 19)) | (1L << (DEC - 19)) | (1L << (NULL - 19)))) != 0)) {
				{
				setState(77);
				switch (_input.LA(1)) {
				case RARROW:
					{
					setState(75); function_def();
					}
					break;
				case TEXT:
				case NUMBER:
				case BOOL:
				case UNDERSCORE:
				case LETTER:
				case LPARENS:
				case LT:
				case INC:
				case DEC:
				case NULL:
					{
					setState(76); declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82); match(EOF);
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

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode VOIDTYPE() { return getToken(AlterNATIVEParser.VOIDTYPE, 0); }
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(AlterNATIVEParser.COMMA, i);
		}
		public TerminalNode LABEL() { return getToken(AlterNATIVEParser.LABEL, 0); }
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public Return_blockContext return_block() {
			return getRuleContext(Return_blockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlterNATIVEParser.COMMA); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(84); block();
				}
				break;
			case 2:
				{
				setState(85); return_block();
				}
				break;
			}
			setState(88); match(LPARENS);
			setState(92);
			_la = _input.LA(1);
			if (_la==UNDERSCORE || _la==LETTER) {
				{
				setState(89); variable();
				setState(90); var_type();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94); match(COMMA);
				setState(95); variable();
				setState(96); var_type();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(RPARENS);
			setState(104); match(LABEL);
			setState(110);
			switch (_input.LA(1)) {
			case TEXTTYPE:
			case FLOATTYPE:
			case BOOLTYPE:
				{
				setState(105); var_type();
				setState(107);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(106); array();
					}
					break;
				}
				}
				break;
			case VOIDTYPE:
				{
				setState(109); match(VOIDTYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FuncallContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(AlterNATIVEParser.LABEL, 0); }
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public Array_functionsContext array_functions() {
			return getRuleContext(Array_functionsContext.class,0);
		}
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public Number_functionsContext number_functions() {
			return getRuleContext(Number_functionsContext.class,0);
		}
		public FuncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterFuncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitFuncall(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcall);
		int _la;
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(LPARENS);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNDERSCORE || _la==LETTER) {
					{
					{
					setState(113); variable();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119); match(RPARENS);
				setState(120); match(LABEL);
				setState(121); match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); number_functions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); array_functions();
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

	public static class StmtContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Case_stmtContext case_stmt() {
			return getRuleContext(Case_stmtContext.class,0);
		}
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); print_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); funcall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); case_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130); loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131); input_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132); assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(133); declaration();
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode PRINT() { return getToken(AlterNATIVEParser.PRINT, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public TerminalNode PRINTLN() { return getToken(AlterNATIVEParser.PRINTLN, 0); }
		public TerminalNode DOUBLEQUOTE(int i) {
			return getToken(AlterNATIVEParser.DOUBLEQUOTE, i);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<TerminalNode> DOUBLEQUOTE() { return getTokens(AlterNATIVEParser.DOUBLEQUOTE); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitPrint_stmt(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(LPARENS);
			setState(137); match(DOUBLEQUOTE);
			setState(138); operand();
			setState(139); match(DOUBLEQUOTE);
			setState(140); match(RPARENS);
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==PRINTLN || _la==PRINT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public TerminalNode INPUT() { return getToken(AlterNATIVEParser.INPUT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitInput_stmt(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(LPARENS);
			setState(144); variable();
			setState(145); match(RPARENS);
			setState(146); match(INPUT);
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

	public static class Case_stmtContext extends ParserRuleContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public TerminalNode LARROW() { return getToken(AlterNATIVEParser.LARROW, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public TerminalNode RARROW() { return getToken(AlterNATIVEParser.RARROW, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitCase_stmt(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(RARROW);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149); case_block();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			setState(154); match(LARROW);
			setState(155); match(LPARENS);
			setState(156); operand();
			setState(157); match(RPARENS);
			setState(158); match(T__8);
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
		public TerminalNode LARROW() { return getToken(AlterNATIVEParser.LARROW, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RARROW() { return getToken(AlterNATIVEParser.RARROW, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(RARROW);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (TEXT - 19)) | (1L << (NUMBER - 19)) | (1L << (BOOL - 19)) | (1L << (UNDERSCORE - 19)) | (1L << (LETTER - 19)) | (1L << (LPARENS - 19)) | (1L << (RARROW - 19)) | (1L << (LT - 19)) | (1L << (INC - 19)) | (1L << (DEC - 19)) | (1L << (NULL - 19)))) != 0)) {
				{
				{
				setState(161); stmt();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167); match(LARROW);
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

	public static class Return_blockContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AlterNATIVEParser.RETURN, 0); }
		public TerminalNode LARROW() { return getToken(AlterNATIVEParser.LARROW, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RARROW() { return getToken(AlterNATIVEParser.RARROW, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Return_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterReturn_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitReturn_block(this);
		}
	}

	public final Return_blockContext return_block() throws RecognitionException {
		Return_blockContext _localctx = new Return_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(RARROW);
			setState(170); match(RETURN);
			setState(171); operand();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (TEXT - 19)) | (1L << (NUMBER - 19)) | (1L << (BOOL - 19)) | (1L << (UNDERSCORE - 19)) | (1L << (LETTER - 19)) | (1L << (LPARENS - 19)) | (1L << (RARROW - 19)) | (1L << (LT - 19)) | (1L << (INC - 19)) | (1L << (DEC - 19)) | (1L << (NULL - 19)))) != 0)) {
				{
				{
				setState(172); stmt();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178); match(LARROW);
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

	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode EXCLAIM() { return getToken(AlterNATIVEParser.EXCLAIM, 0); }
		public TerminalNode COLON() { return getToken(AlterNATIVEParser.COLON, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Case_conditionContext case_condition() {
			return getRuleContext(Case_conditionContext.class,0);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterCase_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitCase_block(this);
		}
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_case_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(T__15);
			setState(181); match(EXCLAIM);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (TEXT - 19)) | (1L << (NUMBER - 19)) | (1L << (BOOL - 19)) | (1L << (UNDERSCORE - 19)) | (1L << (LETTER - 19)) | (1L << (LPARENS - 19)) | (1L << (RARROW - 19)) | (1L << (LT - 19)) | (1L << (INC - 19)) | (1L << (DEC - 19)) | (1L << (NULL - 19)))) != 0)) {
				{
				{
				setState(182); stmt();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188); match(COLON);
			setState(189); case_condition();
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

	public static class Case_conditionContext extends ParserRuleContext {
		public Bool_operatorContext bool_operator() {
			return getRuleContext(Bool_operatorContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Case_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterCase_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitCase_condition(this);
		}
	}

	public final Case_conditionContext case_condition() throws RecognitionException {
		Case_conditionContext _localctx = new Case_conditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_case_condition);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(191); match(T__3);
				setState(192); bool_operator();
				setState(193); operand();
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(T__11);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public Bool_stmtContext bool_stmt() {
			return getRuleContext(Bool_stmtContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(198); block();
				setState(199); match(T__13);
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203); block();
					setState(204); match(T__16);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(211); block();
			setState(212); match(LPARENS);
			setState(213); bool_stmt();
			setState(214); match(RPARENS);
			setState(215); match(T__7);
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

	public static class Bool_stmtContext extends ParserRuleContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public FuncallContext funcall(int i) {
			return getRuleContext(FuncallContext.class,i);
		}
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public Bool_stmtContext bool_stmt() {
			return getRuleContext(Bool_stmtContext.class,0);
		}
		public List<Bool_operationContext> bool_operation() {
			return getRuleContexts(Bool_operationContext.class);
		}
		public List<FuncallContext> funcall() {
			return getRuleContexts(FuncallContext.class);
		}
		public Logic_connectorContext logic_connector(int i) {
			return getRuleContext(Logic_connectorContext.class,i);
		}
		public Bool_operationContext bool_operation(int i) {
			return getRuleContext(Bool_operationContext.class,i);
		}
		public List<Logic_connectorContext> logic_connector() {
			return getRuleContexts(Logic_connectorContext.class);
		}
		public Bool_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterBool_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitBool_stmt(this);
		}
	}

	public final Bool_stmtContext bool_stmt() throws RecognitionException {
		Bool_stmtContext _localctx = new Bool_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_stmt);
		try {
			int _alt;
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); match(LPARENS);
				setState(218); bool_stmt();
				setState(219); match(RPARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(221); bool_operation();
							}
							break;
						case 2:
							{
							setState(222); funcall();
							}
							break;
						}
						setState(225); logic_connector();
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(234);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(232); bool_operation();
					}
					break;
				case 2:
					{
					setState(233); funcall();
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

	public static class Logic_connectorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AlterNATIVEParser.AND, 0); }
		public TerminalNode OR() { return getToken(AlterNATIVEParser.OR, 0); }
		public Logic_connectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_connector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterLogic_connector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitLogic_connector(this);
		}
	}

	public final Logic_connectorContext logic_connector() throws RecognitionException {
		Logic_connectorContext _localctx = new Logic_connectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logic_connector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OperationsContext extends ParserRuleContext {
		public Text_operationContext text_operation() {
			return getRuleContext(Text_operationContext.class,0);
		}
		public Bool_operationContext bool_operation() {
			return getRuleContext(Bool_operationContext.class,0);
		}
		public Number_operationContext number_operation() {
			return getRuleContext(Number_operationContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitOperations(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operations);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); number_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); text_operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242); bool_operation();
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

	public static class Array_functionsContext extends ParserRuleContext {
		public Array_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_functions; }
	 
		public Array_functionsContext() { }
		public void copyFrom(Array_functionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Slice_arrayContext extends Array_functionsContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public TerminalNode COMMA() { return getToken(AlterNATIVEParser.COMMA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Slice_arrayContext(Array_functionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterSlice_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitSlice_array(this);
		}
	}
	public static class MergeContext extends Array_functionsContext {
		public TerminalNode EQUALS() { return getToken(AlterNATIVEParser.EQUALS, 0); }
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public MergeContext(Array_functionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterMerge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitMerge(this);
		}
	}
	public static class LengthContext extends Array_functionsContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LengthContext(Array_functionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitLength(this);
		}
	}
	public static class JoinContext extends Array_functionsContext {
		public TerminalNode EQUALS() { return getToken(AlterNATIVEParser.EQUALS, 0); }
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public JoinContext(Array_functionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitJoin(this);
		}
	}

	public final Array_functionsContext array_functions() throws RecognitionException {
		Array_functionsContext _localctx = new Array_functionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array_functions);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new MergeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245); match(LPARENS);
				setState(246); variable();
				setState(247); match(EQUALS);
				setState(248); variable();
				setState(249); match(RPARENS);
				setState(250); match(T__1);
				}
				break;
			case 2:
				_localctx = new JoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252); match(LPARENS);
				setState(253); variable();
				setState(254); match(EQUALS);
				setState(255); variable();
				setState(256); match(RPARENS);
				setState(257); match(T__0);
				}
				break;
			case 3:
				_localctx = new LengthContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259); match(LPARENS);
				setState(260); variable();
				setState(261); match(RPARENS);
				setState(262); match(T__2);
				}
				break;
			case 4:
				_localctx = new Slice_arrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264); variable();
				setState(265); match(T__4);
				setState(266); match(LPARENS);
				setState(267); value();
				setState(268); match(COMMA);
				setState(269); value();
				setState(270); match(RPARENS);
				setState(271); match(T__14);
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

	public static class Number_operationContext extends ParserRuleContext {
		public Number_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_operation; }
	 
		public Number_operationContext() { }
		public void copyFrom(Number_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends Number_operationContext {
		public TerminalNode ADD() { return getToken(AlterNATIVEParser.ADD, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public AddContext(Number_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitAdd(this);
		}
	}
	public static class ToPowerContext extends Number_operationContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode POW() { return getToken(AlterNATIVEParser.POW, 0); }
		public ToPowerContext(Number_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterToPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitToPower(this);
		}
	}
	public static class Brackets_precedenceContext extends Number_operationContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public Number_operationContext number_operation() {
			return getRuleContext(Number_operationContext.class,0);
		}
		public Brackets_precedenceContext(Number_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterBrackets_precedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitBrackets_precedence(this);
		}
	}
	public static class SubtractContext extends Number_operationContext {
		public TerminalNode SUB() { return getToken(AlterNATIVEParser.SUB, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public SubtractContext(Number_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitSubtract(this);
		}
	}
	public static class DivideContext extends Number_operationContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode DIV() { return getToken(AlterNATIVEParser.DIV, 0); }
		public DivideContext(Number_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitDivide(this);
		}
	}
	public static class MultiplyContext extends Number_operationContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AlterNATIVEParser.MUL, 0); }
		public MultiplyContext(Number_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitMultiply(this);
		}
	}
	public static class ModuloContext extends Number_operationContext {
		public TerminalNode MOD() { return getToken(AlterNATIVEParser.MOD, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public ModuloContext(Number_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitModulo(this);
		}
	}

	public final Number_operationContext number_operation() throws RecognitionException {
		Number_operationContext _localctx = new Number_operationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number_operation);
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Brackets_precedenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275); match(LPARENS);
				setState(276); number_operation();
				setState(277); match(RPARENS);
				}
				break;
			case 2:
				_localctx = new ToPowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279); operand();
				setState(280); match(POW);
				setState(281); operand();
				}
				break;
			case 3:
				_localctx = new MultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(283); operand();
				setState(284); match(MUL);
				setState(285); operand();
				}
				break;
			case 4:
				_localctx = new DivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(287); operand();
				setState(288); match(DIV);
				setState(289); operand();
				}
				break;
			case 5:
				_localctx = new ModuloContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(291); operand();
				setState(292); match(MOD);
				setState(293); operand();
				}
				break;
			case 6:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(295); operand();
				setState(296); match(ADD);
				setState(297); operand();
				}
				break;
			case 7:
				_localctx = new SubtractContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(299); operand();
				setState(300); match(SUB);
				setState(301); operand();
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

	public static class Number_functionsContext extends ParserRuleContext {
		public Number_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_functions; }
	 
		public Number_functionsContext() { }
		public void copyFrom(Number_functionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Increment_or_decrementContext extends Number_functionsContext {
		public TerminalNode DEC() { return getToken(AlterNATIVEParser.DEC, 0); }
		public TerminalNode INC() { return getToken(AlterNATIVEParser.INC, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Increment_or_decrementContext(Number_functionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterIncrement_or_decrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitIncrement_or_decrement(this);
		}
	}

	public final Number_functionsContext number_functions() throws RecognitionException {
		Number_functionsContext _localctx = new Number_functionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number_functions);
		int _la;
		try {
			_localctx = new Increment_or_decrementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(306); variable();
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

	public static class Text_operationContext extends ParserRuleContext {
		public Text_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_operation; }
	 
		public Text_operationContext() { }
		public void copyFrom(Text_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Concatinate_textContext extends Text_operationContext {
		public TerminalNode TEXT() { return getToken(AlterNATIVEParser.TEXT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(AlterNATIVEParser.ADD); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ADD(int i) {
			return getToken(AlterNATIVEParser.ADD, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public Concatinate_textContext(Text_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterConcatinate_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitConcatinate_text(this);
		}
	}

	public final Text_operationContext text_operation() throws RecognitionException {
		Text_operationContext _localctx = new Text_operationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_text_operation);
		int _la;
		try {
			_localctx = new Concatinate_textContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(308); match(TEXT);
				}
				break;
			case UNDERSCORE:
			case LETTER:
				{
				setState(309); variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312); match(ADD);
				setState(315);
				switch (_input.LA(1)) {
				case TEXT:
				case NUMBER:
				case BOOL:
					{
					setState(313); value();
					}
					break;
				case UNDERSCORE:
				case LETTER:
					{
					setState(314); variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ADD );
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

	public static class Text_functionContext extends ParserRuleContext {
		public Text_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_function; }
	 
		public Text_functionContext() { }
		public void copyFrom(Text_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Slice_stringContext extends Text_functionContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public TerminalNode COMMA() { return getToken(AlterNATIVEParser.COMMA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Slice_stringContext(Text_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterSlice_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitSlice_string(this);
		}
	}

	public final Text_functionContext text_function() throws RecognitionException {
		Text_functionContext _localctx = new Text_functionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_text_function);
		try {
			_localctx = new Slice_stringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(321); variable();
			setState(322); match(T__4);
			setState(323); match(LPARENS);
			setState(324); value();
			setState(325); match(COMMA);
			setState(326); value();
			setState(327); match(RPARENS);
			setState(328); match(T__14);
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

	public static class Bool_operationContext extends ParserRuleContext {
		public Bool_operatorContext bool_operator() {
			return getRuleContext(Bool_operatorContext.class,0);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public Bool_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterBool_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitBool_operation(this);
		}
	}

	public final Bool_operationContext bool_operation() throws RecognitionException {
		Bool_operationContext _localctx = new Bool_operationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); operand();
			setState(331); bool_operator();
			setState(332); operand();
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

	public static class Bool_operatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(AlterNATIVEParser.EQUALS, 0); }
		public TerminalNode BOOLEQUALS() { return getToken(AlterNATIVEParser.BOOLEQUALS, 0); }
		public TerminalNode EXCLAIM() { return getToken(AlterNATIVEParser.EXCLAIM, 0); }
		public TerminalNode LT() { return getToken(AlterNATIVEParser.LT, 0); }
		public TerminalNode GT() { return getToken(AlterNATIVEParser.GT, 0); }
		public Bool_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterBool_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitBool_operator(this);
		}
	}

	public final Bool_operatorContext bool_operator() throws RecognitionException {
		Bool_operatorContext _localctx = new Bool_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bool_operator);
		try {
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336); match(LT);
				setState(337); match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338); match(GT);
				setState(339); match(EQUALS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340); match(BOOLEQUALS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(341); match(EXCLAIM);
				setState(342); match(EQUALS);
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

	public static class LoopContext extends ParserRuleContext {
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public DountilContext dountil() {
			return getRuleContext(DountilContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loop);
		try {
			setState(348);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345); forloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346); whileloop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347); dountil();
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

	public static class ForloopContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(AlterNATIVEParser.SEMICOLON); }
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode EQUALS() { return getToken(AlterNATIVEParser.EQUALS, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AlterNATIVEParser.SEMICOLON, i);
		}
		public Bool_operationContext bool_operation() {
			return getRuleContext(Bool_operationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Number_operationContext number_operation() {
			return getRuleContext(Number_operationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Number_functionsContext number_functions() {
			return getRuleContext(Number_functionsContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); block();
			{
			setState(351); match(LPARENS);
			setState(357);
			switch (_input.LA(1)) {
			case TEXT:
			case NUMBER:
			case BOOL:
			case UNDERSCORE:
			case LETTER:
			case LPARENS:
			case NULL:
				{
				{
				setState(352); number_operation();
				setState(353); match(EQUALS);
				setState(354); variable();
				}
				}
				break;
			case INC:
			case DEC:
				{
				setState(356); number_functions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359); match(SEMICOLON);
			setState(360); bool_operation();
			setState(361); match(SEMICOLON);
			setState(362); declaration();
			setState(363); match(RPARENS);
			}
			setState(365); match(T__12);
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

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode RPARENS() { return getToken(AlterNATIVEParser.RPARENS, 0); }
		public TerminalNode LPARENS() { return getToken(AlterNATIVEParser.LPARENS, 0); }
		public Bool_stmtContext bool_stmt() {
			return getRuleContext(Bool_stmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AlterNATIVEParser.WHILE, 0); }
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); block();
			{
			setState(368); match(LPARENS);
			setState(369); bool_stmt();
			setState(370); match(RPARENS);
			}
			setState(372); match(WHILE);
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

	public static class DountilContext extends ParserRuleContext {
		public TerminalNode LARROW() { return getToken(AlterNATIVEParser.LARROW, 0); }
		public Bool_stmtContext bool_stmt() {
			return getRuleContext(Bool_stmtContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RARROW() { return getToken(AlterNATIVEParser.RARROW, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public DountilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dountil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterDountil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitDountil(this);
		}
	}

	public final DountilContext dountil() throws RecognitionException {
		DountilContext _localctx = new DountilContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dountil);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(RARROW);
			setState(375); bool_stmt();
			setState(376); match(T__9);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (TEXT - 19)) | (1L << (NUMBER - 19)) | (1L << (BOOL - 19)) | (1L << (UNDERSCORE - 19)) | (1L << (LETTER - 19)) | (1L << (LPARENS - 19)) | (1L << (RARROW - 19)) | (1L << (LT - 19)) | (1L << (INC - 19)) | (1L << (DEC - 19)) | (1L << (NULL - 19)))) != 0)) {
				{
				{
				setState(377); stmt();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383); match(LARROW);
			setState(384); match(T__5);
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

	public static class OperandContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NULL() { return getToken(AlterNATIVEParser.NULL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operand);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case TEXT:
			case NUMBER:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); value();
				}
				break;
			case UNDERSCORE:
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(387); variable();
				setState(389);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(388); array();
					}
					break;
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(391); match(NULL);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AlterNATIVEParser.TEXT, 0); }
		public TerminalNode BOOL() { return getToken(AlterNATIVEParser.BOOL, 0); }
		public TerminalNode NUMBER() { return getToken(AlterNATIVEParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << NUMBER) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode BOOLTYPE() { return getToken(AlterNATIVEParser.BOOLTYPE, 0); }
		public TerminalNode TEXTTYPE() { return getToken(AlterNATIVEParser.TEXTTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(AlterNATIVEParser.FLOATTYPE, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (TEXTTYPE - 62)) | (1L << (FLOATTYPE - 62)) | (1L << (BOOLTYPE - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode DIGIT(int i) {
			return getToken(AlterNATIVEParser.DIGIT, i);
		}
		public TerminalNode LT() { return getToken(AlterNATIVEParser.LT, 0); }
		public TerminalNode GT() { return getToken(AlterNATIVEParser.GT, 0); }
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AlterNATIVEParser.DIGIT); }
		public Number_operationContext number_operation() {
			return getRuleContext(Number_operationContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); match(LT);
			setState(407);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(399); match(DIGIT);
					}
					}
					setState(402); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case 2:
				{
				setState(404); variable();
				}
				break;
			case 3:
				{
				setState(405); funcall();
				}
				break;
			case 4:
				{
				setState(406); number_operation();
				}
				break;
			}
			setState(409); match(GT);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> UNDERSCORE() { return getTokens(AlterNATIVEParser.UNDERSCORE); }
		public List<TerminalNode> LETTER() { return getTokens(AlterNATIVEParser.LETTER); }
		public TerminalNode DIGIT(int i) {
			return getToken(AlterNATIVEParser.DIGIT, i);
		}
		public TerminalNode LETTER(int i) {
			return getToken(AlterNATIVEParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AlterNATIVEParser.DIGIT); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(AlterNATIVEParser.UNDERSCORE, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if (_la==UNDERSCORE) {
				{
				setState(411); match(UNDERSCORE);
				}
			}

			setState(414); match(LETTER);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(415);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << LETTER) | (1L << DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AlterNATIVEParser.CONST, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode LT() { return getToken(AlterNATIVEParser.LT, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode GT() { return getToken(AlterNATIVEParser.GT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode NULLABLE() { return getToken(AlterNATIVEParser.NULLABLE, 0); }
		public TerminalNode EQUALS() { return getToken(AlterNATIVEParser.EQUALS, 0); }
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(421); operand();
				setState(422); match(EQUALS);
				setState(423); variable();
				setState(424); var_type();
				}
				break;
			case 2:
				{
				setState(426); operations();
				setState(427); match(EQUALS);
				setState(428); variable();
				setState(429); var_type();
				}
				break;
			case 3:
				{
				setState(431); funcall();
				setState(432); match(EQUALS);
				setState(433); variable();
				setState(434); var_type();
				}
				break;
			case 4:
				{
				setState(450);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(436); funcall();
					}
					break;
				case 2:
					{
					setState(437); match(LT);
					setState(438); match(GT);
					}
					break;
				case 3:
					{
					setState(439); match(LT);
					setState(440); value();
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(441); match(COMMA);
						setState(442); value();
						}
						}
						setState(447);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(448); match(GT);
					}
					break;
				}
				setState(452); match(EQUALS);
				setState(453); variable();
				setState(454); var_type();
				setState(455); array();
				}
				break;
			}
			setState(460);
			_la = _input.LA(1);
			if (_la==CONST || _la==NULLABLE) {
				{
				setState(459);
				_la = _input.LA(1);
				if ( !(_la==CONST || _la==NULLABLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(AlterNATIVEParser.EQUALS, 0); }
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlterNATIVEListener ) ((AlterNATIVEListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(462); operand();
				setState(463); match(EQUALS);
				setState(464); variable();
				}
				break;
			case 2:
				{
				setState(466); operations();
				setState(467); match(EQUALS);
				setState(468); variable();
				}
				break;
			case 3:
				{
				setState(470); funcall();
				setState(471); match(EQUALS);
				setState(472); variable();
				}
				break;
			}
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(476); array();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u01e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\2\3\2\7\2P\n\2\f"+
		"\2\16\2S\13\2\3\2\3\2\3\3\3\3\5\3Y\n\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\3\3"+
		"\3\3\3\3\3\7\3e\n\3\f\3\16\3h\13\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\3\5\3q\n"+
		"\3\3\4\3\4\7\4u\n\4\f\4\16\4x\13\4\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0089\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\b\u0099\n\b\r\b\16\b\u009a\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\7\n\u00b0\n\n\f\n\16\n\u00b3\13\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"\u00ba\n\13\f\13\16\13\u00bd\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00c7\n\f\3\r\3\r\3\r\5\r\u00cc\n\r\3\r\3\r\3\r\7\r\u00d1\n\r\f\r"+
		"\16\r\u00d4\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00e2\n\16\3\16\3\16\7\16\u00e6\n\16\f\16\16\16\u00e9\13\16\3\16"+
		"\3\16\5\16\u00ed\n\16\5\16\u00ef\n\16\3\17\3\17\3\20\3\20\3\20\5\20\u00f6"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0114\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0132\n\22\3\23\3\23\3\23\3\24\3\24\5\24\u0139"+
		"\n\24\3\24\3\24\3\24\5\24\u013e\n\24\6\24\u0140\n\24\r\24\16\24\u0141"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u015a\n\27\3\30\3\30\3\30"+
		"\5\30\u015f\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0168\n\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\7\33\u017d\n\33\f\33\16\33\u0180\13\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\5\34\u0188\n\34\3\34\5\34\u018b\n\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\6\37\u0193\n\37\r\37\16\37\u0194\3\37\3\37\3\37\5"+
		"\37\u019a\n\37\3\37\3\37\3 \5 \u019f\n \3 \3 \7 \u01a3\n \f \16 \u01a6"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\7!\u01be\n!\f!\16!\u01c1\13!\3!\3!\5!\u01c5\n!\3!\3!\3!\3!\3!\5!\u01cc"+
		"\n!\3!\5!\u01cf\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u01dd\n\"\3\"\5\"\u01e0\n\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@B\2\t\3\2<=\3\2!\"\3\289\3\2\25\27\3\2"+
		"@B\4\2\35\36  \4\2##FF\u0207\2D\3\2\2\2\4X\3\2\2\2\6~\3\2\2\2\b\u0088"+
		"\3\2\2\2\n\u008a\3\2\2\2\f\u0091\3\2\2\2\16\u0096\3\2\2\2\20\u00a2\3\2"+
		"\2\2\22\u00ab\3\2\2\2\24\u00b6\3\2\2\2\26\u00c6\3\2\2\2\30\u00cb\3\2\2"+
		"\2\32\u00ee\3\2\2\2\34\u00f0\3\2\2\2\36\u00f5\3\2\2\2 \u0113\3\2\2\2\""+
		"\u0131\3\2\2\2$\u0133\3\2\2\2&\u0138\3\2\2\2(\u0143\3\2\2\2*\u014c\3\2"+
		"\2\2,\u0159\3\2\2\2.\u015e\3\2\2\2\60\u0160\3\2\2\2\62\u0171\3\2\2\2\64"+
		"\u0178\3\2\2\2\66\u018a\3\2\2\28\u018c\3\2\2\2:\u018e\3\2\2\2<\u0190\3"+
		"\2\2\2>\u019e\3\2\2\2@\u01cb\3\2\2\2B\u01dc\3\2\2\2DH\7\16\2\2EG\5\b\5"+
		"\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\3\2"+
		"\2LQ\3\2\2\2MP\5\4\3\2NP\5@!\2OM\3\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\2\2\3U\3\3\2\2\2VY\5\20\t\2WY\5\22"+
		"\n\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2Z^\7+\2\2[\\\5> \2\\]\5:\36\2]_\3\2"+
		"\2\2^[\3\2\2\2^_\3\2\2\2_f\3\2\2\2`a\7;\2\2ab\5> \2bc\5:\36\2ce\3\2\2"+
		"\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7,\2"+
		"\2jp\7\37\2\2km\5:\36\2ln\5<\37\2ml\3\2\2\2mn\3\2\2\2nq\3\2\2\2oq\7C\2"+
		"\2pk\3\2\2\2po\3\2\2\2q\5\3\2\2\2rv\7+\2\2su\5> \2ts\3\2\2\2ux\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7,\2\2z{\7\37\2\2{\177\7\n"+
		"\2\2|\177\5$\23\2}\177\5 \21\2~r\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\7\3\2"+
		"\2\2\u0080\u0089\5\n\6\2\u0081\u0089\5\6\4\2\u0082\u0089\5\30\r\2\u0083"+
		"\u0089\5\16\b\2\u0084\u0089\5.\30\2\u0085\u0089\5\f\7\2\u0086\u0089\5"+
		"B\"\2\u0087\u0089\5@!\2\u0088\u0080\3\2\2\2\u0088\u0081\3\2\2\2\u0088"+
		"\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\t\3\2\2\2\u008a\u008b"+
		"\7+\2\2\u008b\u008c\7\'\2\2\u008c\u008d\5\66\34\2\u008d\u008e\7\'\2\2"+
		"\u008e\u008f\7,\2\2\u008f\u0090\t\2\2\2\u0090\13\3\2\2\2\u0091\u0092\7"+
		"+\2\2\u0092\u0093\5> \2\u0093\u0094\7,\2\2\u0094\u0095\7?\2\2\u0095\r"+
		"\3\2\2\2\u0096\u0098\7.\2\2\u0097\u0099\5\24\13\2\u0098\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\7-\2\2\u009d\u009e\7+\2\2\u009e\u009f\5\66\34\2\u009f"+
		"\u00a0\7,\2\2\u00a0\u00a1\7\f\2\2\u00a1\17\3\2\2\2\u00a2\u00a6\7.\2\2"+
		"\u00a3\u00a5\5\b\5\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7-\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\7.\2\2\u00ac\u00ad\7>\2\2\u00ad"+
		"\u00b1\5\66\34\2\u00ae\u00b0\5\b\5\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\23\3\2\2\2\u00b6\u00b7\7\5\2\2"+
		"\u00b7\u00bb\7\61\2\2\u00b8\u00ba\5\b\5\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7:\2\2\u00bf\u00c0\5\26\f\2\u00c0\25\3\2\2"+
		"\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\5,\27\2\u00c3\u00c4\5\66\34\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c7\7\t\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7\7\2\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d2\3\2\2\2\u00cd"+
		"\u00ce\5\20\t\2\u00ce\u00cf\7\4\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7"+
		"+\2\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\7,\2\2\u00d9\u00da\7\r\2\2\u00da"+
		"\31\3\2\2\2\u00db\u00dc\7+\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00de\7,\2"+
		"\2\u00de\u00ef\3\2\2\2\u00df\u00e2\5*\26\2\u00e0\u00e2\5\6\4\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\34\17\2"+
		"\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00ed\5*\26\2\u00eb\u00ed\5\6\4\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00db\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ef"+
		"\33\3\2\2\2\u00f0\u00f1\t\3\2\2\u00f1\35\3\2\2\2\u00f2\u00f6\5\"\22\2"+
		"\u00f3\u00f6\5&\24\2\u00f4\u00f6\5*\26\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\37\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8"+
		"\u00f9\5> \2\u00f9\u00fa\7%\2\2\u00fa\u00fb\5> \2\u00fb\u00fc\7,\2\2\u00fc"+
		"\u00fd\7\23\2\2\u00fd\u0114\3\2\2\2\u00fe\u00ff\7+\2\2\u00ff\u0100\5>"+
		" \2\u0100\u0101\7%\2\2\u0101\u0102\5> \2\u0102\u0103\7,\2\2\u0103\u0104"+
		"\7\24\2\2\u0104\u0114\3\2\2\2\u0105\u0106\7+\2\2\u0106\u0107\5> \2\u0107"+
		"\u0108\7,\2\2\u0108\u0109\7\22\2\2\u0109\u0114\3\2\2\2\u010a\u010b\5>"+
		" \2\u010b\u010c\7\20\2\2\u010c\u010d\7+\2\2\u010d\u010e\58\35\2\u010e"+
		"\u010f\7;\2\2\u010f\u0110\58\35\2\u0110\u0111\7,\2\2\u0111\u0112\7\6\2"+
		"\2\u0112\u0114\3\2\2\2\u0113\u00f7\3\2\2\2\u0113\u00fe\3\2\2\2\u0113\u0105"+
		"\3\2\2\2\u0113\u010a\3\2\2\2\u0114!\3\2\2\2\u0115\u0116\7+\2\2\u0116\u0117"+
		"\5\"\22\2\u0117\u0118\7,\2\2\u0118\u0132\3\2\2\2\u0119\u011a\5\66\34\2"+
		"\u011a\u011b\7\62\2\2\u011b\u011c\5\66\34\2\u011c\u0132\3\2\2\2\u011d"+
		"\u011e\5\66\34\2\u011e\u011f\7\63\2\2\u011f\u0120\5\66\34\2\u0120\u0132"+
		"\3\2\2\2\u0121\u0122\5\66\34\2\u0122\u0123\7\64\2\2\u0123\u0124\5\66\34"+
		"\2\u0124\u0132\3\2\2\2\u0125\u0126\5\66\34\2\u0126\u0127\7\67\2\2\u0127"+
		"\u0128\5\66\34\2\u0128\u0132\3\2\2\2\u0129\u012a\5\66\34\2\u012a\u012b"+
		"\7\65\2\2\u012b\u012c\5\66\34\2\u012c\u0132\3\2\2\2\u012d\u012e\5\66\34"+
		"\2\u012e\u012f\7\66\2\2\u012f\u0130\5\66\34\2\u0130\u0132\3\2\2\2\u0131"+
		"\u0115\3\2\2\2\u0131\u0119\3\2\2\2\u0131\u011d\3\2\2\2\u0131\u0121\3\2"+
		"\2\2\u0131\u0125\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012d\3\2\2\2\u0132"+
		"#\3\2\2\2\u0133\u0134\t\4\2\2\u0134\u0135\5> \2\u0135%\3\2\2\2\u0136\u0139"+
		"\7\25\2\2\u0137\u0139\5> \2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013f\3\2\2\2\u013a\u013d\7\65\2\2\u013b\u013e\58\35\2\u013c\u013e\5"+
		"> \2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013a\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\'\3\2\2\2\u0143\u0144\5> \2\u0144\u0145\7\20\2\2\u0145\u0146"+
		"\7+\2\2\u0146\u0147\58\35\2\u0147\u0148\7;\2\2\u0148\u0149\58\35\2\u0149"+
		"\u014a\7,\2\2\u014a\u014b\7\6\2\2\u014b)\3\2\2\2\u014c\u014d\5\66\34\2"+
		"\u014d\u014e\5,\27\2\u014e\u014f\5\66\34\2\u014f+\3\2\2\2\u0150\u015a"+
		"\7/\2\2\u0151\u015a\7\60\2\2\u0152\u0153\7/\2\2\u0153\u015a\7%\2\2\u0154"+
		"\u0155\7\60\2\2\u0155\u015a\7%\2\2\u0156\u015a\7&\2\2\u0157\u0158\7\61"+
		"\2\2\u0158\u015a\7%\2\2\u0159\u0150\3\2\2\2\u0159\u0151\3\2\2\2\u0159"+
		"\u0152\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a-\3\2\2\2\u015b\u015f\5\60\31\2\u015c\u015f\5\62\32\2\u015d"+
		"\u015f\5\64\33\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3"+
		"\2\2\2\u015f/\3\2\2\2\u0160\u0161\5\20\t\2\u0161\u0167\7+\2\2\u0162\u0163"+
		"\5\"\22\2\u0163\u0164\7%\2\2\u0164\u0165\5> \2\u0165\u0168\3\2\2\2\u0166"+
		"\u0168\5$\23\2\u0167\u0162\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\7*\2\2\u016a\u016b\5*\26\2\u016b\u016c\7*\2\2\u016c\u016d"+
		"\5@!\2\u016d\u016e\7,\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\b\2\2\u0170"+
		"\61\3\2\2\2\u0171\u0172\5\20\t\2\u0172\u0173\7+\2\2\u0173\u0174\5\32\16"+
		"\2\u0174\u0175\7,\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7E\2\2\u0177\63"+
		"\3\2\2\2\u0178\u0179\7.\2\2\u0179\u017a\5\32\16\2\u017a\u017e\7\13\2\2"+
		"\u017b\u017d\5\b\5\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0182\7-\2\2\u0182\u0183\7\17\2\2\u0183\65\3\2\2\2\u0184\u018b\58\35"+
		"\2\u0185\u0187\5> \2\u0186\u0188\5<\37\2\u0187\u0186\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018b\7D\2\2\u018a\u0184\3\2\2\2\u018a"+
		"\u0185\3\2\2\2\u018a\u0189\3\2\2\2\u018b\67\3\2\2\2\u018c\u018d\t\5\2"+
		"\2\u018d9\3\2\2\2\u018e\u018f\t\6\2\2\u018f;\3\2\2\2\u0190\u0199\7/\2"+
		"\2\u0191\u0193\7 \2\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019a\3\2\2\2\u0196\u019a\5> \2\u0197"+
		"\u019a\5\6\4\2\u0198\u019a\5\"\22\2\u0199\u0192\3\2\2\2\u0199\u0196\3"+
		"\2\2\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\7\60\2\2\u019c=\3\2\2\2\u019d\u019f\7\35\2\2\u019e\u019d\3\2\2"+
		"\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a4\7\36\2\2\u01a1"+
		"\u01a3\t\7\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5?\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8"+
		"\5\66\34\2\u01a8\u01a9\7%\2\2\u01a9\u01aa\5> \2\u01aa\u01ab\5:\36\2\u01ab"+
		"\u01cc\3\2\2\2\u01ac\u01ad\5\36\20\2\u01ad\u01ae\7%\2\2\u01ae\u01af\5"+
		"> \2\u01af\u01b0\5:\36\2\u01b0\u01cc\3\2\2\2\u01b1\u01b2\5\6\4\2\u01b2"+
		"\u01b3\7%\2\2\u01b3\u01b4\5> \2\u01b4\u01b5\5:\36\2\u01b5\u01cc\3\2\2"+
		"\2\u01b6\u01c5\5\6\4\2\u01b7\u01b8\7/\2\2\u01b8\u01c5\7\60\2\2\u01b9\u01ba"+
		"\7/\2\2\u01ba\u01bf\58\35\2\u01bb\u01bc\7;\2\2\u01bc\u01be\58\35\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\60\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01b6\3\2\2\2\u01c4\u01b7\3\2\2\2\u01c4\u01b9\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7%\2\2\u01c7\u01c8\5> \2\u01c8\u01c9"+
		"\5:\36\2\u01c9\u01ca\5<\37\2\u01ca\u01cc\3\2\2\2\u01cb\u01a7\3\2\2\2\u01cb"+
		"\u01ac\3\2\2\2\u01cb\u01b1\3\2\2\2\u01cb\u01c4\3\2\2\2\u01cc\u01ce\3\2"+
		"\2\2\u01cd\u01cf\t\b\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"A\3\2\2\2\u01d0\u01d1\5\66\34\2\u01d1\u01d2\7%\2\2\u01d2\u01d3\5> \2\u01d3"+
		"\u01dd\3\2\2\2\u01d4\u01d5\5\36\20\2\u01d5\u01d6\7%\2\2\u01d6\u01d7\5"+
		"> \2\u01d7\u01dd\3\2\2\2\u01d8\u01d9\5\6\4\2\u01d9\u01da\7%\2\2\u01da"+
		"\u01db\5> \2\u01db\u01dd\3\2\2\2\u01dc\u01d0\3\2\2\2\u01dc\u01d4\3\2\2"+
		"\2\u01dc\u01d8\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\5<\37\2\u01df\u01de"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0C\3\2\2\2.HOQX^fmpv~\u0088\u009a\u00a6"+
		"\u00b1\u00bb\u00c6\u00cb\u00d2\u00e1\u00e7\u00ec\u00ee\u00f5\u0113\u0131"+
		"\u0138\u013d\u0141\u0159\u015e\u0167\u017e\u0187\u018a\u0194\u0199\u019e"+
		"\u01a4\u01bf\u01c4\u01cb\u01ce\u01dc\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}