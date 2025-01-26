import java.awt.*;
import java.util.Scanner;
public class Lab02_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The course credits for Math?");
        int cm = scan.nextInt();
        System.out.println("The course credits for Social Science?");
        int cs = scan.nextInt();
        System.out.println("The grades for Math?");
        String gm = scan.next();
        System.out.println("The grades for Social Science?");
        String gs = scan.next();
        double Math = 0, Social = 0;

        if (gm.equals("A")) {
            Math = 4.0;
        } else if (gm.equals("B")) {
            Math = 3.0;
        } else if (gm.equals("C")) {
            Math = 2.0;
        } else if (gm.equals("D")) {
            Math = 1.0;
        } else if (gm.equals("F")) {
            Math = 0.0;
        }

        if (gs.equals("A")) {
            Social = 4.0;
          } else if (gs.equals("B")) {
            Social = 3.0;
        } else if (gs.equals("C")) {
            Social = 2.0;
        } else if (gs.equals("D")) {
            Social = 1.0;
        } else if (gs.equals("F")) {
            Social = 0.0;
        }

        System.out.println("Your GPA is : " + ((Math * cm) + (Social * cs)) / (cm + cs));
    }
}


