/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame.util;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import umgmemorygame.formularios.FrmJuego;
import umgmemorygame.imagenes.RutaImg;

/**
 *
 * @author KORTIZ
 */
public class Carta {
    private JLabel vista;
    private int name, posicionx, posiciony;
    boolean volteada = false;
    
    public Carta(int name, int x, int y){
        this.posicionx = x;
        this.posiciony = y;
        vista = new JLabel();
        this.name = name;
        vista.setIcon(RutaImg.getBlanco());
        vista.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        vista.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(FrmJuego.cont == 2){
                    if(name == FrmJuego.anterior){
                        
                    }
                }
            }
            
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }
    
    public void descubrir(){
        if(!volteada){
            volteada = true;
            vista.setIcon(RutaImg.resizable("src/umgmemorygame/imagenes/" + name + ".png", 50));
        } 
    }
    
    public void ocultar(){
        if(volteada){
            volteada = false;
            vista.setIcon(RutaImg.getBlanco());
            vista.setBackground(Color.WHITE);
        }
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