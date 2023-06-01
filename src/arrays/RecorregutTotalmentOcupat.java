import java.util.Scanner;

public class RecorregutTotalmentOcupat {
    public static void main(String[] args) {

        double[] arrayNotas = new double[10];

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce tus 10 notas para que pueda hacer la mediana.");

        double acumulado = 0;

        for (int i = 0; i < arrayNotas.length; i++) {
            arrayNotas[i] = s.nextDouble();
        }

        for (int i = 0; i < arrayNotas.length; i++) {
            acumulado = acumulado + arrayNotas[i];
        }

        double resultado = acumulado / arrayNotas.length;
        System.out.println(resultado);
    }
}
