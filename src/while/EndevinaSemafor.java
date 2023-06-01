import java.util.Scanner;

public class EndevinaSemafor {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Adivina el número.");
        int num = lector.nextInt();

        int i = 1;
        int numelegido = 6;

        while (num != numelegido && i < 3) {
            if (num >= 0 && num <= 10) {
                System.out.println("¡¡Has fallado!!, vuelve a intentarlo...");
            }
            else {
                System.out.println("Este número está fuera de rango, vuelve a intentarlo...");
            }
            num = lector.nextInt();
            i++;
        }

        if (num == numelegido) {
            System.out.println("¡¡Enhorabuena, lo has adivinado!!");
        }
        else {
            System.out.println("Se te han agotado los " + i + " intentos.");
        }
    }
}
