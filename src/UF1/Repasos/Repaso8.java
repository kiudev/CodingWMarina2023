//Volem un programa que avalui els nombres d'entrada. L'usuari introdueix 1 numero.
// Hem de dir si és parell, senar o 0 (nombres + o -)

import java.util.Scanner;

public class Repaso8 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame un número");
        int num = lector.nextInt();

        String resultado = "";

        if (num % 2 == 0) {
            resultado = "Par";
        }
        else if (num % 2 != 0) {
            resultado = "Impar";
        }
        else {
            resultado = "Cero";
        }

        System.out.println(resultado);
    }
}
