
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author juancarloslizarragaencinas
 */
public class Conexion {

    public static Connection con;

    

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Drive");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bateria", "root", "1234");

        } catch (Exception e) {
            System.err.println("Error" + e);

        }
    }

    public Connection conectar() throws SQLException {
        con = null;

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Bateria", "root", "Tenison10");
            if (con != null) {

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
        return con;
    }

}
