package cl.unibiblioduocuc.vista;

import cl.unibiblioduocuc.modelo.Libro;
import cl.unibiblioduocuc.modelo.TestBD;
import java.awt.Label;
import javax.swing.JRadioButton;

/**
 *
 * @author Gabriel Serrano 
 */
public class TestMain {
    public static void main(String[] args) {
        TestBD bd = new TestBD();
        
        System.out.println(bd.obtenerColecciones());
    }
}
