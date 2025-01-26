import java.util.Scanner;

public class Lab08_1_1 {
    public static int power(int x) {
        return (int) Math.pow(2, x);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        double resultPower = power(number);

        System.out.println("Resuit of 2 power of "+number+" is "+resultPower);
    }

}