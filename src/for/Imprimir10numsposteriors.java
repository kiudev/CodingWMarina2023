import java.util.Scanner;

public class Imprimir10numsposteriors {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Por qué numero quieres empezar?");
        int num = lector.nextInt();

        System.out.println("----------");

        for(int i = 0; i < 11; i++) {
            System.out.println(num);
            num++;
        }
    }
}
