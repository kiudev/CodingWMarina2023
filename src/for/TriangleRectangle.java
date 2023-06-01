import java.util.Scanner;

public class TriangleRectangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input number");
        int num = s.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = num-5; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
