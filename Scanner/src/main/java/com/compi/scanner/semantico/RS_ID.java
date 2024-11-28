package com.compi.scanner.semantico;

public class RS_ID
        extends RS { // RS_ID = Registro Semantico Identificador
    // DataObject
    private String id = "";
    private String scope = "";

    public RS_ID(String id) {
        super("ID");
        this.id = id;
    }

    public RS_ID(String id, String scope) {
        super("ID");
        this.id = id;
        this.scope = scope;
    }

    public String getId() {
        return id;
    }

    public String getScope() {
        return scope;
    }
}