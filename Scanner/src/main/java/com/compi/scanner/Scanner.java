/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.compi.scanner;

import java.io.FileReader;

// import java.io.File

/**
 *
 * @author sebas
 */
public class Scanner {

    public static void main(String[] args) {

        try {
            // Ruta del archivo a leer
            // TODO: Usar un archivo .c
            FileReader reader = new FileReader("C:\\Users\\n" + //
                    "cque\\Downloads\\tec\\ci\\Scanner\\Scanner\\src\\main\\java\\com\\compi\\scanner\\test.txt");

            // Instancia de la clase SimpleLexer (JFlex)
            SimpleLexer lexer = new SimpleLexer(reader);

            // Ciclo para leer tokens
            Token token = lexer.yylex();
            while (token != null) {
                // TODO: Implementar la lista de tokens y de errores
                System.out.println(token.getValue() + " " + token.getToken() + " " +
                        token.getLineNumber());
                token = lexer.yylex();
            }

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
