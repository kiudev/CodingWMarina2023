package UF3.Fitxers;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class GenerarFitxerNotes {
    public static final String MARCA_FI = "fi";
    public static void main (String[] args) {
        GenerarFitxerNotes programa = new GenerarFitxerNotes();
        programa.inici();
    }
    public void inici() {
        try {
            File f = new File("C:\\Users\\Daniel\\Desktop\\M3\\CodingWMarina2023\\src\\UF3\\Fitxers\\Notes.txt");
            PrintStream ps = new PrintStream("C:\\Users\\Daniel\\Desktop\\M3\\CodingWMarina2023\\src\\UF3\\Fitxers\\NotaMitja.txt");

            Scanner lector = new Scanner(f);
            boolean llegir = true;
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                }
                else {
                    String cognom = lector.next();
                    ps.print("Estudiant: " + nom + " " + cognom);

                    double mitjana = llegirNotes(lector);
                    ps.println(" − Mitjana: " + mitjana + " -1");

                }
            }
            lector.close();
        }
        catch(Exception e) {
            System.out.println("Error llegint estudiants: " + e);
        }
    }

    public double llegirNotes(Scanner lector) {
        double res = 0;
        try {
            int numNotes = lector.nextInt();
            for (int i = 0; i < numNotes; i++) {
                res = res + lector.nextDouble();
            }
            res = res/numNotes;
        }
        catch (Exception e) {
            System.out.println("Error llegint notes: " + e);
        }
        return res;
    }
}
