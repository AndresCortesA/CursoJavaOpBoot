package SinInterfaz;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado Juan = new Empleado("Juan", 19, 987.90, false);
        Empleado Pepe = new Empleado("Pepe", 39, 1087.90, true);
        Empleado Andrew = new Empleado("Andrew", 29, 9987.90, false);

        //Guardar
        empleadoCRUD.guardar(Juan);
        empleadoCRUD.guardar(Pepe);
        empleadoCRUD.guardar(Andrew);

        //consultar
        List<Empleado> empleados = empleadoCRUD.buscarTodos();
        System.out.println(empleados);


    }
}