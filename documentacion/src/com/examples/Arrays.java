package com.examples;

public class Arrays {
    public static void main(String[] args) {
        String[] names = new String[3];
        int[] number = new int[6];
        Coche[] car = new Coche[2];

        //Array no dinamico de names
        names[0] = "John";
        names[1] = "Paul";
        names[2] = "George";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //Array no dinamico de number

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        //Array no dinamico de car
        car[0] = new Coche("BMW");
        car[1] = new Coche("MUSTANG");

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }


    }
}
