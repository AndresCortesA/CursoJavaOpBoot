package com.examples;

import java.util.HashMap;
import java.util.Map;


public class Maps {
    public static void main(String[] args) {

        Map<Integer, String> personas = new HashMap<>();

        personas.put(324,"Juan P");
        personas.put(325,"Juan Q");
        personas.put(326,"Juan R");

        System.out.println(personas);

        // sacamos el valor clave con la palabra reservada keyset
        for (int key : personas.keySet()){
            System.out.println(key);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        // sacamos el valor con la palabra reservada value
        for (String value : personas.values() ){
            System.out.println(value);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        // sacamos el par de clave:valor mediante entry viene de java.util
        for(Map.Entry<Integer, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue() );
        }





    }
}
