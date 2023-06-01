import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input number of rows");
        int num = s.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num-1-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i+1; j++) {
                System.out.print(" ");
            }
            for (int j = num-2-i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
