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
public class Vendedor {
    private String nombre;
    private long telefono;
    private String mail;
    private List listaVentas;
    private Integer idVendedor;
    
    // getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List listaVentas) {
        this.listaVentas = listaVentas;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }
    
}
