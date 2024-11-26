package com.compi.scanner.traductor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.compi.scanner.semantico.*;

public class Generador {
    
    private int numLabels = 0;
    public String traduccion;

    public Generador (){
        traduccion = "";
    }

    public void generarArchivo () throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("traduccion.asm"))) {
            writer.write(traduccion);
            System.out.println("Archivo ensamblador generado exitosamente.");
        }
    }

    public void declararGlobales (TablaSimbolos ts){
        String global = traduccion;
        traduccion = "";
        ArrayList<Simbolo> globales = ts.getGlobales();
        for (Simbolo sym : globales){
            String id = sym.getId();
            String tipo = sym.getTipo_var();

            traduccion += id + " ";
            switch (tipo) {
                case "int":
                    traduccion += "dd ";
                    break;
                case "long":
                    traduccion += "dd ";
                    break;
                case "short":
                    traduccion += "dw ";
                    break;
                case "char":
                    traduccion += "db ";
                    break;
            }

            if (sym.getTipo().equals("CONST")) traduccion += sym.getValor().toString() + "\n";
            else traduccion += "?\n";
        }
        traduccion += "\n" + global;
    }

    public void estructuraIf (PilaSemantica pila){
        //System.out.println("dentro del estructura if");
        //pila.print();
        RegistroSemantico registro = pila.pop_init();      //saca la primera expre
        RegistroSemantico operador = pila.pop_init();
        RegistroSemantico registro2 = pila.pop_init();     //saca segunda expre 

        // comparar expresiones
        if (registro.getTipo().equals("VAR") && registro2.getTipo().equals("VAR")){  // guardar en direccion
            registrarDir("A", registro.getValor()); registrarDir("B", registro2.getValor());
            traduccion += "cmp ax, bx\n";
        } else if (registro.getTipo().equals("VAR") && !registro2.getTipo().equals("VAR")){
            registrarDir("A", registro.getValor()); 
            traduccion += "cmp ax, "+ registro2.getValor() +"\n";
        } else if (!registro.getTipo().equals("VAR") && registro2.getTipo().equals("VAR")){
            registrarDir("A", registro2.getValor()); 
            traduccion += "cmp "+ registro.getValor() +", ax\n";
        } else {
            traduccion += "cmp "+ registro.getValor() + registro2.getValor() +"\n";
        }

        if (!pila.isEmpty()){   // verifica si el if no tiene que hacer mas comparaciones
            registro = pila.pop_init();
            if (registro.getId().equals("&&") || registro.getId().equals("||")){
                estructuraIf(pila);
            }
        }

        // se debe esperar a que se traduzca el bloque antes de hacer el jump al exit

        // jump condicional al exit
        traduccion += getSalto(operador.getId()) + " exit_"+getNextNumLabel() + "\n";
        pila.print();
    }

    public void estructuraIfElse (PilaSemantica pila){

    }
    
    public void registrarDir (String registro, String id){
        traduccion += "mov ";
        switch (registro.toUpperCase()) {
            case "A": 
                traduccion += "ax"; break;
            case "B":
                traduccion += "bx"; break;
            case "C":
                traduccion += "cx"; break;
            case "D":
                traduccion += "dx"; break;
        }
        traduccion += ", [" + id + "]\n";
    }

    public String getDir (String registro){
        switch (registro.toUpperCase()) {
            case "A": 
                return "ax";
            case "B":
                return "bx";
            case "C":
                return "cx";
            case "D":
                return "dx"; 
        }
        return "";
    }

    public String getSalto(String operador){
        switch(operador){
            case "<":   return "jge";
            case "<=":  return "jg";
            case ">":   return "jle";
            case ">=":  return "jl";
            case "==":  return "je";
            case "!=":   return "jne";
            default:    return "jz";
        }
    }

    private String getNextNumLabel (){
        return "Label_" + numLabels++;
    }

    public void opIncremento (String id, String op) {
        String registro = "A";
        registrarDir(registro, id);
        switch (op){
            case "++":
                traduccion += "inc ";
                break;

            case "--":
                traduccion += "dec ";
                break;
        }
        traduccion += getDir(registro) + "\n";
        traduccion += "mov [" + id + "], " + getDir(registro) + "\n\n";
    }

}