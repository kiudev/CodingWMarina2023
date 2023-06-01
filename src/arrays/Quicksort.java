package Primer.UF1;

public class Quicksort  {

    public static void main(String[] args)
    {
        Quicksort qs = new Quicksort();

        int numerosAOrdenar[] = {3,5,1,34,22,1,67,32,78,5};

        qs.quickSort(numerosAOrdenar, 0, numerosAOrdenar.length-1);

        for(int i=0; i<numerosAOrdenar.length;i++)
        {
            System.out.print(numerosAOrdenar[i]+", ");
        }

    }


    private void quickSort(int numerosAOrdenar[], int izq, int der)
    {
        int pivote = numerosAOrdenar[izq];
        int i=izq;
        int j=der;
        int auxiliar;

        while(i < j)
        {
            while(numerosAOrdenar[i] <= pivote && i < j) i++;
            while(numerosAOrdenar[j] > pivote) j--;
            if (i < j)
            {
                auxiliar = numerosAOrdenar[i];
                numerosAOrdenar[i] = numerosAOrdenar[j];
                numerosAOrdenar[j] = auxiliar;
            }
        }

        numerosAOrdenar[izq] = numerosAOrdenar[j];
        numerosAOrdenar[j] = pivote;

        if(izq < j-1)
        {
            quickSort(numerosAOrdenar,izq,j-1);
        }
        if(j+1 < der)
        {
            quickSort(numerosAOrdenar,j+1,der);
        }
    }

}
