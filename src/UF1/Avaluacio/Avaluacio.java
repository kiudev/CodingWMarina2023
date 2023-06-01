import java.util.Scanner;

public class Avaluacio {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
              
        System.out.println("Introduce la nota");
        double nota = lector.nextDouble();

        String resultadofinal = "";

        if (nota >= 9 && nota <= 10) {
            resultadofinal = "Excelente";
        }else if (nota >= 6.5 && nota < 9) {
            resultadofinal = "Notable";
        }else if (nota >= 5 && nota < 6.5) {
            resultadofinal = "Aprobado";
        }else if (nota >= 0 && nota < 5) {
            resultadofinal = "Suspenso";
        }else {
            nota = -1;
        }

        if (nota == -1) {
            System.out.println("La nota que has puesto no es correcta");
        } else {
            System.out.println("La nota es " + resultadofinal);
        }
    }
}