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
		T__24=25, T__25=26, T__26=27, ID=28, INT=29, PRAGMA_KEYWORD=30, OPTION_KEYWORD=31, 
		WS=32;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_datatypeDecl = 2, RULE_constructorList = 3, 
		RULE_constructorDecl = 4, RULE_functionDef = 5, RULE_recordDecl = 6, RULE_recordBody = 7, 
		RULE_fieldDecl = 8, RULE_moduleDecl = 9, RULE_postulateDecl = 10, RULE_abstractDecl = 11, 
		RULE_openDecl = 12, RULE_importDecl = 13, RULE_openSpec = 14, RULE_nameList = 15, 
		RULE_renamingList = 16, RULE_renaming = 17, RULE_pragmaDecl = 18, RULE_optionDecl = 19, 
		RULE_expr = 20, RULE_sort = 21, RULE_name = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "datatypeDecl", "constructorList", "constructorDecl", 
			"functionDef", "recordDecl", "recordBody", "fieldDecl", "moduleDecl", 
			"postulateDecl", "abstractDecl", "openDecl", "importDecl", "openSpec", 
			"nameList", "renamingList", "renaming", "pragmaDecl", "optionDecl", "expr", 
			"sort", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'data'", "':'", "'where'", "'='", "'record'", "'field'", "'constructor'", 
			"'module'", "'postulate'", "'abstract'", "'open'", "'import'", "'public'", 
			"'using'", "'('", "')'", "'hiding'", "'renaming'", "','", "'to'", "'pragma'", 
			"'option'", "'\u03BB'", "'->'", "'Set'", "'\u03C9'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "INT", "PRAGMA_KEYWORD", "OPTION_KEYWORD", 
			"WS"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				declaration();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				datatypeDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				functionDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				recordDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				moduleDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				postulateDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				abstractDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				openDecl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
				importDecl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				pragmaDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				optionDecl();
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
		enterRule(_localctx, 4, RULE_datatypeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			name();
			setState(68);
			match(T__1);
			setState(69);
			expr(0);
			setState(70);
			match(T__2);
			setState(71);
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
		enterRule(_localctx, 6, RULE_constructorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					constructorDecl();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		enterRule(_localctx, 8, RULE_constructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			name();
			setState(80);
			match(T__1);
			setState(81);
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

	public static class FunctionDefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			name();
			setState(84);
			match(T__1);
			setState(85);
			expr(0);
			setState(86);
			match(T__3);
			setState(87);
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
		enterRule(_localctx, 12, RULE_recordDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__4);
			setState(90);
			name();
			setState(91);
			match(T__1);
			setState(92);
			expr(0);
			setState(93);
			match(T__2);
			setState(94);
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
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recordBody);
		try {
			int _alt;
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__5);
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(97);
						fieldDecl();
						}
						} 
					}
					setState(102);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__6);
				setState(104);
				name();
				setState(105);
				match(T__5);
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						fieldDecl();
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
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
		enterRule(_localctx, 16, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			name();
			setState(115);
			match(T__1);
			setState(116);
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
		enterRule(_localctx, 18, RULE_moduleDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__7);
			setState(119);
			name();
			setState(120);
			match(T__1);
			setState(121);
			expr(0);
			setState(122);
			match(T__2);
			setState(123);
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
		enterRule(_localctx, 20, RULE_postulateDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__8);
			setState(130); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(126);
					name();
					setState(127);
					match(T__1);
					setState(128);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 22, RULE_abstractDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__9);
			setState(135);
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
		enterRule(_localctx, 24, RULE_openDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__10);
			setState(138);
			name();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(139);
				openSpec();
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
		enterRule(_localctx, 26, RULE_importDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__10);
			setState(143);
			match(T__11);
			setState(144);
			name();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(145);
				openSpec();
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
		enterRule(_localctx, 28, RULE_openSpec);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(148);
					match(T__12);
					}
				}

				setState(151);
				match(T__13);
				setState(152);
				match(T__14);
				setState(153);
				nameList();
				setState(154);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__16);
				setState(157);
				match(T__14);
				setState(158);
				nameList();
				setState(159);
				match(T__15);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__17);
				setState(162);
				match(T__14);
				setState(163);
				renamingList();
				setState(164);
				match(T__15);
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
		enterRule(_localctx, 30, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			name();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(169);
				match(T__18);
				setState(170);
				name();
				}
				}
				setState(175);
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
		enterRule(_localctx, 32, RULE_renamingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			renaming();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(177);
				match(T__18);
				setState(178);
				renaming();
				}
				}
				setState(183);
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
		enterRule(_localctx, 34, RULE_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			name();
			setState(185);
			match(T__19);
			setState(186);
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
		public TerminalNode PRAGMA_KEYWORD() { return getToken(AgdaParser.PRAGMA_KEYWORD, 0); }
		public PragmaDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDecl; }
	}

	public final PragmaDeclContext pragmaDecl() throws RecognitionException {
		PragmaDeclContext _localctx = new PragmaDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pragmaDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__20);
			setState(189);
			match(PRAGMA_KEYWORD);
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
		public TerminalNode OPTION_KEYWORD() { return getToken(AgdaParser.OPTION_KEYWORD, 0); }
		public OptionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDecl; }
	}

	public final OptionDeclContext optionDecl() throws RecognitionException {
		OptionDeclContext _localctx = new OptionDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_optionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__21);
			setState(192);
			match(OPTION_KEYWORD);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(195);
				name();
				}
				break;
			case 2:
				{
				setState(196);
				match(T__22);
				setState(197);
				name();
				setState(198);
				match(T__23);
				setState(199);
				expr(5);
				}
				break;
			case 3:
				{
				setState(201);
				match(T__14);
				setState(202);
				expr(0);
				setState(203);
				match(T__15);
				}
				break;
			case 4:
				{
				setState(205);
				match(T__14);
				setState(206);
				name();
				setState(207);
				match(T__1);
				setState(208);
				expr(0);
				setState(209);
				match(T__15);
				setState(210);
				match(T__23);
				setState(211);
				expr(2);
				}
				break;
			case 5:
				{
				setState(213);
				sort();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(216);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(217);
					expr(4);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class SortContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AgdaParser.INT, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sort);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__24);
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
		enterRule(_localctx, 44, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					match(T__26);
					setState(230);
					match(ID);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3C\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5M\n\5\f\5\16\5P\13\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\7\te\n\t\f\t\16\th\13\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\5\t"+
		"s\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\6\f\u0085\n\f\r\f\16\f\u0086\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u008f"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u0095\n\17\3\20\5\20\u0098\n\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00a9\n\20\3\21\3\21\3\21\7\21\u00ae\n\21\f\21\16\21\u00b1\13\21\3"+
		"\22\3\22\3\22\7\22\u00b6\n\22\f\22\16\22\u00b9\13\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d9"+
		"\n\26\3\26\3\26\7\26\u00dd\n\26\f\26\16\26\u00e0\13\26\3\27\3\27\3\27"+
		"\5\27\u00e5\n\27\3\30\3\30\3\30\7\30\u00ea\n\30\f\30\16\30\u00ed\13\30"+
		"\3\30\2\3*\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\4\2"+
		"\34\34\37\37\2\u00f4\2\63\3\2\2\2\4B\3\2\2\2\6D\3\2\2\2\bN\3\2\2\2\nQ"+
		"\3\2\2\2\fU\3\2\2\2\16[\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24x\3\2\2\2\26"+
		"\177\3\2\2\2\30\u0088\3\2\2\2\32\u008b\3\2\2\2\34\u0090\3\2\2\2\36\u00a8"+
		"\3\2\2\2 \u00aa\3\2\2\2\"\u00b2\3\2\2\2$\u00ba\3\2\2\2&\u00be\3\2\2\2"+
		"(\u00c1\3\2\2\2*\u00d8\3\2\2\2,\u00e4\3\2\2\2.\u00e6\3\2\2\2\60\62\5\4"+
		"\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2"+
		"\2\2\65\63\3\2\2\2\66\67\7\2\2\3\67\3\3\2\2\28C\5\6\4\29C\5\f\7\2:C\5"+
		"\16\b\2;C\5\24\13\2<C\5\26\f\2=C\5\30\r\2>C\5\32\16\2?C\5\34\17\2@C\5"+
		"&\24\2AC\5(\25\2B8\3\2\2\2B9\3\2\2\2B:\3\2\2\2B;\3\2\2\2B<\3\2\2\2B=\3"+
		"\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\5\3\2\2\2DE\7\3\2\2EF"+
		"\5.\30\2FG\7\4\2\2GH\5*\26\2HI\7\5\2\2IJ\5\b\5\2J\7\3\2\2\2KM\5\n\6\2"+
		"LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PN\3\2\2\2QR\5.\30"+
		"\2RS\7\4\2\2ST\5*\26\2T\13\3\2\2\2UV\5.\30\2VW\7\4\2\2WX\5*\26\2XY\7\6"+
		"\2\2YZ\5*\26\2Z\r\3\2\2\2[\\\7\7\2\2\\]\5.\30\2]^\7\4\2\2^_\5*\26\2_`"+
		"\7\5\2\2`a\5\20\t\2a\17\3\2\2\2bf\7\b\2\2ce\5\22\n\2dc\3\2\2\2eh\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2gs\3\2\2\2hf\3\2\2\2ij\7\t\2\2jk\5.\30\2ko\7\b\2"+
		"\2ln\5\22\n\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2"+
		"\2\2rb\3\2\2\2ri\3\2\2\2s\21\3\2\2\2tu\5.\30\2uv\7\4\2\2vw\5*\26\2w\23"+
		"\3\2\2\2xy\7\n\2\2yz\5.\30\2z{\7\4\2\2{|\5*\26\2|}\7\5\2\2}~\5\2\2\2~"+
		"\25\3\2\2\2\177\u0084\7\13\2\2\u0080\u0081\5.\30\2\u0081\u0082\7\4\2\2"+
		"\u0082\u0083\5*\26\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\27\3\2\2\2\u0088"+
		"\u0089\7\f\2\2\u0089\u008a\5\2\2\2\u008a\31\3\2\2\2\u008b\u008c\7\r\2"+
		"\2\u008c\u008e\5.\30\2\u008d\u008f\5\36\20\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\33\3\2\2\2\u0090\u0091\7\r\2\2\u0091\u0092\7\16\2"+
		"\2\u0092\u0094\5.\30\2\u0093\u0095\5\36\20\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\35\3\2\2\2\u0096\u0098\7\17\2\2\u0097\u0096\3\2\2"+
		"\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\20\2\2\u009a"+
		"\u009b\7\21\2\2\u009b\u009c\5 \21\2\u009c\u009d\7\22\2\2\u009d\u00a9\3"+
		"\2\2\2\u009e\u009f\7\23\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\5 \21\2\u00a1"+
		"\u00a2\7\22\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\7"+
		"\21\2\2\u00a5\u00a6\5\"\22\2\u00a6\u00a7\7\22\2\2\u00a7\u00a9\3\2\2\2"+
		"\u00a8\u0097\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\37"+
		"\3\2\2\2\u00aa\u00af\5.\30\2\u00ab\u00ac\7\25\2\2\u00ac\u00ae\5.\30\2"+
		"\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0!\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b7\5$\23\2\u00b3"+
		"\u00b4\7\25\2\2\u00b4\u00b6\5$\23\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\5.\30\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\5.\30\2"+
		"\u00bd%\3\2\2\2\u00be\u00bf\7\27\2\2\u00bf\u00c0\7 \2\2\u00c0\'\3\2\2"+
		"\2\u00c1\u00c2\7\30\2\2\u00c2\u00c3\7!\2\2\u00c3)\3\2\2\2\u00c4\u00c5"+
		"\b\26\1\2\u00c5\u00d9\5.\30\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\5.\30\2"+
		"\u00c8\u00c9\7\32\2\2\u00c9\u00ca\5*\26\7\u00ca\u00d9\3\2\2\2\u00cb\u00cc"+
		"\7\21\2\2\u00cc\u00cd\5*\26\2\u00cd\u00ce\7\22\2\2\u00ce\u00d9\3\2\2\2"+
		"\u00cf\u00d0\7\21\2\2\u00d0\u00d1\5.\30\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3"+
		"\5*\26\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\7\32\2\2\u00d5\u00d6\5*\26\4"+
		"\u00d6\u00d9\3\2\2\2\u00d7\u00d9\5,\27\2\u00d8\u00c4\3\2\2\2\u00d8\u00c6"+
		"\3\2\2\2\u00d8\u00cb\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00de\3\2\2\2\u00da\u00db\f\5\2\2\u00db\u00dd\5*\26\6\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"+\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e5\7\33\2\2\u00e2\u00e3\7\33\2"+
		"\2\u00e3\u00e5\t\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5-"+
		"\3\2\2\2\u00e6\u00eb\7\36\2\2\u00e7\u00e8\7\35\2\2\u00e8\u00ea\7\36\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec/\3\2\2\2\u00ed\u00eb\3\2\2\2\23\63BNfor\u0086\u008e\u0094"+
		"\u0097\u00a8\u00af\u00b7\u00d8\u00de\u00e4\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}