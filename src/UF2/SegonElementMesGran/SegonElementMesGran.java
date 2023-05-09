package UF2.SegonElementMesGran;

public class SegonElementMesGran {

    int[] vector = {10789,2035,1899,1456,2013};

    int max1 = 0;
    int max2 = 0;

    public static void main(String[] args) {
        SegonElementMesGran programa = new SegonElementMesGran();
        programa.inici();
    }
    public void inici() {
        buscaElement();
    }

    public void buscaElement() {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max1) {
                max1 = vector[i];
            }
            else if (vector[i] > max2) {
                max2 = vector[i];
            }
        }
        System.out.println("El segon valor més gran del vector és: " + max2);
    }
}
