import java.util.Scanner;
public class Lab08_2_2 {
    public static String checkOddEven(int num) {
        if (num % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("The number is: " + checkOddEven(num));
    }
}
