// Generated from com\iftm\sintaticoantlr\Grammar.g4 by ANTLR 4.13.0
package com.iftm.sintaticoantlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(GrammarParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(GrammarParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(GrammarParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(GrammarParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dvar}.
	 * @param ctx the parse tree
	 */
	void enterDvar(GrammarParser.DvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dvar}.
	 * @param ctx the parse tree
	 */
	void exitDvar(GrammarParser.DvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(GrammarParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(GrammarParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(GrammarParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(GrammarParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(GrammarParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(GrammarParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void enterMais_dc(GrammarParser.Mais_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void exitMais_dc(GrammarParser.Mais_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void enterCont_dc(GrammarParser.Cont_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void exitCont_dc(GrammarParser.Cont_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void enterSentencas(GrammarParser.SentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void exitSentencas(GrammarParser.SentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterMais_sentencas(GrammarParser.Mais_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitMais_sentencas(GrammarParser.Mais_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterCont_sentencas(GrammarParser.Cont_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitCont_sentencas(GrammarParser.Cont_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_read}.
	 * @param ctx the parse tree
	 */
	void enterVar_read(GrammarParser.Var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_read}.
	 * @param ctx the parse tree
	 */
	void exitVar_read(GrammarParser.Var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_read(GrammarParser.Mais_var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_read(GrammarParser.Mais_var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_write}.
	 * @param ctx the parse tree
	 */
	void enterVar_write(GrammarParser.Var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_write}.
	 * @param ctx the parse tree
	 */
	void exitVar_write(GrammarParser.Var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_write(GrammarParser.Mais_var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_write(GrammarParser.Mais_var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(GrammarParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(GrammarParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void enterPfalsa(GrammarParser.PfalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void exitPfalsa(GrammarParser.PfalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(GrammarParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(GrammarParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GrammarParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GrammarParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(GrammarParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(GrammarParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void enterOp_ad(GrammarParser.Op_adContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void exitOp_ad(GrammarParser.Op_adContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GrammarParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GrammarParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void enterMais_fatores(GrammarParser.Mais_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void exitMais_fatores(GrammarParser.Mais_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void enterOp_mul(GrammarParser.Op_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void exitOp_mul(GrammarParser.Op_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GrammarParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GrammarParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intnum}.
	 * @param ctx the parse tree
	 */
	void enterIntnum(GrammarParser.IntnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intnum}.
	 * @param ctx the parse tree
	 */
	void exitIntnum(GrammarParser.IntnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GrammarParser.IdContext ctx);
}