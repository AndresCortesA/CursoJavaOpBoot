import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number:");
        int num2 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (num1 > num2) {
            System.out.println("Max: " + num1);
        } else {
            System.out.println("Max: " + num2);
        }
    }
}
