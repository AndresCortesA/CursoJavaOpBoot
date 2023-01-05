package EjercicioTema4;

public class Switch {
    public static void main(String[] args) {
        String estacion = "Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Verifique la estacion");

        }
    }
}
