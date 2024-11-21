package com.compi.scanner.traductor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.compi.scanner.semantico.*;

public class Generador {
    
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

}
