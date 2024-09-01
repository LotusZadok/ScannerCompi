/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.compi.scanner;

import java.io.InputStreamReader;
import java.io.Reader;

// import java.io.File

/**
 *
 * @author sebas
 */
public class Scanner {

    public static void main(String[] args) {

        try {
            // Ruta relativa del archivo a leer
            Reader reader = new InputStreamReader(
                    Scanner.class.getResourceAsStream("/com/compi/scanner/test.txt"));
            // Instancia de la clase SimpleLexer (JFlex)
            SimpleLexer lexer = new SimpleLexer(reader);

            // Instancia de la lista de tokens
            TokenList tokenList = TokenList.getInstance();

            // Ciclo para leer tokens
            Token token = lexer.yylex();
            while (token != null) {
                token = lexer.yylex();
            }

            tokenList.printTokens();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    // FIXME: Usar el plugin de JFlex para generar el lexer
    // public static void generateLexer(String path) {
    // String[] lexer = {path};
    // jflex.Main.main(lexer);
    // }
}
