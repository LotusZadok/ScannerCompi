package com.compi.scanner;

import java.io.InputStreamReader;
import java.io.Reader;

import jflex.exceptions.SilentExit;

import jflex.Main;

public class Scanner {

    public static void main(String[] args) {

        generateLexer();

        try {
            Reader reader = new InputStreamReader(
                    Scanner.class.getResourceAsStream("/com/compi/scanner/input.c"));

            // Instancia de la clase SimpleLexer (JFlex)
            SimpleLexer lexer = new SimpleLexer(reader);

            // Instancia de la lista de tokens
            TokenList tokenList = TokenList.getInstance();
            ErrorList errorList = ErrorList.getInstance();

            // Ciclo para leer tokens
            Token token = lexer.yylex();
            while (token != null) {
                token = lexer.yylex();
            }

            tokenList.printTokens();
            errorList.printErrors();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void generateLexer() {
        String projectDir = System.getProperty("user.dir");
        String entrada = projectDir + "/Scanner/src/main/java/com/compi/scanner/SimpleLexer.flex";
        try {
            Main.generate(new String[] { entrada });
        } catch (SilentExit e) {
            System.out.println("SilentExit occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
