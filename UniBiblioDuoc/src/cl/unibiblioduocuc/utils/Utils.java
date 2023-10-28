package cl.unibiblioduocuc.utils;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Gabriel Serrano
 * @version 1.0
 */
public class Utils {
    
    private static final String RUTA_ICONO_JFRAME = "/cl/unibiblioduocuc/img/logo-small.png";   
    
    public static void cambiarIconoJFrame (JFrame frame){
        try {
            ImageIcon icono = new ImageIcon(Utils.class.getResource(RUTA_ICONO_JFRAME));
            frame.setIconImage(icono.getImage());
        } catch (Exception e) {
            ImageIcon icono = new ImageIcon();
            frame.setIconImage(icono.getImage());
        }
    }
}
