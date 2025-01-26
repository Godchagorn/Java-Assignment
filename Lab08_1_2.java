import java.util.Scanner;
public class Lab08_1_2 {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero");
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2 = 0;
        System.out.print("Enter number: ");
        num1 = input.nextDouble();
        while (true) {
            System.out.print("Enter a word (add,subtract,multiply,divide,exit): ");
            String funchion = input.next();

            if (!funchion.equals("exit")){
                System.out.print("Enter number: ");
                num2 = input.nextDouble();
            }


            if (funchion.equalsIgnoreCase("exit")){
                break;
            }

            switch (funchion.toLowerCase()){
                case "add":
                    num1 = add(num1, num2);
                    break;
                case "subtract":
                    num1 = subtract(num1, num2);
                    break;
                case "multiply":
                    num1 = multiply(num1, num2);
                    break;
                case "divide":
                    num1 = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid input, prease enter number again");
                    continue;
            }
            System.out.println("Current result: "+num1);
        }
        System.out.println("final result: "+num1);
    }
}
