package com.compi.scanner.semantico;

import java.util.ArrayList;

public class TablaSimbolos {
    private ArrayList<Simbolo> variablesGlobales;
    private ArrayList<Simbolo> variables;

    // Constructor to initialize the lists
    public TablaSimbolos() {
        variablesGlobales = new ArrayList<>();
        variables = new ArrayList<>();
    }

    // Getter for global variables
    public ArrayList<Simbolo> getGlobales() {
        return variablesGlobales;
    }

    // Inserts a global variable
    public String insertarGlobal(Simbolo simbolo) {
        if (containsInList(variablesGlobales, simbolo.getId())) {
            return "Variable '" + simbolo.getId() + "' ya declarada en el ámbito global.";
        }
        variablesGlobales.add(simbolo);
        return null;
    }

    // Inserts a local variable
    public String insertarVar(Simbolo simbolo) {
        String idSimbolo = simbolo.getId();

        if (containsInList(variablesGlobales, idSimbolo)) {
            return "Variable '" + idSimbolo + "' ya declarada en el ámbito global.";
        }

        if (containsInList(variables, idSimbolo)) {
            return "Variable '" + idSimbolo + "' ya declarada en el ámbito local.";
        }

        variables.add(simbolo);
        return null;
    }

    // Inserts a constant
    public String insertarConstante(Simbolo simbolo) {
        String idSimbolo = simbolo.getId();

        if (containsInList(variablesGlobales, idSimbolo)) {
            return "Constante '" + idSimbolo + "' ya declarada en el ámbito global.";
        }

        if (containsInList(variables, idSimbolo)) {
            return "Constante '" + idSimbolo + "' ya declarada en el ámbito local.";
        }

        if (simbolo.esValorCompatible()) {
            variables.add(simbolo);
            return null;
        } else {
            return "El valor no es compatible con el tipo de variable.";
        }
    }

    // Merges local variables into global variables
    public void globales() {
        variablesGlobales.addAll(variables);
        variables.clear();
    }

    // Prints both global and local variable tables
    public void imprimirTablas() {
        System.out.println("\n--- Variables Globales ---");
        for (Simbolo simbolo : variablesGlobales) {
            System.out.println(simbolo);
        }

        System.out.println("\n--- Variables Locales ---");
        for (Simbolo simbolo : variables) {
            System.out.println(simbolo);
        }
    }

    // Checks if a variable or constant with the given ID exists
    public boolean contiene(String id) {
        return containsInList(variablesGlobales, id) || containsInList(variables, id);
    }

    // Retrieves a symbol by ID
    public Simbolo obtenerSimbolo(String id) {
        Simbolo simbolo = findInList(variablesGlobales, id);
        return (simbolo != null) ? simbolo : findInList(variables, id);
    }

    // Private helper method to check if a list contains a symbol by ID
    private boolean containsInList(ArrayList<Simbolo> list, String id) {
        for (Simbolo s : list) {
            if (s.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    // Private helper method to find a symbol by ID in a list
    private Simbolo findInList(ArrayList<Simbolo> list, String id) {
        for (Simbolo s : list) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }
}