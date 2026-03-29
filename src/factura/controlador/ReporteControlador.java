package factura.controlador;

import factura.dao.ReporteDAO;
import factura.modelo.Reporte;
import java.util.List;

public class ReporteControlador {
    private ReporteDAO reporteDAO = new ReporteDAO();

    public void crearReporte(Reporte reporte) {
        reporteDAO.agregarReporte(reporte);
    }

    public List<Reporte> obtenerReportes() {
        return reporteDAO.obtenerReportes();
    }

    public void actualizarReporte(Reporte reporte) {
        reporteDAO.actualizarReporte(reporte);
    }

    public void eliminarReporte(int id) {
        reporteDAO.eliminarReporte(id);
    }
}