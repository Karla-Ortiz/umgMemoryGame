/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Gabriela}
 */
public class fileManager {

    private String ruta = "C:\\memoryGame";

    public fileManager() {
        File f = new File(ruta);
        if (!f.exists()) {
            f.mkdir();
        } 
    }

    public void saveFile(String rut, String info) {
        FileWriter fw = null;
        try {
            if (rut.equals("u")) {
                fw = new FileWriter(ruta + "\\users.txt");
            } else {
                fw = new FileWriter(ruta + "\\bitacora.txt");
            }
            PrintWriter archivo = new PrintWriter(fw);
            archivo.print(info);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (null != fw) {
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String lecturaArchivo(String rut) {
        StringBuilder informacion = new StringBuilder();
        FileReader fr = null;
        FileWriter escribir = null;
        try {
            File archivo;
            if(rut.equals("u")){
                archivo = new File(ruta + "\\users.txt");
            } else {
                archivo = new File(ruta + "\\bitacora.txt");
            }
            
            if (archivo.exists()) {
                fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null) {
                    informacion.append(linea + " \n");
                }
            } else {
                escribir = new FileWriter(ruta);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
                if (null != escribir) {
                    escribir.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return informacion.toString();
    }

    public String quitarTildes(String dato){
        return dato.replaceAll("á", "a").replaceAll("Á", "A")
            .replaceAll("é", "e").replaceAll("É", "E")
            .replaceAll("Í", "i").replaceAll("Í", "I")
            .replaceAll("Ó", "O").replaceAll("ó", "o")
            .replaceAll("ú", "u").replaceAll("Ú", "U");
    }
    
    public String encriptar(String dato) {
        return dato.replaceAll("a", "7").replaceAll("á", "7").replaceAll("A", "7may").replaceAll("Á", "7may")
            .replaceAll("e", "5").replaceAll("é", "5").replaceAll("E", "5may").replaceAll("É", "5may")
            .replaceAll("i", "4").replaceAll("í", "4").replaceAll("I", "4may").replaceAll("Í", "4may")
            .replaceAll("o", "9").replaceAll("ó", "9").replaceAll("O", "9may").replaceAll("Ó", "9may")
            .replaceAll("u", "1").replaceAll("ú", "1").replaceAll("U", "1may").replaceAll("Ú", "1may")
            .replaceAll("m", "0").replaceAll("M", "0")
            .replaceAll("r", "2").replaceAll("R", "2")
            .replaceAll("c", "3").replaceAll("C", "3")
            .replaceAll("l", "6").replaceAll("L", "6")
            .replaceAll("g", "8").replaceAll("G", "8");
    }

    public String desencriptar(String dato) {
        return dato.replaceAll("7", "a").replaceAll("7may", "A")
            .replaceAll("5", "e").replaceAll("5may", "E")
            .replaceAll("4", "i").replaceAll("4may", "I")
            .replaceAll("9", "o").replaceAll("9may", "O")
            .replaceAll("1", "u").replaceAll("1may", "U")
            .replaceAll("0", "m").replaceAll("0", "M")
            .replaceAll("2", "r").replaceAll("2", "R")
            .replaceAll("3", "c").replaceAll("3", "C")
            .replaceAll("6", "l").replaceAll("6", "L")
            .replaceAll("8", "g").replaceAll("8", "G");
    }
}
