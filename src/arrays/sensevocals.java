import java.util.Scanner;

public class SenseVocals {
    public static void main(String[] args) {

        char[] arrayValors = new char[12];

        Scanner s = new Scanner(System.in);

        char replaceNum = '*';
        char replaceVocal = '$';

        for (int i = 0; i < arrayValors.length; i++) {
            System.out.print("Introduiu un valor qualsevol: ");
            arrayValors[i] = s.next().charAt(0);

            if (Character.isLetter(arrayValors[i])) {
                if (arrayValors[i] == 'a' || arrayValors[i] == 'e'
                || arrayValors[i] == 'i' || arrayValors[i] == 'o' || arrayValors[i] == 'u') {
                    arrayValors[i] = replaceVocal;
                }
            }
            else if (Character.isDigit(arrayValors[i])) {
                    arrayValors[i] = replaceNum;
            }
        }

        System.out.println("Els valors del vector són: ");

        for (int i = 0; i < arrayValors.length; i++) {
            if (i == arrayValors.length - 1) {
                System.out.print(arrayValors[i] + ".");
            }
            else {
                System.out.print(arrayValors[i] + ", ");
            }
        }
    }
}
