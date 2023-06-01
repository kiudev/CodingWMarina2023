import java.util.Scanner;

public class Estrellas2 {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0 && (j != 2 || j != 3)) {
                    System.out.print("*");
                }
                else if (i % 2 != 0 && (j == 2 || j == 3)) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
