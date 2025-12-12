package com.mx_curso.unidad3.lista.simple;

public class Testlista {
    public static void main(String[] args) {
        ListaCabeza lista = new ListaCabeza();
        System.out.println("insertar nuevos datos");
        //c
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);

        System.out.println("insertar datos al final");
        lista.insertarAlFinal(40);
        lista.insertarAlFinal(50);


        lista.insertarAlInicio(60);
        lista.imprimir();
    }
}
