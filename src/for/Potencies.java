import java.util.Scanner;

public class Potencies {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Hasta qué valor quieres buscar potencias de 2?");
        int lim = lector.nextInt();

        for (int i = 1; i < lim; i = i * 2) {
            System.out.println(i);
        }
    }
}
