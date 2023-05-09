package UF2.Examen_v2;

import java.util.Scanner;

public class Examen2 {

    public static double[] array = new double[5];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 10;
    public double min = 0;
    public double mit = 0;


    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();


    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici(){
        //Desenvolupeu el vostre codi aquí
        PreguntarNotes();
        while (!fi) {
            ImprimirArrayNotes(array);
            MostrarMenu();
            TractarOpcio(array);
        }
    }

    //Param. entr:no en té
    //Param. sort:no en té
    //FUNCIÓ: llegir les notes
    private void PreguntarNotes() {
        //OPCIÓ 1 --> Les dades les definim DIRECTAMENT al programa
        //Desenvolupeu el vostre codi aquí
        Scanner s = new Scanner(System.in);

        System.out.println("Afegeix les notes dels alumnes");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextDouble();
            if (array[i] >= min && array[i] <= max) {
                fi = false;
            }
            else {
                System.out.println("Ha de ser una nota del 0 i 10!!");
                fi = true;
                break;
            }
        }

        // -----------------------

        //OPCIÓ 2 --> PUNTUACIÓ EXTRA (1p+). Agafem les dades de terminal
        //Comenceu per l'opció 1!!
        //System.out.println("\nAbans de començar, escriu tantes notes ENTERES com vulguis.");
        //System.out.println("\nQuan hagis acabat d'escriure les notes, escriu un -1.");
        //System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr: double[] array
    //Param. sort: no té
    //FUNCIÓ: imprimir l'array de les notes just després que les haguem llegit
    private void ImprimirArrayNotes(double[] array) {
        //Desenvolupeu el vostre codi aquí
        System.out.println(".....................................");
        System.out.println("Aquestes són les notes que has introduït: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + ".");
    }

    //Param. entr: no té
    //Param. sort: no té
    public void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //Param. entr: double[] array
    //Param. sort: no té
    //FUNCIÓ: tractar cadascuna de les opcions que l'usuari pot triar
    private void TractarOpcio(double[] array) {
        //Desenvolupeu el vostre codi aquí
        Scanner s = new Scanner(System.in);
        String opcio = s.nextLine().toLowerCase();

        double max = calculador.calcularMaxim(array);
        double min = calculador.calcularMinim(array);
        double mit = calculador.calcularMitjana(array);

        switch (opcio) {
            case "max":
                System.out.println("La nota máxima de classe és: " + max);
                break;
            case "min":
                System.out.println("La nota minima de classe és: " + min);
                break;
            case "mit":
                System.out.println("La nota mitjana de classe és: " + mit);
                break;
            case "fi":
                System.out.println("El programa ha terminat. Fins aviat!");
                fi = true;
                break;
            default:
                System.out.println("Opció incorrecta");
        }
    }

    //Param. entr: la nota que volem transformar en text
    //Param. sort: la nota JA transformada en text i si modificar la variable per saber si algú ha tret un 8.
    //FUNCIÓ: Cridem la funció que ens transforma en text la notra nota.
    private String PrepararSortida(double valor) {
        //Desenvolupeu el vostre codi aquí
        double nota = 0;
        String text = String.valueOf(transformar.notaAText(nota));
        return text;
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: buscar si algú ha tret un 8 utilitzant una funció ja creada
    /*private boolean MirarSiAlgu8() {
        //Desenvolupeu el vostre codi aquí
    }*/

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: imprimir el resultat de l'opció que l'usuari ha triat.
    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }
        System.out.print("El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    }

}
