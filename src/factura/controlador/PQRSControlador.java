package factura.controlador;

import factura.dao.PQRSDAO;
import factura.modelo.PQRS;
import java.util.List;

public class PQRSControlador {
    private final PQRSDAO pqrsDAO = new PQRSDAO();

    public List<PQRS> listarPQRS() {
        return pqrsDAO.listarPQRS();
    }

    public void insertarPQRS(PQRS pqrs) {
        pqrsDAO.insertarPQRS(pqrs);
    }

    public void actualizarPQRS(PQRS pqrs) {
        pqrsDAO.actualizarPQRS(pqrs);
    }

    public void eliminarPQRS(int id) {
        pqrsDAO.eliminarPQRS(id);
    }

    public List<PQRS> obtenerTipoConMasRegistros() {
        return pqrsDAO.obtenerTipoConMasRegistros();
    }

    public List<PQRS> obtenerUsuarioConMayorEventos() {
        return pqrsDAO.obtenerUsuarioConMayorEventos();
    }

    public List<PQRS> obtenerUsuarioConMenorEventos() {
        return pqrsDAO.obtenerUsuarioConMenorEventos();
    }
}