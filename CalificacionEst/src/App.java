import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Proporcione una nota:");
        nota = Integer.parseInt(scan.nextLine());

        if (nota >= 9 && nota <= 10) {
            System.out.println("Nota: A");
        } else if (nota >= 8 && nota < 9) {
            System.out.println("Nota: B");
        } else if (nota >= 7 && nota < 8) {
            System.out.println("Nota: C");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Nota: D");
        } else if (nota >= 0 && nota < 6) {
            System.out.println("Nota: F");
        } else {
            System.out.println("Valor desconocido -> no esta dentro de los parametros");
        }

        scan.close();
    }
}
