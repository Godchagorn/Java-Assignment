import java.util.Scanner;
public class Lab03_5 {
    public static void main(String[] args) {
        Scanner qq = new Scanner(System.in);

        System.out.println("Enter the index of the Fibonacci number");
        int num = qq.nextInt();

        long a = 0, b = 1, c = 0;

        int count = 2;

        while (count <= num){
            c = a + b;
            a = b;
            b = c;
            count++;
        }

        c = num == 0 ? a : b;

        System.out.println("The Fibonacci number at index " + num + " is " + c );

    }
    }
