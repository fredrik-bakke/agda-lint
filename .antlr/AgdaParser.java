// Generated from /Users/frebak/Repositories/agda-lint/Agda.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AgdaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, LAMBDA=44, TO=45, ID=46, 
		INT=47, STRING=48, NUMBER=49, LINE_COMMENT=50, BLOCK_COMMENT=51, WS=52;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_functionDef = 2, RULE_pattern = 3, 
		RULE_namedArg = 4, RULE_datatypeDecl = 5, RULE_constructorList = 6, RULE_constructorDecl = 7, 
		RULE_recordDecl = 8, RULE_recordBody = 9, RULE_fieldDecl = 10, RULE_inductivity = 11, 
		RULE_moduleDecl = 12, RULE_postulateDecl = 13, RULE_abstractDecl = 14, 
		RULE_instanceDecl = 15, RULE_openDecl = 16, RULE_importDecl = 17, RULE_openSpec = 18, 
		RULE_nameList = 19, RULE_renamingList = 20, RULE_renaming = 21, RULE_pragmaDecl = 22, 
		RULE_pragmaName = 23, RULE_pragmaArgs = 24, RULE_optionDecl = 25, RULE_optionArgs = 26, 
		RULE_fixityDecl = 27, RULE_fixityKeyword = 28, RULE_fixityLevel = 29, 
		RULE_syntaxDecl = 30, RULE_syntaxPattern = 31, RULE_syntaxAtom = 32, RULE_variableDecl = 33, 
		RULE_visibility = 34, RULE_expr = 35, RULE_letBinding = 36, RULE_whereBlock = 37, 
		RULE_withClause = 38, RULE_name = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "functionDef", "pattern", "namedArg", "datatypeDecl", 
			"constructorList", "constructorDecl", "recordDecl", "recordBody", "fieldDecl", 
			"inductivity", "moduleDecl", "postulateDecl", "abstractDecl", "instanceDecl", 
			"openDecl", "importDecl", "openSpec", "nameList", "renamingList", "renaming", 
			"pragmaDecl", "pragmaName", "pragmaArgs", "optionDecl", "optionArgs", 
			"fixityDecl", "fixityKeyword", "fixityLevel", "syntaxDecl", "syntaxPattern", 
			"syntaxAtom", "variableDecl", "visibility", "expr", "letBinding", "whereBlock", 
			"withClause", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'|'", "'('", "')'", "'_'", "'{'", "'}'", "'{{'", 
			"'}}'", "'.'", "'data'", "'where'", "'record'", "'constructor'", "'field'", 
			"'inductive'", "'coinductive'", "'module'", "'postulate'", "'abstract'", 
			"'instance'", "'open'", "'import'", "'public'", "'using'", "'hiding'", 
			"'renaming'", "';'", "'to'", "'{-#'", "'pragma'", "'#-}'", "'OPTIONS'", 
			"'infix'", "'infixl'", "'infixr'", "'syntax'", "'variable'", "'private'", 
			"'let'", "'in'", "'with'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LAMBDA", "TO", "ID", 
			"INT", "STRING", "NUMBER", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "Agda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AgdaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AgdaParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				declaration();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DatatypeDeclContext datatypeDecl() {
			return getRuleContext(DatatypeDeclContext.class,0);
		}
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public RecordDeclContext recordDecl() {
			return getRuleContext(RecordDeclContext.class,0);
		}
		public ModuleDeclContext moduleDecl() {
			return getRuleContext(ModuleDeclContext.class,0);
		}
		public PostulateDeclContext postulateDecl() {
			return getRuleContext(PostulateDeclContext.class,0);
		}
		public AbstractDeclContext abstractDecl() {
			return getRuleContext(AbstractDeclContext.class,0);
		}
		public OpenDeclContext openDecl() {
			return getRuleContext(OpenDeclContext.class,0);
		}
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public PragmaDeclContext pragmaDecl() {
			return getRuleContext(PragmaDeclContext.class,0);
		}
		public OptionDeclContext optionDecl() {
			return getRuleContext(OptionDeclContext.class,0);
		}
		public FixityDeclContext fixityDecl() {
			return getRuleContext(FixityDeclContext.class,0);
		}
		public SyntaxDeclContext syntaxDecl() {
			return getRuleContext(SyntaxDeclContext.class,0);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public InstanceDeclContext instanceDecl() {
			return getRuleContext(InstanceDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				datatypeDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				functionDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				recordDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				moduleDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				postulateDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				abstractDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				openDecl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				importDecl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				pragmaDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
				optionDecl();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(98);
				fixityDecl();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(99);
				syntaxDecl();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(100);
				variableDecl();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(101);
				instanceDecl();
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

	public static class FunctionDefContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<NamedArgContext> namedArg() {
			return getRuleContexts(NamedArgContext.class);
		}
		public NamedArgContext namedArg(int i) {
			return getRuleContext(NamedArgContext.class,i);
		}
		public List<WhereBlockContext> whereBlock() {
			return getRuleContexts(WhereBlockContext.class);
		}
		public WhereBlockContext whereBlock(int i) {
			return getRuleContext(WhereBlockContext.class,i);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			name();
			setState(105);
			match(T__0);
			setState(106);
			expr(0);
			setState(107);
			match(T__1);
			setState(108);
			expr(0);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					match(T__2);
					setState(110);
					name();
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << ID))) != 0)) {
						{
						setState(113);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(111);
							pattern(0);
							}
							break;
						case 2:
							{
							setState(112);
							namedArg();
							}
							break;
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(118);
					match(T__1);
					setState(119);
					expr(0);
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(120);
						whereBlock();
						}
						break;
					}
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(128);
				withClause();
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

	public static class PatternContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(132);
				name();
				}
				break;
			case T__3:
				{
				setState(133);
				match(T__3);
				setState(134);
				pattern(0);
				setState(135);
				match(T__4);
				}
				break;
			case T__5:
				{
				setState(137);
				match(T__5);
				}
				break;
			case T__6:
				{
				setState(138);
				match(T__6);
				setState(139);
				pattern(0);
				setState(140);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(142);
				match(T__8);
				setState(143);
				pattern(0);
				setState(144);
				match(T__9);
				}
				break;
			case T__10:
				{
				setState(146);
				match(T__10);
				setState(147);
				pattern(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(150);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(151);
					pattern(5);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class NamedArgContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public NamedArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArg; }
	}

	public final NamedArgContext namedArg() throws RecognitionException {
		NamedArgContext _localctx = new NamedArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namedArg);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__6);
				setState(158);
				name();
				setState(159);
				match(T__1);
				setState(160);
				pattern(0);
				setState(161);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__8);
				setState(164);
				name();
				setState(165);
				match(T__1);
				setState(166);
				pattern(0);
				setState(167);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__10);
				setState(170);
				name();
				setState(171);
				match(T__1);
				setState(172);
				pattern(0);
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

	public static class DatatypeDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstructorListContext constructorList() {
			return getRuleContext(ConstructorListContext.class,0);
		}
		public DatatypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypeDecl; }
	}

	public final DatatypeDeclContext datatypeDecl() throws RecognitionException {
		DatatypeDeclContext _localctx = new DatatypeDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datatypeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__11);
			setState(177);
			name();
			setState(178);
			match(T__0);
			setState(179);
			expr(0);
			setState(180);
			match(T__12);
			setState(181);
			constructorList();
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

	public static class ConstructorListContext extends ParserRuleContext {
		public List<ConstructorDeclContext> constructorDecl() {
			return getRuleContexts(ConstructorDeclContext.class);
		}
		public ConstructorDeclContext constructorDecl(int i) {
			return getRuleContext(ConstructorDeclContext.class,i);
		}
		public ConstructorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorList; }
	}

	public final ConstructorListContext constructorList() throws RecognitionException {
		ConstructorListContext _localctx = new ConstructorListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					constructorDecl();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ConstructorDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecl; }
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			name();
			setState(190);
			match(T__0);
			setState(191);
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

	public static class RecordDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RecordBodyContext recordBody() {
			return getRuleContext(RecordBodyContext.class,0);
		}
		public RecordDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDecl; }
	}

	public final RecordDeclContext recordDecl() throws RecognitionException {
		RecordDeclContext _localctx = new RecordDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_recordDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__13);
			setState(194);
			name();
			setState(195);
			match(T__0);
			setState(196);
			expr(0);
			setState(197);
			match(T__12);
			setState(198);
			recordBody();
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

	public static class RecordBodyContext extends ParserRuleContext {
		public InductivityContext inductivity() {
			return getRuleContext(InductivityContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_recordBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(200);
				inductivity();
				}
				break;
			}
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(203);
				match(T__14);
				setState(204);
				name();
				}
				break;
			}
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(207);
				match(T__15);
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(208);
						fieldDecl();
						}
						} 
					}
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
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

	public static class FieldDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			name();
			setState(217);
			match(T__0);
			setState(218);
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

	public static class InductivityContext extends ParserRuleContext {
		public InductivityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inductivity; }
	}

	public final InductivityContext inductivity() throws RecognitionException {
		InductivityContext _localctx = new InductivityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inductivity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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

	public static class ModuleDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ModuleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDecl; }
	}

	public final ModuleDeclContext moduleDecl() throws RecognitionException {
		ModuleDeclContext _localctx = new ModuleDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_moduleDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__18);
			setState(223);
			name();
			setState(224);
			match(T__0);
			setState(225);
			expr(0);
			setState(226);
			match(T__12);
			setState(227);
			prog();
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

	public static class PostulateDeclContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PostulateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postulateDecl; }
	}

	public final PostulateDeclContext postulateDecl() throws RecognitionException {
		PostulateDeclContext _localctx = new PostulateDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_postulateDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__19);
			setState(234); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
					name();
					setState(231);
					match(T__0);
					setState(232);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AbstractDeclContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public AbstractDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDecl; }
	}

	public final AbstractDeclContext abstractDecl() throws RecognitionException {
		AbstractDeclContext _localctx = new AbstractDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_abstractDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__20);
			setState(239);
			prog();
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

	public static class InstanceDeclContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public InstanceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceDecl; }
	}

	public final InstanceDeclContext instanceDecl() throws RecognitionException {
		InstanceDeclContext _localctx = new InstanceDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instanceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24 || _la==T__39) {
				{
				setState(241);
				visibility();
				}
			}

			setState(244);
			match(T__21);
			setState(245);
			prog();
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

	public static class OpenDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OpenSpecContext openSpec() {
			return getRuleContext(OpenSpecContext.class,0);
		}
		public OpenDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openDecl; }
	}

	public final OpenDeclContext openDecl() throws RecognitionException {
		OpenDeclContext _localctx = new OpenDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_openDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__22);
			setState(248);
			name();
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(249);
				openSpec();
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

	public static class ImportDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OpenSpecContext openSpec() {
			return getRuleContext(OpenSpecContext.class,0);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_importDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__22);
			setState(253);
			match(T__23);
			setState(254);
			name();
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(255);
				openSpec();
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

	public static class OpenSpecContext extends ParserRuleContext {
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public RenamingListContext renamingList() {
			return getRuleContext(RenamingListContext.class,0);
		}
		public OpenSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openSpec; }
	}

	public final OpenSpecContext openSpec() throws RecognitionException {
		OpenSpecContext _localctx = new OpenSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_openSpec);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(258);
					match(T__24);
					}
				}

				setState(261);
				match(T__25);
				setState(262);
				match(T__3);
				setState(263);
				nameList();
				setState(264);
				match(T__4);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(T__26);
				setState(267);
				match(T__3);
				setState(268);
				nameList();
				setState(269);
				match(T__4);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(T__27);
				setState(272);
				match(T__3);
				setState(273);
				renamingList();
				setState(274);
				match(T__4);
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

	public static class NameListContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			name();
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					match(T__28);
					setState(280);
					name();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class RenamingListContext extends ParserRuleContext {
		public List<RenamingContext> renaming() {
			return getRuleContexts(RenamingContext.class);
		}
		public RenamingContext renaming(int i) {
			return getRuleContext(RenamingContext.class,i);
		}
		public RenamingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renamingList; }
	}

	public final RenamingListContext renamingList() throws RecognitionException {
		RenamingListContext _localctx = new RenamingListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_renamingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			renaming();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(287);
				match(T__28);
				setState(288);
				renaming();
				}
				}
				setState(293);
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

	public static class RenamingContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public RenamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renaming; }
	}

	public final RenamingContext renaming() throws RecognitionException {
		RenamingContext _localctx = new RenamingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			name();
			setState(295);
			match(T__29);
			setState(296);
			name();
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

	public static class PragmaDeclContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public List<PragmaArgsContext> pragmaArgs() {
			return getRuleContexts(PragmaArgsContext.class);
		}
		public PragmaArgsContext pragmaArgs(int i) {
			return getRuleContext(PragmaArgsContext.class,i);
		}
		public PragmaDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDecl; }
	}

	public final PragmaDeclContext pragmaDecl() throws RecognitionException {
		PragmaDeclContext _localctx = new PragmaDeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pragmaDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__30);
			setState(299);
			match(T__31);
			setState(300);
			pragmaName();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(301);
				pragmaArgs();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(T__32);
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

	public static class PragmaNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AgdaParser.ID, 0); }
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(ID);
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

	public static class PragmaArgsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AgdaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(AgdaParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AgdaParser.NUMBER, 0); }
		public PragmaArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaArgs; }
	}

	public final PragmaArgsContext pragmaArgs() throws RecognitionException {
		PragmaArgsContext _localctx = new PragmaArgsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pragmaArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
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

	public static class OptionDeclContext extends ParserRuleContext {
		public List<OptionArgsContext> optionArgs() {
			return getRuleContexts(OptionArgsContext.class);
		}
		public OptionArgsContext optionArgs(int i) {
			return getRuleContext(OptionArgsContext.class,i);
		}
		public OptionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDecl; }
	}

	public final OptionDeclContext optionDecl() throws RecognitionException {
		OptionDeclContext _localctx = new OptionDeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_optionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__30);
			setState(314);
			match(T__33);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(315);
				optionArgs();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(T__32);
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

	public static class OptionArgsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AgdaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(AgdaParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AgdaParser.NUMBER, 0); }
		public OptionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionArgs; }
	}

	public final OptionArgsContext optionArgs() throws RecognitionException {
		OptionArgsContext _localctx = new OptionArgsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_optionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
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

	public static class FixityDeclContext extends ParserRuleContext {
		public FixityKeywordContext fixityKeyword() {
			return getRuleContext(FixityKeywordContext.class,0);
		}
		public FixityLevelContext fixityLevel() {
			return getRuleContext(FixityLevelContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public FixityDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixityDecl; }
	}

	public final FixityDeclContext fixityDecl() throws RecognitionException {
		FixityDeclContext _localctx = new FixityDeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fixityDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			fixityKeyword();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(326);
				fixityLevel();
				}
			}

			setState(334); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(334);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(329);
						name();
						}
						break;
					case T__3:
						{
						setState(330);
						match(T__3);
						setState(331);
						name();
						setState(332);
						match(T__4);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(336); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FixityKeywordContext extends ParserRuleContext {
		public FixityKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixityKeyword; }
	}

	public final FixityKeywordContext fixityKeyword() throws RecognitionException {
		FixityKeywordContext _localctx = new FixityKeywordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fixityKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public static class FixityLevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AgdaParser.INT, 0); }
		public FixityLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixityLevel; }
	}

	public final FixityLevelContext fixityLevel() throws RecognitionException {
		FixityLevelContext _localctx = new FixityLevelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fixityLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(INT);
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

	public static class SyntaxDeclContext extends ParserRuleContext {
		public SyntaxPatternContext syntaxPattern() {
			return getRuleContext(SyntaxPatternContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SyntaxDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxDecl; }
	}

	public final SyntaxDeclContext syntaxDecl() throws RecognitionException {
		SyntaxDeclContext _localctx = new SyntaxDeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_syntaxDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__37);
			setState(343);
			syntaxPattern();
			setState(344);
			match(T__1);
			setState(345);
			name();
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

	public static class SyntaxPatternContext extends ParserRuleContext {
		public List<SyntaxAtomContext> syntaxAtom() {
			return getRuleContexts(SyntaxAtomContext.class);
		}
		public SyntaxAtomContext syntaxAtom(int i) {
			return getRuleContext(SyntaxAtomContext.class,i);
		}
		public SyntaxPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxPattern; }
	}

	public final SyntaxPatternContext syntaxPattern() throws RecognitionException {
		SyntaxPatternContext _localctx = new SyntaxPatternContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_syntaxPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(347);
				syntaxAtom();
				}
				}
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << ID))) != 0) );
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

	public static class SyntaxAtomContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SyntaxPatternContext syntaxPattern() {
			return getRuleContext(SyntaxPatternContext.class,0);
		}
		public SyntaxAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxAtom; }
	}

	public final SyntaxAtomContext syntaxAtom() throws RecognitionException {
		SyntaxAtomContext _localctx = new SyntaxAtomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_syntaxAtom);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__5);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				name();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(T__3);
				setState(355);
				syntaxPattern();
				setState(356);
				match(T__4);
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

	public static class VariableDeclContext extends ParserRuleContext {
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24 || _la==T__39) {
				{
				setState(360);
				visibility();
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(363);
				match(T__38);
				}
			}

			setState(366);
			nameList();
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

	public static class VisibilityContext extends ParserRuleContext {
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__39) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LAMBDA() { return getToken(AgdaParser.LAMBDA, 0); }
		public TerminalNode TO() { return getToken(AgdaParser.TO, 0); }
		public List<LetBindingContext> letBinding() {
			return getRuleContexts(LetBindingContext.class);
		}
		public LetBindingContext letBinding(int i) {
			return getRuleContext(LetBindingContext.class,i);
		}
		public WhereBlockContext whereBlock() {
			return getRuleContext(WhereBlockContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(371);
				name();
				}
				break;
			case 2:
				{
				setState(372);
				match(T__3);
				setState(373);
				expr(0);
				setState(374);
				match(T__4);
				}
				break;
			case 3:
				{
				setState(376);
				match(T__6);
				setState(377);
				expr(0);
				setState(378);
				match(T__7);
				}
				break;
			case 4:
				{
				setState(380);
				match(T__8);
				setState(381);
				expr(0);
				setState(382);
				match(T__9);
				}
				break;
			case 5:
				{
				setState(384);
				match(LAMBDA);
				setState(385);
				name();
				setState(386);
				match(TO);
				setState(387);
				expr(10);
				}
				break;
			case 6:
				{
				setState(389);
				match(LAMBDA);
				setState(390);
				match(T__3);
				setState(391);
				name();
				setState(392);
				match(T__0);
				setState(393);
				expr(0);
				setState(394);
				match(T__4);
				setState(395);
				match(TO);
				setState(396);
				expr(9);
				}
				break;
			case 7:
				{
				setState(398);
				match(LAMBDA);
				setState(399);
				match(T__6);
				setState(400);
				name();
				setState(401);
				match(T__0);
				setState(402);
				expr(0);
				setState(403);
				match(T__7);
				setState(404);
				match(TO);
				setState(405);
				expr(8);
				}
				break;
			case 8:
				{
				setState(407);
				match(LAMBDA);
				setState(408);
				match(T__8);
				setState(409);
				name();
				setState(410);
				match(T__0);
				setState(411);
				expr(0);
				setState(412);
				match(T__9);
				setState(413);
				match(TO);
				setState(414);
				expr(7);
				}
				break;
			case 9:
				{
				setState(416);
				match(T__3);
				setState(417);
				name();
				setState(418);
				match(T__0);
				setState(419);
				expr(0);
				setState(420);
				match(T__4);
				setState(421);
				match(TO);
				setState(422);
				expr(6);
				}
				break;
			case 10:
				{
				setState(424);
				match(T__6);
				setState(425);
				name();
				setState(426);
				match(T__0);
				setState(427);
				expr(0);
				setState(428);
				match(T__7);
				setState(429);
				match(TO);
				setState(430);
				expr(5);
				}
				break;
			case 11:
				{
				setState(432);
				match(T__8);
				setState(433);
				name();
				setState(434);
				match(T__0);
				setState(435);
				expr(0);
				setState(436);
				match(T__9);
				setState(437);
				match(TO);
				setState(438);
				expr(4);
				}
				break;
			case 12:
				{
				setState(440);
				match(T__40);
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(441);
					letBinding();
					}
					}
					setState(444); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(446);
				match(T__41);
				setState(447);
				expr(3);
				}
				break;
			case 13:
				{
				setState(449);
				match(T__13);
				setState(450);
				match(T__6);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(451);
					name();
					setState(452);
					match(T__1);
					setState(453);
					expr(0);
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__28) {
						{
						{
						setState(454);
						match(T__28);
						setState(455);
						name();
						setState(456);
						match(T__1);
						setState(457);
						expr(0);
						}
						}
						setState(463);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(466);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(469);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(470);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(471);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(472);
						whereBlock();
						}
						break;
					}
					} 
				}
				setState(477);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LetBindingContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LetBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBinding; }
	}

	public final LetBindingContext letBinding() throws RecognitionException {
		LetBindingContext _localctx = new LetBindingContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_letBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			name();
			setState(479);
			match(T__0);
			setState(480);
			expr(0);
			setState(481);
			match(T__1);
			setState(482);
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

	public static class WhereBlockContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public WhereBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereBlock; }
	}

	public final WhereBlockContext whereBlock() throws RecognitionException {
		WhereBlockContext _localctx = new WhereBlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whereBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__12);
			setState(486); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(485);
					declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(488); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class WithClauseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<WhereBlockContext> whereBlock() {
			return getRuleContexts(WhereBlockContext.class);
		}
		public WhereBlockContext whereBlock(int i) {
			return getRuleContext(WhereBlockContext.class,i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_withClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__42);
			setState(491);
			expr(0);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(492);
					match(T__2);
					setState(494); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(493);
						name();
						}
						}
						setState(496); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ID );
					setState(498);
					match(T__0);
					setState(499);
					expr(0);
					setState(500);
					match(T__1);
					setState(501);
					expr(0);
					setState(503);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(502);
						whereBlock();
						}
						break;
					}
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AgdaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AgdaParser.ID, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(ID);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					match(T__10);
					setState(512);
					match(ID);
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		case 3:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 35:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0209\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3i\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4t\n\4\f\4\16"+
		"\4w\13\4\3\4\3\4\3\4\5\4|\n\4\7\4~\n\4\f\4\16\4\u0081\13\4\3\4\5\4\u0084"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0097\n\5\3\5\3\5\7\5\u009b\n\5\f\5\16\5\u009e\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b1\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\b\u00bb\n\b\f\b\16\b\u00be\13\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13\u00cc\n\13\3\13\3\13"+
		"\5\13\u00d0\n\13\3\13\3\13\7\13\u00d4\n\13\f\13\16\13\u00d7\13\13\5\13"+
		"\u00d9\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\6\17\u00ed\n\17\r\17\16\17\u00ee\3\20\3\20\3"+
		"\20\3\21\5\21\u00f5\n\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00fd\n\22"+
		"\3\23\3\23\3\23\3\23\5\23\u0103\n\23\3\24\5\24\u0106\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0117"+
		"\n\24\3\25\3\25\3\25\7\25\u011c\n\25\f\25\16\25\u011f\13\25\3\26\3\26"+
		"\3\26\7\26\u0124\n\26\f\26\16\26\u0127\13\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\7\30\u0131\n\30\f\30\16\30\u0134\13\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u013f\n\33\f\33\16\33\u0142\13\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u014a\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\6\35\u0151\n\35\r\35\16\35\u0152\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3"+
		"!\6!\u015f\n!\r!\16!\u0160\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0169\n\"\3#\5"+
		"#\u016c\n#\3#\5#\u016f\n#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u01bd\n%\r%\16%\u01be"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01ce\n%\f%\16%\u01d1\13%\5"+
		"%\u01d3\n%\3%\5%\u01d6\n%\3%\3%\3%\3%\7%\u01dc\n%\f%\16%\u01df\13%\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\6\'\u01e9\n\'\r\'\16\'\u01ea\3(\3(\3(\3(\6(\u01f1"+
		"\n(\r(\16(\u01f2\3(\3(\3(\3(\3(\5(\u01fa\n(\7(\u01fc\n(\f(\16(\u01ff\13"+
		"(\3)\3)\3)\7)\u0204\n)\f)\16)\u0207\13)\3)\2\4\bH*\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\6\3\2\23\24\4\2"+
		"\60\60\62\63\3\2%\'\4\2\33\33**\2\u0229\2U\3\2\2\2\4h\3\2\2\2\6j\3\2\2"+
		"\2\b\u0096\3\2\2\2\n\u00b0\3\2\2\2\f\u00b2\3\2\2\2\16\u00bc\3\2\2\2\20"+
		"\u00bf\3\2\2\2\22\u00c3\3\2\2\2\24\u00cb\3\2\2\2\26\u00da\3\2\2\2\30\u00de"+
		"\3\2\2\2\32\u00e0\3\2\2\2\34\u00e7\3\2\2\2\36\u00f0\3\2\2\2 \u00f4\3\2"+
		"\2\2\"\u00f9\3\2\2\2$\u00fe\3\2\2\2&\u0116\3\2\2\2(\u0118\3\2\2\2*\u0120"+
		"\3\2\2\2,\u0128\3\2\2\2.\u012c\3\2\2\2\60\u0137\3\2\2\2\62\u0139\3\2\2"+
		"\2\64\u013b\3\2\2\2\66\u0145\3\2\2\28\u0147\3\2\2\2:\u0154\3\2\2\2<\u0156"+
		"\3\2\2\2>\u0158\3\2\2\2@\u015e\3\2\2\2B\u0168\3\2\2\2D\u016b\3\2\2\2F"+
		"\u0172\3\2\2\2H\u01d5\3\2\2\2J\u01e0\3\2\2\2L\u01e6\3\2\2\2N\u01ec\3\2"+
		"\2\2P\u0200\3\2\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"VX\3\2\2\2WU\3\2\2\2XY\7\2\2\3Y\3\3\2\2\2Zi\5\f\7\2[i\5\6\4\2\\i\5\22"+
		"\n\2]i\5\32\16\2^i\5\34\17\2_i\5\36\20\2`i\5\"\22\2ai\5$\23\2bi\5.\30"+
		"\2ci\5\64\33\2di\58\35\2ei\5> \2fi\5D#\2gi\5 \21\2hZ\3\2\2\2h[\3\2\2\2"+
		"h\\\3\2\2\2h]\3\2\2\2h^\3\2\2\2h_\3\2\2\2h`\3\2\2\2ha\3\2\2\2hb\3\2\2"+
		"\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\5\3\2\2\2jk\5P)"+
		"\2kl\7\3\2\2lm\5H%\2mn\7\4\2\2n\177\5H%\2op\7\5\2\2pu\5P)\2qt\5\b\5\2"+
		"rt\5\n\6\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2"+
		"wu\3\2\2\2xy\7\4\2\2y{\5H%\2z|\5L\'\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}o"+
		"\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0082\u0084\5N(\2\u0083\u0082\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\7\3\2\2\2\u0085\u0086\b\5\1\2\u0086\u0097\5P)\2\u0087\u0088"+
		"\7\6\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7\7\2\2\u008a\u0097\3\2\2\2\u008b"+
		"\u0097\7\b\2\2\u008c\u008d\7\t\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7\n"+
		"\2\2\u008f\u0097\3\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092\5\b\5\2\u0092"+
		"\u0093\7\f\2\2\u0093\u0097\3\2\2\2\u0094\u0095\7\r\2\2\u0095\u0097\5\b"+
		"\5\3\u0096\u0085\3\2\2\2\u0096\u0087\3\2\2\2\u0096\u008b\3\2\2\2\u0096"+
		"\u008c\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009c\3\2"+
		"\2\2\u0098\u0099\f\6\2\2\u0099\u009b\5\b\5\7\u009a\u0098\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\t\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009f\u00a0\7\t\2\2\u00a0\u00a1\5P)\2\u00a1\u00a2"+
		"\7\4\2\2\u00a2\u00a3\5\b\5\2\u00a3\u00a4\7\n\2\2\u00a4\u00b1\3\2\2\2\u00a5"+
		"\u00a6\7\13\2\2\u00a6\u00a7\5P)\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5\b"+
		"\5\2\u00a9\u00aa\7\f\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ac\7\r\2\2\u00ac"+
		"\u00ad\5P)\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\5\b\5\2\u00af\u00b1\3\2\2"+
		"\2\u00b0\u009f\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1\13"+
		"\3\2\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b4\5P)\2\u00b4\u00b5\7\3\2\2\u00b5"+
		"\u00b6\5H%\2\u00b6\u00b7\7\17\2\2\u00b7\u00b8\5\16\b\2\u00b8\r\3\2\2\2"+
		"\u00b9\u00bb\5\20\t\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\17\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\5P)\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5H%\2\u00c2\21\3\2\2\2\u00c3"+
		"\u00c4\7\20\2\2\u00c4\u00c5\5P)\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7\5H%"+
		"\2\u00c7\u00c8\7\17\2\2\u00c8\u00c9\5\24\13\2\u00c9\23\3\2\2\2\u00ca\u00cc"+
		"\5\30\r\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2"+
		"\u00cd\u00ce\7\21\2\2\u00ce\u00d0\5P)\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d8\3\2\2\2\u00d1\u00d5\7\22\2\2\u00d2\u00d4\5\26\f\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\25\3\2\2\2\u00da\u00db\5P)\2\u00db\u00dc\7\3\2\2"+
		"\u00dc\u00dd\5H%\2\u00dd\27\3\2\2\2\u00de\u00df\t\2\2\2\u00df\31\3\2\2"+
		"\2\u00e0\u00e1\7\25\2\2\u00e1\u00e2\5P)\2\u00e2\u00e3\7\3\2\2\u00e3\u00e4"+
		"\5H%\2\u00e4\u00e5\7\17\2\2\u00e5\u00e6\5\2\2\2\u00e6\33\3\2\2\2\u00e7"+
		"\u00ec\7\26\2\2\u00e8\u00e9\5P)\2\u00e9\u00ea\7\3\2\2\u00ea\u00eb\5H%"+
		"\2\u00eb\u00ed\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\7\27\2\2\u00f1"+
		"\u00f2\5\2\2\2\u00f2\37\3\2\2\2\u00f3\u00f5\5F$\2\u00f4\u00f3\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\30\2\2\u00f7\u00f8"+
		"\5\2\2\2\u00f8!\3\2\2\2\u00f9\u00fa\7\31\2\2\u00fa\u00fc\5P)\2\u00fb\u00fd"+
		"\5&\24\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd#\3\2\2\2\u00fe"+
		"\u00ff\7\31\2\2\u00ff\u0100\7\32\2\2\u0100\u0102\5P)\2\u0101\u0103\5&"+
		"\24\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103%\3\2\2\2\u0104\u0106"+
		"\7\33\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0108\7\34\2\2\u0108\u0109\7\6\2\2\u0109\u010a\5(\25\2\u010a\u010b"+
		"\7\7\2\2\u010b\u0117\3\2\2\2\u010c\u010d\7\35\2\2\u010d\u010e\7\6\2\2"+
		"\u010e\u010f\5(\25\2\u010f\u0110\7\7\2\2\u0110\u0117\3\2\2\2\u0111\u0112"+
		"\7\36\2\2\u0112\u0113\7\6\2\2\u0113\u0114\5*\26\2\u0114\u0115\7\7\2\2"+
		"\u0115\u0117\3\2\2\2\u0116\u0105\3\2\2\2\u0116\u010c\3\2\2\2\u0116\u0111"+
		"\3\2\2\2\u0117\'\3\2\2\2\u0118\u011d\5P)\2\u0119\u011a\7\37\2\2\u011a"+
		"\u011c\5P)\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011e)\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0125"+
		"\5,\27\2\u0121\u0122\7\37\2\2\u0122\u0124\5,\27\2\u0123\u0121\3\2\2\2"+
		"\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126+\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\5P)\2\u0129\u012a\7 \2\2\u012a"+
		"\u012b\5P)\2\u012b-\3\2\2\2\u012c\u012d\7!\2\2\u012d\u012e\7\"\2\2\u012e"+
		"\u0132\5\60\31\2\u012f\u0131\5\62\32\2\u0130\u012f\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\7#\2\2\u0136/\3\2\2\2\u0137\u0138\7\60\2\2"+
		"\u0138\61\3\2\2\2\u0139\u013a\t\3\2\2\u013a\63\3\2\2\2\u013b\u013c\7!"+
		"\2\2\u013c\u0140\7$\2\2\u013d\u013f\5\66\34\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7#\2\2\u0144\65\3\2\2\2\u0145\u0146"+
		"\t\3\2\2\u0146\67\3\2\2\2\u0147\u0149\5:\36\2\u0148\u014a\5<\37\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0150\3\2\2\2\u014b\u0151\5P"+
		")\2\u014c\u014d\7\6\2\2\u014d\u014e\5P)\2\u014e\u014f\7\7\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u014b\3\2\2\2\u0150\u014c\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u01539\3\2\2\2\u0154\u0155\t\4\2\2"+
		"\u0155;\3\2\2\2\u0156\u0157\7\61\2\2\u0157=\3\2\2\2\u0158\u0159\7(\2\2"+
		"\u0159\u015a\5@!\2\u015a\u015b\7\4\2\2\u015b\u015c\5P)\2\u015c?\3\2\2"+
		"\2\u015d\u015f\5B\"\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161A\3\2\2\2\u0162\u0169\7\b\2\2\u0163"+
		"\u0169\5P)\2\u0164\u0165\7\6\2\2\u0165\u0166\5@!\2\u0166\u0167\7\7\2\2"+
		"\u0167\u0169\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164"+
		"\3\2\2\2\u0169C\3\2\2\2\u016a\u016c\5F$\2\u016b\u016a\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\7)\2\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5(\25\2\u0171E\3\2\2\2"+
		"\u0172\u0173\t\5\2\2\u0173G\3\2\2\2\u0174\u0175\b%\1\2\u0175\u01d6\5P"+
		")\2\u0176\u0177\7\6\2\2\u0177\u0178\5H%\2\u0178\u0179\7\7\2\2\u0179\u01d6"+
		"\3\2\2\2\u017a\u017b\7\t\2\2\u017b\u017c\5H%\2\u017c\u017d\7\n\2\2\u017d"+
		"\u01d6\3\2\2\2\u017e\u017f\7\13\2\2\u017f\u0180\5H%\2\u0180\u0181\7\f"+
		"\2\2\u0181\u01d6\3\2\2\2\u0182\u0183\7.\2\2\u0183\u0184\5P)\2\u0184\u0185"+
		"\7/\2\2\u0185\u0186\5H%\f\u0186\u01d6\3\2\2\2\u0187\u0188\7.\2\2\u0188"+
		"\u0189\7\6\2\2\u0189\u018a\5P)\2\u018a\u018b\7\3\2\2\u018b\u018c\5H%\2"+
		"\u018c\u018d\7\7\2\2\u018d\u018e\7/\2\2\u018e\u018f\5H%\13\u018f\u01d6"+
		"\3\2\2\2\u0190\u0191\7.\2\2\u0191\u0192\7\t\2\2\u0192\u0193\5P)\2\u0193"+
		"\u0194\7\3\2\2\u0194\u0195\5H%\2\u0195\u0196\7\n\2\2\u0196\u0197\7/\2"+
		"\2\u0197\u0198\5H%\n\u0198\u01d6\3\2\2\2\u0199\u019a\7.\2\2\u019a\u019b"+
		"\7\13\2\2\u019b\u019c\5P)\2\u019c\u019d\7\3\2\2\u019d\u019e\5H%\2\u019e"+
		"\u019f\7\f\2\2\u019f\u01a0\7/\2\2\u01a0\u01a1\5H%\t\u01a1\u01d6\3\2\2"+
		"\2\u01a2\u01a3\7\6\2\2\u01a3\u01a4\5P)\2\u01a4\u01a5\7\3\2\2\u01a5\u01a6"+
		"\5H%\2\u01a6\u01a7\7\7\2\2\u01a7\u01a8\7/\2\2\u01a8\u01a9\5H%\b\u01a9"+
		"\u01d6\3\2\2\2\u01aa\u01ab\7\t\2\2\u01ab\u01ac\5P)\2\u01ac\u01ad\7\3\2"+
		"\2\u01ad\u01ae\5H%\2\u01ae\u01af\7\n\2\2\u01af\u01b0\7/\2\2\u01b0\u01b1"+
		"\5H%\7\u01b1\u01d6\3\2\2\2\u01b2\u01b3\7\13\2\2\u01b3\u01b4\5P)\2\u01b4"+
		"\u01b5\7\3\2\2\u01b5\u01b6\5H%\2\u01b6\u01b7\7\f\2\2\u01b7\u01b8\7/\2"+
		"\2\u01b8\u01b9\5H%\6\u01b9\u01d6\3\2\2\2\u01ba\u01bc\7+\2\2\u01bb\u01bd"+
		"\5J&\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c2\5H%"+
		"\5\u01c2\u01d6\3\2\2\2\u01c3\u01c4\7\20\2\2\u01c4\u01d2\7\t\2\2\u01c5"+
		"\u01c6\5P)\2\u01c6\u01c7\7\4\2\2\u01c7\u01cf\5H%\2\u01c8\u01c9\7\37\2"+
		"\2\u01c9\u01ca\5P)\2\u01ca\u01cb\7\4\2\2\u01cb\u01cc\5H%\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01c8\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01c5\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\7\n\2\2\u01d5"+
		"\u0174\3\2\2\2\u01d5\u0176\3\2\2\2\u01d5\u017a\3\2\2\2\u01d5\u017e\3\2"+
		"\2\2\u01d5\u0182\3\2\2\2\u01d5\u0187\3\2\2\2\u01d5\u0190\3\2\2\2\u01d5"+
		"\u0199\3\2\2\2\u01d5\u01a2\3\2\2\2\u01d5\u01aa\3\2\2\2\u01d5\u01b2\3\2"+
		"\2\2\u01d5\u01ba\3\2\2\2\u01d5\u01c3\3\2\2\2\u01d6\u01dd\3\2\2\2\u01d7"+
		"\u01d8\f\20\2\2\u01d8\u01dc\5H%\21\u01d9\u01da\f\4\2\2\u01da\u01dc\5L"+
		"\'\2\u01db\u01d7\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01deI\3\2\2\2\u01df\u01dd\3\2\2\2"+
		"\u01e0\u01e1\5P)\2\u01e1\u01e2\7\3\2\2\u01e2\u01e3\5H%\2\u01e3\u01e4\7"+
		"\4\2\2\u01e4\u01e5\5H%\2\u01e5K\3\2\2\2\u01e6\u01e8\7\17\2\2\u01e7\u01e9"+
		"\5\4\3\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01ebM\3\2\2\2\u01ec\u01ed\7-\2\2\u01ed\u01fd\5H%\2\u01ee"+
		"\u01f0\7\5\2\2\u01ef\u01f1\5P)\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2"+
		"\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\7\3\2\2\u01f5\u01f6\5H%\2\u01f6\u01f7\7\4\2\2\u01f7\u01f9\5H%\2\u01f8"+
		"\u01fa\5L\'\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2"+
		"\2\2\u01fb\u01ee\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01feO\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0205\7\60\2\2"+
		"\u0201\u0202\7\r\2\2\u0202\u0204\7\60\2\2\u0203\u0201\3\2\2\2\u0204\u0207"+
		"\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206Q\3\2\2\2\u0207"+
		"\u0205\3\2\2\2-Uhsu{\177\u0083\u0096\u009c\u00b0\u00bc\u00cb\u00cf\u00d5"+
		"\u00d8\u00ee\u00f4\u00fc\u0102\u0105\u0116\u011d\u0125\u0132\u0140\u0149"+
		"\u0150\u0152\u0160\u0168\u016b\u016e\u01be\u01cf\u01d2\u01d5\u01db\u01dd"+
		"\u01ea\u01f2\u01f9\u01fd\u0205";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}