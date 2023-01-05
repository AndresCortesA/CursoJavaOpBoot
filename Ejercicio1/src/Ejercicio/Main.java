package Ejercicio;

/**
 * @author AndresEnDesarrollo (AndresArias)
 * @see 1.1 versionFree
 */
public class Main {
    public static void main(String[] args) {
        //Prueba con int
        int num1 = 50;
        int num2 = 5;

        int division = num1 / num2;

        System.out.println("Prueba INT:"+ " " + division);

        //Prueba long
        long num3 = 3333;
        long num4 = 4444;

        long sum = num3 + num4;

        System.out.println("Prueba con LONG: "+sum);

        //Prueba double

        double num5 = 33.4;
        double num6 = 22;

        double division2 = num5 / num6;

        System.out.println("Prueba DOUBLE: " + division2);

        //Prueba boolean

        if (5 > 4) {
            System.out.println("Prueba bool con if: true");
        } else {
            System.out.println("Prueba bool con if: false");
        }

        //Prueba boolean

        boolean laverdad = true;
        boolean lamentira = false;

        boolean resultado = laverdad && lamentira;

        System.out.println("Prueba bool con AND: " + resultado);

        //Prueba con String
      String nombreEstudiante = "Andres";
      String apellidoDelEstudiante = "Arias";
        System.out.println("Prueba Cadenas STRING: " + " "+ nombreEstudiante + " " + apellidoDelEstudiante);
    }
}