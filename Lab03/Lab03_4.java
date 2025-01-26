import java.util.Scanner;
public class Lab03_4 {
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = ww.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= n){
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of "+ n + " is " + factorial);
    }
}
