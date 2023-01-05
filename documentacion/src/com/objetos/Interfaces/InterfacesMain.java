package com.objetos.Interfaces;

import com.objetos.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service = new CocheServiceClasicosImpl();      //Cada uno se sobreescribe con el @override
        CocheService service1 = new CocheServiceDeportivosImpl();

        Coche coche1 = service.crearCocheDemo();
        Coche coche2 = service1.crearCocheDemo();




    }


}
