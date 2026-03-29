package factura.modelo;

public class PQRS {
    private int id;
    private String fecha;
    private String descripcion;
    private String correo;
    private String telefono;
    private String tipoPQRS;

    // Constructor
    public PQRS(int id, String fecha, String descripcion, String correo, String telefono, String tipoPQRS) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoPQRS = tipoPQRS;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoPQRS() {
        return tipoPQRS;
    }

    public void setTipoPQRS(String tipoPQRS) {
        this.tipoPQRS = tipoPQRS;
    }
}