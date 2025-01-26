import java.util.Scanner;
public class Lab05_2 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = aa.nextInt();
        String prime = "";
        String even = "";
        int max = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            int x = aa.nextInt();

            if (x % 2 == 0) {
                even = even + x + " ";
            }

            if (x == 2 || x == 3 || x == 5) {
                prime = prime + x + " ";
            } else if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0) {
                System.out.println(" ");
            } else if (x != 1) {
                prime = prime + x + " ";

            }
            if (max < x) {
                max = x;
            }
        }
        System.out.println("Even number : " + even);
        System.out.println("Prime number : " + prime);
        System.out.println("Max number :" + max);

    }
}


