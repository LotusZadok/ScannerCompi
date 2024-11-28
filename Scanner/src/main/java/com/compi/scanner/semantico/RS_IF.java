package com.compi.scanner.semantico;

public class RS_IF extends RS { // RS_IF = Registro Semantico If
    private String exitLabel = "";
    private String elseLabel = "";

    public RS_IF(String elseLabel, String exitLabel) {
        super("IF");
        this.exitLabel = exitLabel;
        this.elseLabel = elseLabel;
    }

    public String getExitLabel() {
        return exitLabel;
    }

    public String getElseLabel() {
        return elseLabel;
    }
}
