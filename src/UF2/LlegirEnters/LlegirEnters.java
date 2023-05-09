package UF2.LlegirEnters;
import java.util.Scanner;

public class LlegirEnters {
    public static void main (String[] args) {
        LlegirEnters programa = new LlegirEnters();
        programa.inici();
    }
    public void inici() {
        System.out.println("Llegiu un enter pel teclat:");
        int a = llegirEnterTeclat();
        System.out.println("L’enter ha estat " + a + ".");
        System.out.println("Llegiu un altre enter pel teclat:");
        a = llegirEnterTeclat();
        System.out.println("L’altre enter ha estat " + a + ".");
    }
    //1. Quin tipus de valor genera? Un enter (int)
    public int llegirEnterTeclat() {
        //2. Es fa el codi que llegeix un únic enter del teclat, com s’ha fet sempre
        //No canvia absolutament res...
        Scanner lector = new Scanner(System.in);
        int enterLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextInt();
            if (llegit) {
                enterLlegit = lector.nextInt();
            }
            else {
                System.out.println("Això no és un enter.");
                lector.next();
            }
        }
        lector.nextLine();
        //3. Un cop fet, quina variable t  el resultat? "enterLlegit"
        //4. Cal fer "return" damunt seu
        return enterLlegit;
    }
}
