package cl.unibiblioduocuc.modelo;

import java.util.Date;

/**
 *
 * @author Gabriel Serrano
 */
public class Prestamo {
    
    private int id;
    private Libro libro;
    private Bibliotecario bibliotecario;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucionEsperada;
    private Date fechaDevolucionReal;
    
    //Constructores
    public Prestamo() {
    }

    public Prestamo(int id, Libro libro, Bibliotecario bibliotecario, Usuario usuario, Date fechaPrestamo, Date fechaDevolucionEsperada, Date fechaDevolucionReal) {
        this.id = id;
        this.libro = libro;
        this.bibliotecario = bibliotecario;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
        this.fechaDevolucionReal = fechaDevolucionReal;
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucionEsperada() {
        return fechaDevolucionEsperada;
    }

    public void setFechaDevolucionEsperada(Date fechaDevolucionEsperada) {
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
    }

    public Date getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(Date fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", libro=" + libro + ", bibliotecario=" + bibliotecario + ", usuario=" + usuario + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucionEsperada=" + fechaDevolucionEsperada + ", fechaDevolucionReal=" + fechaDevolucionReal + '}';
    }
    
    
}
