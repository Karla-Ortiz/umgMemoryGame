/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame.controladores;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Gabriela}
 */
public class LogicaJuego {

    int matriz1[][] = new int[8][8];
    int matriz2[][] = new int[8][8];
    Random ran;
    int contador;

    public JLabel[][] cartas(JLabel[][] matriz) {
        matriz = new JLabel[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = new JLabel();
                matriz[i][j].setSize(matriz[i][j].getWidth(), matriz[i][j].getHeight());
                matriz[i][j].setBounds(350+(j*125),30+(i*156),125,156);
            }
        }
        return matriz;
    }
}
