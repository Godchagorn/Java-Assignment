import java.util.Scanner;
public class   Lab06_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] Array1 = new double[15];
        double[] Array2 = new double[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Enter #" + (i + 1) + " double: ");
            Array1[i] = input.nextDouble();
        }
        int index = -1;
        double x = 0;
        System.out.print("Enter your index: ");
        index = input.nextInt();
        System.out.print("Enter your number: ");
        x = input.nextInt();
        Array2 = Array1;
        Array2[index] = x;
        for (int i = 0; i < 15; i++) {
            System.out.print(Array1[i] + " ");
        }
        for (int i = 0; i < 15; i++) {
            System.out.print(Array2[i] + " ");
        }
    }
}

