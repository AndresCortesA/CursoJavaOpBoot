package com.objetos;

public class PolimorfismoMain {
    public static void main(String[] args) {

      //  Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();

        //polimorfismo - lo que se busca es tratar las clases por igual instanciando la clase padre con las hijas
        Coche coche4 = new CocheElectrico();
        // Coche coche5 = new Coche();

        if(coche4 instanceof CocheElectrico){
            /*
            InstanceOf sirve para cualquier objeto al que hacemos una referencia dada una clase o una interfaz concreta
            Es para saber si un obtejo al que apuntamos hace referencia a tal clase lo que devuelve un boleano
             */
            System.out.println("Coche Electrico");
        }

        if(coche4 instanceof Coche){
            System.out.println("Coche");
        }else {
            System.out.println("no pertenece");
        }


    }
}
