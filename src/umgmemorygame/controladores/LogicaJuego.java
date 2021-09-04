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

    public int matriz1[][] = new int[8][8]; //Matriz base
    public static Carta matrizCartas[][] = new Carta[8][8]; //Matriz con componentes

    public LogicaJuego(){
        insertarCartas();
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
