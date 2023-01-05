package com.empresa;

public class TiposDatos {
    public static void main(String[] args) {

        // tipoDato identificador = 30;
        // tipoDato declararDato;
        // declararDato = 30;

        //DATOS PRIMITIVOS (NO PUEDEN SER NULOS)
        //Enteros
        byte num1 = 1; // 1 byte
        short num2 = 2; // 2 byte
        int num3 = 3; // 4 byte
        long num4 = 4l; //8 byte

        // punto flotante
        float decimal1 = 4.9f; // menor capacidad de bytes
        double decimal2 = 4.99d; // mayor capacidad de bytes

        // caracter

        char caracter1 = 'a';

        // boolean

        boolean verdad = true;
        boolean falso = false;

        //DATOS NO PRIMITIVOS (QUE PUEDEN SER NULOS)
        // cadenas de texto
        String nombre = "Alanbrimo";

        /* tipo envoltorio
        (ESTOS SE ENCARGAN DE QUE LOS DATOS PRIMITIVOS PUEDAN SER NULOS)
        */
        Integer numero = null;
        Long numero2 = 2L;



    }
}
