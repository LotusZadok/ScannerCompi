package com.compi.scanner.semantico;

public class RS_FUNC extends RS { // RS_FUNC = Registro Semantico Func
    private String ambito = "";

    public RS_FUNC(String ambito) {
        super("FUNC");
        this.ambito = ambito;
    }

    public String getAmbito() {
        return ambito;
    }
}
