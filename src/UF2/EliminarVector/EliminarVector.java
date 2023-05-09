package UF2.EliminarVector;

import java.util.Arrays;
import java.util.Random;

public class EliminarVector {

    int[] vector = {25,14,56,15,36};

    Random rand = new Random();
    int eliminar = rand.nextInt(vector.length);

    public static void main(String[] args) {
        EliminarVector programa = new EliminarVector();
        programa.inici();
    }

    public void inici() {
        System.out.println("El vector és el següent: " + Arrays.toString(vector));
        System.out.println("----------------------------------------------------");
        int[] resultat = eliminaVector();
        System.out.println("La posició eliminada és " + eliminar + " i el vector queda així: " + Arrays.toString(resultat));
    }

    public int[] eliminaVector() {
        int num = 0;

        for (int i = 0; i < vector.length; i++) {
            if (i != eliminar) {
                vector[num++] = vector[i];
            }
        }

        int[] resultat = Arrays.copyOf(vector, num);
        return resultat;
    }
}
