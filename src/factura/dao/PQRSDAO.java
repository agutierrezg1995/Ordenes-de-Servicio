package factura.dao;

import factura.modelo.PQRS;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PQRSDAO {

    public List<PQRS> listarPQRS() {
        List<PQRS> lista = new ArrayList<>();
        // Simulación de datos
        lista.add(new PQRS(1, "2025-10-01", "Producto dañado", "usuario1@example.com", "123456789", "Queja"));
        lista.add(new PQRS(2, "2025-10-02", "Entrega tardía", "usuario2@example.com", "987654321", "Reclamo"));
        return lista;
    }

    public void insertarPQRS(PQRS pqrs) {
        // Simulación de inserción
        System.out.println("Insertando PQRS: " + pqrs.getDescripcion());
    }

    public void actualizarPQRS(PQRS pqrs) {
        // Simulación de actualización
        System.out.println("Actualizando PQRS con ID: " + pqrs.getId());
    }

    public void eliminarPQRS(int id) {
        // Simulación de eliminación
        System.out.println("Eliminando PQRS con ID: " + id);
    }

    public List<PQRS> obtenerTipoConMasRegistros() {
        List<PQRS> lista = new ArrayList<>();
        // Simulación de consulta
        lista.add(new PQRS(0, null, null, null, null, "Queja"));
        return lista;
    }

    public List<PQRS> obtenerUsuarioConMayorEventos() {
        List<PQRS> lista = new ArrayList<>();
        // Simulación de consulta
        lista.add(new PQRS(0, null, null, "usuario1@example.com", null, null));
        return lista;
    }

    public List<PQRS> obtenerUsuarioConMenorEventos() {
        List<PQRS> lista = new ArrayList<>();
        // Simulación de consulta
        lista.add(new PQRS(0, null, null, "usuario2@example.com", null, null));
        return lista;
    }
}