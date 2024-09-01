package com.compi.scanner;

import java.util.ArrayList;

public class TokenList {
    private static TokenList instance;
    private ArrayList<Token> tokens;

    private TokenList() {
        tokens = new ArrayList<>();
    }

    public static TokenList getInstance() {
        if (instance == null) {
            instance = new TokenList();
        }
        return instance;
    }

    public void insertToken(TokenTypes tokenType, String value, int lineNumber) {
        for (Token t : tokens) {
            if (t.getToken() == tokenType && t.getValue().equals(value)) {
                t.addLineNumber(lineNumber);
                return;
            }
        }
        tokens.add(new Token(tokenType, value, lineNumber));
    }

    // Other methods for managing the token list
    public void printTokens() {
        for (Token t : tokens) {
            System.out.format("%-17s | %-75s | %-15s %n", t.getToken(), t.getValue(), t.getLineNumbers());
        }
    }
}
