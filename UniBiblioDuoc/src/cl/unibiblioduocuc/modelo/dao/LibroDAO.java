package cl.unibiblioduocuc.modelo.dao;

import cl.unibiblioduocuc.modelo.Libro;
import cl.unibiblioduocuc.modelo.bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    
    private Connection conexion;

    public LibroDAO() {
        // En el constructor tratamos de obtener la conexión con la base de datos
        try {
            this.conexion = Conexion.obtenerConexion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para insertar un libro
    public boolean insertarLibro(Libro libro) {
        String sql = "INSERT INTO libros (titulo, nomAutor, editorial, annoPublicacion, genero, isbn, estado, coleccion) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, libro.getTitulo());
            pstmt.setString(2, libro.getNomAutor());
            pstmt.setString(3, libro.getEditorial());
            pstmt.setInt(4, libro.getAnnoPublicacion());
            pstmt.setString(5, libro.getGenero());
            pstmt.setString(6, libro.getIsbn());
            pstmt.setString(7, libro.getEstado());
            pstmt.setString(8, libro.getColeccion());
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para actualizar un libro
    public boolean actualizarLibro(Libro libro) {
        String sql = "UPDATE libros SET titulo = ?, nomAutor = ?, editorial = ?, annoPublicacion = ?, genero = ?, isbn = ?, estado = ?, coleccion = ? WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, libro.getTitulo());
            pstmt.setString(2, libro.getNomAutor());
            pstmt.setString(3, libro.getEditorial());
            pstmt.setInt(4, libro.getAnnoPublicacion());
            pstmt.setString(5, libro.getGenero());
            pstmt.setString(6, libro.getIsbn());
            pstmt.setString(7, libro.getEstado());
            pstmt.setString(8, libro.getColeccion());
            pstmt.setInt(9, libro.getId());
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para eliminar un libro
    public boolean eliminarLibro(int id) {
        String sql = "DELETE FROM libros WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para obtener un libro por su ID
    public Libro obtenerLibroPorId(int id) {
        String sql = "SELECT * FROM libros WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Libro(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("nomAutor"),
                    rs.getString("editorial"),
                    rs.getInt("annoPublicacion"),
                    rs.getString("genero"),
                    rs.getString("isbn"),
                    rs.getString("estado"),
                    rs.getString("coleccion")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para obtener todos los libros
    public List<Libro> obtenerTodosLosLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                libros.add(new Libro(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("nomAutor"),
                    rs.getString("editorial"),
                    rs.getInt("annoPublicacion"),
                    rs.getString("genero"),
                    rs.getString("isbn"),
                    rs.getString("estado"),
                    rs.getString("coleccion")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
    
    // Asegurarse de cerrar la conexión cuando ya no se necesite
    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}