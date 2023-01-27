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

//    public static void main(String[] args) {
//        Venta venta1 = new Venta();
//        venta1.Fecha = 13Junio;
//        System.out.println(venta1.Fecha);
//        System.out.println(venta1.Cliente);
//        System.out.println(venta1.Vendedor);
//        System.out.println(venta1.ListaDetalles);
//        System.out.println(venta1.IDventa);
//    }
    
    
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