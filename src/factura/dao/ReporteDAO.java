package factura.dao;

import factura.modelo.Reporte;
import java.util.ArrayList;
import java.util.List;

public class ReporteDAO {
    private List<Reporte> reportes = new ArrayList<>();

    // Crear
    public void agregarReporte(Reporte reporte) {
        reportes.add(reporte);
    }

    // Leer
    public List<Reporte> obtenerReportes() {
        return reportes;
    }

    // Actualizar
    public void actualizarReporte(Reporte reporte) {
        for (int i = 0; i < reportes.size(); i++) {
            if (reportes.get(i).getId() == reporte.getId()) {
                reportes.set(i, reporte);
                break;
            }
        }
    }

    // Eliminar
    public void eliminarReporte(int id) {
        reportes.removeIf(r -> r.getId() == id);
    }
}