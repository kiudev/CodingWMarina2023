import java.util.Scanner;

public class TriangleInvertit {
    public static void main (String[] args) {

        Scanner r = new Scanner(System.in);

        System.out.println("Input a number:");
        int num = r.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i; j++) {
              System.out.print("*");
            }
            System.out.println("");
        }
    }
}
