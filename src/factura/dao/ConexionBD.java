package factura.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/db-factura"; // Nueva base de datos
    private static final String USUARIO = "root"; // Cambiar si tu usuario es diferente
    private static final String CONTRASENA = ""; // Cambiar si tienes contraseña

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}