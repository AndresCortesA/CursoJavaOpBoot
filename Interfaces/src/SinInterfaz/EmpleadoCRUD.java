package SinInterfaz;

import java.util.ArrayList;
import java.util.List;

/*
* Create
* Recreate/ Read
* Update
* Delete
* */
public class EmpleadoCRUD {


    private List<Empleado> empleados = new ArrayList<>();

    //operaciones CRUD

    //guardar empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> buscarTodos(){
        return empleados;
    }




}
