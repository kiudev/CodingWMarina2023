// Escriu un programa Java per calcular la suma de dos nombres enters i retorna cert si la suma és igual a un tercer enter.

import java.util.Scanner;

public class Repaso5 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame 3 números para verificar si la suma es correcta");
        System.out.println("Dame el primer número");
        int num1 = lector.nextInt();

        System.out.println("Dame el segundo número");
        int num2 = lector.nextInt();

        System.out.println("Y por último, dame su resultado");
        int num3 = lector.nextInt();

        String resultado = "";

        int suma = num1 + num2;

        if (suma == num3) {
            resultado = "True";
        }
        else {
            resultado = "False";
        }

        System.out.println(resultado);
    }
}
