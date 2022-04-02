
package Dominio;

/**
 *
 * @author juancarloslizarragaencinas
 */
class Proveedor {

    public String nombre;
    public String direccion;
    public String ciudad;
    public int telefono;

    public Proveedor(String nombre, String direccion, String ciudad, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "nombre" + nombre + "direccion" + direccion + "ciudad" + ciudad + "telefono" + telefono;
    }
}
