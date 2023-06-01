import java.util.Scanner;

public class LectorSequencia2ACT {

  public static void main (String[] args) {
    //declarem dos nombres enters "MAX_VALORS" i "MARCA_FI"
    int MAX_VALORS = 80;
    int MARCA_FI = -1;
    //declarem un array per poder introduir les notes corresponents
    float[] arrayNotes = new float[MAX_VALORS];
    //declarem un nombre enter "elements"
    int elements = 0;
    Scanner lector = new Scanner(System.in);
    System.out.print("Escriure fins a " + MAX_VALORS + " valors.");
    System.out.println("En pots escriure diversos en una sola línia, separatsper espais.");
    System.out.println("(Per acabar, escriu un" + MARCA_FI + ")");
    //mentres elements sigui menor que la longitud de arrayNotes
    while (elements < arrayNotes.length) {
      //ens diu si el valor que s'introdueix és decimal
      if (lector.hasNextFloat()) {
      float nota = lector.nextFloat();
        //si la nota que introdueix l'usuari està en un rang de 0 a 10 farà cada vegada el bucle
        if ((nota >= 0)&&(nota <= 10)) {
          arrayNotes[elements] = nota;
          elements++;
        }
        //si nota introduïda és igual a "MARCA_FI" el programa acaba
        else if (nota == MARCA_FI) {
          break;
        }
      }
      else {
        lector.next();
      }
    }
    lector.nextLine();
    System.out.println("La seqüència llegida és:");
    //les notes introduïdes per l'usuari es llegiran
    for (int i = 0; i < elements;i++) {
      System.out.println(arrayNotes[i]);
    }
  }
}
