/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author elisalo613
 */
public class Producto {
    private String nombre;
    private LocalDate vencimiento;
    private Integer precio;
    private Integer idProducto;
    
    // Constructor
    
    public Producto(String nombre, LocalDate vencimiento, Integer precio, Integer idProducto)
    {this.nombre = nombre;
    this.vencimiento = vencimiento;
    this.precio = precio;
    this.idProducto = idProducto;}
    
    // toString
    
    @Override
    public String toString() {
        return getClass().getName() + "[nombre=" + nombre +",vencimiento=" + vencimiento +",precio =" + precio + ",idProducto=" + idProducto + "]";
   }
   

    // getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
