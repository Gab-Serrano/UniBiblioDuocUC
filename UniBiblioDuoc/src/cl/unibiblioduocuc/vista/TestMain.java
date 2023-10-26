package cl.unibiblioduocuc.vista;

import cl.unibiblioduocuc.modelo.Libro;
import cl.unibiblioduocuc.modelo.TestBD;

/**
 *
 * @author Gabriel Serrano 
 */
public class TestMain {
    public static void main(String[] args) {
        TestBD bd = new TestBD();
        
        //"juan.perez@biblioteca.com", "admin123"
        System.out.println(bd.validarCredenciales("juan.perez@biblioteca.com", "admin1234"));
        
    }
}
