import java.util.Scanner;
public class Lab01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Celsius : ");
        double ctemp = sc.nextDouble();
        double f = (9.0 / 5.0) * ctemp + 32;
        System.out.println("Enter your Fahrenheit : ");
        double ftemp = sc.nextDouble();
        double c = (5.0 / 9.0) * (ftemp - 32);
        System.out.println("The Celsius to Fahrenheit is " + f);
        System.out.println("The Fahrenheit to Celsius is " + c);
    }
}
