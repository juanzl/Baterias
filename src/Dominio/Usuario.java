package Dominio;

/**
 *
 * @author juancarloslizarragaencinas
 */
public class Usuario {

    public tipoUsuario tipoUsuario;
    public String nombre;
    public int id;

    public Usuario(tipoUsuario tipoUsuario, String nombre, int id) {
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
        this.id = id;
    }

    public tipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(tipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ", tipoUsuario" + tipoUsuario + ", nombre" + nombre + ", id" + id;
    }
}
