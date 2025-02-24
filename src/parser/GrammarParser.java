// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		IDENT=18, INT_LITERAL=19, REAL=20, INT=21, FLOAT=22, READ=23, PRINT=24, 
		LINE_COMMENT=25, MULTILINE_COMMENT=26, WHITESPACE=27, CHAR_LITERAL=28, 
		LITENT=29, LITREAL=30;
	public static final int
		RULE_program = 0, RULE_definicion = 1, RULE_tipo = 2, RULE_sentencia = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definicion", "tipo", "sentencia", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "';'", "'float'", "'char'", "'='", "'if'", "'('", 
			"')'", "'{'", "'}'", "'else'", "'while'", "'+'", "'!='", "'<'", "'>'", 
			null, null, null, "'int'", "'real'", "'read'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENT", "INT_LITERAL", "REAL", "INT", 
			"FLOAT", "READ", "PRINT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE", 
			"CHAR_LITERAL", "LITENT", "LITREAL"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				definicion();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				sentencia();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 25436288L) != 0 );
			setState(20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinicionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(IDENT);
			setState(24);
			match(T__1);
			setState(25);
			tipo();
			setState(26);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 6291504L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode READ() { return getToken(GrammarParser.READ, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(PRINT);
				setState(31);
				expr(0);
				setState(32);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(READ);
				setState(35);
				match(IDENT);
				setState(36);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(IDENT);
				setState(38);
				match(T__5);
				setState(39);
				expr(0);
				setState(40);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__6);
				setState(43);
				match(T__7);
				setState(44);
				expr(0);
				setState(45);
				match(T__8);
				setState(46);
				match(T__9);
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					sentencia();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 25436288L) != 0 );
				setState(52);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(T__6);
				setState(55);
				match(T__7);
				setState(56);
				expr(0);
				setState(57);
				match(T__8);
				setState(58);
				match(T__9);
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					sentencia();
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 25436288L) != 0 );
				setState(64);
				match(T__10);
				setState(65);
				match(T__11);
				setState(66);
				match(T__9);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					sentencia();
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 25436288L) != 0 );
				setState(72);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(T__12);
				setState(75);
				match(T__7);
				setState(76);
				expr(0);
				setState(77);
				match(T__8);
				setState(78);
				match(T__9);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					sentencia();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 25436288L) != 0 );
				setState(84);
				match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITENT:
				{
				setState(89);
				match(LITENT);
				}
				break;
			case LITREAL:
				{
				setState(90);
				match(LITREAL);
				}
				break;
			case IDENT:
				{
				setState(91);
				match(IDENT);
				}
				break;
			case T__7:
				{
				setState(92);
				match(T__7);
				setState(93);
				expr(0);
				setState(94);
				match(T__8);
				}
				break;
			case T__15:
				{
				setState(96);
				match(T__15);
				setState(97);
				tipo();
				setState(98);
				match(T__16);
				setState(99);
				match(T__7);
				setState(100);
				expr(0);
				setState(101);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(106);
						match(T__13);
						setState(107);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(109);
						match(T__14);
						setState(110);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001eu\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0004\u0000"+
		"\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u00031\b\u0003\u000b\u0003\f\u00032\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003=\b\u0003\u000b\u0003\f\u0003>\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003E\b\u0003\u000b\u0003\f\u0003"+
		"F\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003Q\b\u0003\u000b\u0003\f\u0003R\u0001"+
		"\u0003\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004h\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004p\b\u0004\n\u0004\f\u0004s\t"+
		"\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0001\u0002\u0000\u0004\u0005\u0015\u0016\u0080\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000"+
		"\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000"+
		"\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000"+
		"\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\u0011\u0003\u0006"+
		"\u0003\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0000"+
		"\u0000\u0001\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0001"+
		"\u0000\u0000\u0017\u0018\u0005\u0012\u0000\u0000\u0018\u0019\u0005\u0002"+
		"\u0000\u0000\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001b\u0005\u0003"+
		"\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0007\u0000"+
		"\u0000\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0018"+
		"\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0005\u0003\u0000\u0000!W\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0017\u0000\u0000#$\u0005\u0012\u0000\u0000"+
		"$W\u0005\u0003\u0000\u0000%&\u0005\u0012\u0000\u0000&\'\u0005\u0006\u0000"+
		"\u0000\'(\u0003\b\u0004\u0000()\u0005\u0003\u0000\u0000)W\u0001\u0000"+
		"\u0000\u0000*+\u0005\u0007\u0000\u0000+,\u0005\b\u0000\u0000,-\u0003\b"+
		"\u0004\u0000-.\u0005\t\u0000\u0000.0\u0005\n\u0000\u0000/1\u0003\u0006"+
		"\u0003\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0005\u000b\u0000\u00005W\u0001\u0000\u0000\u000067\u0005\u0007\u0000"+
		"\u000078\u0005\b\u0000\u000089\u0003\b\u0004\u00009:\u0005\t\u0000\u0000"+
		":<\u0005\n\u0000\u0000;=\u0003\u0006\u0003\u0000<;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0005\u000b\u0000\u0000AB\u0005\f\u0000"+
		"\u0000BD\u0005\n\u0000\u0000CE\u0003\u0006\u0003\u0000DC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\u000b\u0000\u0000IW\u0001"+
		"\u0000\u0000\u0000JK\u0005\r\u0000\u0000KL\u0005\b\u0000\u0000LM\u0003"+
		"\b\u0004\u0000MN\u0005\t\u0000\u0000NP\u0005\n\u0000\u0000OQ\u0003\u0006"+
		"\u0003\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0005\u000b\u0000\u0000UW\u0001\u0000\u0000\u0000V\u001e\u0001\u0000"+
		"\u0000\u0000V\"\u0001\u0000\u0000\u0000V%\u0001\u0000\u0000\u0000V*\u0001"+
		"\u0000\u0000\u0000V6\u0001\u0000\u0000\u0000VJ\u0001\u0000\u0000\u0000"+
		"W\u0007\u0001\u0000\u0000\u0000XY\u0006\u0004\uffff\uffff\u0000Yh\u0005"+
		"\u001d\u0000\u0000Zh\u0005\u001e\u0000\u0000[h\u0005\u0012\u0000\u0000"+
		"\\]\u0005\b\u0000\u0000]^\u0003\b\u0004\u0000^_\u0005\t\u0000\u0000_h"+
		"\u0001\u0000\u0000\u0000`a\u0005\u0010\u0000\u0000ab\u0003\u0004\u0002"+
		"\u0000bc\u0005\u0011\u0000\u0000cd\u0005\b\u0000\u0000de\u0003\b\u0004"+
		"\u0000ef\u0005\t\u0000\u0000fh\u0001\u0000\u0000\u0000gX\u0001\u0000\u0000"+
		"\u0000gZ\u0001\u0000\u0000\u0000g[\u0001\u0000\u0000\u0000g\\\u0001\u0000"+
		"\u0000\u0000g`\u0001\u0000\u0000\u0000hq\u0001\u0000\u0000\u0000ij\n\u0004"+
		"\u0000\u0000jk\u0005\u000e\u0000\u0000kp\u0003\b\u0004\u0005lm\n\u0003"+
		"\u0000\u0000mn\u0005\u000f\u0000\u0000np\u0003\b\u0004\u0004oi\u0001\u0000"+
		"\u0000\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\t\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000\n\r\u00122>FRVgoq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}