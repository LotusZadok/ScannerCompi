package com.compi.scanner.semantico;

public class Simbolo {
    protected String tipo_var;
    protected String id;
    protected String ambito;
    private boolean esConstante;
    private Object valor;

    public Simbolo() {
        tipo_var = "";
        id = "";
        ambito = "";
        esConstante = false;
        valor = null;
    }

    public Simbolo(String tipo_var, String id) {
        this.tipo_var = tipo_var;
        this.id = id;
        this.esConstante = false;
        this.valor = null;
    }

    public Simbolo(String tipo_var, String id, boolean esConstante, Object valor) {
        this.tipo_var = tipo_var;
        this.id = id;
        this.esConstante = esConstante;
        this.valor = valor;
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

    public boolean isEsConstante() {
        return esConstante;
    }

    public void setEsConstante(boolean esConstante) {
        this.esConstante = esConstante;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Simbolo{" +
                "tipo_var='" + tipo_var + '\'' +
                ", id='" + id + '\'' +
                ", ambito='" + ambito + '\'' +
                ", esConstante=" + esConstante +
                ", valor=" + valor +
                '}';
    }
}
