package com.objetos;

public abstract class Coche {

    //Atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;


    //Constructores - nos permite crear obtejos de las clases
    public Coche() {

    }
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    //Comportamiento ( metodos)

    public void acelerar(Integer aumentVelocidad){
        if(aumentVelocidad > 0 && aumentVelocidad <= 80){
            this.velocidad += aumentVelocidad;

        }else {
            System.out.println("Velocidad no permitida, debe ser maximo 80km");
        }
        if (aumentVelocidad < 0 ){
            System.out.println("aumento negativo - verifique");
        }
    }

    // hace un sout que devuelve un texto con el valor de todas los atributos
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
