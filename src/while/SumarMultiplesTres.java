import java.util.Scanner;

public class SumarMultiplesTres {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Hasta que valor quieres sumar múltiplos de 3?");
        int num = lector.nextInt();

        int i = 0;
        int resultado = 0;

        while(i <= num) {
            if (i % 3 == 0) {
                System.out.println("Añadimos " + i + "...");
                resultado = resultado + i;
            }
            i++;
        }
        System.out.println("El resultado final es " + resultado + ".");
    }
}
