import java.util.Scanner;

public class Lab07_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[5][4];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print("Enter the value of a[" + row + "][" + col + "]:");
                a[row][col] = input.nextInt();
            }

        }

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                // print values with space
                System.out.print(a[row][col] + " ");
            }
            // a newline for the next row
            System.out.println();
        }
        input.close();

        //What do you get from a.length, a[row].length, and a[0].length?
        //20, 4, 4

        //Is a[row].length always equal to a[0].length ?
        //equal
    }
}