package main.java.org.dii.oop.exercise04;
import java.util.*;

public class Lesson {
    public static void run() {
        Vector<Student> studentCollection = new Vector<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\n1. Add new student" +
                    "\n2. Display all students" +
                    "\n3. Exit" +
                    "\nSelect the number [1-3]: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addStudent(studentCollection, input);
                    break;
                case 2:
                    displayStudents(studentCollection);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addStudent(Vector<Student> studentCollection, Scanner input) {
        System.out.print("Enter the number of students you want to add: ");
        int num = input.nextInt();
        input.nextLine();

        for (int i = 0; i < num; i++) {
            Student student = new Student();

            System.out.print("Enter Firstname: ");
            student.fname = input.nextLine();
            System.out.print("Enter Lastname: ");
            student.lname = input.nextLine();
            System.out.print("Enter ID: ");
            student.idNum = input.nextLine();

            studentCollection.add(student);
        }
    }

    public static void displayStudents(Vector<Student> studentCollection) {
        if (studentCollection.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("List of students:");
        for (Student student : studentCollection) {
            System.out.println("    Firstname: " + student.fname + ", Lastname: " + student.lname + ", ID: " + student.idNum);
        }
    }
}
