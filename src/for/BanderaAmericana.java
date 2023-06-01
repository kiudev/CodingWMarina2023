import java.util.Scanner;

public class BanderaAmericana {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        int hstars = 8;
        int wstars = 15;
        int wbars1 = 31;

        for (int i = 0; i <= hstars; i++) {
            for (int j = 0; j <= wstars; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            for (int k = 0; k <= wbars1; k++) {
                    System.out.print("=");
            }
            System.out.println("");
        }

        int hbars2 = 6;
        int wbars2 = 47;

        for (int i = 0; i <= hbars2; i++) {
            for (int j = 0; j <= wbars2; j++) {
                System.out.print("=");
            }
            System.out.println("");
        }
    }
}
