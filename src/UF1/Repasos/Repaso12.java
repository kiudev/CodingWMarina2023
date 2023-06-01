// A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade
//Sólo 1 print
import java.util.Scanner;
public class Repaso12 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int num = lector.nextInt();

        char nota = '_';

        if (num >= 0 && num < 25) {
            nota = 'F';
        }
        else if (num >= 25 && num < 45) {
            nota = 'E';
        }
        else if (num >= 45 && num < 50) {
            nota = 'D';
        }
        else if (num >= 50 && num < 60) {
            nota = 'C';
        }
        else if (num >= 60 && num < 80) {
            nota = 'B';
        }
        else if (num >= 80) {
            nota = 'A';
        }
        
        System.out.println(nota);
    }
}
