package Ejercicio2;

public class Precio {

    private Double precio;

    public static double calcularIva(Double precio){
        Double iva = 0.2d;
        return iva * precio;
    }
    public static void main(String[] args) {
        Double precio1 = 290.23d;

        System.out.println("Precio sin iva: " +  precio1+"\n" + "Precio con iva: " + calcularIva(precio1));


    }
}
