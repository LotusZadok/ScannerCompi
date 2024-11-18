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

    public String insertarGlobal(Simbolo simbolo){
        String idSimbolo = simbolo.getId();
    
        for (Simbolo s : variablesGlobales) {   // Verificar si el nombre del símbolo ya existe en variablesGlobales
            if (s.getId().equals(idSimbolo)) return "Variable ya declarada en el ámbito global.";
        }

        variablesGlobales.add(simbolo);
        return null;
    }

    public String insertarVar(Simbolo simbolo){
        String idSimbolo = simbolo.getId();
    
        for (Simbolo s : variablesGlobales) {   // Verificar si el nombre del símbolo ya existe en variablesGlobales
            if (s.getId().equals(idSimbolo)) return "Variable ya declarada en el ámbito global.";
        }

        for (Simbolo s : variables) {    // Verificar si el nombre del símbolo ya existe en variables
            if (s.getId().equals(idSimbolo)) return "Variable ya declarada en el ámbito local.";
        }

        variables.add(simbolo);
        return null;
    }

    public void globales (){
        variablesGlobales.addAll(variables);
        variables.clear();
    }

    public void imprimirTablas(){
        System.out.println("\n--- Variables Globales ---");
        for (Simbolo simbolo : variablesGlobales) {
            System.out.println(simbolo.toString());
        }

        System.out.println("\n--- Variables ---");
        for (Simbolo simbolo : variables) {
            System.out.println(simbolo.toString());
        }
    }

}
