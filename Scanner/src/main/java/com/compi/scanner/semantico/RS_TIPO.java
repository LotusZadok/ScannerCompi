package com.compi.scanner.semantico;

public class RS_TIPO
        extends RS { // RS_TIPO = Registro Semantico Tipo
    // DataObject
    private String tipo_var = "";

    public RS_TIPO(String tipo_var) {
        super("TIPO");
        this.tipo_var = tipo_var;
    }

    public String getTipo_Var() {
        return tipo_var;
    }
}