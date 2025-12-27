package com.mx_curso.unidad3.cola.practica02;

import java.util.Queue;
import java.util.LinkedList;

public class servidorWeb {
    public static void main(String[] args) {
        //crear instacia de queue
        Queue<String> ColaUsurios = new LinkedList<>();


        //
        ColaUsurios.offer("alice");
        ColaUsurios.offer("bob");
        ColaUsurios.offer("charlie");
        ColaUsurios.offer("david");
        ColaUsurios.offer("eve");

        System.out.println("Cola despues de agrear varios usuarios " + ColaUsurios);

        while(!ColaUsurios.isEmpty()){
            String usuario = ColaUsurios.poll();
            System.out.println("atendido " + usuario);
        }
        System.out.println("Cola despues de atender usuarios : " + ColaUsurios);





    }


}
