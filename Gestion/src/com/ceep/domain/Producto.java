/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author Marco
 */
public class Producto extends Orden {
 private  final int producto;
 private String nombre;
 private double precio;
 private  static int contadorProductos;    

    public Producto() {
       this.producto = ++Producto.contadorProductos;
        
    }

    public Producto(String nombre,int producto) {
        this.producto = producto;
        this.nombre = nombre;
    }

   
 
 
    public Producto(String nombre, double precio) {
        this();
        
        this.nombre = nombre;
        this.precio = precio;
    }

    public  int getProducto() {
        return this.producto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

   
   
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
