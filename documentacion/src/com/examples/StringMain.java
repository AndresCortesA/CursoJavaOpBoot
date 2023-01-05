package com.examples;

public class StringMain {
    public static void main(String[] args) {
        //La clase String
        /*
        length() para obtener la longitud o tamaño del string
        startsWith("")
        endsWith("")
        indexOf("")
        contains("")
        substring(1,5)
        trim() elimina espacion
        equals()
        equalsignoreCase() ignora la comparacion de mayus o minus
        comparteTo
         */

        String mensaje = "Hola mundo";

        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
    }
}
