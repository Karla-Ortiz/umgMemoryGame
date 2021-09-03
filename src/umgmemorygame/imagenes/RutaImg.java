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
import javafx.scene.image.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author KORTIZ
 */
public class RutaImg {
    private static final String logo = "src/umgmemorygame/imagenes/logo.jpg";
    private static final String img1 = "src/umgmemorygame/imagenes/1.png";
    private static final String img2 = "src/umgmemorygame/imagenes/2.png";
    private static final String img3 = "src/umgmemorygame/imagenes/3.png";
    private static final String img4 = "src/umgmemorygame/imagenes/4.png";
    private static final String img5 = "src/umgmemorygame/imagenes/5.png";
    private static final String img6 = "src/umgmemorygame/imagenes/6.png";
    private static final String img7 = "src/umgmemorygame/imagenes/7.png";
    private static final String img8 = "src/umgmemorygame/imagenes/8.png";
    private static final String img9 = "src/umgmemorygame/imagenes/9.png";
    private static final String img10 = "src/umgmemorygame/imagenes/10.png";
    private static final String img11 = "src/umgmemorygame/imagenes/11.png";
    private static final String img12 = "src/umgmemorygame/imagenes/12.png";
    private static final String img13 = "src/umgmemorygame/imagenes/13.png";
    private static final String img14 = "src/umgmemorygame/imagenes/14.png";
    private static final String img15 = "src/umgmemorygame/imagenes/15.png";
    private static final String img16 = "src/umgmemorygame/imagenes/16.png";
    private static final String img17 = "src/umgmemorygame/imagenes/17.png";
    private static final String img18 = "src/umgmemorygame/imagenes/18.png";
    private static final String img19 = "src/umgmemorygame/imagenes/19.png";
    private static final String img20 = "src/umgmemorygame/imagenes/20.png";
    private static final String img21 = "src/umgmemorygame/imagenes/21.png";
    private static final String img22 = "src/umgmemorygame/imagenes/22.png";
    private static final String img23 = "src/umgmemorygame/imagenes/23.png";
    private static final String img24 = "src/umgmemorygame/imagenes/24.png";
    private static final String img25 = "src/umgmemorygame/imagenes/25.png";
    private static final String img26 = "src/umgmemorygame/imagenes/26.png";
    private static final String img27 = "src/umgmemorygame/imagenes/27.png";
    private static final String img28 = "src/umgmemorygame/imagenes/28.png";
    private static final String img29 = "src/umgmemorygame/imagenes/29.png";
    private static final String img30 = "src/umgmemorygame/imagenes/30.png";
    private static final String img31 = "src/umgmemorygame/imagenes/31.png";
    private static final String img32 = "src/umgmemorygame/imagenes/32.png";
    
    
    
    private static ImageIcon resizable(String imagen, int v) {
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
        return resizable(logo, 35);
    }

    public static ImageIcon getImg1() {
        return resizable(img1,70);
    }

    public static ImageIcon getImg2() {
        return resizable(img2,70);
    }

    public static ImageIcon getImg3() {
        return resizable(img3,70);
    }

    public static ImageIcon getImg4() {
        return resizable(img4,70);
    }

    public static ImageIcon getImg5() {
        return resizable(img5,70);
    }

    public static ImageIcon getImg6() {
        return resizable(img6,70);
    }

    public static ImageIcon getImg7() {
        return resizable(img7,70);
    }

    public static ImageIcon getImg8() {
        return resizable(img8,70);
    }

    public static ImageIcon getImg9() {
        return resizable(img9,70);
    }

    public static ImageIcon getImg10() {
        return resizable(img10,70);
    }

    public static ImageIcon getImg11() {
        return resizable(img11,70);
    }

    public static ImageIcon getImg12() {
        return resizable(img12,70);
    }

    public static ImageIcon getImg13() {
        return resizable(img13,70);
    }

    public static ImageIcon getImg14() {
        return resizable(img14,70);
    }

    public static ImageIcon getImg15() {
        return resizable(img15,70);
    }

    public static ImageIcon getImg16() {
        return resizable(img16,70);
    }

    public static ImageIcon getImg17() {
        return resizable(img17,70);
    }

    public static ImageIcon getImg18() {
        return resizable(img18,70);
    }

    public static ImageIcon getImg19() {
        return resizable(img19,70);
    }

    public static ImageIcon getImg20() {
        return resizable(img20,70);
    }

    public static ImageIcon getImg21() {
        return resizable(img21,70);
    }

    public static ImageIcon getImg22() {
        return resizable(img22,70);
    }

    public static ImageIcon getImg23() {
        return resizable(img23,70);
    }

    public static ImageIcon getImg24() {
        return resizable(img24,70);
    }

    public static ImageIcon getImg25() {
        return resizable(img25,70);
    }

    public static ImageIcon getImg26() {
        return resizable(img26,70);
    }

    public static ImageIcon getImg27() {
        return resizable(img27,70);
    }

    public static ImageIcon getImg28() {
        return resizable(img28,70);
    }

    public static ImageIcon getImg29() {
        return resizable(img29,70);
    }

    public static ImageIcon getImg30() {
        return resizable(img30,70);
    }

    public static ImageIcon getImg31() {
        return resizable(img31,70);
    }

    public static ImageIcon getImg32() {
        return resizable(img32,70);
    }
    
}
