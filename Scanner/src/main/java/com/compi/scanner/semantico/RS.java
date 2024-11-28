package com.compi.scanner.semantico;

public class RS {
    // DataObject
    private String tipo = ""; // TIPO | CONST | VAR | PARAMETRO

    public RS(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "RS{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
