import java.util.Scanner;

public class Lab03_3 {
    public static void main(String[] args) {
        Scanner yy = new Scanner(System.in);

        System.out.println("Enter the number of integers: ");
        int numC = yy.nextInt();

        int sum = 0;
        int count = 0;

        while (count < numC) {
            System.out.println("Enter your number" + (count + 1) + ": ");
            int num = yy.nextInt();
            sum += num;
            count++;
        }

        if (numC % 2 == 0) {
            System.out.println("The total number of integers is even.");
        } else {
            System.out.println("The total number of integers is odd.");
        }

        System.out.println("The summation of number is : " + sum);

        double av = (double) sum / numC;
        System.out.printf("The average of number is: %.2f%n", av);
    }
}

