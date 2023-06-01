import java.util.Scanner;

public class SumaMitjana {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Necesito que me des 5 números para hacer la suma total y la media");
        System.out.println("Introduce el primer número");
        double num1 = lector.nextDouble();

        System.out.println("Introduce el segundo número");
        double num2 = lector.nextDouble();

        System.out.println("Introduce el tercer número");
        double num3 = lector.nextDouble();

        System.out.println("Introduce el cuarto número");
        double num4 = lector.nextDouble();

        System.out.println("Introduce el quinto número");
        double num5 = lector.nextDouble();

        double suma = num1 + num2 + num3 + num4 + num5;

        System.out.println("Suma = " + suma +".");

        double media = suma / 5;

        System.out.println("Media = " + media +".");
    }
}
