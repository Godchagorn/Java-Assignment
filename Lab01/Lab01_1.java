import java.util.Scanner;
public class Lab01_1 {
    public static void main(String[] args) {
        System.out.println("Enter the radius : ");
        Scanner scanner = new Scanner(System.in);
        double radius;
        radius = scanner.nextDouble();
        double area = 3.1416 * radius * radius;
        double circumference = 2 * 3.1416 * radius;
        System.out.println("The area of this circle is " + area);
        System.out.println("The circumference is " + circumference);
    }
}
