import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Suma, resta, multiplicación, division o módulo");
        String operacion = lector.nextLine();

        System.out.println("Introduce el primer número");
        double num1 = lector.nextDouble();

        System.out.println("Ahora el segundo número");
        double num2 = lector.nextDouble();

        double suma, resta, multiplicacion, division, modulo;

        String resultado = "";

        if (operacion.equals("suma")) {
            suma = num1 + num2;
            resultado = "La suma de los 2 número es de " + suma;
        }

        System.out.println(resultado);
    }
}
