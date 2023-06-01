import java.util.Scanner;

public class CreemParaules {
    public static void main(String[] args) {

        String[] arrayPalabras = new String[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arrayPalabras.length; i++) {
            System.out.print("Introduiu una paraula: ");
            arrayPalabras[i] = s.nextLine();
        }

        System.out.println("Les paraules del vector són:");

        for (int i = 0; i < arrayPalabras.length; i++) {
            System.out.println(arrayPalabras[i]);
        }
    }
}
