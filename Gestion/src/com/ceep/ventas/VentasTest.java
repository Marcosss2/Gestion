
package com.ceep.ventas;

import com.ceep.domain.*;

public class VentasTest {

   
    public static void main(String[] args) {
        
     Producto prodl = new Producto("Peras",5.4);
     Producto prod2 = new Producto("Ps",5.7);
     Producto prod3 = new Producto("Pers",7);
     
     Orden pedido1 = new Orden();
    
     pedido1.agregarProducto(prod3);
     
    pedido1.agregarProducto(prodl);
     pedido1.agregarProducto(prod2);
     
    }
    
}
