package com.mx_curso.unidad3.pilas.Practica01;

import java.util.ArrayDeque;


public class EjemploStack {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("contenido de la pila " + stack);

        //c
        int elemento = stack.pop();

        System.out.println("elemento " + elemento);
    }

}
