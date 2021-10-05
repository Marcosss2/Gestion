
package com.ceep.domain;


public class Orden {
  
 private  final int idOrden;
  Producto productos[];
 private static int contadorOrdenes ; 
 private static int contadorProductos; 
 private static  final int MAX_PRODUCTOS = 10 ;    

    public Orden() {
        productos = new Producto[Orden.MAX_PRODUCTOS];
        this.idOrden = ++ Orden.contadorOrdenes;
    }

   
    public void agregarProducto(Producto producto){
        
       if(Orden.contadorProductos < Orden.MAX_PRODUCTOS){
           
           productos[Orden.contadorProductos++] = producto;
       } else{
           
           System.out.println("has alcanzado el maximo de productos por orden de 10"
         + Orden.MAX_PRODUCTOS);
       }
        
        
    }
    
    public double calcularTotal(){
        var res = 0.0;
        for( int i = 0; i <Orden.contadorProductos; i++){
        res += productos[i].getPrecio();
            
        }
        
         return  res;
        
        
        
    }
    public void muestraOrden(){
        
        System.out.println("orden " + this.idOrden);
        for( int i = 0; i <Orden.contadorProductos; i++){
        System.out.println("NombreProducto " + i + "--" + productos[i].getNombre());
         System.out.println("Precio " + i + "--" + productos[i].getPrecio());    
        }
        System.out.println("total" + this.calcularTotal());
    
    }
    
    
}
