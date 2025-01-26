import java.util.Scanner;
public class Lab04_1 {
    public static void main(String[]args) {
        Scanner op = new Scanner(System.in);
        int sumE = 0;
        int sumO = 0;

        int x = 0;

        while (true) {
            System.out.println("Enter an integer or 'Z': ");
            String input = op.next();
            if (input.equalsIgnoreCase("Z")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                if (num % 2 == 0) {
                    sumE += num;
                } else {
                    x = sumO += num;
                }
            } catch
            (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        System.out.println("Sum of even numbers: " + sumE);
        System.out.println("Sum of odd numbers: " + x);

    }
        }