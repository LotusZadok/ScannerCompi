package com.compi.scanner.semantico;

import java.util.ArrayList;

public class TablaSimbolos {
    static ArrayList<Simbolo> tablaSimbolos;
    public ArrayList<Simbolo> variablesGlobales;
    public ArrayList<Simbolo> variables;
    // falta una lista de funciones, todavia no se como manejarlo

    public TablaSimbolos(){
        tablaSimbolos = new ArrayList<>();
        variablesGlobales = new ArrayList<>();
        variables = new ArrayList<>();
    }

    public void insertarGlobal(Simbolo simbolo){
        if (!variablesGlobales.contains(simbolo))
            variablesGlobales.add(simbolo);
        else System.out.println("Global ya declarada");
    }

    public void insertarVar(Simbolo simbolo){
        if (!variablesGlobales.contains(simbolo) && !variables.contains(simbolo))
            variables.add(simbolo);
        else System.out.println("Variable ya declarada");
    }

}
