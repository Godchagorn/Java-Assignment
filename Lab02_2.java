import java.util.Scanner;

public class Lab02_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The total number of the classes?");
        double classes = scan.nextDouble();
        System.out.println("How many times the student came late?");
        double late = scan.nextDouble();
        System.out.println("How many times the student was absent?");
        double absent = scan.nextDouble();
        double x = (classes - (late * 0.5) - absent);
        double y = (x / classes) * 100;
        if (y >= 80) {
            System.out.println("-->The student can take the exam");
        } else {
            System.out.println("-->The student cannot take the exam");
        }
    }
}