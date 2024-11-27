package com.compi.scanner.semantico;

public class RS_OP extends RS { // RS_OP = Registro Semantico Operador
    private String op = "";

    public RS_OP(String op) {
        super("OP");
        this.op = op;
    }

    public String getOP() {
        return op;
    }
}