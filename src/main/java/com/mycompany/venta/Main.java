/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

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
        
        Venta v1 = new Venta();
        
        // Fecha
        
        v1.setFecha(LocalDateTime.now());
        System.out.println("Fecha de la venta 1 : " + v1.getFecha());
        
        // Cliente 1 y sus atributos
        
        Cliente cliente1 = new Cliente();
        v1.setCliente(cliente1);
        cliente1.setNombre("Elisa");
        cliente1.setTelefono(2213557988L);
        cliente1.setDomicilio("calle 452 n1628");
        cliente1.setIdCliente(1);
        ArrayList<Venta> lv1 = new ArrayList<>();
        cliente1.setListaVentas(lv1);
        
        // Vendedor 1 y sus atributos
        
        Vendedor vendedor1 = new Vendedor();
        v1.setVendedor(vendedor1);
        vendedor1.setNombre("Pablo");
        vendedor1.setTelefono(113557921L);
        vendedor1.setMail("pablo.marquez@gmaail.com");
        vendedor1.setIdVendedor(1);
        vendedor1.setListaVentas(lv1);
        
        // Productos
        
        Producto manzana = new Producto();
        manzana.setNombre("manzana");
        manzana.setPrecio(150);
        manzana.setVencimiento(LocalDateTime.now());
        manzana.setIdProducto(1);
        
        Producto naranja = new Producto();
        naranja.setNombre("naranja");
        naranja.setPrecio(100);
        naranja.setVencimiento(LocalDateTime.now());
        naranja.setIdProducto(2);
        
        // Lista de detalles
        
        Detalle d1 = new Detalle();
        d1.setCantidad(3);
        d1.setIdDetalle(1);
        d1.setPrecio(450);
        d1.setProducto(manzana);
        
        Detalle d2 = new Detalle();
        d1.setCantidad(6);
        d1.setIdDetalle(2);
        d1.setPrecio(600);
        d1.setProducto(naranja);
        
        ArrayList<Detalle> ld1 = new ArrayList<>();
        v1.setListaDetalles(ld1);
        ld1.add(0,d1);
        ld1.add(1,d2);
        
         System.out.println("Primer producto = " + manzana.getNombre());
        
        // ID Venta
        
        v1.setIdVenta(1);
        
        
       // java constructors y metodo toString (asociado a overwrite a method in a class)
        
        
    
}}