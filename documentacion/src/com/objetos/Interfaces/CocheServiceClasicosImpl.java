package com.objetos.Interfaces;

import com.objetos.Coche;
import com.objetos.CocheElectrico;

public class CocheServiceClasicosImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Se a creado un coche clasico electrico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche clasico");
    }
}
