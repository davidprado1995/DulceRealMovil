package clases;

import java.util.List;

/**
 * Created by USER on 09/07/2016.
 */
public class Pedido {

    public int idpedido;
    public float costoTotal;
    public String cliente;
    public String fecha;
    public List<Venta> ventas;

    public Pedido(int idpedido, float costoTotal, String cliente, String fecha, List<Venta> ventas) {
        this.idpedido = idpedido;
        this.costoTotal = costoTotal;
        this.cliente = cliente;
        this.fecha = fecha;
        this.ventas = ventas;
    }

    public Pedido() {
    }

}
