package com.compi.scanner.semantico;

public class RegistroSemantico {
    
    // DataObject
    private String tipo = "";    // TIPO | CONST | VAR
    private String tipo_var = "";//TYPE_INT | TYPE_LONG | TYPE_SHORT | TYPE_CHAR
    private String id = "";
    private String valor = "";
    private String operador = "";

    public RegistroSemantico(String id){
        if ("int".equals(id) || "long".equals(id) || "short".equals(id) || "char".equals(id)){
            this.tipo = "TIPO";
            this.tipo_var = id;
        } else{
            this.id = id;
        }    
    }

    public RegistroSemantico(String tipo, String tipo_var, String id) {
        this.tipo = tipo;
        this.tipo_var = tipo_var;
        this.id = id;
    }

    public RegistroSemantico(String tipo_var, String id) {
        this.tipo = "VAR";
        this.tipo_var = tipo_var;
        this.id = id;
    }

    public RegistroSemantico(String tipo, String tipo_var, String id, String valor) {
        this.tipo = tipo;
        this.tipo_var = tipo_var;
        this.id = id;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "RegistroSemantico{" +
                "tipo='" + tipo + '\'' +
                ", tipo_var='" + tipo_var + '\'' +
                ", id='" + id + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
