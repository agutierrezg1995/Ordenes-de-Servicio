package factura.modelo;

public class Reporte {
    private int id;
    private String descripcion;
    private String fecha;

    // Constructor vacío
    public Reporte() {}

    // Constructor con parámetros
    public Reporte(int id, String descripcion, String fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}