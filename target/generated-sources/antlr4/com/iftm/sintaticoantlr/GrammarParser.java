// Generated from com\iftm\sintaticoantlr\Grammar.g4 by ANTLR 4.13.0
package com.iftm.sintaticoantlr;
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
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, PROGRAM=2, FOR=3, REPEAT=4, WHILE=5, IF=6, TO=7, UNTIL=8, DO=9, 
		BEGIN=10, ELSE=11, THEN=12, END=13, VAR=14, INTEGER=15, WRITE=16, VIRGULA=17, 
		LETRA=18, DIGITO=19, PONTO_VIRGULA=20, PARENTESES_DIREITO=21, PARENTESES_ESQUERDO=22, 
		DOIS_PONTOS_IGUAL=23, DOIS_PONTOS=24, IGUAL=25, MAIOR=26, MAIOR_IGUAL=27, 
		MENOR=28, MENOR_IGUAL=29, DIFERENTE=30, MULTIPLICACAO=31, DIVISAO=32, 
		ADICAO=33, SUBTRACAO=34, PONTO=35, IDENTIFICADOR=36, WS=37, COMMENT=38, 
		LCOMMENT=39;
	public static final int
		RULE_program = 0, RULE_corpo = 1, RULE_declara = 2, RULE_dvar = 3, RULE_tipo_var = 4, 
		RULE_variaveis = 5, RULE_mais_var = 6, RULE_mais_dc = 7, RULE_cont_dc = 8, 
		RULE_sentencas = 9, RULE_mais_sentencas = 10, RULE_cont_sentencas = 11, 
		RULE_var_read = 12, RULE_mais_var_read = 13, RULE_var_write = 14, RULE_mais_var_write = 15, 
		RULE_comando = 16, RULE_condicao = 17, RULE_pfalsa = 18, RULE_relacao = 19, 
		RULE_expressao = 20, RULE_outros_termos = 21, RULE_op_ad = 22, RULE_termo = 23, 
		RULE_mais_fatores = 24, RULE_op_mul = 25, RULE_fator = 26, RULE_intnum = 27, 
		RULE_id = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "corpo", "declara", "dvar", "tipo_var", "variaveis", "mais_var", 
			"mais_dc", "cont_dc", "sentencas", "mais_sentencas", "cont_sentencas", 
			"var_read", "mais_var_read", "var_write", "mais_var_write", "comando", 
			"condicao", "pfalsa", "relacao", "expressao", "outros_termos", "op_ad", 
			"termo", "mais_fatores", "op_mul", "fator", "intnum", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "','", null, null, "';'", "')'", "'('", 
			"':='", "':'", "'='", "'>'", "'>='", "'<'", "'<='", "'<>'", "'*'", "'/'", 
			"'+'", "'-'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READ", "PROGRAM", "FOR", "REPEAT", "WHILE", "IF", "TO", "UNTIL", 
			"DO", "BEGIN", "ELSE", "THEN", "END", "VAR", "INTEGER", "WRITE", "VIRGULA", 
			"LETRA", "DIGITO", "PONTO_VIRGULA", "PARENTESES_DIREITO", "PARENTESES_ESQUERDO", 
			"DOIS_PONTOS_IGUAL", "DOIS_PONTOS", "IGUAL", "MAIOR", "MAIOR_IGUAL", 
			"MENOR", "MENOR_IGUAL", "DIFERENTE", "MULTIPLICACAO", "DIVISAO", "ADICAO", 
			"SUBTRACAO", "PONTO", "IDENTIFICADOR", "WS", "COMMENT", "LCOMMENT"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		public TerminalNode PROGRAM() { return getToken(GrammarParser.PROGRAM, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(GrammarParser.PONTO, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PROGRAM);
			setState(59);
			id();
			System.out.println("AÇÃO1");
			setState(61);
			corpo();
			setState(62);
			match(PONTO);
			System.out.println("AÇÃO30");
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
	public static class CorpoContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(65);
				declara();
				}
			}

			setState(68);
			match(BEGIN);
			setState(69);
			sentencas();
			setState(70);
			match(END);
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
	public static class DeclaraContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public DvarContext dvar() {
			return getRuleContext(DvarContext.class,0);
		}
		public Mais_dcContext mais_dc() {
			return getRuleContext(Mais_dcContext.class,0);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(VAR);
			setState(73);
			dvar();
			setState(74);
			mais_dc();
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
	public static class DvarContext extends ParserRuleContext {
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(GrammarParser.DOIS_PONTOS, 0); }
		public Tipo_varContext tipo_var() {
			return getRuleContext(Tipo_varContext.class,0);
		}
		public DvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDvar(this);
		}
	}

	public final DvarContext dvar() throws RecognitionException {
		DvarContext _localctx = new DvarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			variaveis();
			setState(77);
			match(DOIS_PONTOS);
			setState(78);
			tipo_var();
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
	public static class Tipo_varContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GrammarParser.INTEGER, 0); }
		public Tipo_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTipo_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTipo_var(this);
		}
	}

	public final Tipo_varContext tipo_var() throws RecognitionException {
		Tipo_varContext _localctx = new Tipo_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(INTEGER);
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
	public static class VariaveisContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public VariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariaveis(this);
		}
	}

	public final VariaveisContext variaveis() throws RecognitionException {
		VariaveisContext _localctx = new VariaveisContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			id();
			System.out.println("AÇÃO2");
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(84);
				mais_var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_varContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(GrammarParser.VIRGULA, 0); }
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mais_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(VIRGULA);
			setState(88);
			variaveis();
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
	public static class Mais_dcContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(GrammarParser.PONTO_VIRGULA, 0); }
		public Cont_dcContext cont_dc() {
			return getRuleContext(Cont_dcContext.class,0);
		}
		public Mais_dcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_dc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMais_dc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMais_dc(this);
		}
	}

	public final Mais_dcContext mais_dc() throws RecognitionException {
		Mais_dcContext _localctx = new Mais_dcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mais_dc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(PONTO_VIRGULA);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(91);
				cont_dc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cont_dcContext extends ParserRuleContext {
		public DvarContext dvar() {
			return getRuleContext(DvarContext.class,0);
		}
		public Mais_dcContext mais_dc() {
			return getRuleContext(Mais_dcContext.class,0);
		}
		public Cont_dcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_dc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCont_dc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCont_dc(this);
		}
	}

	public final Cont_dcContext cont_dc() throws RecognitionException {
		Cont_dcContext _localctx = new Cont_dcContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cont_dc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			dvar();
			setState(95);
			mais_dc();
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
	public static class SentencasContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Mais_sentencasContext mais_sentencas() {
			return getRuleContext(Mais_sentencasContext.class,0);
		}
		public SentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSentencas(this);
		}
	}

	public final SentencasContext sentencas() throws RecognitionException {
		SentencasContext _localctx = new SentencasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentencas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			comando();
			setState(98);
			mais_sentencas();
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
	public static class Mais_sentencasContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(GrammarParser.PONTO_VIRGULA, 0); }
		public Cont_sentencasContext cont_sentencas() {
			return getRuleContext(Cont_sentencasContext.class,0);
		}
		public Mais_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMais_sentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMais_sentencas(this);
		}
	}

	public final Mais_sentencasContext mais_sentencas() throws RecognitionException {
		Mais_sentencasContext _localctx = new Mais_sentencasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mais_sentencas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(PONTO_VIRGULA);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719542394L) != 0)) {
				{
				setState(101);
				cont_sentencas();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cont_sentencasContext extends ParserRuleContext {
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public Cont_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCont_sentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCont_sentencas(this);
		}
	}

	public final Cont_sentencasContext cont_sentencas() throws RecognitionException {
		Cont_sentencasContext _localctx = new Cont_sentencasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cont_sentencas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			sentencas();
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
	public static class Var_readContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Mais_var_readContext mais_var_read() {
			return getRuleContext(Mais_var_readContext.class,0);
		}
		public Var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_read(this);
		}
	}

	public final Var_readContext var_read() throws RecognitionException {
		Var_readContext _localctx = new Var_readContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			id();
			System.out.println("AÇÃO5");
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(108);
				mais_var_read();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_var_readContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(GrammarParser.VIRGULA, 0); }
		public Var_readContext var_read() {
			return getRuleContext(Var_readContext.class,0);
		}
		public Mais_var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMais_var_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMais_var_read(this);
		}
	}

	public final Mais_var_readContext mais_var_read() throws RecognitionException {
		Mais_var_readContext _localctx = new Mais_var_readContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mais_var_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(VIRGULA);
			setState(112);
			var_read();
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
	public static class Var_writeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Mais_var_writeContext mais_var_write() {
			return getRuleContext(Mais_var_writeContext.class,0);
		}
		public Var_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_write(this);
		}
	}

	public final Var_writeContext var_write() throws RecognitionException {
		Var_writeContext _localctx = new Var_writeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			id();
			System.out.println("AÇÃO6");
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(116);
				mais_var_write();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_var_writeContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(GrammarParser.VIRGULA, 0); }
		public Var_writeContext var_write() {
			return getRuleContext(Var_writeContext.class,0);
		}
		public Mais_var_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMais_var_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMais_var_write(this);
		}
	}

	public final Mais_var_writeContext mais_var_write() throws RecognitionException {
		Mais_var_writeContext _localctx = new Mais_var_writeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mais_var_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(VIRGULA);
			setState(120);
			var_write();
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
	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(GrammarParser.READ, 0); }
		public TerminalNode PARENTESES_ESQUERDO() { return getToken(GrammarParser.PARENTESES_ESQUERDO, 0); }
		public Var_readContext var_read() {
			return getRuleContext(Var_readContext.class,0);
		}
		public TerminalNode PARENTESES_DIREITO() { return getToken(GrammarParser.PARENTESES_DIREITO, 0); }
		public TerminalNode WRITE() { return getToken(GrammarParser.WRITE, 0); }
		public Var_writeContext var_write() {
			return getRuleContext(Var_writeContext.class,0);
		}
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DOIS_PONTOS_IGUAL() { return getToken(GrammarParser.DOIS_PONTOS_IGUAL, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode TO() { return getToken(GrammarParser.TO, 0); }
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public TerminalNode REPEAT() { return getToken(GrammarParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(GrammarParser.UNTIL, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode THEN() { return getToken(GrammarParser.THEN, 0); }
		public PfalsaContext pfalsa() {
			return getRuleContext(PfalsaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(READ);
				setState(123);
				match(PARENTESES_ESQUERDO);
				setState(124);
				var_read();
				setState(125);
				match(PARENTESES_DIREITO);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(WRITE);
				setState(128);
				match(PARENTESES_ESQUERDO);
				setState(129);
				var_write();
				setState(130);
				match(PARENTESES_DIREITO);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(FOR);
				setState(133);
				id();
				System.out.println("AÇÃO25");
				setState(135);
				match(DOIS_PONTOS_IGUAL);
				setState(136);
				expressao();
				System.out.println("AÇÃO26");
				setState(138);
				match(TO);
				System.out.println("AÇÃO27");
				setState(140);
				expressao();
				System.out.println("AÇÃO28");
				setState(142);
				match(DO);
				setState(143);
				match(BEGIN);
				setState(144);
				sentencas();
				setState(145);
				match(END);
				System.out.println("AÇÃO29");
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(REPEAT);
				System.out.println("AÇÃO23");
				setState(150);
				sentencas();
				setState(151);
				match(UNTIL);
				setState(152);
				match(PARENTESES_ESQUERDO);
				setState(153);
				condicao();
				setState(154);
				match(PARENTESES_DIREITO);
				System.out.println("AÇÃO24");
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(WHILE);
				System.out.println("AÇÃO20");
				setState(159);
				match(PARENTESES_ESQUERDO);
				setState(160);
				condicao();
				setState(161);
				match(PARENTESES_DIREITO);
				System.out.println("AÇÃO21");
				setState(163);
				match(DO);
				setState(164);
				match(BEGIN);
				setState(165);
				sentencas();
				setState(166);
				match(END);
				System.out.println("AÇÃO22");
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(IF);
				setState(170);
				match(PARENTESES_ESQUERDO);
				setState(171);
				condicao();
				setState(172);
				match(PARENTESES_DIREITO);
				System.out.println("AÇÃO17");
				setState(174);
				match(THEN);
				setState(175);
				match(BEGIN);
				setState(176);
				sentencas();
				setState(177);
				match(END);
				System.out.println("A18");
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(179);
					pfalsa();
					}
				}

				System.out.println("AÇÃO19");
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				id();
				System.out.println("AÇÃO13");
				setState(186);
				match(DOIS_PONTOS_IGUAL);
				setState(187);
				expressao();
				System.out.println("AÇÃO14");
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public RelacaoContext relacao() {
			return getRuleContext(RelacaoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expressao();
			setState(193);
			relacao();
			System.out.println("AÇÃO15");
			setState(195);
			expressao();
			System.out.println("AÇÃO16");
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
	public static class PfalsaContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public PfalsaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pfalsa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPfalsa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPfalsa(this);
		}
	}

	public final PfalsaContext pfalsa() throws RecognitionException {
		PfalsaContext _localctx = new PfalsaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pfalsa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ELSE);
			setState(199);
			match(BEGIN);
			setState(200);
			sentencas();
			setState(201);
			match(END);
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
	public static class RelacaoContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(GrammarParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(GrammarParser.DIFERENTE, 0); }
		public TerminalNode MENOR() { return getToken(GrammarParser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(GrammarParser.MENOR_IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(GrammarParser.MAIOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(GrammarParser.MAIOR_IGUAL, 0); }
		public RelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRelacao(this);
		}
	}

	public final RelacaoContext relacao() throws RecognitionException {
		RelacaoContext _localctx = new RelacaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
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
	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			termo();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADICAO || _la==SUBTRACAO) {
				{
				setState(206);
				outros_termos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Outros_termosContext extends ParserRuleContext {
		public Op_adContext op_ad() {
			return getRuleContext(Op_adContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_outros_termos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			op_ad();
			System.out.println("AÇÃO9");
			setState(211);
			termo();
			System.out.println("AÇÃO10");
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADICAO || _la==SUBTRACAO) {
				{
				setState(213);
				outros_termos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_adContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(GrammarParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(GrammarParser.SUBTRACAO, 0); }
		public Op_adContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOp_ad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOp_ad(this);
		}
	}

	public final Op_adContext op_ad() throws RecognitionException {
		Op_adContext _localctx = new Op_adContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_ad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==ADICAO || _la==SUBTRACAO) ) {
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
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Mais_fatoresContext mais_fatores() {
			return getRuleContext(Mais_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			fator();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				setState(219);
				mais_fatores();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_fatoresContext extends ParserRuleContext {
		public Op_mulContext op_mul() {
			return getRuleContext(Op_mulContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Mais_fatoresContext mais_fatores() {
			return getRuleContext(Mais_fatoresContext.class,0);
		}
		public Mais_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMais_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMais_fatores(this);
		}
	}

	public final Mais_fatoresContext mais_fatores() throws RecognitionException {
		Mais_fatoresContext _localctx = new Mais_fatoresContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mais_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			op_mul();
			System.out.println("AÇÃO11");
			setState(224);
			fator();
			System.out.println("AÇÃO12");
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				setState(226);
				mais_fatores();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_mulContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(GrammarParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(GrammarParser.DIVISAO, 0); }
		public Op_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOp_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOp_mul(this);
		}
	}

	public final Op_mulContext op_mul() throws RecognitionException {
		Op_mulContext _localctx = new Op_mulContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACAO || _la==DIVISAO) ) {
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
	public static class FatorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IntnumContext intnum() {
			return getRuleContext(IntnumContext.class,0);
		}
		public TerminalNode PARENTESES_ESQUERDO() { return getToken(GrammarParser.PARENTESES_ESQUERDO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_DIREITO() { return getToken(GrammarParser.PARENTESES_DIREITO, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fator);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				id();
				System.out.println("AÇÃO7");
				}
				break;
			case DIGITO:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				intnum();
				System.out.println("AÇÃO8");
				}
				break;
			case PARENTESES_ESQUERDO:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(PARENTESES_ESQUERDO);
				setState(238);
				expressao();
				setState(239);
				match(PARENTESES_DIREITO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntnumContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(GrammarParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(GrammarParser.DIGITO, i);
		}
		public IntnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntnum(this);
		}
	}

	public final IntnumContext intnum() throws RecognitionException {
		IntnumContext _localctx = new IntnumContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_intnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				match(DIGITO);
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			System.out.println("AÇÃO4");
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GrammarParser.IDENTIFICADOR, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(IDENTIFICADOR);
			System.out.println("AÇÃO3");
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
		"\u0004\u0001\'\u00fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001C\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"V\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007]\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0003\ng\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0003\fn\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000ev\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b5\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00bf\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00d0\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00d7\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00dd\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e4\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u00f2\b\u001a\u0001\u001b\u0004\u001b\u00f5\b\u001b\u000b\u001b\f\u001b"+
		"\u00f6\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0003\u0001\u0000"+
		"\u0019\u001e\u0001\u0000!\"\u0001\u0000\u001f \u00f4\u0000:\u0001\u0000"+
		"\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000"+
		"\u0006L\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nR\u0001\u0000"+
		"\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000"+
		"\u0010^\u0001\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014d"+
		"\u0001\u0000\u0000\u0000\u0016h\u0001\u0000\u0000\u0000\u0018j\u0001\u0000"+
		"\u0000\u0000\u001ao\u0001\u0000\u0000\u0000\u001cr\u0001\u0000\u0000\u0000"+
		"\u001ew\u0001\u0000\u0000\u0000 \u00be\u0001\u0000\u0000\u0000\"\u00c0"+
		"\u0001\u0000\u0000\u0000$\u00c6\u0001\u0000\u0000\u0000&\u00cb\u0001\u0000"+
		"\u0000\u0000(\u00cd\u0001\u0000\u0000\u0000*\u00d1\u0001\u0000\u0000\u0000"+
		",\u00d8\u0001\u0000\u0000\u0000.\u00da\u0001\u0000\u0000\u00000\u00de"+
		"\u0001\u0000\u0000\u00002\u00e5\u0001\u0000\u0000\u00004\u00f1\u0001\u0000"+
		"\u0000\u00006\u00f4\u0001\u0000\u0000\u00008\u00fa\u0001\u0000\u0000\u0000"+
		":;\u0005\u0002\u0000\u0000;<\u00038\u001c\u0000<=\u0006\u0000\uffff\uffff"+
		"\u0000=>\u0003\u0002\u0001\u0000>?\u0005#\u0000\u0000?@\u0006\u0000\uffff"+
		"\uffff\u0000@\u0001\u0001\u0000\u0000\u0000AC\u0003\u0004\u0002\u0000"+
		"BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0005\n\u0000\u0000EF\u0003\u0012\t\u0000FG\u0005\r\u0000\u0000"+
		"G\u0003\u0001\u0000\u0000\u0000HI\u0005\u000e\u0000\u0000IJ\u0003\u0006"+
		"\u0003\u0000JK\u0003\u000e\u0007\u0000K\u0005\u0001\u0000\u0000\u0000"+
		"LM\u0003\n\u0005\u0000MN\u0005\u0018\u0000\u0000NO\u0003\b\u0004\u0000"+
		"O\u0007\u0001\u0000\u0000\u0000PQ\u0005\u000f\u0000\u0000Q\t\u0001\u0000"+
		"\u0000\u0000RS\u00038\u001c\u0000SU\u0006\u0005\uffff\uffff\u0000TV\u0003"+
		"\f\u0006\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u000b"+
		"\u0001\u0000\u0000\u0000WX\u0005\u0011\u0000\u0000XY\u0003\n\u0005\u0000"+
		"Y\r\u0001\u0000\u0000\u0000Z\\\u0005\u0014\u0000\u0000[]\u0003\u0010\b"+
		"\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u000f\u0001"+
		"\u0000\u0000\u0000^_\u0003\u0006\u0003\u0000_`\u0003\u000e\u0007\u0000"+
		"`\u0011\u0001\u0000\u0000\u0000ab\u0003 \u0010\u0000bc\u0003\u0014\n\u0000"+
		"c\u0013\u0001\u0000\u0000\u0000df\u0005\u0014\u0000\u0000eg\u0003\u0016"+
		"\u000b\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0015"+
		"\u0001\u0000\u0000\u0000hi\u0003\u0012\t\u0000i\u0017\u0001\u0000\u0000"+
		"\u0000jk\u00038\u001c\u0000km\u0006\f\uffff\uffff\u0000ln\u0003\u001a"+
		"\r\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0019\u0001"+
		"\u0000\u0000\u0000op\u0005\u0011\u0000\u0000pq\u0003\u0018\f\u0000q\u001b"+
		"\u0001\u0000\u0000\u0000rs\u00038\u001c\u0000su\u0006\u000e\uffff\uffff"+
		"\u0000tv\u0003\u001e\u000f\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v\u001d\u0001\u0000\u0000\u0000wx\u0005\u0011\u0000\u0000"+
		"xy\u0003\u001c\u000e\u0000y\u001f\u0001\u0000\u0000\u0000z{\u0005\u0001"+
		"\u0000\u0000{|\u0005\u0016\u0000\u0000|}\u0003\u0018\f\u0000}~\u0005\u0015"+
		"\u0000\u0000~\u00bf\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0010\u0000"+
		"\u0000\u0080\u0081\u0005\u0016\u0000\u0000\u0081\u0082\u0003\u001c\u000e"+
		"\u0000\u0082\u0083\u0005\u0015\u0000\u0000\u0083\u00bf\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0086\u00038\u001c\u0000"+
		"\u0086\u0087\u0006\u0010\uffff\uffff\u0000\u0087\u0088\u0005\u0017\u0000"+
		"\u0000\u0088\u0089\u0003(\u0014\u0000\u0089\u008a\u0006\u0010\uffff\uffff"+
		"\u0000\u008a\u008b\u0005\u0007\u0000\u0000\u008b\u008c\u0006\u0010\uffff"+
		"\uffff\u0000\u008c\u008d\u0003(\u0014\u0000\u008d\u008e\u0006\u0010\uffff"+
		"\uffff\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\u0090\u0005\n\u0000"+
		"\u0000\u0090\u0091\u0003\u0012\t\u0000\u0091\u0092\u0005\r\u0000\u0000"+
		"\u0092\u0093\u0006\u0010\uffff\uffff\u0000\u0093\u00bf\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u0004\u0000\u0000\u0095\u0096\u0006\u0010\uffff"+
		"\uffff\u0000\u0096\u0097\u0003\u0012\t\u0000\u0097\u0098\u0005\b\u0000"+
		"\u0000\u0098\u0099\u0005\u0016\u0000\u0000\u0099\u009a\u0003\"\u0011\u0000"+
		"\u009a\u009b\u0005\u0015\u0000\u0000\u009b\u009c\u0006\u0010\uffff\uffff"+
		"\u0000\u009c\u00bf\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0005\u0000"+
		"\u0000\u009e\u009f\u0006\u0010\uffff\uffff\u0000\u009f\u00a0\u0005\u0016"+
		"\u0000\u0000\u00a0\u00a1\u0003\"\u0011\u0000\u00a1\u00a2\u0005\u0015\u0000"+
		"\u0000\u00a2\u00a3\u0006\u0010\uffff\uffff\u0000\u00a3\u00a4\u0005\t\u0000"+
		"\u0000\u00a4\u00a5\u0005\n\u0000\u0000\u00a5\u00a6\u0003\u0012\t\u0000"+
		"\u00a6\u00a7\u0005\r\u0000\u0000\u00a7\u00a8\u0006\u0010\uffff\uffff\u0000"+
		"\u00a8\u00bf\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0016\u0000\u0000\u00ab\u00ac\u0003\"\u0011\u0000\u00ac"+
		"\u00ad\u0005\u0015\u0000\u0000\u00ad\u00ae\u0006\u0010\uffff\uffff\u0000"+
		"\u00ae\u00af\u0005\f\u0000\u0000\u00af\u00b0\u0005\n\u0000\u0000\u00b0"+
		"\u00b1\u0003\u0012\t\u0000\u00b1\u00b2\u0005\r\u0000\u0000\u00b2\u00b4"+
		"\u0006\u0010\uffff\uffff\u0000\u00b3\u00b5\u0003$\u0012\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u0010\uffff\uffff\u0000\u00b7"+
		"\u00bf\u0001\u0000\u0000\u0000\u00b8\u00b9\u00038\u001c\u0000\u00b9\u00ba"+
		"\u0006\u0010\uffff\uffff\u0000\u00ba\u00bb\u0005\u0017\u0000\u0000\u00bb"+
		"\u00bc\u0003(\u0014\u0000\u00bc\u00bd\u0006\u0010\uffff\uffff\u0000\u00bd"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bez\u0001\u0000\u0000\u0000\u00be\u007f"+
		"\u0001\u0000\u0000\u0000\u00be\u0084\u0001\u0000\u0000\u0000\u00be\u0094"+
		"\u0001\u0000\u0000\u0000\u00be\u009d\u0001\u0000\u0000\u0000\u00be\u00a9"+
		"\u0001\u0000\u0000\u0000\u00be\u00b8\u0001\u0000\u0000\u0000\u00bf!\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0003(\u0014\u0000\u00c1\u00c2\u0003&\u0013"+
		"\u0000\u00c2\u00c3\u0006\u0011\uffff\uffff\u0000\u00c3\u00c4\u0003(\u0014"+
		"\u0000\u00c4\u00c5\u0006\u0011\uffff\uffff\u0000\u00c5#\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005\u000b\u0000\u0000\u00c7\u00c8\u0005\n\u0000\u0000"+
		"\u00c8\u00c9\u0003\u0012\t\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca"+
		"%\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007\u0000\u0000\u0000\u00cc\'"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003.\u0017\u0000\u00ce\u00d0\u0003"+
		"*\u0015\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0)\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003,\u0016\u0000"+
		"\u00d2\u00d3\u0006\u0015\uffff\uffff\u0000\u00d3\u00d4\u0003.\u0017\u0000"+
		"\u00d4\u00d6\u0006\u0015\uffff\uffff\u0000\u00d5\u00d7\u0003*\u0015\u0000"+
		"\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7+\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0001\u0000\u0000\u00d9"+
		"-\u0001\u0000\u0000\u0000\u00da\u00dc\u00034\u001a\u0000\u00db\u00dd\u0003"+
		"0\u0018\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd/\u0001\u0000\u0000\u0000\u00de\u00df\u00032\u0019\u0000"+
		"\u00df\u00e0\u0006\u0018\uffff\uffff\u0000\u00e0\u00e1\u00034\u001a\u0000"+
		"\u00e1\u00e3\u0006\u0018\uffff\uffff\u0000\u00e2\u00e4\u00030\u0018\u0000"+
		"\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e41\u0001\u0000\u0000\u0000\u00e5\u00e6\u0007\u0002\u0000\u0000\u00e6"+
		"3\u0001\u0000\u0000\u0000\u00e7\u00e8\u00038\u001c\u0000\u00e8\u00e9\u0006"+
		"\u001a\uffff\uffff\u0000\u00e9\u00f2\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u00036\u001b\u0000\u00eb\u00ec\u0006\u001a\uffff\uffff\u0000\u00ec\u00f2"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0016\u0000\u0000\u00ee\u00ef"+
		"\u0003(\u0014\u0000\u00ef\u00f0\u0005\u0015\u0000\u0000\u00f0\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f1\u00e7\u0001\u0000\u0000\u0000\u00f1\u00ea\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f25\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0005\u0013\u0000\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0006\u001b\uffff\uffff\u0000\u00f97\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005$\u0000\u0000\u00fb\u00fc\u0006\u001c\uffff"+
		"\uffff\u0000\u00fc9\u0001\u0000\u0000\u0000\u000eBU\\fmu\u00b4\u00be\u00cf"+
		"\u00d6\u00dc\u00e3\u00f1\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}