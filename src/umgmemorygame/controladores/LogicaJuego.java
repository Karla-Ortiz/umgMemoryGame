/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame.controladores;

import java.util.Random;
import javax.swing.JLabel;
import umgmemorygame.util.Carta;

/**
 *
 * @author Gabriela}
 */
public class LogicaJuego {

    int matriz1[][] = new int[8][8]; //Matriz base
    Carta matrizCartas[][] = new Carta[8][8]; //Matriz con componentes

    /**
     * Crea vista de las cartas con datos de la matriz base
     * @return matriz de JLabel con componentes
     */
    public JLabel[][] cartas() {
        insertarCartas();
        JLabel[][] matriz = new JLabel[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrizCartas[i][j] = new Carta(matriz1[i][j],i,j);
                matriz[i][j] = matrizCartas[i][j].getVista();
                matriz[i][j].setBounds(380 + (j * 70), 10 + (i * 85), 70, 85);
            }
        }
        return matriz;
    }

    /**
     * Llenar matriz base
     */
    public void insertarCartas() {
        int x,y;
        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                matriz1[k][l] = 0;
            }
        }
        for (int i = 1; i <= 32; i++) {
            x = generateIntRandom(8);
            y = generateIntRandom(8);
            if (matriz1[x][y] != 0) {
                do {
                    x = generateIntRandom(8);
                    y = generateIntRandom(8);
                } while (matriz1[x][y] != 0);
            }
            matriz1[x][y] = i;
        }
        for (int i = 1; i <= 32; i++) {
            x = generateIntRandom(8);
            y = generateIntRandom(8);
            if (matriz1[x][y] != 0) {
                do {
                    x = generateIntRandom(8);
                    y = generateIntRandom(8);
                } while (matriz1[x][y] != 0);
            }
            matriz1[x][y] = i;
        }
    }

    /**
     *
     * @param max limite superior
     * @return entero random
     */
    private int generateIntRandom(int max) {
        Random r = new Random();
        return r.nextInt(max);
    }
}
