/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame.imagenes;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author KORTIZ
 */
public class RutaImg {
    private static final String logo = "src/umgmemorygame/imagenes/logo.jpg";
    private static final String blanco = "src/umgmemorygame/imagenes/blanco.jpg";
    public static String avatarRut = "src/umgmemorygame/imagenes/blanco.jpg";
    
    public static ImageIcon resizable(String imagen, int v) {
        BufferedImage icono = null;
        try {
            BufferedImage image = ImageIO.read(new File(imagen));
            icono = new BufferedImage(v, v, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = icono.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(image, 0, 0, v, v, null);
            g2.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ImageIcon(icono);
    }

    public static ImageIcon getLogo() {
        return resizable(logo, 70);
    }

    public static ImageIcon getBlanco() {
        return resizable(blanco, 70);
    }
}
