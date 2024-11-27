package com.compi.scanner.traductor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.compi.scanner.semantico.*;

public class Generador {

    private int numLabels = 0;
    public String data = "section .data\n";
    public String code = "section .code\n";

    public Generador() {
    }

    public void generarArchivo() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("traduccion.asm"))) {
            writer.write(data + code);
            System.out.println("Archivo ensamblador generado exitosamente.");
        }
    }

    public void registrarDir(String registro, String id) {
        code += "mov ";
        switch (registro.toUpperCase()) {
            case "A":
                code += "ax";
                break;
            case "B":
                code += "bx";
                break;
            case "C":
                code += "cx";
                break;
            case "D":
                code += "dx";
                break;
        }
        code += ", [" + id + "]\n";
    }

    public String getDir(String registro) {
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

    public String getSalto(String operador) {
        switch (operador) {
            case "<":
                return "jge";
            case "<=":
                return "jg";
            case ">":
                return "jle";
            case ">=":
                return "jl";
            case "==":
                return "je";
            case "!=":
                return "jne";
            default:
                return "jz";
        }
    }

    private String getNextNumLabel() {
        return "Label_" + numLabels++;
    }

    public void opIncremento(String id, String op) {
        String registro = "A";
        registrarDir(registro, id);
        switch (op) {
            case "++":
                code += "inc ";
                break;

            case "--":
                code += "dec ";
                break;
        }
        code += getDir(registro) + "\n";
        code += "mov [" + id + "], " + getDir(registro) + "\n\n";
    }

}