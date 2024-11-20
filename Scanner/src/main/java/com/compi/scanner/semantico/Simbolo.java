package com.compi.scanner.semantico;

public class Simbolo {
    protected String tipo_var;
    protected String id;
    private boolean esConstante;
    private Object valor;

    public Simbolo() {
        tipo_var = "";
        id = "";
        esConstante = false;
        valor = "";
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

    public boolean esValorCompatible() {
        // Verificar si el valor es un String y convertirlo al tipo correspondiente
        if (valor instanceof String) {
            try {
                switch (tipo_var) {
                    case "int":
                        valor = Integer.parseInt((String) valor);
                        break;
                    case "long":
                        valor = Long.parseLong((String) valor);
                        break;
                    case "short":
                        valor = Short.parseShort((String) valor);
                        break;
                    case "char":
                        // Asegurarse de que el String tiene un solo carácter
                        String strValue = (String) valor;
                        if (strValue.length() == 1) {
                            valor = strValue.charAt(0);
                        } else {
                            return false; // No es un carácter válido
                        }
                        break;
                    default:
                        return false; // Tipo no soportado
                }
            } catch (NumberFormatException e) {
                return false; // El valor no puede ser convertido
            }
        }

        // se verifica si el valor es del tipo adecuado
        switch (tipo_var) {
            case "int":
                return valor instanceof Integer;
            case "long":
                return valor instanceof Long;
            case "short":
                return valor instanceof Short;
            case "char":
                // Si es un Character o un valor convertible a char
                return valor instanceof Character || (valor instanceof Integer &&
                                                    (Integer) valor >= Character.MIN_VALUE &&
                                                    (Integer) valor <= Character.MAX_VALUE);
            default:
                return false; // Tipo desconocido o no soportado
        }
    }
    
    @Override
    public String toString() {
        return "Simbolo { " +
                "esConstante=" + esConstante +
                ", tipo_var='" + tipo_var + '\'' +
                ", id='" + id + '\'' +
                ", valor=" + valor +
                " }";
    }
}
