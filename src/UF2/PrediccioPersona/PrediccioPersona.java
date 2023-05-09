package UF2.PrediccioPersona;

import java.util.Scanner;

public class PrediccioPersona {

    private String nom, equipFutbol, llenguatgeProgramacio, mesNaixement = "";
    private int edat = 0;
    private int numSort = 0;
    public static void main(String[] args) {
        PrediccioPersona programa = new PrediccioPersona();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        tractarDades();
        imprimir();
    }

    public void mostrarMenu() {
        System.out.print("Escriu el mes en què vas nèixer.");
        System.out.print("\n");
        System.out.print("Gener\tFebrer\tMarc\n");
        System.out.print("Abril\tMaig\tJuny\n");
        System.out.print("Juliol\tAgost\tSetembre\n");
        System.out.print("Octubre\tNovembre\tDesembre");
        System.out.print("\n\n");
    }

    public String mesNaixement() {
        Scanner s = new Scanner(System.in);
        String mesNaixement = s.nextLine();
        return mesNaixement;
    }

    public String nomUsuari() {
        Scanner s = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Com et dius?\n");
        String nom = s.nextLine();
        return nom;
    }

    public int edatUsuari() {
        Scanner s = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Per acabar, quants anys tens?\n");
        int edat = s.nextInt();
        return edat;
    }

    public void tractarDades() {
        mesNaixement = mesNaixement();
        nom = nomUsuari();
        edat = edatUsuari();

        switch (mesNaixement) {
            case "Gener", "gener":
                numSort = edat * 3 / 2;
                equipFutbol = "Bayern de Munich";
                llenguatgeProgramacio = "C++";
                break;
            case "Febrer", "febrer":
                numSort = edat - 4;
                equipFutbol = "Atlético de Madrid";
                llenguatgeProgramacio = "Python";
                break;
            case "Marc", "marc":
                numSort = edat / 2;
                equipFutbol = "Chelsea";
                llenguatgeProgramacio = "JavaScript";
                break;
            case "Abril", "abril":
                numSort = edat % 4;
                equipFutbol = "Manchester city";
                llenguatgeProgramacio = "Node.js";
                break;
            case "Maig", "maig":
                numSort = edat * 3 / 6;
                equipFutbol = "Liverpool";
                llenguatgeProgramacio = "React";
                break;
            case "Juny", "juny":
                numSort = edat + edat;
                equipFutbol = "Real Madrid";
                llenguatgeProgramacio = "C#";
                break;
            case "Juliol", "juliol":
                numSort = edat * edat / 5;
                equipFutbol = "BVB";
                llenguatgeProgramacio = "Swift";
                break;
            case "Agost", "agost":
                numSort = edat * 1 / 2 * edat;
                equipFutbol = "FCB";
                llenguatgeProgramacio = "Java";
                break;
            case "Setembre", "setembre":
                numSort = edat / edat;
                equipFutbol = "Juve";
                llenguatgeProgramacio = "PHP";
                break;
            case "Octubre", "octubre":
                numSort = edat * 4 / 3;
                equipFutbol = "PSG";
                llenguatgeProgramacio = "R";
                break;
            case "Novembre", "novembre":
                numSort = edat % 2 + 23;
                equipFutbol = "Sevilla CF";
                llenguatgeProgramacio = "Go";
                break;
            case "Desembre", "desembre":
                numSort = (edat + edat) / 2;
                equipFutbol = "Manchester United";
                llenguatgeProgramacio = "Ruby";
                break;
            default:
                int numSort = 0;
                String equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
                String llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
                System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
                break;
        }
    }

    public void imprimir() {
        System.out.print("------------------------------------------------\n");

        System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");

        System.out.print(">>> El teu número de la sort és el " + numSort + "!");
        System.out.print("\n\n");

        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");

        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");
    }
}


