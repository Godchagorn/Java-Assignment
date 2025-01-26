import java.util.Scanner;
public class Lab06_2 {
    public static void main(String[] args) {

        double myArray[];
        myArray = new double[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter #" + (i + 1) + " double:");
            myArray[i] = input.nextDouble();
        }

        boolean exist = false;
        System.out.println("Please enter a new double:");
        double new_value = input.nextDouble();

        for (int i = 0; i < myArray.length; i++) {
            if (new_value == myArray[i]) {
                exist = true;
            }
        }
        if (exist){
            System.out.println("The value " + new_value + " is in the array.");
        }
        else {
            System.out.println("The value is not in the array.");
        }
    }
}
