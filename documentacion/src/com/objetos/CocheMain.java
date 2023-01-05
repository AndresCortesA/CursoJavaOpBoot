package com.objetos;

public class CocheMain {

    public static void main(String[] args) {
        String coche = "Mustang";
        //Coche coche1 = new Coche();
        Coche coche2 = new CocheElectrico("4velo23","Azul", "Alambrito",
                "2022",1439.22, 5.5);

        coche2.acelerar(70);
        System.out.println(coche2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "2V_6velocidades";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo = "2024";
        cocheElectrico.peso = 1002.3;
        cocheElectrico.largo = 5.3;
        cocheElectrico.acelerar(80);

        System.out.println(cocheElectrico );

        //metodo super, nos permite acceder al constructor de la clase base, nos permite reutilizar codigo desde una
        //clase hija hacia una clase base
        CocheElectrico cocheElectrico1 = new CocheElectrico("4v_todoterreno","verde","Stromae",
                                                    "2024",1340.55d, 5.6d);
        System.out.println(cocheElectrico1);

        //sobreescritura de funciones o metodos entre clases

        cocheElectrico1.acelerar(50);
        System.out.println(cocheElectrico1);

    }




}
