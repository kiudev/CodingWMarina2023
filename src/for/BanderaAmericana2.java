import java.util.Scanner;

public class BanderaAmericana2 {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        int h = 16;
        int w = 36;

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= w; j++) {
                if (i < 8 && j < 14) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else if (i < 16 && j < 36) {
                    System.out.print("=");
                }
                else if (i < 8 && j < 36) {
                    System.out.print("=");
                }
            }
            System.out.println("");
        }
    }
}
