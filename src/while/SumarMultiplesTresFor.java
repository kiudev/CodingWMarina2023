import java.util.Scanner;

public class SumarMultiplesTresFor {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Hasta qué valor quieres sumar múltiplos de 3?");
        int num = lector.nextInt();

        int resultado = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println("Añadimos " + i + "...");
                resultado = resultado + i;
            }
        }
        System.out.println("El resultado final es " + resultado + ".");
    }
}
