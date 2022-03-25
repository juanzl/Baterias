package Dominio;

/**
 *
 * @author juancarloslizarragaencinas
 */
public class Producto {

    public String nombre;
    public Double precio;
    public int clave;
    public String marca;
    public String descripcion;
    public Proveedor proveedor;

    public Producto(String nombre, Double precio, int clave, String marca, String descripcion, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.clave = clave;
        this.marca = marca;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return ", nombre" + nombre + ", precio" + precio + ", clave" + clave + ", marca" + marca + ", descripcion" + descripcion + ", proveedor" + proveedor;
    }
}
