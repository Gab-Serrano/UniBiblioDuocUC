/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unibiblioduocuc.modelo.dao;

import cl.unibiblioduocuc.modelo.Bibliotecario;
import cl.unibiblioduocuc.modelo.bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BibliotecarioDAO {
    
    private Connection conexion;

    public BibliotecarioDAO() {
        // En el constructor tratamos de obtener la conexión con la base de datos
        try {
            this.conexion = Conexion.obtenerConexion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para insertar un bibliotecario
    public boolean insertarBibliotecario(Bibliotecario bibliotecario) {
        String sql = "INSERT INTO bibliotecarios (rut, nombre, apellido, email, contraseña) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, bibliotecario.getRut());
            pstmt.setString(2, bibliotecario.getNombre());
            pstmt.setString(3, bibliotecario.getApellido());
            pstmt.setString(4, bibliotecario.getEmail());
            pstmt.setString(5, bibliotecario.getContraseña());
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para actualizar un bibliotecario
    public boolean actualizarBibliotecario(Bibliotecario bibliotecario) {
        String sql = "UPDATE bibliotecarios SET rut = ?, nombre = ?, apellido = ?, email = ?, contraseña = ? WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, bibliotecario.getRut());
            pstmt.setString(2, bibliotecario.getNombre());
            pstmt.setString(3, bibliotecario.getApellido());
            pstmt.setString(4, bibliotecario.getEmail());
            pstmt.setString(5, bibliotecario.getContraseña());
            pstmt.setInt(6, bibliotecario.getId());
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para eliminar un bibliotecario
    public boolean eliminarBibliotecario(int id) {
        String sql = "DELETE FROM bibliotecarios WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para obtener un bibliotecario por su ID
    public Bibliotecario obtenerBibliotecarioPorId(int id) {
        String sql = "SELECT * FROM bibliotecarios WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Bibliotecario(
                    rs.getInt("id"),
                    rs.getString("rut"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("email"),
                    rs.getString("contraseña")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // Método para validar el inicio de sesión del bibliotecario
    public Bibliotecario validarIngreso(String rut, String contraseña) {
        String sql = "SELECT * FROM bibliotecarios WHERE rut = ? AND contraseña = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, rut);
            pstmt.setString(2, contraseña);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Bibliotecario(
                    rs.getInt("id"),
                    rs.getString("rut"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("email"),
                    rs.getString("contraseña")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
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