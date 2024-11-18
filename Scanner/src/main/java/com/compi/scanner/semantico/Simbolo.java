package com.compi.scanner.semantico;

public class Simbolo {
    protected String tipo_var;
    protected String id;
    protected String ambito;

    public Simbolo(){
        tipo_var = "";
        id = "";
        ambito = "";
    }

    public Simbolo(String tipo_var, String id){
        this.tipo_var = tipo_var;
        this.id = id;
    }

    public Simbolo(Object tipo_var, Object id){
        this.tipo_var = String.valueOf(tipo_var);
        this.id = String.valueOf(id);
    }

    public String getTipo_var() {
        return tipo_var;
    }

    public void setTipo_var(String tipo_var) {
        this.tipo_var = tipo_var;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmbito (){
        return ambito;
    }

    public void setAmbito (String ambito){
        this.ambito = ambito;
    }

    public String toString (){
        return "Tipo: " + tipo_var + ", identificador: " + id;
    }
}
