//Escriu un programa que accepti tres números de l'usuari i imprimeix "creixent" si els números estan en ordre creixent,
//"decreixent" si els números estan en ordre decreixent i "Ni ordre creixent ni decreixent" en cas contrari.

import java.util.Scanner;

public class Repaso3 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        double num1 = lector.nextDouble();

        System.out.println("Introduce el segundo número");
        double num2 = lector.nextDouble();

        System.out.println("Introduce el tercer número");
        double num3 = lector.nextDouble();

        String resultado = "";

        if (num1 < num2 && num1 < num3 && num2 < num3) {
            resultado = "Creciente";
        }
        else if (num1 > num2 && num1 > num3 && num2 > num3) {
            resultado = "Decreciente";
        }
        else {
            resultado = "Ni orden creciente ni decreciente";
        }

        System.out.println(resultado);
    }
}
