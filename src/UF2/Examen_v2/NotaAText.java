package UF2.Examen_v2;

public class NotaAText {

    //Param. entr: la nota que volem transformar a text
    //Param. sort: la nota transformada en text
    public double notaAText(double nota) {
        //Desenvolupeu el vostre codi aquí
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
        return nota;
    }
}
