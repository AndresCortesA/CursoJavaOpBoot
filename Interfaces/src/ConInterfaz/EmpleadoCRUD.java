package ConInterfaz;

import SinInterfaz.Empleado;

import java.util.List;

/*
*
* se declaran los métodos, no se implementan
*
* Actúa como un contrato, dice que se debe hacer, no lo hace
*
* */


public interface EmpleadoCRUD {
    void guardar(Empleado empleado);
    List<Empleado> buscarTodos();

    void borrar(Empleado empleado);
}
