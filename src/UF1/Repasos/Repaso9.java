// La asignación familiar por hijo de un trabajador es la siguiente:
//Si no tiene hijos no le corresponde asignación familiar
//Si tiene un hijo le corresponde 50 soles
//Si tiene dos hijos le corresponde 75 soles por sus dos hijos
//Y si tiene más de dos hijos le corresponde 100 soles
//Ingresar el número de hijos y reportar la asignación familiar del trabajador.

import java.util.Scanner;
public class Repaso9 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int numHijos, asignacion;

        System.out.println("¿Cuántos hijos tienes?");
        numHijos = lector.nextInt();

        String resultado = "";

        switch (numHijos) {
            case 0:
                asignacion = 0;
                resultado = "Tu asignación familiar es de " + asignacion + ".";
                break;
            case 1:
                asignacion = 50;
                resultado = "Tu asignación familiar es de " + asignacion + ".";
                break;
            case 2:
                asignacion = 75;
                resultado = "Tu asignación familiar es de " + asignacion + ".";
                break;
            case 3, 4, 5, 6, 7, 8, 9, 10:
                asignacion = 100;
                resultado = "Tu asignación familiar es de " + asignacion + ".";
                break;
            default:
                resultado = "¡¡Número de hijos incorrecto!!";
        }

        System.out.println(resultado);
    }
}
