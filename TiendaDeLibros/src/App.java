import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String nombre;
        int id;
        int precio;
        boolean envioGratis;

        System.out.println("Ingresa Nombre:");
        nombre = scan.nextLine();
        System.out.println("Ingresa id del producto:");
        id = Integer.parseInt(scan.nextLine());
        System.out.println("Indica un precio:");
        precio = Integer.parseInt(scan.nextLine());
        System.out.println("Envio gratuito -> opciones true o false:");
        envioGratis = Boolean.parseBoolean(scan.nextLine());

        System.out.println("Producto: " + nombre + " # '" + id + "'");
        System.out.println("Precio: $" + precio);
        if (envioGratis == true) {
            System.out.println("Envio gratis: Sí");
        } else {
            System.out.println("Envio gratis: No");
        }

        scan.close();

    }
}
