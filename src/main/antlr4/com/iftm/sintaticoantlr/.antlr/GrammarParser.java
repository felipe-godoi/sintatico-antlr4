// Generated from d:\Documentos\Faculdade\Compiladores\antlr\demo\src\main\antlr4\com\iftm\sintaticoantlr\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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

	public static class Tipo_varContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GrammarParser.INTEGER, 0); }
		public Tipo_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var; }
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

	public static class Mais_varContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(GrammarParser.VIRGULA, 0); }
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
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

	public static class Mais_dcContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(GrammarParser.PONTO_VIRGULA, 0); }
		public Cont_dcContext cont_dc() {
			return getRuleContext(Cont_dcContext.class,0);
		}
		public Mais_dcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_dc; }
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

	public static class Mais_sentencasContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(GrammarParser.PONTO_VIRGULA, 0); }
		public Cont_sentencasContext cont_sentencas() {
			return getRuleContext(Cont_sentencasContext.class,0);
		}
		public Mais_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_sentencas; }
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << FOR) | (1L << REPEAT) | (1L << WHILE) | (1L << IF) | (1L << WRITE) | (1L << IDENTIFICADOR))) != 0)) {
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

	public static class Cont_sentencasContext extends ParserRuleContext {
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public Cont_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_sentencas; }
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

	public static class Mais_var_readContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(GrammarParser.VIRGULA, 0); }
		public Var_readContext var_read() {
			return getRuleContext(Var_readContext.class,0);
		}
		public Mais_var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_read; }
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

	public static class Mais_var_writeContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(GrammarParser.VIRGULA, 0); }
		public Var_writeContext var_write() {
			return getRuleContext(Var_writeContext.class,0);
		}
		public Mais_var_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_write; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL) | (1L << DIFERENTE))) != 0)) ) {
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

	public static class Op_adContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(GrammarParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(GrammarParser.SUBTRACAO, 0); }
		public Op_adContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ad; }
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

	public static class Op_mulContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(GrammarParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(GrammarParser.DIVISAO, 0); }
		public Op_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mul; }
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

	public static class IntnumContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(GrammarParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(GrammarParser.DIGITO, i);
		}
		public IntnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intnum; }
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GrammarParser.IDENTIFICADOR, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\5\3E\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\t\3\t\5\t_\n\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\5\fi\n\f\3\r\3\r\3\16\3\16\3\16\5\16p\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\5\20x\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b7"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c1\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\5\26"+
		"\u00d2\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00d9\n\27\3\30\3\30\3\31\3"+
		"\31\5\31\u00df\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u00e6\n\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00f4\n\34\3\35"+
		"\6\35\u00f7\n\35\r\35\16\35\u00f8\3\35\3\35\3\36\3\36\3\36\3\36\2\2\37"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2"+
		"\33 \3\2#$\3\2!\"\2\u00f6\2<\3\2\2\2\4D\3\2\2\2\6J\3\2\2\2\bN\3\2\2\2"+
		"\nR\3\2\2\2\fT\3\2\2\2\16Y\3\2\2\2\20\\\3\2\2\2\22`\3\2\2\2\24c\3\2\2"+
		"\2\26f\3\2\2\2\30j\3\2\2\2\32l\3\2\2\2\34q\3\2\2\2\36t\3\2\2\2 y\3\2\2"+
		"\2\"\u00c0\3\2\2\2$\u00c2\3\2\2\2&\u00c8\3\2\2\2(\u00cd\3\2\2\2*\u00cf"+
		"\3\2\2\2,\u00d3\3\2\2\2.\u00da\3\2\2\2\60\u00dc\3\2\2\2\62\u00e0\3\2\2"+
		"\2\64\u00e7\3\2\2\2\66\u00f3\3\2\2\28\u00f6\3\2\2\2:\u00fc\3\2\2\2<=\7"+
		"\4\2\2=>\5:\36\2>?\b\2\1\2?@\5\4\3\2@A\7%\2\2AB\b\2\1\2B\3\3\2\2\2CE\5"+
		"\6\4\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\f\2\2GH\5\24\13\2HI\7\17\2\2"+
		"I\5\3\2\2\2JK\7\20\2\2KL\5\b\5\2LM\5\20\t\2M\7\3\2\2\2NO\5\f\7\2OP\7\32"+
		"\2\2PQ\5\n\6\2Q\t\3\2\2\2RS\7\21\2\2S\13\3\2\2\2TU\5:\36\2UW\b\7\1\2V"+
		"X\5\16\b\2WV\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YZ\7\23\2\2Z[\5\f\7\2[\17\3\2"+
		"\2\2\\^\7\26\2\2]_\5\22\n\2^]\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`a\5\b\5\2"+
		"ab\5\20\t\2b\23\3\2\2\2cd\5\"\22\2de\5\26\f\2e\25\3\2\2\2fh\7\26\2\2g"+
		"i\5\30\r\2hg\3\2\2\2hi\3\2\2\2i\27\3\2\2\2jk\5\24\13\2k\31\3\2\2\2lm\5"+
		":\36\2mo\b\16\1\2np\5\34\17\2on\3\2\2\2op\3\2\2\2p\33\3\2\2\2qr\7\23\2"+
		"\2rs\5\32\16\2s\35\3\2\2\2tu\5:\36\2uw\b\20\1\2vx\5 \21\2wv\3\2\2\2wx"+
		"\3\2\2\2x\37\3\2\2\2yz\7\23\2\2z{\5\36\20\2{!\3\2\2\2|}\7\3\2\2}~\7\30"+
		"\2\2~\177\5\32\16\2\177\u0080\7\27\2\2\u0080\u00c1\3\2\2\2\u0081\u0082"+
		"\7\22\2\2\u0082\u0083\7\30\2\2\u0083\u0084\5\36\20\2\u0084\u0085\7\27"+
		"\2\2\u0085\u00c1\3\2\2\2\u0086\u0087\7\5\2\2\u0087\u0088\5:\36\2\u0088"+
		"\u0089\b\22\1\2\u0089\u008a\7\31\2\2\u008a\u008b\5*\26\2\u008b\u008c\b"+
		"\22\1\2\u008c\u008d\7\t\2\2\u008d\u008e\b\22\1\2\u008e\u008f\5*\26\2\u008f"+
		"\u0090\b\22\1\2\u0090\u0091\7\13\2\2\u0091\u0092\7\f\2\2\u0092\u0093\5"+
		"\24\13\2\u0093\u0094\7\17\2\2\u0094\u0095\b\22\1\2\u0095\u00c1\3\2\2\2"+
		"\u0096\u0097\7\6\2\2\u0097\u0098\b\22\1\2\u0098\u0099\5\24\13\2\u0099"+
		"\u009a\7\n\2\2\u009a\u009b\7\30\2\2\u009b\u009c\5$\23\2\u009c\u009d\7"+
		"\27\2\2\u009d\u009e\b\22\1\2\u009e\u00c1\3\2\2\2\u009f\u00a0\7\7\2\2\u00a0"+
		"\u00a1\b\22\1\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7"+
		"\27\2\2\u00a4\u00a5\b\22\1\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7\7\f\2\2"+
		"\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\b\22\1\2\u00aa"+
		"\u00c1\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae\5"+
		"$\23\2\u00ae\u00af\7\27\2\2\u00af\u00b0\b\22\1\2\u00b0\u00b1\7\16\2\2"+
		"\u00b1\u00b2\7\f\2\2\u00b2\u00b3\5\24\13\2\u00b3\u00b4\7\17\2\2\u00b4"+
		"\u00b6\b\22\1\2\u00b5\u00b7\5&\24\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\22\1\2\u00b9\u00c1\3\2\2\2\u00ba"+
		"\u00bb\5:\36\2\u00bb\u00bc\b\22\1\2\u00bc\u00bd\7\31\2\2\u00bd\u00be\5"+
		"*\26\2\u00be\u00bf\b\22\1\2\u00bf\u00c1\3\2\2\2\u00c0|\3\2\2\2\u00c0\u0081"+
		"\3\2\2\2\u00c0\u0086\3\2\2\2\u00c0\u0096\3\2\2\2\u00c0\u009f\3\2\2\2\u00c0"+
		"\u00ab\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c1#\3\2\2\2\u00c2\u00c3\5*\26\2"+
		"\u00c3\u00c4\5(\25\2\u00c4\u00c5\b\23\1\2\u00c5\u00c6\5*\26\2\u00c6\u00c7"+
		"\b\23\1\2\u00c7%\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\7\f\2\2\u00ca"+
		"\u00cb\5\24\13\2\u00cb\u00cc\7\17\2\2\u00cc\'\3\2\2\2\u00cd\u00ce\t\2"+
		"\2\2\u00ce)\3\2\2\2\u00cf\u00d1\5\60\31\2\u00d0\u00d2\5,\27\2\u00d1\u00d0"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2+\3\2\2\2\u00d3\u00d4\5.\30\2\u00d4"+
		"\u00d5\b\27\1\2\u00d5\u00d6\5\60\31\2\u00d6\u00d8\b\27\1\2\u00d7\u00d9"+
		"\5,\27\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9-\3\2\2\2\u00da"+
		"\u00db\t\3\2\2\u00db/\3\2\2\2\u00dc\u00de\5\66\34\2\u00dd\u00df\5\62\32"+
		"\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\61\3\2\2\2\u00e0\u00e1"+
		"\5\64\33\2\u00e1\u00e2\b\32\1\2\u00e2\u00e3\5\66\34\2\u00e3\u00e5\b\32"+
		"\1\2\u00e4\u00e6\5\62\32\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\63\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e8\65\3\2\2\2\u00e9\u00ea\5:\36\2\u00ea"+
		"\u00eb\b\34\1\2\u00eb\u00f4\3\2\2\2\u00ec\u00ed\58\35\2\u00ed\u00ee\b"+
		"\34\1\2\u00ee\u00f4\3\2\2\2\u00ef\u00f0\7\30\2\2\u00f0\u00f1\5*\26\2\u00f1"+
		"\u00f2\7\27\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ec\3"+
		"\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\67\3\2\2\2\u00f5\u00f7\7\25\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\35\1\2\u00fb9\3\2\2\2\u00fc\u00fd"+
		"\7&\2\2\u00fd\u00fe\b\36\1\2\u00fe;\3\2\2\2\20DW^how\u00b6\u00c0\u00d1"+
		"\u00d8\u00de\u00e5\u00f3\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}