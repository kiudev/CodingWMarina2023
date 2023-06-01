import java.util.Scanner;

public class Estrellasparimpar {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        int h = 15;
        int w = 20;

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= w; j++) {
                if (j % 2 == 0 && i % 2 != 0) {
                    System.out.print("*");
                }
                else if (i % 2 == 0 && j % 2 != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
