import java.util.Scanner;
//comment
public class Lab03_2 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        double totalGradePoints = 0;
        int totalCredits = 0;

        while (true) {
            System.out.print("Enter grade (0-4) or 'Z' to quit: ");
            String gradeInput = xx.next();

            if (gradeInput.equalsIgnoreCase("Z")) {
                break;
            }

            int grade = Integer.parseInt(gradeInput);
            if (grade < 0 || grade > 4) {
                System.out.println("Invalid grade. Please enter a grade between 0- 4.");
                continue;
            }

            System.out.print("Enter credits: ");
            int credits = xx.nextInt();

            totalGradePoints += grade * credits;
            totalCredits += credits;
        }

        xx.close();

        double gpa = totalGradePoints / totalCredits;
        System.out.println("Your GPA is: " + gpa);
    }
}
