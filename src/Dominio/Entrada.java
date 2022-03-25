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

    public Producto producto;
    public int cantidad;
    public Date fecha;
    public Usuario responsable;

    public Entrada(Producto producto, int cantidad, Date fecha, Usuario responsable) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.responsable = responsable;
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

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

@Override
public String toString() {
return "producto"+producto+"cantidad"+cantidad+"fecha"+fecha+"responsable"+responsable;
}
}
