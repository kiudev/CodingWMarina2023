import java.util.Scanner;

public class Repaso13 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String sexo, resultado;

        sexo = lector.nextLine();

        int edad = lector.nextInt();

        if (sexo.equals("f")) {
            resultado = "Ella sólo trabajará en áreas úrbanas";
        }
        else if (sexo.equals("m") && edad >= 20 && edad <= 40) {
            resultado = "Él puede trabajar donde quiera";
        }
        else if (sexo.equals("m") && edad >= 40 && edad <= 60) {
            resultado = "Él trabajará sólo en áreas urbanas";
        }
        else {
            resultado = "ERROR";
        }

        System.out.println(resultado);
    }
}
