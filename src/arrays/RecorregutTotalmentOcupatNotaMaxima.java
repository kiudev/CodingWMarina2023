import java.util.Scanner;

public class RecorregutTotalmentOcupatNotaMaxima {
    public static void main(String[] args) {

        double[] arrayNotas = new double[10];

        Scanner s = new Scanner(System.in);

        double notaMax = 0;

        for (int i = 0; i < arrayNotas.length; i++) {
            System.out.println("Introduce la nota " + (i + 1));
            arrayNotas[i] = s.nextInt();
            if (arrayNotas[i] > notaMax) {
                notaMax = arrayNotas[i];
            }
        }
        
        System.out.println("La nota máxima es: " + notaMax);
    }
}
