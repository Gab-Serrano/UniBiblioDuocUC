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
        
        for (Libro libro : bd.obtenerLibros()) {
            libro.imprimirDetalles();
        }
    }
}
