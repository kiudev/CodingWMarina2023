// Escriba programa para ingresar 4 notas de un alumno, calcular y mostrar su promedio, sabiendo que la 1ra y 2sa tiene 20% de peso cada una, la 3ra y 4ta tienen 30% de peso cada una.

import java.util.Scanner;

public class Repaso15 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double nota1 = lector.nextDouble();
        double nota2 = lector.nextDouble();
        double nota3 = lector.nextDouble();
        double nota4 = lector.nextDouble();

        double promedio = nota1 * 0.2 + nota2 * 0.2 + nota3 * 0.3 + nota4 * 0.3;

        System.out.println("El promedio es " + promedio);
    }
}
