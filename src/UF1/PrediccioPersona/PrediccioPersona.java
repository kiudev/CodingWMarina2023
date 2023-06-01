import java.util.Scanner;

public class PrediccioPersona {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escribe el mes en el que has nacido");
        System.out.println("Enero\tFebrero\tMarzo\nAbril\tMayo\tJunio\nJulio\tAgosto\tSeptiembre\nOctubre\tNoviembre\tDiciembre\n");
        String mes = lector.nextLine();
        
        System.out.println("\n¿Cómo te llamas?");
        String nombre = lector.nextLine();

        System.out.println("\n¿Cuál es tu edad?");
        double edad = lector.nextDouble();

        if ("Enero".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Febrero".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Marzo".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Abril".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Mayo".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Junio".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Julio".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Agosto".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Septiembre".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Octubre".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Noviembre".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else if ("Diciembre".equalsIgnoreCase(mes)) {
            System.out.println("\n");
        }else {
            System.out.println("\n¡¡¡No he entendido lo que me has dicho!!!\n");
        }

        switch (mes) {
            case "Enero", "enero":
                double numero1 = edad * 3 / 2;
                String club1 = "Bayern";
                String lenguaje1 = "C++";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero1 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club1 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje1 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Febrero", "febrero":
                double numero2 = edad - 4;
                String club2 = "Atlético de Madrid";
                String lenguaje2 = "Python";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero2 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club2 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje2 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Marzo", "marzo":
                double numero3 = edad / 2;
                String club3 = "Chelsea";
                String lenguaje3 = "JavaScript";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero3 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club3 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje3 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Abril", "abril":
                double numero4 = edad % 4 ;
                String club4 = "Manchester City";
                String lenguaje4 = "Node.js";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero4 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club4 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje4 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Mayo", "mayo":
                double numero5 = edad * 3 / 6;
                String club5 = "Liverpool";
                String lenguaje5 = "React";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero5 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club5 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje5 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Junio", "junio":
                double numero6 = edad + edad;
                String club6 = "Real Madrid";
                String lenguaje6 = "C#";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero6 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club6 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje6 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Julio", "julio":
                double numero7 = edad * edad / 5;
                String club7 = "Borussia Dortmund";
                String lenguaje7 = "Swift";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero7 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club7 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje7 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Agosto", "agosto":
                double numero8 = edad * 0.5 * edad;
                String club8 = "Barça";
                String lenguaje8 = "Java";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero8 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club8 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje8 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Septiembre", "septiembre":
                double numero9 = edad / edad;
                String club9 = "Juventus";
                String lenguaje9 = "PHP";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero9 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club9 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje9 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Octubre", "octubre":
                double numero10 = edad * 4 / 3;
                String club10 = "PSG";
                String lenguaje10 = "R";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero10 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club10 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje10 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Noviembre", "noviembre":
                double numero11 = edad % 2 + 23;
                String club11 = "Sevilla";
                String lenguaje11 = "Go";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero11 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club11 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje11 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            case "Diciembre", "diciembre":
                double numero12 = (edad + edad) / 2;
                String club12 = "Manchester United";
                String lenguaje12 = "Ruby";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero12 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club12 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje12 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
            default:
                double numero13 = 0;
                String club13 = "no tengo equipo de fútbol porque me he equivocado escribiendo mi mes de aniversario";
                String lenguaje13 = "no tengo lenguaje de programación preferido porque me he equivocado escribiendo mi mes de aniversario";
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Un placer conocerte " + nombre + ". Con los datos que me has dado, ya sé varias cosas sobre ti... \n\n");
                System.out.println(">>> ¡Tu número de la suerte es " + numero13 + "!\n");
                System.out.println(">>> Tu equipo favorito, aunque no lo digas en voz alta, es el " + club13 + ".\n");
                System.out.println(">>> ¡Y tu lenguaje de programación más querido será " + lenguaje13 + "!\n");
                System.out.println("¡Vuelve cuando quieras!");
                System.out.println("--------------------------------------------------------------------------------------");
            break;
        }
    }
}