package cl.unibiblioduocuc.modelo;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gabriel Serrano
 * @version 1.1
 */

public class DataBase {
    
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<String> colecciones;
    
    public DataBase() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.colecciones = new ArrayList<>();
        
        /*Al momento de inicializar la clase. Llena la "base de datos" */
        agregarDatosMockUp();
    }
    
    /* Getter y Setters */

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<String> getColecciones() {
        return colecciones;
    }

    public void setColecciones(ArrayList<String> colecciones) {
        this.colecciones = colecciones;
    }
    
    /* Métodos customizados */
    
    /* Métodos de usuarios */
    
     /**
     * Método que llena la BD simulada con datos.
     *
     * Método que permite llenar la BD simulada por arreglos con información
     * dummy. Este método se inicializa en el constructor de modo que la BD
     * simulada tenga datos desde el inicio de la ejecución del programa
     */
    private void agregarDatosMockUp() {

        //Datos de libros
        this.libros.add(new Libro(1, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 1967, "Realismo mágico", "978-84-663-0344-6", "Disponible", "Clásicos"));
        this.libros.add(new Libro(2, "1984", "George Orwell", "Editorial Secker & Warburg", 1949, "Ciencia ficción", "978-0-452-28423-4", "Prestado", "Ficción distópica"));
        this.libros.add(new Libro(3, "El Gran Gatsby", "F. Scott Fitzgerald", "Editorial Charles Scribner's Sons", 1925, "Ficción", "978-0-7432-7356-5", "Disponible", "Clásicos"));
        this.libros.add(new Libro(4, "Don Quijote de la Mancha", "Miguel de Cervantes", "Editorial Francisco de Robles", 1605, "Novela de aventuras", "978-84-376-0494-3", "Prestado", "Clásicos"));
        this.libros.add(new Libro(5, "Harry Potter y la piedra filosofal", "J.K. Rowling", "Editorial Bloomsbury Publishing", 1997, "Fantasía", "978-84-9838-622-0", "Disponible", "Serie Harry Potter"));
        this.libros.add(new Libro(6, "Matar a un ruiseñor", "Harper Lee", "Editorial J.B. Lippincott & Co.", 1960, "Ficción legal", "978-84-206-7994-9", "Disponible", "Clásicos"));
        this.libros.add(new Libro(7, "Los juegos del hambre", "Suzanne Collins", "Editorial Scholastic", 2008, "Ciencia ficción", "978-84-9815-292-0", "Prestado", "Serie Los juegos del hambre"));
        this.libros.add(new Libro(8, "El Señor de los Anillos: La Comunidad del Anillo", "J.R.R. Tolkien", "Editorial Allen & Unwin", 1954, "Fantasía épica", "978-84-450-7058-9", "Disponible", "Trilogía El Señor de los Anillos"));
        this.libros.add(new Libro(9, "Crónica de una muerte anunciada", "Gabriel García Márquez", "Editorial La Oveja Negra", 1981, "Ficción", "978-84-8346-681-3", "Prestado", "Realismo mágico"));
        this.libros.add(new Libro(10, "Orgullo y prejuicio", "Jane Austen", "Editorial T. Egerton", 1813, "Novela romántica", "978-84-16042-73-5", "Disponible", "Clásicos"));
        this.libros.add(new Libro(11, "Lolita", "Vladimir Nabokov", "Editorial Olympia Press", 1955, "Ficción", "978-84-937396-0-2", "Disponible", "Clásicos modernos"));
        this.libros.add(new Libro(12, "Un mundo feliz", "Aldous Huxley", "Editorial Chatto & Windus", 1932, "Ciencia ficción", "978-84-9759-205-2", "Prestado", "Ficción distópica"));
        this.libros.add(new Libro(13, "Crimen y castigo", "Fiódor Dostoyevski", "Editorial The Russian Messenger", 1866, "Ficción", "978-84-322-1691-9", "Disponible", "Clásicos"));
        this.libros.add(new Libro(14, "Ulises", "James Joyce", "Editorial Sylvia Beach", 1922, "Modernismo", "978-84-206-5204-5", "Disponible", "Clásicos modernos"));
        this.libros.add(new Libro(15, "En busca del tiempo perdido", "Marcel Proust", "Editorial Grasset", 1913, "Ficción", "978-84-339-7253-7", "Prestado", "Novela modernista"));
        this.libros.add(new Libro(16, "El amor en los tiempos del cólera", "Gabriel García Márquez", "Editorial Oveja Negra", 1985, "Realismo mágico", "978-84-670-4686-8", "Disponible", "Novela romántica"));
        this.libros.add(new Libro(17, "El cuento de la criada", "Margaret Atwood", "Editorial McClelland and Stewart", 1985, "Ciencia ficción", "978-84-9065-702-3", "Disponible", "Ficción distópica"));
        this.libros.add(new Libro(18, "Dune", "Frank Herbert", "Editorial Chilton Books", 1965, "Ciencia ficción", "978-84-450-7037-4", "Prestado", "Serie Dune"));
        this.libros.add(new Libro(19, "Drácula", "Bram Stoker", "Editorial Archibald Constable and Company", 1897, "Horror gótico", "978-84-670-5422-4", "Disponible", "Clásicos"));
        this.libros.add(new Libro(20, "Ana Karenina", "León Tolstói", "Editorial The Russian Messenger", 1877, "Ficción", "978-84-206-8087-4", "Prestado", "Clásicos"));

        //Datos de Usuarios
        this.usuarios.add(new Usuario(1, "11.111.111-1", "Admin", "Admin", "admin", "admin123"));
        this.usuarios.add(new Usuario(1, "19.345.678-9", "Juan", "Pérez", "juan.perez@biblioteca.com", "admin123"));
        this.usuarios.add(new Usuario(2, "15.234.567-8", "María", "Rodríguez", "maria.rodriguez@biblioteca.com", "admin123"));
        this.usuarios.add(new Usuario(3, "12.123.456-7", "Carlos", "Soto", "carlos.soto@biblioteca.com", "admin123"));
        this.usuarios.add(new Usuario(4, "17.456.789-0", "Ana", "González", "ana.gonzalez@biblioteca.com", "admin123"));
        this.usuarios.add(new Usuario(5, "20.567.890-k", "Pedro", "Morales", "pedro.morales@biblioteca.com", "admin123"));

        //Colecciones
        this.colecciones.add("Reserva");
        this.colecciones.add("General");
        this.colecciones.add("Ingeniería");
        this.colecciones.add("Clásicos");
        this.colecciones.add("Literatura Juvenil");
    }
    
}
