import java.util.Scanner;
public class Lab01_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Where are you now? : ");
        sc.next();

        System.out.println("Where are you going? : ");
        sc.next();

        System.out.println("Break time? : ");
        double bt = sc.nextDouble();

        System.out.println("distance : ");
        double s = sc.nextDouble();

        System.out.println("speed : ");
        double v = sc.nextDouble();
        double time = (s/v);
        double t = time+bt;

                System.out.println("Time is " +t);
    }
}
