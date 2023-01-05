package com.empresa;

/**
 * @author Andrés Arias
 * sobrecarga de funciones
 */
public class Funciones {

    public static void main(String[] args) {

        // una funcion es una agrupacion de sentencias

        holaMundo("Andres");
        holaMundo("Andres", "Arias");
        holaMundo(1);
        holaMundo(2,4);
        





    }

    private static void holaMundo(String name) {
        System.out.println("HolaMundo-metodo " + name);
    }
    private static void holaMundo(String name, String lastName){
        System.out.println("Nombre " + name + " Apellido " + lastName);
    }
    private static void holaMundo(Integer number){
        System.out.println("El numero es " + number);
    }

    private static void holaMundo(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println("Hola mundo pero suma " + resultado);
    }

}
