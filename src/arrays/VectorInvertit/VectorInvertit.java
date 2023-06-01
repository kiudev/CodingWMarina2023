import java.util.Scanner;

public class VectorInvertit {
    public static void main(String[] args) {

        int[] valors = new int[3];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < valors.length; i++) {
            System.out.println("Introdueixi els valors d'un vector");
            valors[i] = s.nextInt();
        }

        for (int i = 0; i < valors.length / 2; i++) {
            int aux = valors[i];
            valors[i] = valors[valors.length - 1 - i];
            valors[valors.length - 1 - i] = aux;
        }

        System.out.print("El vector invertit es: [ ");

        for (int i = 0; i < valors.length; i++) {
            System.out.print(valors[i] + " ");
        }
        System.out.println("]");
    }
}
