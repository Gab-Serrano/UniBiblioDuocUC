package cl.unibiblioduocuc.controlador;

import cl.unibiblioduocuc.modelo.TestBD;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Serrano
 */
public class ControladorLogin {

    private TestBD bd;

    public ControladorLogin(TestBD bd) {
        this.bd = bd;
    }

    public void handleLogin(String email, String password) {
        if (bd.validarCredenciales(email, password)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión correcto.", "Confirmación Login", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Error en el inicio de sesión.","Confirmación Login",JOptionPane.ERROR_MESSAGE);
        }
    }
}
