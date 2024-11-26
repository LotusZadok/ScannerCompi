package com.compi.scanner.semantico;

import java.util.ArrayList;

public class TablaSimbolos {
    private ArrayList<Simbolo> variablesGlobales;
    private ArrayList<Simbolo> variables;
    private ArrayList<Simbolo> funciones;

    // Constructor to initialize the lists
    public TablaSimbolos() {
        variablesGlobales = new ArrayList<>();
        variables = new ArrayList<>();
        funciones = new ArrayList<>();
    }

    // Getter for global variables
    public ArrayList<Simbolo> getGlobales() {
        for (Simbolo s : variables) {
            if (s.getAmbito().equals("global")) {
                variablesGlobales.add(s);
            }
        }
        return variablesGlobales;
    }

    // Inserts a variable
    public String insertarVar(Simbolo simbolo) {
        //System.out.println("dentro del insertarVar");
        String idSimbolo = simbolo.getId();
        String ambito = simbolo.getAmbito();
        String mensaje =  idSimbolo + "' ya declarada.";

        if (simbolo.getValor() != null && simbolo.getValor().equals("PARAMETRO")) {
            mensaje = checkAmbitoParametro(idSimbolo, ambito);
        } else if (!containsInList(variables, idSimbolo, ambito)) {
            mensaje = checkAmbito(idSimbolo, ambito);
        }

        if (mensaje == null) {
            variables.add(simbolo);
            return null;
        } else return "Variable '" + mensaje;
    }

    // Inserts a constant
    public String insertarConstante(Simbolo simbolo) {
        //System.out.println("dentro del insertarConst");
        String idSimbolo = simbolo.getId();
        String ambito = simbolo.getAmbito();
        String mensaje =  "Constante '" + idSimbolo + "' ya declarada.";

        if (!containsInList(variables, idSimbolo, ambito)) {
            //System.out.println("dentor del primer if");
            mensaje = checkAmbito(idSimbolo, ambito);
            if (mensaje == null) {
                //System.out.println("dentro del segundo if");
                if (simbolo.esValorCompatible()) {
                    variables.add(simbolo);
                    return null;
                } else return "El valor no es compatible con el tipo de variable.";
            } else return "Constante '" + mensaje;
        }
        return mensaje;
    }

    // Inserts a funtion ()
    public String insertarFuncion (Simbolo simbolo){
        String idSimbolo = simbolo.getId();
        if (containsInList(funciones, idSimbolo,null)){
            return "Función '" + idSimbolo + "' ya declarada."; 
        } else {
            funciones.add(simbolo);
            return null;
        }
    }

    // Prints both global and local variable tables
    public void imprimirTablas() {
        System.out.println("\n--- Variables ---");
        for (Simbolo simbolo : variables) {
            System.out.println(simbolo);
        }

        System.out.println("\n--- Funciones ---");
        for (Simbolo simbolo : funciones) {
            System.out.println(simbolo);
        }
    }

    // Checks if a variable or constant with the given ID exists
    public boolean contiene(String id, String ambito) {
        System.out.println("esta en contiene");
        return (containsInList(variables, id, ambito));
    }

    // Retrieves a symbol by ID
    public Simbolo obtenerSimbolo(String id) {
        Simbolo simbolo = findInList(variablesGlobales, id);
        return (simbolo != null) ? simbolo : findInList(variables, id);
    }

    // Private helper method to check if a list contains a symbol by ID
    private boolean containsInList(ArrayList<Simbolo> list, String id, String ambito) {
        System.out.println("dentro de containst in list");
        for (Simbolo s : list) {
            //if (s.getId().equals(id) && (s.getAmbito().equals(ambito) || s.getAmbito().equals("global"))) return true;
            if (s.getId().equals(id))
                if (list == variables) if (s.getAmbito().equals(ambito) || s.getAmbito().equals("global")) return true;
                else {System.out.println("es una funcion"); return true;}
        }
        return false;
    }

    // Private helper methor to check if theres two or more parametros for the same function
    private String checkAmbitoParametro (String id, String ambito){
        System.out.println("dentro de checkambitoparametros");
        for (Simbolo s : variables) {
            if (s.getId().equals(id)) {
                if (s.getAmbito().equals(ambito)) return id + "' ya declarada en el ámbito "+ ambito + ".";
            }
        }
        return null;
    }

    // Private helper methor to check if theres two funtions or variable in the same ambito
    private String checkAmbito (String id, String ambito){
        for (Simbolo s : variables) {
            if (s.getId().equals(id)) {
                if (s.getAmbito().equals("global") && (ambito == null || ambito.equals("global"))) return id + "' ya declarada en el ámbito global.";    // solo puede haber una a nivel global
                else if (s.getAmbito().equals(ambito)) return id + "' ya declarada en el ámbito "+ ambito + ".";
            }
        }
        return null;
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

    // Checks if a funtion already exists
    public boolean existeFuncion (String id){
        return containsInList(funciones, id, null);
    }

    // Set ambito global a variables
    public void global (){
        variables.getLast().setAmbito("global");
    }
}