import java.util.Scanner;
public class Lab05_3 {
    public static void main(String[] args) {
        Scanner bb = new Scanner(System.in);
        System.out.println("Enter number");
        int number = bb.nextInt();
        for (int i = 1; i < 13; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}