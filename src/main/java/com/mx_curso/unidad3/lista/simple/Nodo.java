package com.mx_curso.unidad3.lista.simple;

// Clase Nodo
public class Nodo {
    int dato;          // almacena dato
    Nodo siguiente;    // siguiente nodo

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

// Clase ListaCabeza
class ListaCabeza {
    Nodo cabeza;

    public ListaCabeza() {
        this.cabeza = null; // inicializa la lista vacía
    }

    // Insertar al inicio
    public void insertarAlInicio(int nuevoDato) {
        Nodo nuevoNodo = new Nodo(nuevoDato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        System.out.println("Nodo insertado al inicio: " + nuevoDato);
    }

    // Insertar al final
    public void insertarAlFinal(int nuevoDato) {
        Nodo nuevoNodo = new Nodo(nuevoDato);

        // si la lista está vacía, el nuevo nodo es la cabeza
        if (cabeza == null) {
            cabeza = nuevoNodo;
            System.out.println("Nodo insertado al final (lista vacía): " + nuevoDato);
            return;
        }

        // recorrer hasta el último nodo
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoNodo;
        System.out.println("Nodo insertado al final: " + nuevoDato);
    }

    // Imprimir lista
    public void imprimir() {
        Nodo actual = cabeza;
        System.out.println("Lista simple:");

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
