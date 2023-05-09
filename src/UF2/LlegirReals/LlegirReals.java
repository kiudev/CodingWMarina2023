package UF2.LlegirReals;

import java.util.Scanner;

public class LlegirReals {
    public static void main(String[] args) {
        LlegirReals programa = new LlegirReals();
        programa.inici();
    }

    public void inici() {
        System.out.println("Llegiu un valor real pel teclat:");
        double num = llegirRealsTeclat();
        System.out.println("El valor real ha sigut " + num + ".");
        System.out.println("Llegiu un altre valor igual:");
        num = llegirRealsTeclat();
        System.out.println("L'altre valor real ha sigut " + num + ".");
    }

    public double llegirRealsTeclat() {
        Scanner s = new Scanner(System.in);
        double realLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = s.hasNextDouble();
            if (llegit) {
                realLlegit = s.nextDouble();
            }
            else {
                System.out.println("El nombre llegit no és un valor real.");
                s.next();
            }
        }
        s.nextLine();
        return realLlegit;
    }
}
