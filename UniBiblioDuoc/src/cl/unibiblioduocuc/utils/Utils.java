package cl.unibiblioduocuc.utils;

import cl.unibiblioduocuc.vista.JF_Login;
import cl.unibiblioduocuc.vista.Principal;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel Serrano
 * @version 1.0
 */
public class Utils {

    private final static Color PRIMARY_BG = new Color(229, 229, 229);
    private final static Color SECONDARY_BG = new Color(0, 0, 51);
    private final static Color TEXT_COLOR_PRIMARY = new Color(229, 229, 229);
    private final static Color TEXT_COLOR_SECONDARY = new Color(0, 34, 68);

    private static final String RUTA_ICONO_JFRAME = "/cl/unibiblioduocuc/img/logo-small.png";

    public static void cambiarIconoJFrame(JFrame frame) {
        try {
            ImageIcon icono = new ImageIcon(Utils.class.getResource(RUTA_ICONO_JFRAME));
            frame.setIconImage(icono.getImage());
        } catch (Exception e) {
            ImageIcon icono = new ImageIcon();
            frame.setIconImage(icono.getImage());
        }
    }

    public static void desactrivarIconoBotonEtiqueta(JLabel btn) {
        String RUTA = "/cl/unibiblioduocuc/img/" + btn.getName() + "-icon-blank.png";

        try {
            ImageIcon icono = new ImageIcon(Utils.class.getResource(RUTA));
            btn.setIcon(icono);
        } catch (Exception e) {
            ImageIcon icono = new ImageIcon();
            btn.setIcon(icono);
        }
    }

    public static void activarIconoBotonEtiqueta(JLabel btn) {
        String RUTA = "/cl/unibiblioduocuc/img/" + btn.getName() + "-icon-fill.png";

        try {
            ImageIcon icono = new ImageIcon(Utils.class.getResource(RUTA));
            btn.setIcon(icono);
        } catch (Exception e) {
            ImageIcon icono = new ImageIcon();
            btn.setIcon(icono);
        }
    }

    public static String obtenerInput(JTextField campo) {
        return campo.getText();
    }

    public static String obtenerInputPassword(JPasswordField campo) {
        return String.valueOf(campo.getPassword());
    }

    public static void cambiarPanel(JFrame frame, JPanel panelPadre, JPanel panelHijo, JPanel panelBtn, JLabel btn) {

        switch (btn.getName()) {
            case "jBtn_Libros":
                resetearPanelPadre(frame, panelPadre, btn.getName());
                activarPanelHijo(frame, panelPadre, panelHijo, panelBtn, btn);
                break;
            case "jBtn_Prestamos":
                resetearPanelPadre(frame, panelPadre, btn.getName());
                activarPanelHijo(frame, panelPadre, panelHijo, panelBtn, btn);
                break;
            case "jBtn_Salir":
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Confirmación cierre de sesión", 2, JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    frame.dispose();
                    JF_Login login = new JF_Login();
                    login.setVisible(true);
                }
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void resetearPanelPadre(JFrame frame, JPanel panel, String nomBoton) {
        panel.removeAll();

        Principal vp = (Principal) frame;
        //Desactrivar botones

        switch (nomBoton) {
            case "jBtn_Libros":
                dejarInactivoBoton(vp.getjPanel_PanelBtn_Prestamos(), vp.getjBtn_Prestamos());
                break;
            case "jBtn_Prestamos":
                dejarInactivoBoton(vp.getjPanel_PanelBtn_Libros(), vp.getjBtn_Libros());
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void activarPanelHijo(JFrame frame, JPanel panelPadre, JPanel panelHijo, JPanel panelBtn, JLabel btn) {
        Principal vp = (Principal) frame;

        String nomButton = btn.getName();
        switch (nomButton) {
            case "jBtn_Libros":
                //Activar panelHijo
                vp.getjPanel_Parent().add(vp.getjPanel_Child_Libros());
                vp.getjPanel_Child_Libros().setVisible(true);
                //Setear boton
                activarBoton(vp.getjPanel_PanelBtn_Libros(), vp.getjBtn_Libros());
                break;
            case "jBtn_Prestamos":
                //Activar panelHijo
                vp.getjPanel_Parent().add(vp.getjPanel_Child_Prestamos());
                vp.getjBtn_Prestamos().setVisible(true);
                activarBoton(vp.getjPanel_PanelBtn_Prestamos(), vp.getjBtn_Prestamos());
                break;
            default:
                throw new AssertionError();
        }
        panelPadre.repaint();
        panelPadre.revalidate();
    }

    public static void activarBoton(JPanel panelBtn, JLabel btn) {
        //Setea el texto del botón-etiqueta
        panelBtn.setBackground(PRIMARY_BG);
        btn.setForeground(TEXT_COLOR_SECONDARY);

        //Setea el ícono del botón etiqueta
        activarIconoBotonEtiqueta(btn);
    }

    public static void dejarInactivoBoton(JPanel panelBtn, JLabel btn) {
        //Setea el texto del botón-etiqueta
        panelBtn.setBackground(SECONDARY_BG);
        btn.setForeground(TEXT_COLOR_PRIMARY);

        //Setea el ícono del botón etiqueta
        desactrivarIconoBotonEtiqueta(btn);
    }

}
