import java.util.Scanner;
public class LectorSequenciaACT {
  public static void main (String[] args) {
    Scanner lector = new Scanner(System.in);
    //declarem un nombre enter "nombreValors"
    int nombreValors = 0;
    //mentres nombreValors sigui menor o igual a 0 executi el print
    while (nombreValors <= 0) {
      System.out.print("Quantes notes vols introduir? ");
      //ens diu si el valor que s'introdueix es enter
      if (lector.hasNextInt()) {
        nombreValors = lector.nextInt();
      }
      //per a que el programa pugui llegir si no entra un valor enter
      else {
        lector.next();
      }
    }
    //per a que l'usuari pugui introduir quantes notes
    lector.nextLine();
    System.out.println("Es llegiran " + nombreValors + " valors reals.");
    System.out.println("En pots escriure diversos en una sola línia, separats per espais.");
    //declarem un array per poder introduir les notes corresponents
    float[] arrayNotes = new float[nombreValors];
    //declarem un nombre enter "index"
    int index = 0;
    //mentres index sigui menor que la longitud que ens ha donat l'usuari "nombreValors"
    while (index < arrayNotes.length) {
      //ens diu si el valor que s'introdueix es decimal
      if (lector.hasNextFloat()) {
        float nota = lector.nextFloat();
        //si la nota que introdueix l'usuari està en un rang de 0 a 10 farà cada vegada el bucle
        if ((nota >= 0)&&(nota <= 10)) {
          arrayNotes[index] = nota;
          index++;
        }
      }
      else {
        lector.next();
      }
    }
    lector.nextLine();
    System.out.println("La seqüència llegida és:");
    //les notes introduïdes per l'usuari es llegiran
    for (int i = 0; i < arrayNotes.length;i++) {
      System.out.println(arrayNotes[i]);
    }
  }
}
