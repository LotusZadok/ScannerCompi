package com.compi.scanner.semantico;

import java.util.ArrayList;
import java.util.List;

public class PilaSemantica {
    private List<RegistroSemantico> pilaSemantica;

    // Constructor to initialize the stack
    public PilaSemantica() {
        pilaSemantica = new ArrayList<>();
    }

    // Pushes a record to the start of the stack
    public void push_init(RegistroSemantico registro) {
        pilaSemantica.add(0, registro);
    }

    // Pushes a record to the end of the stack
    public void push_end(RegistroSemantico registro) {
        pilaSemantica.add(registro);
    }

    // Removes and returns the first record from the stack
    public RegistroSemantico pop_init() {
        if (!pilaSemantica.isEmpty()) {
            return pilaSemantica.remove(0);
        }
        logError("pop_init");
        return null;
    }

    // Removes and returns the last record from the stack
    public RegistroSemantico pop_end() {
        if (!pilaSemantica.isEmpty()) {
            return pilaSemantica.remove(pilaSemantica.size() - 1);
        }
        logError("pop_end");
        return null;
    }

    // Searches for the first record with "TIPO" and returns its tipo_var
    public String buscarTipoVar() {
        for (RegistroSemantico registro : pilaSemantica) {
            if ("TIPO".equals(registro.getTipo())) {
                return registro.getTipo_Var();
            }
        }
        return null;
    }

    // Checks if the stack is empty
    public Boolean isEmpty() {
        return pilaSemantica.isEmpty();
    }

    // Clears the stack
    public void clear() {
        pilaSemantica.clear();
    }

    // Returns the size of the stack
    public int size() {
        return pilaSemantica.size();
    }

    // Retrieves a record at a specified index
    public RegistroSemantico get(int index) {
        if (isValidIndex(index)) {
            return pilaSemantica.get(index);
        }
        logError("get: índice fuera de rango");
        return null;
    }

    // Prints all records in the stack
    public void print() {
        for (RegistroSemantico registro : pilaSemantica) {
            System.out.println(registro);
        }
    }

    // Private helper method to check if an index is valid
    private boolean isValidIndex(int index) {
        return index >= 0 && index < pilaSemantica.size();
    }

    // Private helper method to log errors
    private void logError(String methodName) {
        System.err.println("Error en la pila: " + methodName + "()");
    }
}