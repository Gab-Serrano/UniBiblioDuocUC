package cl.unibiblioduocuc.modelo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gabriel Serrano
 */
public class TestBD {

    private ArrayList<Libro> libros;
    private ArrayList<Bibliotecario> bibliotecarios;
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Usuario> usuarios;
    private ArrayList<String> colecciones;

    //Constructor con inicializador de listas
    public TestBD() {
        this.libros = new ArrayList<>();
        this.bibliotecarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.colecciones = new ArrayList<>();

        agregarDatosMockUp();
    }

    //Métodos customizados
    /**
     * Método que devuelve un ArrayList con libros.
     *
     * Método devuelve un ArrayList con los libros presentes en la colección, en
     * el atributo ´libros´.
     *
     * @return ArrayList con los libros presentes en la colección.
     */
    public ArrayList<Libro> getLibros() {
        return this.libros;
    }

    public ArrayList<String> obtenerColecciones() {
        return this.colecciones;
    }

    /**
     * Busca libros en la colección por su título.
     * <p>
     * Este método devuelve una lista de libros cuyo título contiene la cadena
     * de búsqueda proporcionada. La búsqueda es insensible a mayúsculas y
     * minúsculas.
     * </p>
     *
     * @param titulo La cadena de búsqueda para encontrar libros por título.
     * @return Una lista de libros que coinciden con el criterio de búsqueda.
     */
    public ArrayList<Libro> obtenerLibroPorTitulo(String titulo) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    /**
     * Busca libros en la colección por el nombre del autor.
     * <p>
     * Este método devuelve una lista de libros cuyo nombre de autor contiene la
     * cadena de búsqueda proporcionada. La búsqueda es insensible a mayúsculas
     * y minúsculas.
     * </p>
     *
     * @param autor La cadena de búsqueda para encontrar libros por nombre de
     * autor.
     * @return Una lista de libros que coinciden con el criterio de búsqueda.
     */
    public ArrayList<Libro> obtenerLibroPorAutor(String autor) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.getNomAutor().toLowerCase().contains(autor.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    /**
     * Busca un libro en la colección por su ISBN.
     * <p>
     * Este método devuelve una lista de libros cuyo ISBN coincide exactamente
     * con la cadena de búsqueda proporcionada.
     * </p>
     *
     * @param isbn La cadena de búsqueda para encontrar libros por ISBN.
     * @return Una lista de libros que coinciden con el criterio de búsqueda.
     */
    public ArrayList<Libro> obtenerLibroPorISBN(String isbn) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public Libro obtenerLibroPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public void actualizarLibro(Libro libroActualizado) {
        // Reemplaza el libro antiguo con el nuevo libro editado
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libroActualizado.getId()) {
                libros.set(i, libroActualizado);
                break;
            }
        }
    }
    
    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
    }

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

        //Datos de Bibliotecarios
        this.bibliotecarios.add(new Bibliotecario(1, "11.111.111-1", "Admin", "Admin", "admin", "admin123"));
        this.bibliotecarios.add(new Bibliotecario(1, "19.345.678-9", "Juan", "Pérez", "juan.perez@biblioteca.com", "admin123"));
        this.bibliotecarios.add(new Bibliotecario(2, "15.234.567-8", "María", "Rodríguez", "maria.rodriguez@biblioteca.com", "admin123"));
        this.bibliotecarios.add(new Bibliotecario(3, "12.123.456-7", "Carlos", "Soto", "carlos.soto@biblioteca.com", "admin123"));
        this.bibliotecarios.add(new Bibliotecario(4, "17.456.789-0", "Ana", "González", "ana.gonzalez@biblioteca.com", "admin123"));
        this.bibliotecarios.add(new Bibliotecario(5, "20.567.890-k", "Pedro", "Morales", "pedro.morales@biblioteca.com", "admin123"));

        //Colecciones
        this.colecciones.add("Reserva");
        this.colecciones.add("General");
        this.colecciones.add("Ingeniería");
        this.colecciones.add("Clásicos");
        this.colecciones.add("Literatura Juvenil");

    }

    public boolean validarCredenciales(String email, String password) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getEmail().equalsIgnoreCase(email) && bibliotecario.getContraseña().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public Bibliotecario obtenerBibliotecario(String email) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getEmail().equalsIgnoreCase(email)) {
                return bibliotecario;
            }
        }
        return null;
    }

    public int getMaxId() {
        ArrayList<Integer> ids = new ArrayList<>();
        for (Libro libro : this.libros) {
            ids.add(libro.getId());
        }
        int maxId = Collections.max(ids);
        return maxId;
    }
}
