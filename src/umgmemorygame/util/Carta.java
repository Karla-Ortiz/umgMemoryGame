/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame.util;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import umgmemorygame.controladores.LogicaJuego;
import umgmemorygame.formularios.FrmJuego;
import umgmemorygame.imagenes.RutaImg;

/**
 *
 * @author KORTIZ
 */
public class Carta extends JLabel{

    private JLabel vista;
    private int name, posicionx, posiciony;
    private boolean volteada = false;
    private boolean encontrada = false;

    public Carta(int name, int x, int y, JLabel carta) {
        this.posicionx = x;
        this.posiciony = y;
        vista = carta;
        this.name = name;
        vista.setIcon(RutaImg.getBlanco());
        vista.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        vista.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    if (FrmJuego.cont < 3) {
                        Runnable runnable = new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    descubrir(carta);
                                    Thread.sleep(500);
                                    switch (FrmJuego.cont) {
                                        case 1:
                                            FrmJuego.cont++;
                                            FrmJuego.anterior = name;
                                            FrmJuego.xant = x;
                                            FrmJuego.yant = y;
                                            break;
                                        case 2:
                                            if (name == FrmJuego.anterior) {
                                                LogicaJuego.matrizCartas[FrmJuego.xant][FrmJuego.yant].encontrada = true;
                                                encontrada = true;
                                            } else {
                                                LogicaJuego.matrizCartas[FrmJuego.xant][FrmJuego.yant].ocultar(LogicaJuego.matrizCartas[FrmJuego.xant][FrmJuego.yant].getVista());
                                                ocultar(carta);
                                            }
                                            FrmJuego.cont = 1;
                                            break;
                                    }
                                    Thread.sleep(1500);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            }
                        };
                        new Thread(runnable).start();
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    private void descubrir(JLabel carta) {
        if (!volteada) {
            volteada = true;
            carta.setIcon(RutaImg.resizable("src/umgmemorygame/imagenes/" + name + ".png", 50));
        }
    }

    public void ocultar(JLabel carta) {
        if (volteada) {
            volteada = false;
            carta.setIcon(RutaImg.getBlanco());
            carta.setBackground(Color.WHITE);
        }
    }

    private void ocultarTodo() {

    }

    public JLabel getVista() {
        return vista;
    }

    public void setVista(JLabel vista) {
        this.vista = vista;
    }

    public int getNameImg() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPosicionx() {
        return posicionx;
    }

    public void setPosicionx(int posicionx) {
        this.posicionx = posicionx;
    }

    public int getPosiciony() {
        return posiciony;
    }

    public void setPosiciony(int posiciony) {
        this.posiciony = posiciony;
    }

    public boolean isVolteada() {
        return volteada;
    }

    public void setVolteada(boolean volteada) {
        this.volteada = volteada;
    }

    public boolean isEncontrada() {
        return encontrada;
    }

    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }

}
