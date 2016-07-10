package clases;

/**
 * Created by USER on 09/07/2016.
 */
public class Venta {

    public int cantidad;
    public float costo;
    public Producto prod;
    public int idventa;

    public Venta(int cantidad, float costo, Producto prod, int idventa) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.prod = prod;
        this.idventa = idventa;
    }

    public Venta() {
    }
}
