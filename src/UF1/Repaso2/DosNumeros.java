import java.util.Scanner;

public class DosNumeros {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int num1 = lector.nextInt();
        int num2 = lector.nextInt();

        int resultado = 0;

        if (num1 > num2) {
            System.out.println(num1);
        }
        else if (num1 < num2) {
            System.out.println(num2);
        }
        else if (num1 == num2) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("ERROR");
        }
    }
}
