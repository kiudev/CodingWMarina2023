import java.util.Scanner;

public class SecondsToHMS {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter seconds:");
        int num = s.nextInt();

        int hour = 0;
        int min = 0;
        int sec = 0;

        if (num != 0) {
            sec = num;
        }
        if ((num / 60) != 0) {
            min = num / 60;
        }
        if ((num / 3600) != 0) {
            hour = num / 3600;
        }
		    System.out.print(hour+" hours : "+min+" minutes : "+sec+" seconds ");
    }
}
