package com.mx_curso.unidad1;

public class Inventario {
    public static void main(String[] args) {
        //ID, Cantidad, Precio
        double[][]inventario={
                {1,50,20.5},
                {2,30,15.0},
                {3,80,10.0}
        };

        System.out.println("ID Stock Precio");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(inventario[i][0] + "  " + inventario[i][1] + "  " + inventario[i][2]);
        }

        //Producto con ID 2
        double cantidad=inventario[1][1];
        double precio=inventario[1][2];
        double total=cantidad*precio;

        System.out.println("Valor total del producto 2: "+total);

        //Restar 10 unidades
        inventario[1][1] -= 10;
        System.out.println("Stock actualizado del producto 2: "+inventario[1][1]);    }}
