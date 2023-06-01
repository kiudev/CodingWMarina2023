import java.util.Scanner;

public class NombreMesGran {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el primer valor");
        double num1 = lector.nextDouble();

        System.out.println("Ahora el segundo valor");
        double num2 = lector.nextDouble();

        System.out.println("Por último, añade el último valor");
        double num3 = lector.nextDouble();

        double numtotal = 0;

        if (num1 > num2 && num1 > num3) {
            numtotal = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            numtotal = num2;
        }
        else if (num3 > num1 && num3 > num2) {
            numtotal = num3;
        }
        else {
            System.out.println("¡¡Error, vuelve a intentarlo!!");
        }

        System.out.println("El resultado final será " + numtotal + ".");
    }
}
