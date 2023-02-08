/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author elisalo613
 */

public class Main {
    public static void main(String[] args){
        
        // VENTA 1
        
        //Venta v1 = new Venta();
        
        // Fecha
        
        //v1.setFecha(LocalDateTime.now());
        //System.out.println("Fecha de la venta 1 : " + v1.getFecha());
        
        // Cliente 1 y sus atributos
        
        //Cliente cliente1 = new Cliente();
        //v1.setCliente(cliente1);
        //cliente1.setNombre("Elisa");
        //cliente1.setTelefono(2213557988L);
        //cliente1.setDomicilio("calle 452 n1628");
        //cliente1.setIdCliente(1);
        //ArrayList<Venta> lv1 = new ArrayList<>();
        //cliente1.setListaVentas(lv1);
        
        ArrayList<Venta> lv1 = new ArrayList<>();
        var cliente1 = new Cliente("Elisa","calle 452 n1628",2213557988L, lv1, 1);
        
        // Vendedor 1 y sus atributos
        
        //Vendedor vendedor1 = new Vendedor();
        //v1.setVendedor(vendedor1);
        //vendedor1.setNombre("Pablo");
        //vendedor1.setTelefono(113557921L);
        //vendedor1.setMail("pablo.marquez@gmaail.com");
        //vendedor1.setIdVendedor(1);
        //vendedor1.setListaVentas(lv1);
        
        var vendedor1 = new Vendedor("Pablo", 113557921L, "pablo.marquez@gmaail.com", lv1, 1);
        
        // Productos
        
        //Producto manzana = new Producto();
        //manzana.setNombre("manzana");
        //manzana.setPrecio(150);
        //LocalDate vencimientoManzana = LocalDate.of(2023, 4, 13);
        //manzana.setVencimiento(vencimientoManzana);
        //manzana.setIdProducto(1);
        
        var manzana = new Producto("manzana", LocalDate.of(2023, 4, 13), 150, 1);
        
        //Producto naranja = new Producto();
        //naranja.setNombre("naranja");
        //naranja.setPrecio(100);
        //LocalDate vencimientoNaranja = LocalDate.of(2023, 4, 15);
        //naranja.setVencimiento(vencimientoNaranja);
        //naranja.setIdProducto(2);
        
        var naranja = new Producto("naranja",LocalDate.of(2023, 4, 15),100,2);
        
        // Lista de detalles
        
        //Detalle d1 = new Detalle();
        //d1.setCantidad(3);
        //d1.setIdDetalle(1);
        //d1.setPrecio(450);
        //d1.setProducto(manzana);
        
        var d1 = new Detalle(450,manzana,3,1);
        
        //Detalle d2 = new Detalle();
        //d1.setCantidad(6);
        //d1.setIdDetalle(2);
        //d1.setPrecio(600);
        //d1.setProducto(naranja);
        
        var d2 = new Detalle(600,naranja,6,2);
        
        ArrayList<Detalle> ld1 = new ArrayList<>();
        //v1.setListaDetalles(ld1);
        ld1.add(0,d1);
        ld1.add(1,d2);
        
        var v1 = new Venta(LocalDateTime.now(),cliente1,vendedor1,ld1,1);
        
        System.out.println("cliente1.toString():" + cliente1);
        System.out.println("vendedor1.toString():" + vendedor1);
        System.out.println("manzana.toString():" + manzana);
        System.out.println("naranja.toString():" + naranja);
        System.out.println("d1.toString():" + d1);
        System.out.println("d2.toString():" + d2);
        System.out.println("v1.toString():" + v1);
        
        // ID Venta
        
        //v1.setIdVenta(1);
        
        // VENTA 2
        
        //Venta v2 = new Venta();
        
        // Fecha
        
        //v2.setFecha(LocalDateTime.now());
        //System.out.println("Fecha de la venta 2 : " + v2.getFecha());
        
        // Cliente 2 y sus atributos
        
        //Cliente cliente2 = new Cliente();
        //v1.setCliente(cliente2);
        //cliente1.setNombre("Julio");
        //cliente1.setTelefono(1161672318L);
        //cliente1.setDomicilio("calle 51 n1312");
        //cliente1.setIdCliente(2);
        //ArrayList<Venta> lv2 = new ArrayList<>();
        //cliente1.setListaVentas(lv2);
        
        ArrayList<Venta> lv2 = new ArrayList<>();
        var cliente2 = new Cliente("Julio","calle 51 n1312",1161672318L, lv2, 2);
        
        // Vendedor 1 
        
        //v2.setVendedor(vendedor1);
        
        // Productos
        
        //Producto banana = new Producto();
        //banana.setNombre("banana");
        //banana.setPrecio(200);
        //LocalDate vencimientoBanana = LocalDate.of(2023, 2,1 );
        //naranja.setVencimiento(vencimientoNaranja);
        //banana.setIdProducto(3);
        
        var banana = new Producto("banana", LocalDate.of(2023, 2, 1), 200, 3);
        
        // Lista de detalles
        
        //Detalle d3 = new Detalle();
        //d3.setCantidad(4);
        //d3.setIdDetalle(3);
        //d3.setPrecio(600);
        //d3.setProducto(manzana);
        
        var d3 = new Detalle(600,manzana,4,3);
        
        //Detalle d4 = new Detalle();
        //d4.setCantidad(2);
        //d4.setIdDetalle(4);
        //d4.setPrecio(200);
        //d4.setProducto(naranja);
        
        var d4 = new Detalle(200,naranja,2,4);
        
        //Detalle d5 = new Detalle();
        //d5.setCantidad(4);
        //d5.setIdDetalle(5);
        //d5.setPrecio(800);
        //d5.setProducto(banana);
        
        var d5 = new Detalle(800,banana,4,5);
        
        ArrayList<Detalle> ld2 = new ArrayList<>();
        //v2.setListaDetalles(ld2);
        ld2.add(0,d3);
        ld2.add(1,d4);
        ld2.add(2,d5);
         
         var v2 = new Venta(LocalDateTime.now(),cliente2,vendedor1,ld2,2);
         
        System.out.println("cliente1.toString():" + cliente2);
        System.out.println("vendedor1.toString():" + vendedor1);
        System.out.println("manzana.toString():" + manzana);
        System.out.println("naranja.toString():" + naranja);
        System.out.println("naranja.toString():" + banana);
        System.out.println("d1.toString():" + d3);
        System.out.println("d2.toString():" + d4);
        System.out.println("d2.toString():" + d5);
        System.out.println("v1.toString():" + v2);
        
        // ID Venta
        
        //v2.setIdVenta(2);
        
        // VENTA 3
        
        //Venta v3 = new Venta();
        
        // Fecha
        
        //v3.setFecha(LocalDateTime.now());
        //System.out.println("Fecha de la venta 3 : " + v3.getFecha());
        
        // Cliente 2 
        
        //v3.setCliente(cliente2);
        ArrayList<Venta> lv3 = new ArrayList<>();
        cliente2.setListaVentas(lv3);
        
        
        // Vendedor 1 y sus atributos
        
        //v3.setVendedor(vendedor1);
        vendedor1.setListaVentas(lv3);
        
        // Lista de detalles
        
        //Detalle d6 = new Detalle();
        //d6.setCantidad(2);
        //d6.setIdDetalle(6);
        //d6.setPrecio(300);
        //d6.setProducto(manzana);
        
        var d6 = new Detalle(300,manzana,2,6);
        
        //Detalle d7 = new Detalle();
        //d6.setCantidad(3);
        //d6.setIdDetalle(7);
        //d6.setPrecio(600);
        //d6.setProducto(banana);
        
        var d7 = new Detalle(600,banana,3,7);
        
        ArrayList<Detalle> ld3 = new ArrayList<>();
        //v1.setListaDetalles(ld3);
        ld3.add(0,d6);
        ld3.add(1,d7);
        
        // ID Venta
        
        //v3.setIdVenta(3);
        
        var v3 = new Venta(LocalDateTime.now(),cliente2,vendedor1,ld3,3);
        
        System.out.println("cliente1.toString():" + cliente2);
        System.out.println("vendedor1.toString():" + vendedor1);
        System.out.println("manzana.toString():" + manzana);
        System.out.println("naranja.toString():" + banana);
        System.out.println("d1.toString():" + d6);
        System.out.println("d2.toString():" + d7);
        System.out.println("v1.toString():" + v3);
     
        
        
        
        
        
        
        
        
        
        
        
    
        
        
    
}}