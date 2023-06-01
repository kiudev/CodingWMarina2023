import java.util.Scanner;

public class TriangleNombre {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Input number of rows:");
        int num = lector.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
