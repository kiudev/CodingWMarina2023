import java.util.Scanner;

public class DiaSetmana {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el número del día de la semana");
        double numero = lector.nextDouble();

        String dia = "";

        if (numero >= 1 && numero <= 7) {

            if (numero == 1) {
                dia = "Lunes";
            }
            else if (numero == 2) {
                dia = "Martes";
            }
            else if (numero == 3) {
                dia = "Miércoles";
            }
            else if (numero == 4) {
                dia = "Jueves";
            }
            else if (numero == 5) {
                dia = "Viernes";
            }
            else if (numero == 6) {
                dia = "Sábado";
            }
            else if (numero == 7) {
                dia = "Domingo";
            }
        }
        else {
            System.out.println("¡¡Error, vuelve a intentarlo!!");
        }

        System.out.println(dia);
    }
}
