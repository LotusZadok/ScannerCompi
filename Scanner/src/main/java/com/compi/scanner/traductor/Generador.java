package com.compi.scanner.traductor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import com.compi.scanner.semantico.*;

public class Generador {

    private int numLabels = 1;
    public String data = "section .data\n";
    public String code = "\nsection .code\n";

    public Generador() {
    }

    public void generarArchivo() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("traduccion.asm"))) {
            writer.write(data + code);
            System.out.println("Archivo ensamblador generado exitosamente.");
        }
    }

    public void registrarDir(String registro, String id) {
        code += "\tmov ";
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
                code += "\tinc ";
                break;

            case "--":
                code += "\tdec ";
                break;
        }
        code += getDir(registro) + "\n";
        code += "\tmov [" + id + "], " + getDir(registro) + "\n";
    }

    public void genAssign(String id, String valor) {
        code += "\tmov ax, " + valor + "\n";
        code += "\tmov [" + id + "], ax\n";
    }

    public void genJump(String label) {
        code += "\tjmp " + label + "\n";
    }

    public void genLabel(String label) {
        code += "\n" + label + ":\n";
    }

    public void genVar(String id, String tipo) {
        data += id + " dw 0\n";
    }

    public void genTest(RS_DO left, String op, RS_DO right, String label) {
        if (left.isConstante()) {
            code += "\tmov ax, " + left.getId() + "\n";
        } else {
            registrarDir("A", left.getId());
        }
        if (right.isConstante()) {
            code += "\tcmp ax, " + right.getId() + "\n";
        } else {
            registrarDir("B", right.getId());
            code += "\tcmp ax, bx\n";
        }
        code += "\t"+ getSalto(op) + " " + label + "\n";
    }

    public String genBinary(RS_DO left, String op, RS_DO right) {
        // Generar varinale temporal
        String temp = "temp" + getNextNumLabel();
        genVar(temp, "int");

        if (left.isConstante()) {
            code += "\tmov ax, " + left.getId() + "\n";
        } else {
            registrarDir("A", left.getId());
        }
        if (right.isConstante()) {
            code += "\tmov bx, " + right.getId() + "\n";
        } else {
            registrarDir("B", right.getId());
        }
        code += "\t" + getOperator(op) + " ax, bx\n";
        code += "\tmov [" + temp + "], ax\n";
        return temp;
    }

}