import java.util.Scanner;

public class Lab07_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        String[] name = new String[number];
        double[][] heightsWeights = new double[number][2];

        for (int i = 0; i < number; i++) {
            System.out.print("Name: ");
            name[i] = input.next();
            System.out.print("Height: ");
            heightsWeights[i][0] = input.nextDouble();
            System.out.print("Weight: ");
            heightsWeights[i][1] = input.nextDouble();
            input.nextLine();
        }

        System.out.printf("%-20s %-15s %-15s%n", "Name", "Height(cm)", "Weight(kg)");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-20s %-15.2f %-15.2f%n", name[i], heightsWeights[i][0], heightsWeights[i][1]);
        }
    }
}
