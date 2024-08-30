package com.compi.scanner;

public class Token {
    private Tokens token;
    private String value;
    private int lineNumber;

    public Token(Tokens token, String value, int lineNumber) {
        this.token = token;
        this.value = value;
        this.lineNumber = lineNumber;
    }

    public Tokens getToken() {
        return token;
    }

    public String getValue() {
        return value;
    }

    public int getLineNumber() {
        return lineNumber;
    }

}
