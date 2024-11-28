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

    public String getOperator(String op) {
        switch (op) {
            case "+":
                return "add";
            case "-":
                return "sub";
            case "*":
                return "mul";
            case "/":
                return "div";
            case "%":
                return "mod";
            default:
                return "";
        }
    }

    public String getNextNumLabel() {
        return "Label_" + numLabels++;
    }

    public void genIncrement(String id, String op) {
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

    public void genAssign(String id, String valor) {
        code += "mov ax, " + valor + "\n";
        code += "mov [" + id + "], ax\n";
    }

    public void genJump(String label) {
        code += "jmp " + label + "\n";
    }

    public void genLabel(String label) {
        code += label + ":\n";
    }

    public void genVar(String id, String tipo) {
        data += id + " dw 0\n";
    }

    public void genTest(RS_DO left, String op, RS_DO right, String label) {
        if (left.isConstante()) {
            code += "mov ax, " + left.getId() + "\n";
        } else {
            registrarDir("A", left.getId());
        }
        if (right.isConstante()) {
            code += "cmp ax, " + right.getId() + "\n";
        } else {
            registrarDir("B", right.getId());
            code += "cmp ax, bx\n";
        }
        code += getSalto(op) + " " + label + "\n";
    }

    public String genBinary(RS_DO left, String op, RS_DO right) {
        // Generar varinale temporal
        String temp = "temp" + getNextNumLabel();
        genVar(temp, "int");

        if (left.isConstante()) {
            code += "mov ax, " + left.getId() + "\n";
        } else {
            registrarDir("A", left.getId());
        }
        if (right.isConstante()) {
            code += "mov bx, " + right.getId() + "\n";
        } else {
            registrarDir("B", right.getId());
        }
        code += getOperator(op) + " ax, bx\n";
        code += "mov [" + temp + "], ax\n";
        return temp;
    }

}