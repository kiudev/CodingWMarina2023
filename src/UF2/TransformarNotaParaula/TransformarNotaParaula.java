package UF2.TransformarNotaParaula;

import java.util.Scanner;

public class TransformarNotaParaula {

    Scanner s = new Scanner(System.in);

    double nota = 0;

    public static void main(String[] args) {
        TransformarNotaParaula programa = new TransformarNotaParaula();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        notaParaula();
    }

    public void mostrarMenu() {
        System.out.println("Introdueix la teva nota per consultar si és (Excel·lent, Notable, Aprovat o Suspès)");
        nota = s.nextDouble();
    }

    public void notaParaula() {
        if (nota >= 9 && nota <= 10) {
            System.out.println("Excel·lent");
        }
        else if (nota >= 6.5 && nota <= 8.9) {
            System.out.println("Notable");
        }
        else if (nota >= 5 && nota <= 6.49) {
            System.out.println("Aprovat");
        }
        else if (nota >= 0 && nota <= 4.9) {
            System.out.println("Suspès");
        }
        else {
            System.out.println("Nota no vàlida!");
        }
    }
}
