/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author juancarloslizarragaencinas
 */
public class Entrada {
    
    public int id;
    public String producto;
    public int cantidad;
    public String fecha;
    public String proveedor;

    public Entrada(int id, String producto, int cantidad, String fecha, String proveedor) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.proveedor = proveedor;
    }
public Entrada(){
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

@Override
public String toString() {
return "producto"+producto+"cantidad"+cantidad+"fecha"+fecha+"proveedor"+proveedor;
}

    
}
