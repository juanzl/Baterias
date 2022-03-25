/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author juancarloslizarragaencinas
 */
public class Conexion {

    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Drive");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bateria", "root", "1234");

        } catch (Exception e) {
            System.err.println("Error" + e);

        }

    }

    public static void main(String[] args) {
        Conexion cn = new Conexion();
        Statement st;
        ResultSet rs;
        try {
      st=cn.con.createStatement();
      rs=st.executeQuery("select * from usuario");
      while (rs.next()){
System.out.println(rs.getInt("id")+" " + rs.getString("user")+" "+rs.getString("dni"));
}
cn.con.close();

        } catch (Exception e){
}
    }
}
