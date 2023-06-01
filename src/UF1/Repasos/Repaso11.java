// Hacer un programa para ingresar la edad y el sexo de una persona y reportar si es hombre o mujer mayor o menor de edad.

import java.util.Scanner;

public class Repaso11 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Eres hombre o mujer?");
        String sexo = lector.next().toLowerCase();

        System.out.println("¿Qué edad tienes?");
        int edad = lector.nextInt();

        String resultado = "";

        if (edad < 18 && sexo.equals("mujer")) {
            resultado = "Eres una mujer menor de edad";
        }
        else if (edad > 18 && sexo.equals("mujer")) {
            resultado = "Eres una mujer mayor de edad";
        }
        else if (edad < 18 && sexo.equals("hombre")) {
            resultado = "Eres un hombre menor de edad";
        }
        else if (edad > 18 && sexo.equals("hombre")) {
            resultado = "Eres un hombre mayor de edad";
        }
        else {
            resultado = "¡¡No he entendido lo que has puesto!!";
        }

        System.out.println(resultado);
    }
}
