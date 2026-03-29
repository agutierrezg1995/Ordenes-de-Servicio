package factura.dao;

import factura.modelo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacturaDAO {

    // Crear
    public void agregarFactura(Factura factura) {
        String sql = "INSERT INTO facturas (id, cliente, total) VALUES (?, ?, ?)";
        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, factura.getId());
            ps.setString(2, factura.getCliente());
            ps.setDouble(3, factura.getTotal());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Leer
    public List<Factura> obtenerFacturas() {
        List<Factura> facturas = new ArrayList<>();
        String sql = "SELECT * FROM facturas";
        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Factura factura = new Factura();
                factura.setId(rs.getInt("id"));
                factura.setCliente(rs.getString("cliente"));
                factura.setTotal(rs.getDouble("total"));
                facturas.add(factura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facturas;
    }

    // Actualizar
    public void actualizarFactura(Factura factura) {
        String sql = "UPDATE facturas SET cliente = ?, total = ? WHERE id = ?";
        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, factura.getCliente());
            ps.setDouble(2, factura.getTotal());
            ps.setInt(3, factura.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar
    public void eliminarFactura(int id) {
        String sql = "DELETE FROM facturas WHERE id = ?";
        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}