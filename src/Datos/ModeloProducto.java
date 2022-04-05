
package Datos;

import Dominio.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juancarloslizarragaencinas
 */
public class ModeloProducto {

    
    public ArrayList<Producto> getProducto(){

Connection con = Conexion.con;
Statement stmt;
ResultSet rs;

ArrayList<Producto> listaProductos = new ArrayList<>();

try {

stmt = con.createStatement();
rs = stmt.executeQuery("SELECT * FROM Producto");


while (rs.next()){
Producto producto = new Producto();
producto.setProducto(rs.getString("producto"));

listaProductos.add(producto);
}

} catch (SQLException ex){
Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
}
        return null;
        
}}






