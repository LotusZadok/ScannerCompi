package com.compi.scanner;

public class Occurrences {
    private int lineNumber;
    private int occurrences;

    public Occurrences(int lineNumber) {
        this.lineNumber = lineNumber;
        this.occurrences = 1;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public void incrementOccurrences() {
        occurrences++;
    }

    @Override
    public String toString() {
        if (occurrences == 1) {
            return lineNumber + "";
        }
        return lineNumber + "(" + occurrences + ")";
    }
}
