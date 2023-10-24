package cl.unibiblioduocuc.modelo;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Serrano
 */
public class TestBD {

    private ArrayList<Libro> libros;
    private ArrayList<Bibliotecario> bibliotecarios;
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Usuario> usuarios;

    //Constructor con inicializador de listas
    public TestBD() {
        this.libros = new ArrayList<>();
        this.bibliotecarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.usuarios = new ArrayList<>();

        agregarDatosMockUp();
    }

    //Métodos customizados
    /**
     * Método que devuelve un ArrayList con libros.
     * 
     * Método devuelve un ArrayList con los libros presentes en la colección, en el atributo ´libros´.
     * @return ArrayList con los libros presentes en la colección.
     */
    public ArrayList<Libro> obtenerLibros(){
        return this.libros;
    }
    
    /**
     * Método que llena la BD simulada con datos.
     *
     * Método que permite llenar la BD simulada por arreglos con información
     * dummy. Este método se inicializa en el constructor de modo que la BD
     * simulada tenga datos desde el inicio de la ejecución del programa
     */
    private void agregarDatosMockUp() {
        this.libros.add(new Libro(1, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 1967, "Realismo mágico", "978-84-663-0344-6", "Disponible", "Clásicos", "Una obra maestra de la literatura latinoamericana."));
        this.libros.add(new Libro(2, "1984", "George Orwell", "Editorial Secker & Warburg", 1949, "Ciencia ficción", "978-0-452-28423-4", "Prestado", "Ficción distópica", "Una visión sombría del futuro totalitario."));
        this.libros.add(new Libro(3, "El Gran Gatsby", "F. Scott Fitzgerald", "Editorial Charles Scribner's Sons", 1925, "Ficción", "978-0-7432-7356-5", "Disponible", "Clásicos", "Una historia de decadencia y ambición en los años 20."));
        this.libros.add(new Libro(4, "Don Quijote de la Mancha", "Miguel de Cervantes", "Editorial Francisco de Robles", 1605, "Novela de aventuras", "978-84-376-0494-3", "Prestado", "Clásicos", "Las andanzas de un caballero y su fiel escudero."));
        this.libros.add(new Libro(5, "Harry Potter y la piedra filosofal", "J.K. Rowling", "Editorial Bloomsbury Publishing", 1997, "Fantasía", "978-84-9838-622-0", "Disponible", "Serie Harry Potter", "El inicio de la saga de Harry Potter."));
        this.libros.add(new Libro(6, "Matar a un ruiseñor", "Harper Lee", "Editorial J.B. Lippincott & Co.", 1960, "Ficción legal", "978-84-206-7994-9", "Disponible", "Clásicos", "La lucha contra la injusticia racial en el sur de EE. UU."));
        this.libros.add(new Libro(7, "Los juegos del hambre", "Suzanne Collins", "Editorial Scholastic", 2008, "Ciencia ficción", "978-84-9815-292-0", "Prestado", "Serie Los juegos del hambre", "Una sociedad distópica y violentos juegos televisados."));
        this.libros.add(new Libro(8, "El Señor de los Anillos: La Comunidad del Anillo", "J.R.R. Tolkien", "Editorial Allen & Unwin", 1954, "Fantasía épica", "978-84-450-7058-9", "Disponible", "Trilogía El Señor de los Anillos", "El inicio de la épica búsqueda del anillo."));
        this.libros.add(new Libro(9, "Crónica de una muerte anunciada", "Gabriel García Márquez", "Editorial La Oveja Negra", 1981, "Ficción", "978-84-8346-681-3", "Prestado", "Realismo mágico", "El asesinato anunciado de Santiago Nasar."));
        this.libros.add(new Libro(10, "Orgullo y prejuicio", "Jane Austen", "Editorial T. Egerton", 1813, "Novela romántica", "978-84-16042-73-5", "Disponible", "Clásicos", "La historia de Elizabeth Bennet y Mr. Darcy."));
    }
}
