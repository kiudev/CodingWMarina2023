import java.util.Scanner;

public class SwitchMes {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Qué número del mes quieres ver? (1-12)");
        int mes = lector.nextInt();

        System.out.println("Los días de este mes son...");

        switch (mes) {
            case 1:
                System.out.println("¡31!");
            break;
            case 2:
                System.out.println("¡28 o 29!");
            break;
            case 3:
                System.out.println("¡31!");
            break;
            case 4:
                System.out.println("¡30!");
            break;
            case 5:
                System.out.println("¡31!");
            break;
            case 6:
                System.out.println("¡30!");
            break;
            case 7:
                System.out.println("¡31!");
            break;
            case 8:
                System.out.println("¡31!");
            break;
            case 9:
                System.out.println("¡30!");
            break;
            case 10:
                System.out.println("¡31!");
            break;
            case 11:
                System.out.println("¡30!");
            break;
            case 12:
                System.out.println("¡31!");
            break;
            default:
                System.out.println("¡Este mes no existe!");
            break;
        }
    }
}
