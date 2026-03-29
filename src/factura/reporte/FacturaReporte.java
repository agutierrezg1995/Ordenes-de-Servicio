/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura.reporte;

import factura.dao.ConexionBD;
import factura.vista.Factura;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class FacturaReporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            System.out.println("Conexión establecida al iniciar el proyecto.");
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error de conexión al iniciar: " + e.getMessage());
        }

        // Crear una instancia de la vista Factura
        Factura facturaVista = new Factura();
        
        // Mostrar la vista (esto depende de cómo esté implementada la clase Factura)
        facturaVista.setVisible(true);
    }
    
}
