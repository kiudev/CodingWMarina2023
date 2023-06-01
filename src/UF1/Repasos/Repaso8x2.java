//Volem un programa que avalui els nombres d'entrada. L'usuari introdueix 1 numero.
// Hem de dir si és parell, senar o 0 (nombres + o -)

import java.util.Scanner;

public class Repaso8x2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame un número");
        int num = lector.nextInt();

        String resultado = "";

        if (num > 0 && num % 2 == 0) {
            resultado = "Par positivo";
        }
        else if (num > 0 && num % 2 != 0) {
            resultado = "Impar positivo";
        }
        else if (num < 0 && num % 2 == 0){
            resultado = "Par negativo";
        }
        else if (num < 0 && num % 2 != 0) {
            resultado = "Impar negativo";
        }
        else {
            resultado = "Cero";
        }

        System.out.println(resultado);
    }
}
