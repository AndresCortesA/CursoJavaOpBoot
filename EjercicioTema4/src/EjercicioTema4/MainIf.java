package EjercicioTema4;

import java.util.Scanner;

public class MainIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();


            if (numero > 0) {
                System.out.println("es positivo");
            } else if (numero < 0) {
                System.out.println("es negativo");
            } else if (numero == 0) {
                System.out.println("Es igual a cero");
            }



    }
}