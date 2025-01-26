import java.util.Scanner;
public class Lab08_2_1 {
    public static int labMethodQ1(int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        } else {
            return x + y;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1: ");
        int x = input.nextInt();
        System.out.print("Enter integer 2: ");
        int y = input.nextInt();
        System.out.println("Summation result: " + labMethodQ1(x, y));
    }
}
