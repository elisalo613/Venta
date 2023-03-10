/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

/**
 *
 * @author elisalo613
 */
public class Detalle {
    private Integer precio;
    private Producto producto;
    private Integer cantidad;
    private Integer idDetalle;
    
    // Constructor
    
    public Detalle(Integer precio, Producto producto, Integer cantidad, Integer idDetalle)
    {this.precio = precio;
    this.producto = producto;
    this.cantidad = cantidad;
    this.idDetalle = idDetalle;
    }
    
    // toString
    
    @Override
    public String toString() {
        return getClass().getName() + "[precio=" + precio +",producto=" + producto +",cantidad =" + cantidad + ",idDetalle=" + idDetalle + "]";
   }
   
    // getters and setters

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }
    
    
}
