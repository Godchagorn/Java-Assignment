import java.util.Scanner;
public class Lab06_5 {
    public static void main(String[] args) {

        int[] myArray = {1, 5, 9, 11, 12, 13, 14, 15, 19, 22};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a new value:");
        int x = input.nextInt();
        int index = -1;

        for (int i = 0; i < 10; i++) {
            if (myArray[i] > x) {
                index = i;
                break;
            }

/*
            int j = 0;
            while (x > myArray[j]){
                j++;
                index = j;
            }

 */

            int count = myArray.length - 1;
            while (count > index) {
                myArray[count] = myArray[count - 1];
                count--;
            }
            myArray[count] = x;

            for (i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i] + " ");
            }
        }
    }
}
