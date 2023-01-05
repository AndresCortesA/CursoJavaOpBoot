package com.examples;

import java.util.ArrayList;
import java.util.List;

public class ListArray {

    public static void main(String[] args) {

        //Array list son dinamicos

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }

 //       for (int i = 0; i < numbers.size(); i++) {
  //          System.out.println(numbers.get(i));
  //      }
        System.out.println(numbers);

        System.out.println("\n ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        /*
        For each - recupera informacion de colecciones de los arrays que solo existe en la variable temporal del
        bucle y se declara con tipo nombreVariable(esta es la variable temporal) : nombreArrayList
         */

        for(int numeros : numbers){
            System.out.println(numeros);
        }

        //ArrayList de objetos

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("BMW"));
        coches.add(new Coche("MUSTANG"));
        coches.add(new Coche("TESLA"));

        System.out.println(coches);





    }



}
