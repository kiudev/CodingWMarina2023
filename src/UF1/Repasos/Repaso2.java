// Escriu un programa Java que accepti tres nombres i imprimeix "Tots els números són iguals" si els tres són
// iguals, "Tots els números són diferents" si els tres números són diferents. Poden ser nombres enters o reals.

import java.util.Scanner;

public class Repaso2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        double num1 = lector.nextDouble();

        System.out.println("Introduce el segundo número");
        double num2 = lector.nextDouble();

        System.out.println("Introduce el tercer número");
        double num3 = lector.nextDouble();

        String resultado = "";

        if (num1 == num2 && num1 == num3 && num2 == num3) {
            resultado = "Todos los números son iguales";
        }
        else {
            resultado = "Todos los números son diferentes";
        }

        System.out.println(resultado);
    }
}
