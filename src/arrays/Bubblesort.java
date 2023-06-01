//Un programa per ordenar valors usant l’algorisme de la bombolla.  --> bubblesort
public class BubbleSort {
  public static void main (String[] args) {
    float[] llistaNotes = {5.5f, 9f, 2f, 10f, 4.9f};
    //double[] llistatNotes = {5.5, 9, 2, 10, 4.9};
    //Bucle extern.
    //S’anirà posant a cada posicó tractada, començant per la 0,
    //el valor més baix que es trobi.
    for (int i = 0; i < llistaNotes.length - 1; i++) {
      //Bucle intern.
      //Se cerca entre la resta de posicions quin és el valor m s baix.
      for(int j = i + 1; j < llistaNotes.length; j++) {
        //La posició tractada té un valor més alt que el de la cerca. Els intercanviem.
        if (llistaNotes[i] > llistaNotes[j]) {
          //Per intercanviar valors cal una variable auxiliar. --> aux
          System.out.print("He entrat a l'IF \n");
          System.out.print("Comparo pos i " + llistaNotes[i] + " amb pos j " + llistaNotes[j] + "\n");

          float aux = llistaNotes[i];
          llistaNotes[i] = llistaNotes[j];
          llistaNotes[j] = aux;
        }
      }
    }
    //El mostrem per pantalla.
    System.out.print("L’array ordenat  s: [");
    for (int i = 0; i < llistaNotes.length;i++) {
      System.out.print(llistaNotes[i] + " ");
    }
    System.out.println("]");
  }
}
