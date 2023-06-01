public class MitjanaSuspesosOrdenats {
    public static void main (String[] args) {

        float[] llistaNotes = {5.5f, 9f, 2f, 10f, 4.9f};
        float mitjana = 0;
        float sumaSuspesos = 0;
        float numSuspesos = 0;

        for (int i = 0; i < llistaNotes.length - 1; i++) {
            for (int j = i + 1; j < llistaNotes.length; j++) {
                if (llistaNotes[i] > llistaNotes[j]) {
                  float aux = llistaNotes[i];
                  llistaNotes[i] = llistaNotes[j];
                  llistaNotes[j] = aux;
                }
            }
        }

        System.out.print("L'array ordenat és: [");

        for (int i = 0; i < llistaNotes.length; i++) {
            System.out.print(llistaNotes[i] + " ");
            if ( i == llistaNotes.length - 1) {
                System.out.println("]");
            }
        }

        for (int i = 0; i < llistaNotes.length; i++) {
            if (llistaNotes[i] < 5) {
                sumaSuspesos = sumaSuspesos + llistaNotes[i];
                numSuspesos++;
            }
        }

        if (numSuspesos > 0) {
            mitjana = sumaSuspesos / numSuspesos;
            System.out.println("La nota mitjana dels suspesos és de " + mitjana + ".");
        }
    }
}
