/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import java.util.List;

/**
 *
 * @author elisalo613
 */
public class Cliente {
    private String nombre;
    private String domicilio;
    private long telefono;
    private List listaVentas;
    private Integer idCliente;
    
    // constructor
    
    public Cliente(String nombre, String domicilio, long telefono, List listaVentas, Integer idCliente)
    {this.nombre = nombre;
    this.domicilio = domicilio;
    this.telefono = telefono;
    this.listaVentas = listaVentas;
    this.idCliente = idCliente;}
    
    // toString
    
    @Override
    public String toString() {
        return getClass().getName() + "[nombre=" + nombre +",domicilio=" + domicilio +",telefono =" + telefono + ",listaVentas=" + listaVentas + ",idCliente=" + idCliente + "]";
   }
    
    // getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public List getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List listaVentas) {
        this.listaVentas = listaVentas;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
