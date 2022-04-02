package Dominio;

import java.sql.Date;

/**
 *
 * @author juancarloslizarragaencinas
 */
public class Producto {

    public Date fecha;
    public String producto;
    public Double precio;
    public int clave;
    public String marca;
    public String descripcion;
    public int cantidad;
    public Proveedor proveedor;

    public Producto(Date fecha, String producto, Double precio, int clave, String marca, String descripcion, int cantidad, Proveedor proveedor) {
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
        this.clave = clave;
        this.marca = marca;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }
public Producto(){
}

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return  ", fecha"+fecha+ ", producto" + producto + ", precio" + precio + ", clave" + clave + ", marca" + marca + ", descripcion" + descripcion + ", cantidad"+ cantidad+ ", proveedor" + proveedor;
    }
}
