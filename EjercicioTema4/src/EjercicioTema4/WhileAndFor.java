package EjercicioTema4;

public class WhileAndFor {
    public static void main(String[] args) {
        System.out.println("++++++++++++++While++++++++++++++++++++++");
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println("Ejecucion while número: " + (numeroWhile + 1));
            numeroWhile ++;
        }

        System.out.println("++++++++++++++DoWhile++++++++++++++++++++++");
       int numeroDoWhile = 0;
        do {
            System.out.println("Ejecucion doWhile número: " + (numeroDoWhile + 1));
            numeroDoWhile ++;
        }while ( numeroDoWhile < 1);

        System.out.println("++++++++++++++BucleFor++++++++++++++++++++++");

        for (int numeroBucleFor = 0; numeroBucleFor <= 3; numeroBucleFor++){
            System.out.println("Ejecucion for numero: " + (numeroBucleFor + 1));
        }


    }
}
