/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unibiblioduocuc.controlador;

import cl.unibiblioduocuc.modelo.DataBase;
import cl.unibiblioduocuc.modelo.Usuario;
import cl.unibiblioduocuc.vista.Principal;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Serrano
 * @version 1.0
 */
public class ContLogin {

    private DataBase db = new DataBase();

    public ContLogin() {
    }

    public ContLogin(DataBase db) {
        this.db = db;
    }

    public boolean validarLogin(String correo, String contasenna, DataBase db) {
        ArrayList<Usuario> usuarios = db.getUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(correo) && usuario.getContraseña().equals(contasenna)) {
                JOptionPane.showMessageDialog(null, "Ingreso correcto", "Información", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No coincide el usuario y/o la constraseña.", "Información", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return false;
    }

    public void redigirLogin(JFrame frame, DataBase db, boolean estado) {

        if (estado) {
            frame.dispose();
            Principal vp = new Principal(db);
            vp.setVisible(true);
        }
    }
}
