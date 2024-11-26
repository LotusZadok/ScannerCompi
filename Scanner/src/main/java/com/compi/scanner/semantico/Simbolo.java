package com.compi.scanner.semantico;

public class Simbolo {
    private String tipo;    //CONST | VAR | PARAMETRO | FUNCION
    protected String tipo_var;
    protected String id;
    private boolean esConstante;
    private Object valor;
    private String ambito;

    // Default constructor
    public Simbolo() {
        this.tipo = "";
        this.tipo_var = "";
        this.id = "";
        this.valor = "";
        this.ambito = "";
    }

    // Constructor with type, type_var and ID
    public Simbolo(String tipo, String tipo_var, String id) {
        this.tipo = tipo;
        this.tipo_var = tipo_var;
        this.id = id;
    }

    // Constructor without ambito
    public Simbolo(String tipo, String tipo_var, String id, Object valor) {
        this.tipo = tipo;
        this.tipo_var = tipo_var;
        this.id = id;
        this.valor = valor;
    }

    // Constructor with all fields
    public Simbolo(String tipo, String tipo_var, String id, Object valor, String ambito) {
        this.tipo = tipo;
        this.tipo_var = tipo_var;
        this.id = id;
        this.valor = valor;
        this.ambito = ambito;
    }

    // Constructor with type, ID, ambit
    public Simbolo(String tipo, String tipo_var, String id, String ambito) {
        this.tipo = tipo;
        this.tipo_var = tipo_var;
        this.id = id;
        this.ambito = ambito;
    }

    // Getter for tipo_var
    public String getTipo_var() {
        return tipo_var;
    }

    // Setter for tipo_var
    public void setTipo_var(String tipo_var) {
        this.tipo_var = tipo_var;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for tipo
    public String getTipo (){
        return tipo;
    }

    // Setter for tipo 
    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    // Getter for esConstante
    public boolean esConstante() {
        return esConstante;
    }

    // Setter for esConstante
    public void setEsConstante(boolean esConstante) {
        this.esConstante = esConstante;
    }

    // Getter for valor
    public Object getValor() {
        return valor;
    }

    // Setter for valor
    public void setValor(Object valor) {
        this.valor = valor;
    }

    // Getter for ambito
    public String getAmbito() {
        return ambito;
    }

    // Setter for ambito
    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
    /**
     * Verifies if the current value is compatible with the specified variable type.
     *
     * @return true if the value is compatible, false otherwise.
     */
    public boolean esValorCompatible() {
        // Convert value if it's a String
        if (valor instanceof String) {
            if (!convertStringToTipo((String) valor)) {
                return false; // Conversion failed
            }
        }

        // Validate type compatibility
        return validateTipoCompatibility();
    }

    // Converts a String value to the specified tipo_var, if possible
    private boolean convertStringToTipo(String stringValue) {
        try {
            switch (tipo_var) {
                case "int":
                    valor = Integer.parseInt(stringValue);
                    break;
                case "long":
                    valor = Long.parseLong(stringValue);
                    break;
                case "short":
                    valor = Short.parseShort(stringValue);
                    break;
                case "char":
                    if (stringValue.length() == 1) {
                        valor = stringValue.charAt(0);
                    } else {
                        return false; // Invalid char
                    }
                    break;
                default:
                    return false; // Unsupported type
            }
            return true;
        } catch (NumberFormatException e) {
            return false; // Conversion error
        }
    }

    // Validates if valor matches the expected tipo_var
    private boolean validateTipoCompatibility() {
        switch (tipo_var) {
            case "int":
                return valor instanceof Integer;
            case "long":
                return valor instanceof Long;
            case "short":
                return valor instanceof Short;
            case "char":
                return valor instanceof Character || (valor instanceof Integer &&
                        (Integer) valor >= Character.MIN_VALUE &&
                        (Integer) valor <= Character.MAX_VALUE);
            default:
                return false; // Unsupported type
        }
    }

    @Override
    public String toString() {
        if (tipo.equals("FUNCION")) {
            return "Simbolo { " +
                "tipo_func='" + tipo_var + '\'' +
                ", id='" + id + '\'' +
                ", cantParametros=" + valor + 
                " }";
        } else {
            return "Simbolo { " +
                    tipo +
                    ", tipo_var='" + tipo_var + '\'' +
                    ", id='" + id + '\'' +
                    ", valor=" + valor + '\''+
                    ", ambito=" + ambito +
                    " }";
            }
    }
}