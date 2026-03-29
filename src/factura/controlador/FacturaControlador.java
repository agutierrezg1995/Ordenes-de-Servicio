package factura.controlador;

import factura.dao.FacturaDAO;
import factura.modelo.Factura;
import java.util.List;

public class FacturaControlador {
    private FacturaDAO facturaDAO = new FacturaDAO();

    public void crearFactura(Factura factura) {
        facturaDAO.agregarFactura(factura);
    }

    public List<Factura> obtenerFacturas() {
        return facturaDAO.obtenerFacturas();
    }

    public void actualizarFactura(Factura factura) {
        facturaDAO.actualizarFactura(factura);
    }

    public void eliminarFactura(int id) {
        facturaDAO.eliminarFactura(id);
    }
}