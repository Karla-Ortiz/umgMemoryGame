/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame.util;

import javax.swing.JLabel;
import umgmemorygame.imagenes.RutaImg;

/**
 *
 * @author KORTIZ
 */
public class Carta {
    private JLabel vista;
    private int name;
    
    public Carta(int name){
        vista = new JLabel();
        this.name = name;
        vista.setIcon(RutaImg.resizable("src/umgmemorygame/imagenes/" + name + ".png", 50));
    }

    public JLabel getVista() {
        return vista;
    }

    public void setVista(JLabel vista) {
        this.vista = vista;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
    
}