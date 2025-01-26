import java.util.Scanner;

public class Lab07_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] score;
        double[] average = new double[3];

        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        score = new double[number][3];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter the " + (i + 1) + " student Physics score: ");
            score[i][0] = input.nextInt();
            System.out.print("Enter the " + (i + 1) + " student Biology score: ");
            score[i][1] = input.nextInt();
            System.out.print("Enter the " + (i + 1) + " student Chemistry score: ");
            score[i][2] = input.nextInt();
        }

        System.out.println("Physics, Biology, Chemistry | Total | Average");
        for (int i = 0; i < number; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += (int) score[i][j];
                System.out.print(score[i][j] + " ");
            }
            System.out.println("| " + total + " | " + total / 3);
        }
        System.out.println("--------------------");

        System.out.println("Average scores for Physics, Biology, and Chemistry");
        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < number; j++) {
                total += score[j][i];
            }
            average[i] = total / number;
            System.out.print(average[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------");
        for (int i = 0 ; i < number ; i++){
            System.out.print("Student "+(i+1)+": ");
            for (int j = 0 ; j < 3 ; j++){
                if (score[i][j] > average[j]) {
                    System.out.print("Pass ");
                }else {
                    System.out.print("No ");
                }
            }
            System.out.println();
        }
    }
}
