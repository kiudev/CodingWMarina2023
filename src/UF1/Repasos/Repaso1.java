//Escriu un programa Java que llegeixi un nombre enter i imprimeix "zero" si el nombre és zero.
//En cas contrari, escriviu "positiu" o "negatiu". Afegiu "petit" si el valor absolut del nombre és inferior a 10, o "gran" si supera 1.000.000

import java.util.Scanner;

public class Repaso1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce cualquier número");
        double num = lector.nextDouble();

        String resultado = "";

        if (num == 0) {
            resultado = "cero";
        }
        else if (num > 0 && num < 10) {
            resultado = "Positivo pequeño";
        }
        else if (num > 1000000) {
            resultado = "Positivo grande";
        }
        else if (num > -10 && num < 0) {
            resultado = "Negativo pequeño";
        }
        else if (num < -1000000) {
            resultado = "Negativo grande";
        }
        else if (num > 10 && num < 1000000) {
            resultado = "Positivo";
        }
        else if (num < -10 && num > -1000000) {
            resultado = "Negativo";
        }

        System.out.println(resultado);
    }
}
