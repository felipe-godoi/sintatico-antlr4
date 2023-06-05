package com.iftm.sintaticoantlr;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class Compilador {
    private String entrada;

   public Compilador(String entrada) {
       this.entrada = entrada;
   }

   public void compile() {
       CharStream input = CharStreams.fromString(this.entrada);
       GrammarLexer lexer = new GrammarLexer(input);
       CommonTokenStream tokens = new CommonTokenStream(lexer);
       tokens.fill();
       List<Token> tokenList = tokens.getTokens();
       for (Token token : tokenList) {
           int tipo = token.getType();
           String nome = lexer.getVocabulary().getSymbolicName(tipo);
           String texto = token.getText();
           int linha = token.getLine();
           int coluna = token.getCharPositionInLine();
           System.out.println("nome=" + nome + " | texto=" + texto + ", linha=" + linha + ", coluna=" + coluna);
       }
       GrammarParser parser = new GrammarParser(tokens);
       ParseTree tree = parser.program();
   }
}