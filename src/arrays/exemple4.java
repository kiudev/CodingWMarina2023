import java.util.Scanner;

public class exemple4 {
    public static void main(String[] args) {

        int[] arrayEnters = new int[5];
        System.out.println("Escriu 5 nombres enters");

        Scanner s = new Scanner(System.in);

        int j = 0;

        while (j < arrayEnters.length) {
            int num = s.nextInt();
            arrayEnters[j] = num;
            System.out.println("Estic escrivint: " + arrayEnters[j] + " i hauria d'escriure " + num);
            ++j;
        }

        for (int i = 0; i < arrayEnters.length; ++i) {
            System.out.println(arrayEnters[i]);
        }
    }
}
