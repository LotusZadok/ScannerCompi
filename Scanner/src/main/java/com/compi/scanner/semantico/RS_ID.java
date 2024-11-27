package com.compi.scanner.semantico;

public class RS_ID
        extends RS { // RS_ID = Registro Semantico Identificador
    // DataObject
    private String id = "";

    public RS_ID(String id) {
        super("ID");
        this.id = id;
    }

    public String getId() {
        return id;
    }
}