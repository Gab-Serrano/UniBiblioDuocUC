package cl.unibiblioduocuc.utils;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Gabriel Serrano
 */
public class Utils {

    private static final String ICON_PATH = "/cl/unibiblioduocuc/img/logo-small.png";
    /**
     * Cambia el ícono de un JFrame dado.
     * 
     * @param frame el JFrame al que se le cambiará el ícono.
     */
    public static void cambiarIconoFrame(JFrame frame) {
        try {
            ImageIcon icon = new ImageIcon(Utils.class.getResource(ICON_PATH));
            frame.setIconImage(icon.getImage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   
}
