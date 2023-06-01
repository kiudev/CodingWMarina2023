import java.util.Scanner;

public class DobleVector {
    public static void main(String[] args) {

        String[] arrayA = {"hola","bon","dia","arbre","blau"};
        String[] arrayB = new String[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arrayB.length; i++) {
            System.out.print("Introduiu una paraula: ");
            arrayB[i] = s.nextLine();
        }

        System.out.println("Les paraules dels vectors són:");

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Vector 1: ");
            System.out.println(arrayA[i] + " - Vector 2: " + arrayB[i]);
        }
    }
}
