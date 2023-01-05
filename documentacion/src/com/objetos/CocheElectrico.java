package com.objetos;

public class CocheElectrico extends Coche {
    String motorElectrico;
    public CocheElectrico(){
    }
    public CocheElectrico(String motorElectrico){

        this.motorElectrico = motorElectrico;
    }

    //metodo super, nos permite acceder al constructor de la clase base
    public CocheElectrico(String motorElectrico,String color, String fabricante, String modelo, Double peso, Double largo){
        super(color, fabricante,  modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
