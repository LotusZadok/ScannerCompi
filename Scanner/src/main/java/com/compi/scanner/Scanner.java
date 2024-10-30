package com.compi.scanner;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jflex.exceptions.SilentExit;

import jflex.Main;

public class Scanner {

    public static void main(String[] args) throws Exception {

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

            System.out
                    .println("\t********************************** ANALISIS LEXICO **********************************");
            tokenList.printTokens();
            errorList.printErrors();

            System.out.println("");
            System.out.println(
                    "\t********************************** ANALISIS SINTACTICO **********************************");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void generateLexer() throws IOException, Exception {
        String projectDir = System.getProperty("user.dir");
        String ruta1 = projectDir + "/scanner/src/main/java/com/compi/scanner/SimpleLexer.flex";
        String ruta2 = projectDir + "/scanner/src/main/java/com/compi/scanner/LexerCup.flex";
        String[] rutaSintax = { "-parser", "Sintax", projectDir + "/src/main/java/com/compi/scanner/Sintax.cup" };
        try {
            Main.generate(new String[] { ruta1 });
            Main.generate(new String[] { ruta2 });
            java_cup.Main.main(rutaSintax); // no pasa de aqui
            Path rutaSym = Paths.get(projectDir + "/src/main/java/com/compi/scanner/sym.java");
            if (Files.exists(rutaSym)) {
                Files.delete(rutaSym);
            }
            Files.move(
                    Paths.get(projectDir + "/src/main/java/com/compi/scanner/sym.java"),
                    Paths.get(projectDir + "/src/main/java/com/compi/scanner/sym.java"));
            Path rutaSin = Paths.get(projectDir + "/src/main/java/com/compi/scanner/Sintax.java");
            if (Files.exists(rutaSin)) {
                Files.delete(rutaSin);
            }
            Files.move(
                    Paths.get(projectDir + "/src/main/java/com/compi/scanner/Sintax.java"),
                    Paths.get(projectDir + "/src/main/java/com/compi/scanner/Sintax.java"));

        } catch (SilentExit e) {
            System.out.println("SilentExit occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
