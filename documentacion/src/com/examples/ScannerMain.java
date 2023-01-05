package com.examples;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir un nombre: ");
        //Introducir Strings
        String nombre = scanner.nextLine();
        System.out.println("Nombre: " + nombre);
        //Introducir Enteros
        System.out.println("Introducir un número: ");
        int numero = scanner.nextInt();
        System.out.println("Numero: " + numero);



    }
}
