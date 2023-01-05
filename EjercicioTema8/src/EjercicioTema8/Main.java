package EjercicioTema8;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(19);
        persona.setNombre("Andrew");
        persona.setTelefono(23456);

        System.out.println("+++++++++++++++++Con to string");
        System.out.println(persona+"\n");
        System.out.println("+++++++++++++++++++++++Con los getters");
        System.out.println("Edad: "+persona.getEdad() +
                            " Nombre: "+persona.getNombre() +
                            " Telefono: "+persona.getTelefono());

    }
}