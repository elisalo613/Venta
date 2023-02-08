/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.venta;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author elisalo613
 */
public class Venta {
    private LocalDateTime fecha;
    private Cliente cliente;
    private Vendedor vendedor;
    private List listaDetalles;
    private Integer idVenta;
    
    // constructor
    
    public Venta(LocalDateTime fecha, Cliente cliente, Vendedor vendedor, List listaDetalles, Integer idVenta)
    {this.fecha = fecha;
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.listaDetalles = listaDetalles;
    this.idVenta = idVenta;}
    
    // toString
    
    @Override
    public String toString() {
        return getClass().getName() + "[fecha=" + fecha +",cliente=" + cliente +",vendedor =" + vendedor + ",listaDetalles=" + listaDetalles + ",idVenta=" + idVenta + "]";
   }
   
    
    // getters and setters

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }
    
    
}