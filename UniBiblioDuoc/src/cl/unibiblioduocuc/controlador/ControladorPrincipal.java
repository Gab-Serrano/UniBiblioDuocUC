package cl.unibiblioduocuc.controlador;

import cl.unibiblioduocuc.modelo.Libro;
import cl.unibiblioduocuc.modelo.bd.TestBD;
import cl.unibiblioduocuc.vista.gestionlibros.VistaAgregarLibros;
import cl.unibiblioduocuc.vista.gestionlibros.VistaEditarLibros;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Serrano
 */
public class ControladorPrincipal {

    private VistaAgregarLibros vAgregarLibros;
    private TestBD bd;
    private VistaEditarLibros vEditarLibros;
    
    public ControladorPrincipal() {
    }

    public ControladorPrincipal(TestBD bd) {
        this.bd = bd;
    }
    
    public ArrayList<Libro>obtenerLibros(TestBD bd){
        return bd.getLibros();
    }
    
    public ArrayList<Libro> buscarLibroPorQuery(String query, String type, TestBD bd){
        ArrayList<Libro> librosBuscados;
        
        switch (type) {
            case "titulo":
                librosBuscados = bd.obtenerLibroPorTitulo(query);
                break;
            case "autor":
                librosBuscados = bd.obtenerLibroPorAutor(query);
                break;
            case "isbn":
                librosBuscados = bd.obtenerLibroPorISBN(query);
                break;
            default:
                throw new AssertionError();
        }
        return librosBuscados;
    }
    
    public ArrayList<String> obtenerColecciones (TestBD bd){
        return bd.obtenerColecciones();
    }
    
    public int obtenerMaxId (TestBD bd){
        return bd.getMaxId();
    }
    
    public boolean agregarLibro (Libro libro, TestBD bd){
        return bd.getLibros().add(libro);
    }
    
    public void handleAgregar (TestBD bd){
        this.vAgregarLibros = new VistaAgregarLibros(bd);
        vAgregarLibros.setVisible(true); // Mostramos la ventana principal
    }
    
    public Libro obtenerLibroPorId(int id, TestBD bd) {
        return bd.obtenerLibroPorId(id);
    }

    public void guardarCambios(Libro libroActualizado) {
        bd.actualizarLibro(libroActualizado);
    }
    
    public void handleEditar (TestBD bd, int libroId){
        Libro libro = obtenerLibroPorId(libroId, bd);
        this.vEditarLibros = new VistaEditarLibros(bd, libro);
        vEditarLibros.setVisible(true); // Mostramos la ventana principal
    }
    
    public void eliminarLibro(int id, TestBD bd) {
        bd.eliminarLibro(id);
    }
}
