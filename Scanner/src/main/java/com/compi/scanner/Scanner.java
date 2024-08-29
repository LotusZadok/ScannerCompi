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
        System.out.println("Hello World!");

        try {
            FileReader reader = new FileReader("C:\\Users\\n" + //
                    "cque\\Downloads\\tec\\ci\\Scanner\\Scanner\\src\\main\\java\\com\\compi\\scanner\\test.txt");
            SimpleLexer lexer = new SimpleLexer(reader);

            Token token = lexer.yylex();
            while (token != null) {
                System.out.println(token);
                token = lexer.yylex();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    // public static void generateLexer(String path) {
    // String[] lexer = {path};
    // jflex.Main.main(lexer);
    // }
}
