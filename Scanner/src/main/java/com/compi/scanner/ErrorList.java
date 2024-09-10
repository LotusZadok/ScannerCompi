package com.compi.scanner;

import java.util.ArrayList; // Add this import statement

public class ErrorList {
    private static ErrorList instance;
    private ArrayList<Token> errors;

    private ErrorList() {
        errors = new ArrayList<>();
    }

    public static ErrorList getInstance() {
        if (instance == null) {
            instance = new ErrorList();

        }
        return instance;
    }

    public void insertError(TokenTypes tokenType, String value, int lineNumber) {
        errors.add(new Token(tokenType, value, lineNumber));
    }

    public void printErrors() {

        for (Token t : errors) {
            String value = t.getValue();
            int lineNumber = t.getLineNumbers().get(0).getLineNumber();
            System.out.println("Error at line " + lineNumber + ": " + value);

        }
    }
}
