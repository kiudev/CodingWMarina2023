import java.util.Scanner;

public class exemple3 {
    public static void main(String[] args) {

        int[] arrayEnters = {1,2,3,4,5};
        int mida = arrayEnters.length;

        for (int i = 0; i < mida; i++) {
            System.out.println("L'array inicialment és: " + arrayEnters[i]);
            if (i % 2 == 0) {
                arrayEnters[i] = -1;
            }
        }
        System.out.println("Fixa't bé en les posicions que han canviat de valor");
        System.out.println("--------------------------");

        for (int i = 0; i < mida; i++) {
            System.out.println("L'array finalment és: " + arrayEnters[i]);
        }
    }
}
