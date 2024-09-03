package com.compi.scanner;

import java.util.ArrayList;

public class Token {
    private TokenTypes token;
    private String value;
    private ArrayList<Occurrences> lineNumbers;

    public Token(TokenTypes token, String value, int lineNumber) {
        this.token = token;
        this.value = value;
        this.lineNumbers = new ArrayList<>();
        this.lineNumbers.add(new Occurrences(lineNumber + 1));
    }

    public TokenTypes getToken() {
        return token;
    }

    public String getValue() {
        return value;
    }

    public ArrayList<Occurrences> getLineNumbers() {
        return lineNumbers;
    }

    public void addLineNumber(int lineNumber) {
        for (Occurrences o : lineNumbers) {
            if (o.getLineNumber() == lineNumber + 1) {
                o.incrementOccurrences();
                return;
            }
        }
        lineNumbers.add(new Occurrences(lineNumber+1));
    }

}
