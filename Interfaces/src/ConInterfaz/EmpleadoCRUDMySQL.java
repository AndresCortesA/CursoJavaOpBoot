package ConInterfaz;

import SinInterfaz.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD, EmpleadoReader{

    @Override
    public void guardar(Empleado empleado) {

    }

    @Override
    public List<Empleado> buscarTodos() {
        return null;
    }

    @Override
    public void borrar(Empleado empleado) {

    }
}
