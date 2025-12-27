package com.mx_curso.unidad3.pilas.Practica01;

import java.util.Deque;
import java.util.ArrayDeque;

public class EjemploDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("1");
        deque.addLast("2");
        deque.addFirst("3");

        System.out.println("contenido "+deque);

        String primero = deque.removeFirst();

        System.out.println(primero);

        String segundo = deque.removeLast();
        System.out.println(segundo);

        System.out.println("contenido actual "+deque);
//c


    }
}
