import java.util.Scanner;

public class TriangleCentrat {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input a number of rows");
        int rows = s.nextInt();

        for (int i = 0; i <= rows; i++) {
            for (int j = rows-1-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
