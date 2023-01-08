import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    //imprime una cadena al reves
    public static String reverse(String texto) {
        StringBuilder revers = new StringBuilder(texto);
        texto = revers.reverse().toString();
        return texto;
    }
    //metodo para dividir por cero
    private static int  Divide(int dividend, int divisor) throws ArithmeticException{
        return dividend/divisor;
    }
    public static void main(String[] args) {
        System.out.println("/--------------------- cadena al reves-----------------------------------/");
        System.out.println(reverse("Hola Mundo"));
        System.out.println("/--------------------- Array unidimensional-----------------------------------/");
        String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8"};
        for (String string: strings) {
            System.out.println(string);
        }
        System.out.println("/--------------------- Array bidimensional-----------------------------------/");
        Integer[][] integers = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                System.out.println("Fila: " + (i+1) +
                                  " Columna: " + (j +1) +
                                  "\nValor: " + integers[i][j]);
            }
        }
        System.out.println("/---------------------Vector-----------------------------------/");

        Vector<Integer> enteros = new Vector<>();

        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        System.out.println("Sin eleminar posiciones: "+enteros);

        enteros.remove(2);
        enteros.remove(1);
        System.out.println("Eliminando 2da y 3ra posicion: " + enteros);

        System.out.println("/---------------------VectorDefecto_Respuesta-----------------------------------/");
        System.out.println("cada vez que se ejecute el vector se duplica al desbordar hace que no sea eficiente");

        System.out.println("/--------------------arrayList_LinkedList-----------------------------------/");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pepito");
        arrayList.add("Perez");
        arrayList.add("Tolomea");
        for (String array: arrayList) {
            System.out.println("Elementos de arrayList: "+array);
        }
        /*LinkedList<String> linkedList = new LinkedList<String>();
        for (int i = 0; i < arrayList.size() ; i++) {
            linkedList.add(i,arrayList.get(i));
            //              index, obtenerdato.get(posicion)
            esta es buena option pero se utiliza mucho codigo, es mejor asignarle el arreglo directamente
            es casi lo mismo y más eficiente
        }*/
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        for (String linked : linkedList) {
            System.out.println("Elementos de LinkedList: " + linked);
        }
        System.out.println("-------------------Arreglo en menos de dos pasos-----------------------");
        /*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
         con otro bucle, recórrelo y elimina los numeros pares.
         Por último, vuelve a recorrerlo y muestra el ArrayList final.
        Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.*/
        ArrayList<Integer> numeritos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(i%2 != 0) {
                numeritos.add(i);
            }
        }
        System.out.println(numeritos);

        System.out.println("-------------------Try catch-----------------------");

        try {
            System.out.println(Divide(1, 0));
        }catch (ArithmeticException e){
            System.out.println("Este proceso no es permitido: " + e.toString());
        }finally {
            System.out.println("Final");
        }

    }

}