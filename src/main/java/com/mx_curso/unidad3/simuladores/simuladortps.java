package com.mx_curso.unidad3.simuladores;

public class simuladortps {
    public static void main(String[] args) {
        listaenlazada lista = new listaenlazada();
        listaenlazada.PilaListaEnlazada pila = lista.new PilaListaEnlazada();


        pila.push("a");
        System.out.println("Inicio en a");
        pila.mostrar();

        String actual = pila.pop();
        System.out.println("Pop y visitar -> " + actual);
        pila.mostrar();

        pila.push("b");
        System.out.println("b vecino de a");
        pila.mostrar();

        pila.push("c");
        System.out.println("c vecino de b");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("Pop y visitar -> " + actual);
        pila.mostrar();

        pila.push("d");
        System.out.println("d vecino de c");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("Pop y visitar -> " + actual);
        pila.mostrar();

        actual = pila.pop();
        System.out.println("Pop y visitar -> " + actual);
        pila.mostrar();

        pila.push("e");
        System.out.println("e vecino de b");
        pila.mostrar();
    }
}

