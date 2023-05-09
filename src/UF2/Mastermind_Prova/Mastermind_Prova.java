package UF2.Mastermind_Prova;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

//Un programa per jugar al MasterMind.
public class Mastermind_Prova {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final int LONG_SECRET = 3;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String secret = "dani";
    public static String resposta = "";

    //Mètodes associats al problema general
    public static void main(String[] args) {
        //desenvolupeu el codi d'aquesta funció
        Mastermind_Prova prog = new Mastermind_Prova();
        prog.inici();
    }


    public void inici() {
        //desenvolupeu el codi d'aquesta funció
        boolean fi = false;
        generarParaulaSecreta();
        while (!fi) {
            preguntarResposta();
            fi = resoldreResposta(secret, resposta);
        }
    }


    //Mètodes associats al primer nivell de descomposició
    //Param. entrada: -
    //Param. sortida: string res (paraula secreta)
    public String generarParaulaSecreta() {
        String res = "";
        for (int i = 0; i < LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    //Param. entrada: cap, tot s’obté del teclat
    // Param. sortida: la paraula de resposta (un String)
    public String preguntarResposta() {
        //desenvolupeu el codi d'aquesta funció
        Scanner s = new Scanner(System.in);
        System.out.println("Endevina la paraula secreta");
        resposta = s.nextLine();
        comprovarResposta(resposta);
        return resposta;
    }

    //Param. entrada: string secret, string resposta
    //Param. sortida: boolean fi (indica si es cert o fals)
    public boolean resoldreResposta(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "]. ");
        if (resposta.equals(secret)){
            System.out.println("Has encertat!");
            fi = true;
        } else {
            System.out.println("Continua intentant−ho!");
        }
        return fi;
    }

    //Mètodes associats al segon nivell de descomposició
    //Param. entrada: -
    //Param. sortida: genera lletra de la solució (char)
    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        return abc.charAt(index);
    }

    //Param. entrada: string resposta
    //Param. sortida: retorna true o false
    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != LONG_SECRET) {
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == abc.indexOf(c)){
                return false;
            }
        }
        return true;
    }

    //Param. entrada: string s, string r
    //Param. sortida: string res
    public String generarPista(String s, String r) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res = res + TOT_CORRECTE;
            }
            else if (s.indexOf(charResposta) != - 1){
                res = res + MALA_POSICIO;
            }
            else {
                res = res + INCORRECTE;
            }
        }
        return res;
    }
}