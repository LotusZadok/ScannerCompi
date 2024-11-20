package com.compi.scanner.semantico;

import java.util.ArrayList;

public class TablaSimbolos {
    private ArrayList<Simbolo> variablesGlobales;
    private ArrayList<Simbolo> variables;

    public TablaSimbolos() {
        variablesGlobales = new ArrayList<>();
        variables = new ArrayList<>();
    }

    public String insertarGlobal(Simbolo simbolo) {
        String idSimbolo = simbolo.getId();

        for (Simbolo s : variablesGlobales) {
            if (s.getId().equals(idSimbolo)) return "Variable '" + idSimbolo + "' ya declarada en el ámbito global.";
        }

        variablesGlobales.add(simbolo);
        return null;
    }

    public String insertarVar(Simbolo simbolo) {
        String idSimbolo = simbolo.getId();

        for (Simbolo s : variablesGlobales) {
            if (s.getId().equals(idSimbolo)) return "Variable '" + idSimbolo + "' ya declarada en el ámbito global.";
        }

        for (Simbolo s : variables) {
            if (s.getId().equals(idSimbolo)) return "Variable '" + idSimbolo + "' ya declarada en el ámbito local.";
        }

        variables.add(simbolo);
        return null;
    }

    public String insertarConstante(Simbolo simbolo) {
        String idSimbolo = simbolo.getId();

        for (Simbolo s : variablesGlobales) {
            if (s.getId().equals(idSimbolo)) return "Constante '" + idSimbolo + "' ya declarada en el ámbito global.";
        }
        for (Simbolo s : variables) {
            if (s.getId().equals(idSimbolo)) return "Constante '" + idSimbolo + "' ya declarada en el ámbito local.";
        }

        if (simbolo.esValorCompatible()){
            variables.add(simbolo);
            return null;    
        } else { return "El valor no es compatible con el tipo de variable.";}
    }

    public void globales() {
        variablesGlobales.addAll(variables);
        variables.clear();
    }

    public void imprimirTablas() {
        System.out.println("\n--- Variables Globales ---");
        for (Simbolo simbolo : variablesGlobales) {
            System.out.println(simbolo.toString());
        }

        System.out.println("\n--- Variables Locales ---");
        for (Simbolo simbolo : variables) {
            System.out.println(simbolo.toString());
        }
    }

    public boolean contiene(String id) {
        for (Simbolo s : variablesGlobales) {
            if (s.getId().equals(id)) return true;
        }
        for (Simbolo s : variables) {
            if (s.getId().equals(id)) return true;
        }
        return false;
    }

    public Simbolo obtenerSimbolo(String id) {
        for (Simbolo s : variablesGlobales) {
            if (s.getId().equals(id)) return s;
        }
        for (Simbolo s : variables) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }
}
