package com.compi.scanner.semantico;

public class RS_DO extends RS { // RS_DO = Registro Semantico Declaracion de Objeto

    private String id = "";
    private String tipo_var = "";
    private boolean isConstante = false;

    public RS_DO(String id, String tipo_var) {
        super("DO");
        this.id = id;
        this.tipo_var = tipo_var;
    }

    public RS_DO(String id, String tipo_var, boolean isConstante) {
        super("DO");
        this.id = id;
        this.tipo_var = tipo_var;
        this.isConstante = isConstante;
    }

    public String getId() {
        return id;
    }

    public String getTipo_Var() {
        return tipo_var;
    }

    public boolean isConstante() {
        return isConstante;
    }
}
