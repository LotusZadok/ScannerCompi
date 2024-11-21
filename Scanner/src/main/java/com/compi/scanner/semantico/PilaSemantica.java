package com.compi.scanner.semantico;

import java.util.ArrayList;
import java.util.List;

public class PilaSemantica {
    private List<RegistroSemantico> pilaSemantica;

    public PilaSemantica(){
        pilaSemantica = new ArrayList<>();
    }

    public void push_init(RegistroSemantico registro) {
        pilaSemantica.add(0, registro);
    }

    public void push_end(RegistroSemantico registro) {
        pilaSemantica.add(pilaSemantica.size(), registro);
    }

    public RegistroSemantico pop_init() {
        if (!pilaSemantica.isEmpty()) {
            return pilaSemantica.remove(0);
        } else {
            System.err.println("Error en la pila: pop_init()");
            return null;
        }
    }

    public RegistroSemantico pop_end() {
        if (!pilaSemantica.isEmpty()) {
            return pilaSemantica.remove(pilaSemantica.size() - 1);
        } else {
            System.err.println("Error en la pila: pop_end()");
            return null;
        }
    }

    public String buscarTipoVar (){
        for (RegistroSemantico registro : pilaSemantica) {
            if ("TIPO".equals(registro.getTipo())) {
                return registro.getTipo_Var().toString();
            }
        }
        return null;
    }

    public Boolean isEmpty(){
        return pilaSemantica.isEmpty();
    }

    public void clear(){
        pilaSemantica.clear();
    }

    public int size(){
        return pilaSemantica.size();
    }

    public RegistroSemantico get(int index) {
        if (index >= 0 && index < pilaSemantica.size()) {
            return pilaSemantica.get(index); 
        } else {
            System.err.println("Error: índice fuera de rango");
            return null;
        }
    }

    public void print() {
        for (RegistroSemantico registro : pilaSemantica) {
            System.out.println(registro);
            //System.out.println(pilaSemantica.indexOf(registro));
        }
    }
}
