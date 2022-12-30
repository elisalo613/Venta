/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.venta;
import java.util.*;

/**
 *
 * @author elisalo613
 */
public class Venta {
    public static void main(String[] args){
    Date Fecha;
    Cliente cliente;
    Vendedor vendedor;
    List ListaDetalles;
    int IDventa;

//    public static void main(String[] args) {
//        Venta venta1 = new Venta();
//        venta1.Fecha = 13Junio;
//        System.out.println(venta1.Fecha);
//        System.out.println(venta1.Cliente);
//        System.out.println(venta1.Vendedor);
//        System.out.println(venta1.ListaDetalles);
//        System.out.println(venta1.IDventa);
//    }
}}

class Vendedor {
    String Nombre;
    int Telefono;
    String Mail;
    List ListaVentas;
    int IDvendedor;}

class Detalle {
    int Precio;
    Producto producto;
    int Cantidad;
    int IDdetalle;}

class Cliente {
    String Nombre;
    String Domicilio;
    int Telefono;
    List ListaVentas;
    int IDcliente;}

class Producto {
    String Nombre;
    Date Vencimiento;
    int Precio;
    int IDproducto;}

