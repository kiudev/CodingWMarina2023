import java.util.Scanner;

public class Cubo {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres ver al cubo?");
        int num = lector.nextInt();

        int i = 1;
        int resultado = 0;

        while (i <= num) {
            resultado = i * i * i;
            System.out.println("Cubo de " + i + " es " + resultado);
            i++;
        }
    }
}
