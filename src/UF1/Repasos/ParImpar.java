import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int num = lector.nextInt();

        String resultado = "";

        if (num % 2 == 0) {
            resultado = "Par";
        }
        else if (num % 2 != 0) {
            resultado = "Impar";
        }
        else {
            resultado = "ERROR";
        }
        System.out.println(resultado);
    }
}
