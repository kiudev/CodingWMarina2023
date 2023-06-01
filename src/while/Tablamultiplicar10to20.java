import java.util.Scanner;

public class Tablamultiplicar10to20 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Qué tabla de multiplicar quieres ver?");
        int num = lector.nextInt();

        int i = 10;
        int resultado = 0;

        while (i < 21) {
            resultado = num * i;
            System.out.println(num + " * " + i + " = " + resultado);
            i++;
        }
    }
}
