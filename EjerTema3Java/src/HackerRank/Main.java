/*
TAREA 
obtener un entero N, conforme a las siguientes condiciones:
if N impar, print Weird
if N es par y esta en el rango de 2 a 5, print Not Weird
if N es par y esta en el rango de 6 a 20, print Weird
if N es par y mayor que 20, print Not Weird

*/

// solucion valida hasta cierto criterio, el cual no cumple satisfactoriamente la salida
package HackerRank;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if((N&2) != 0) {
            System.out.println("Weird");
        }
        else if(N>=2 && N<=5){
                System.out.println("Not Weird");
            }
        else if(N>=6 && N<=20){
                System.out.println("Weird");
            }
        else if (N >= 20){
                System.out.println("Not Weird");
            }
        }
    }

// Solucion correcta
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2 != 0) {
            System.out.println("Weird");
        }
        else if(N%2 == 0 && N>=2 && N<=5){
                System.out.println("Not Weird");
            }
        else if(N%2 == 0 && N>=6 && N<=20){
                System.out.println("Weird");
            }
        else if (N%2 == 0 && N >= 20){
                System.out.println("Not Weird");
            }
        scanner.close();
    }
}
