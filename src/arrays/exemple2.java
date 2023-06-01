import java.util.Scanner;

public class exemple2 {
    public static void main(String[] args) {

        int[] arrayEnters = {1,2,3,4,5};
        int mida = arrayEnters.length;

        for (int i = 0; i < mida; i++) {
            int suma = arrayEnters[i] + 10;
            System.out.println("El resultat de sumar 10 + " + arrayEnters[i] + " = " + suma);
        }
    }
}
