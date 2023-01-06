package ConInterfaz;

import SinInterfaz.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD;
    public static void main(String[] args) {
        empleadoCRUD.buscarTodos();
        empleadoCRUD.guardar(new Empleado());
    }
}
