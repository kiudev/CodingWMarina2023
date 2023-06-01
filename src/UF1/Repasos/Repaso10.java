// Elaborar un programa para calcular el sueldo de un trabajador, a partir de las horas trabajadas en la semana y la clase a la que pertenece:

//Trabajadores de clase “A”, se les paga 25 euros por hora.
//Trabajadores de clase “B”, se paga 20 euros por hora.
//Trabajadores de clase “C”, se les paga 15 euros por hora y
//Trabajadores de clase “D”, 10 euros por hora.
//Ingresar el número de horas trabajadas y reportar el sueldo del trabajador.

import java.util.Scanner;

public class Repaso10 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double horasTrabajadas, calculo;
        String clase;

        System.out.println("¿A qué clase perteneces: A, B, C, D?");
        clase = lector.next().toLowerCase();

        System.out.println("¿Cuántas horas has trabajado esta semana?");
        horasTrabajadas = lector.nextDouble();

        calculo = 0;

        switch (clase) {
            case "a":
                System.out.println("La clase A se paga 25 euros la hora.");
                calculo = 25 * horasTrabajadas;
                break;
            case "b":
                System.out.println("La clase B se paga 20 euros la hora.");
                calculo = 20 * horasTrabajadas;
                break;
            case "c":
                System.out.println("La clase C se paga 15 euros la hora.");
                calculo = 15 * horasTrabajadas;
                break;
            case "d":
                System.out.println("La clase D se paga 10 euros la hora.");
                calculo = 10 * horasTrabajadas;
            default:
                System.out.println("¡¡No he entendido nada!!");
        }

        System.out.println("Tu sueldo final es de " + calculo);
    }
}
