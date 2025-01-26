import java.util.Scanner;
public class Lab01_3 {
    public static void main(String[] args) {
        System.out.println("Enter your Money : ");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double m = (money * 0.027);
        System.out.println("The money frome to USD is " + m);
    }
}
