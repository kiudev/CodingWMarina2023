import java.util.Scanner;

public class NombreMes {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        int mes = 0;

        do {
            String resultado = "";
            System.out.println("¿Qué número del mes quieres comprobar?");
            mes = lector.nextInt();
            if (mes == 1) {
                resultado = "El mes " + mes + " equivale a Enero";
            }
            else if (mes == 2) {
                resultado = "El mes " + mes + " equivale a Febrero";
            }
            else if (mes == 3) {
                resultado = "El mes " + mes + " equivale a Marzo";
            }
            else if (mes == 4) {
                resultado = "El mes " + mes + " equivale a Abril";
            }
            else if (mes == 5) {
                resultado = "El mes " + mes + " equivale a Mayo";
            }
            else if (mes == 6) {
                resultado = "El mes " + mes + " equivale a Junio";
            }
            else if (mes == 7) {
                resultado = "El mes " + mes + " equivale a Julio";
            }
            else if (mes == 8) {
                resultado = "El mes " + mes + " equivale a Agosto";
            }
            else if (mes == 9) {
                resultado = "El mes " + mes + " equivale a Septiembre";
            }
            else if (mes == 10) {
                resultado = "El mes " + mes + " equivale a Octubre";
            }
            else if (mes == 11) {
                resultado = "El mes " + mes + " equivale a Noviembre";
            }
            else if (mes == 12) {
                resultado = "El mes " + mes + " equivale a Diciembre";
            }
            else {
                resultado = "¡¡El mes no existe!!";
            }

            System.out.println(resultado);
        }
        while (mes >= 1 && mes <= 12);
    }
}
