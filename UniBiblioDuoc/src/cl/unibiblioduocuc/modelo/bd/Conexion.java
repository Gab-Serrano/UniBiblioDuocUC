package cl.unibiblioduocuc.modelo.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    private static final String WALLET_PATH = "D:\\Usuarios\\Gabriel Serrano\\OneDrive\\Escritorio\\Wallet_testdb";
    private static final String WALLET_PASSWORD = "Iwtltpuyam123#";
    private static final String JDBC_URL = "jdbc:oracle:thin:@testdb_high";

    // Método para obtener la conexión
    public static Connection obtenerConexion() {
        Connection conexion = null;

        try {
            // Configuración del wallet
            String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
            String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

            System.setProperty("oracle.net.tns_admin", WALLET_PATH);
            System.setProperty("javax.net.ssl.trustStore", trustStorePath);
            System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
            System.setProperty("javax.net.ssl.keyStore", keyStorePath);
            System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

            Properties properties = new Properties();
            properties.put("user", "admin");
            properties.put("password", WALLET_PASSWORD);

            // Intento de conexión
            conexion = DriverManager.getConnection(JDBC_URL, properties);
        } catch (SQLException e) {
            // Manejo de excepciones para depurar la causa de la falla
            // En un entorno de producción, sería mejor usar logging en lugar de printStackTrace
            System.out.println(e);
        }

        return conexion;
    }

    // Método para cerrar la conexión
    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                // Manejo de la excepción al intentar cerrar la conexión
                // De igual forma, preferir usar logging
                System.out.println(e);
                
            }
        }
    }
}