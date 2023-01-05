package EjercicioTema9;

public class Main {
    public static void main(String[] args) {
        Persona cliente = new Cliente("credito a 4 meses", 19, "Andrew", 31566778);
        Persona trabajador = new Trabajador(200456, 24, "Marmolejo", 32132512);

        System.out.println(cliente +"\n\n" + trabajador);
    }
}