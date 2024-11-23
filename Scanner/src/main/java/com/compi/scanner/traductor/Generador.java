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

            if (sym.esConstante()) traduccion += sym.getValor().toString() + "\n";
            else traduccion += "?\n";
        }
    }

    public void estructuraIf (PilaSemantica pila){
        RegistroSemantico registro = pila.pop_init();      //saca la primera expre
        RegistroSemantico operador = pila.pop_init();
        RegistroSemantico registro2 = pila.pop_init();     //saca segunda expre 

        // comparar expresiones
        if (registro.getTipo().equals("VAR") && registro2.getTipo().equals("VAR")){  // guardar en direccion
            registrarDir("A", registro.getId()); registrarDir("B", registro2.getId());
            traduccion += "cmp ax, bx\n";
        } else if (registro.getTipo().equals("VAR") && !registro2.getTipo().equals("VAR")){
            registrarDir("A", registro.getId()); 
            traduccion += "cmp ax, "+ registro2.getValor() +"\n";
        } else if (!registro.getTipo().equals("VAR") && registro2.getTipo().equals("VAR")){
            registrarDir("A", registro2.getId()); 
            traduccion += "cmp "+ registro.getValor() +", ax\n";
        } else {
            traduccion += "cmp "+ registro.getValor() + registro2.getValor() +"\n";
        }

        // jump conficional
        traduccion += getSalto(operador.getId()) + "exit"+getNextNumLabel() + ":\n";
    }

    public void estructuraIfElse (PilaSemantica pila){

    }
    
    public void registrarDir (String registro, String id){
        traduccion += "mov ";
        switch (registro) {
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
        return "Label" + numLabels++;
    }

}
