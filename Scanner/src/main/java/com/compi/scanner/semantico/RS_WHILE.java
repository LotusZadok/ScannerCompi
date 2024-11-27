package com.compi.scanner.semantico;

public class RS_WHILE extends RS { // RS_WHILE = Registro Semantico While
    private String exitLabel = "";
    private String startLabel = "";

    public RS_WHILE(String exitLabel, String startLabel) {
        super("WHILE");
        this.exitLabel = exitLabel;
        this.startLabel = startLabel;
    }

    public String getExitLabel() {
        return exitLabel;
    }

    public String getStartLabel() {
        return startLabel;
    }
}