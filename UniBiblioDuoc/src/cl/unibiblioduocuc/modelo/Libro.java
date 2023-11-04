package cl.unibiblioduocuc.modelo;

/**
 *
 * @author Gabriel Serrano
 */
public class Libro {
    private int id;
    private String titulo;
    private String nomAutor;
    private String editorial;
    private int annoPublicacion;
    private String genero;
    private String isbn;
    private String estado;
    private String coleccion;

    //Constructores
    public Libro() {
    }

    public Libro(int id, String titulo, String nomAutor, String editorial, int annoPublicacion, String genero, String isbn, String estado, String coleccion) {
        this.id = id;
        this.titulo = titulo;
        this.nomAutor = nomAutor;
        this.editorial = editorial;
        this.annoPublicacion = annoPublicacion;
        this.genero = genero;
        this.isbn = isbn;
        this.estado = estado;
        this.coleccion = coleccion;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", nomAutor=" + nomAutor + ", editorial=" + editorial + ", annoPublicacion=" + annoPublicacion + ", genero=" + genero + ", isbn=" + isbn + ", estado=" + estado + ", coleccion=" + coleccion + '}';
    }
    
    //Métodos customizados
    public void imprimirDetalles(){
        System.out.println(
                "ID: " + id + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + nomAutor + "\n" +
                "Editorial: " + titulo + "\n" +
                "Año: " + annoPublicacion + "\n" +
                "Género: " + genero + "\n" +
                "ISBN: " + isbn + "\n" +
                "Colección: " + coleccion + "\n" +
                "Estado: " + estado + "\n"
        );
    }
    
}
