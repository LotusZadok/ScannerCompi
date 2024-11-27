package com.compi.scanner.semantico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PilaSemantica {
    private List<RS> pilaSemantica;

    // Constructor to initialize the stack
    public PilaSemantica() {
        pilaSemantica = new ArrayList<>();
    }

    // Pushes a record to the end of the stack
    public void push(RS registro) {
        pilaSemantica.add(registro);
    }

    // Removes and returns the last record from the stack
    public RS pop() {
        if (!pilaSemantica.isEmpty()) {
            return pilaSemantica.remove(pilaSemantica.size() - 1);
        }
        logError("pop_end");
        return null;
    }

    // Gets the last record from the stack
    public RS top() {
        if (!pilaSemantica.isEmpty()) {
            return pilaSemantica.get(pilaSemantica.size() - 1);
        }
        logError("top");
        return null;
    }

    // Searches for the first record with "TIPO"
    public RS get(String tipo) {
        for (int i = pilaSemantica.size() - 1; i >= 0; i--) {
            RS registro = pilaSemantica.get(i);
            if (registro.getTipo().equals(tipo)) {
                return registro;
            }
        }
        logError("buscarRS");
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
    public RS get(int index) {
        if (isValidIndex(index)) {
            return pilaSemantica.get(index);
        }
        logError("get: índice fuera de rango");
        return null;
    }

    // Prints all records in the stack
    public void print() {
        for (RS registro : pilaSemantica) {
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

    public Stream<RS> stream() {
        return pilaSemantica.stream();
    }
}