package com.compi.scanner;

import java.io.InputStreamReader;
import java.io.Reader;

import java_cup.runtime.Symbol;

public class Main {
    public static void main(String[] args) {
        try {
            // Verificar si el archivo de entrada existe
            Reader reader = new InputStreamReader(
                    Main.class.getResourceAsStream("/com/compi/scanner/input.c"));
            LexerCup lexer = new LexerCup(reader);

            // while (true) {
            // Symbol token = lexer.next_token();
            // if (token.sym == 0) {
            // break;
            // }
            // System.out.println("Token: " + sym.terminalNames[token.sym] + " - " +
            // token.value);
            // }

            // Crear una instancia del parser usando el nuevo constructor
            ParserCup parser = new ParserCup(lexer);

            // Parsear el archivo de entrada
            Symbol result = parser.parse();

            System.out.println("\nParsing completed successfully.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}