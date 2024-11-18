package com.compi.scanner.semantico;

public class Simbolo {
    protected String tipo_var;
    protected String id;

    public Simbolo(){
        tipo_var = "";
        id = "";
    }

    public Simbolo(String tipo_var, String id){
        this.tipo_var = tipo_var;
        this.id = id;
    }

    public String getTipo_Var() {
        return tipo_var;
    }

    public void setTipo_Var(String tipo_var) {
        this.tipo_var = tipo_var;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
