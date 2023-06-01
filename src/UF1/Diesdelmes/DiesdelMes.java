import java.util.Scanner;

public class DiesdelMes {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Te puedo mostrar cuántos días tiene el mes de cualquier año");
        System.out.println("Introduce el número del mes");
        double mes = lector.nextDouble();

        System.out.println("Introduce el año");
        double ano = lector.nextDouble();

        String resultado = "";

        if (mes == 1) {
            resultado = "Tiene 31 días";
        }
        else if (mes == 2) {
            if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
                resultado = "Tiene 29 días";
            }
            else {
                resultado = "Tiene 28 días";
            }
        }
        else if (mes == 3) {
            resultado = "Tiene 31 días";
        }
        else if (mes == 4) {
            resultado = "Tiene 30 días";
        }
        else if (mes == 5) {
            resultado = "Tiene 31 días";
        }
        else if (mes == 6) {
            resultado = "Tiene 30 días";
        }
        else if (mes == 7) {
            resultado = "Tiene 31 días";
        }
        else if (mes == 8) {
            resultado = "Tiene 31 días";
        }
        else if (mes == 9) {
            resultado = "Tiene 30 días";
        }
        else if (mes == 10) {
            resultado = "Tiene 31 días";
        }
        else if (mes == 11) {
            resultado = "Tiene 30 días";
        }
        else if (mes == 12) {
            resultado = "Tiene 31 días";
        }
        else {
            System.out.println("¡¡Error, vuelve a intentarlo!!");
        }

        System.out.println(resultado);
    }
}
