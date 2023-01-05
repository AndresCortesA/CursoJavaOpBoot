package Ejercicio3;

public class Main {
    /*
    Primera parte:

    Crear una función con tres parámetros que sean números que se suman entre sí.

    Llamar a la función en el main y darle valores.*/
    public static int funcionSumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        System.out.println("Funcion suma con tres parametros: " + funcionSumar(2,3,5) );
        System.out.println("\n +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        Coche miCoche = new Coche();
        System.out.println(miCoche);
        System.out.println("\n +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        miCoche.inrementar(2);
        System.out.println(miCoche);

    }
}