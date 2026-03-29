package factura.modelo;

public class Factura {
    private int id;
    private String cliente;
    private double total;

    // Constructor vacío
    public Factura() {}

    // Constructor con parámetros
    public Factura(int id, String cliente, double total) {
        this.id = id;
        this.cliente = cliente;
        this.total = total;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}