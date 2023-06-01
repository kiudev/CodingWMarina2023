import java.util.Scanner;

public class NombresRealIguals {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuál será el primer valor?");
        double num1 = lector.nextDouble();

        System.out.println("¿Cuál será el segundo valor?");
        double num2 = lector.nextDouble();

        String resultado = "";

        if (num1 == num2) {
            resultado = "Iguales";
        }
        else if (num1 != num2) {
            resultado = "Diferentes";
        }
        else {
            System.out.println("¡¡Error, vuelve a intentarlo!!");
        }

        System.out.println(resultado);
    }
}
