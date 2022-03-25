package Dominio;

import java.util.Date;

/**
 *
 * @author juancarloslizarragaencinas
 */
public class Inventario {

    public Producto producto;
    public int cantidad;
    public Date fecha;

    public Inventario(Producto producto, int cantidad, Date fecha) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "producto" + producto + "cantidad" + cantidad + "fecha" + fecha;
    }
}
