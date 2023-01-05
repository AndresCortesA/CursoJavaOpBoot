package Ejercicio3;
    /*Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.*/
public class Coche {
        int puertasCoche = 4;
        public Coche(){

        }

        public void inrementar(int aumentarPuertas){
            this.puertasCoche = puertasCoche + aumentarPuertas;
            System.out.println("Se aumento las puertas");
        }

        @Override
        public String toString() {
            return "Coche{" +
                    "puertasCoche=" + puertasCoche +
                    '}';
        }
    }
