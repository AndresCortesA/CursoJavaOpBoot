import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el alto: ");
        double alto = Double.parseDouble(scanner.nextLine());
        System.out.println("Introduce el ancho: ");
        double ancho = Double.parseDouble(scanner.nextLine());

        double area = alto * ancho;
        double perimetro = (alto + ancho) * 2;

        System.out.println("area: " + area);
        System.out.println("perimetro: " + perimetro);

    }
}
