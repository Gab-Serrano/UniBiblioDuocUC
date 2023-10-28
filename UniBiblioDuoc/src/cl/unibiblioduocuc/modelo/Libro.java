/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unibiblioduocuc.modelo;

/**
 *
 * @author Gabriel Serrano
 * @version 1.1
 */
public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private int fecha;
    private String genero;
    private String isbn;
    private String estado;
    private String coleccion;

    /* Constructores */
    public Libro() {
    }

    public Libro(int id, String titulo, String nomAutor, String editorial, int annoPublicacion, String genero, String isbn, String estado, String coleccion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = nomAutor;
        this.editorial = editorial;
        this.fecha = annoPublicacion;
        this.genero = genero;
        this.isbn = isbn;
        this.estado = estado;
        this.coleccion = coleccion;
    }

    /* Getter y Setters */
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
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
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", nomAutor=" + autor + ", editorial=" + editorial + ", annoPublicacion=" + fecha + ", genero=" + genero + ", isbn=" + isbn + ", estado=" + estado + ", coleccion=" + coleccion + '}';
    }

    
    //Métodos customizados
    
    /**
     * Método para imprimir detalles de un libro.
     * 
     * 
     * Método para imprimir detalles de un libro con un formato de salto de línea, sin requerir sout.
     */
    public void imprimirDetalles() {
        System.out.println("ID: " + id + "\n"
                + "Título: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Editorial: " + titulo + "\n"
                + "Año: " + fecha + "\n"
                + "Género: " + genero + "\n"
                + "ISBN: " + isbn + "\n"
                + "Colección: " + coleccion + "\n"
                + "Estado: " + estado + "\n"
        );
    }
}
