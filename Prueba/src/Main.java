import java.util.Arrays;

public class Main {

    public static int maximaDiferencia(int[] arr){
        int maxDiferencia = 0;
        int minimo = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimo){
                minimo = arr[i];
            }
            int diff = arr[i] - minimo;
            if (diff > maxDiferencia) {
                maxDiferencia = diff;
            }
        }
        return maxDiferencia;
    }

    public static void main(String[] args) {
        int[] arr = {2,8,10,20,5,18};
        System.out.println("arr: ->" + Arrays.toString(arr));
        System.out.println("max diferencia: "+maximaDiferencia(arr));
    }
}