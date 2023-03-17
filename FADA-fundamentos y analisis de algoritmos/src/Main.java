



public class Main {

    public static boolean existePalindromo(String oracion) {
        // Eliminar espacios y convertir a minúsculas
        String sinEspacios = oracion.replaceAll("\\s", "").toLowerCase();
        // Separar en palabras
        String[] palabras = sinEspacios.split("\\s+");
        // Iterar por cada palabra y verificar si es un palíndromo
        for (String palabra : palabras) {
            String reverso = new StringBuilder(palabra).reverse().toString();
            if (palabra.equals(reverso)) {
                return true;
            }
        }
        // Si no se encontró palíndromo, devolver false
        return false;
    }


    public static long f_sum(long n){
        long suma = 0;
        for (long i = -40; i <= 2*n; i++){
            for (long j = 40; j <= n*n; j++){
                suma += 2*i*j + 8*j;
            }
        }
        return suma;
    }

    public static long sol_sum(long n){
        long x = (n*n*(n*n+1)/2 - 780);
        long  parte1 = -40*41+2*n*(2*n + 1);
        long  parte2 = 8*(2*n + 41);
        return x *(parte1 + parte2);
    }



    public static void main(String[] args) {

        long[] arreglo = {10,20,40,60,80,100};

        String oracion = "Dabale arroz a la zorra el abad";

        String largoPalindromo = "";
        int sizePalindromo = 0;

        for (int i = 0; i < oracion.length(); i++){
            for(int j = i+1; j <= oracion.length(); j++ ){
                String subcadena = oracion.substring(i,j);
                boolean palindromo = existePalindromo(subcadena);
                if (palindromo && subcadena.length() > sizePalindromo){
                    largoPalindromo = subcadena;
                    sizePalindromo = subcadena.length();
                }
            }
        }
        System.out.println(largoPalindromo);

        System.out.println("************************************************* sumatoria");

        for(long valor:arreglo){
            System.out.println(valor+" "+f_sum(valor)+" "+sol_sum(valor));
        }

    }
}