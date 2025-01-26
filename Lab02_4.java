import java.util.Scanner;

public class Lab02_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dc = 0.0;

        System.out.println("His/her membership status? (Yes or No):");
        String member = input.nextLine();

        if (member.equalsIgnoreCase("Yes")) {
            System.out.println("Silver or Gold");
            member = input.nextLine();
        }

        System.out.println("The money that he/she spends?");
        double sp = input.nextDouble();

        switch (member.toLowerCase()) {
            case "Silver":
                if (sp <= 1000) {
                    dc = 0.98;
                } else if (sp <= 10000) {
                    dc = 0.97;
                } else {
                    dc = 0.95;
                }
                break;
            case "Gold":
                if (sp <= 1000) {
                    dc = 0.95;
                } else if (sp <= 10000) {
                    dc = 0.92;
                } else {
                    dc = 0.90;
                }
                break;
            default:
                System.out.println("Invalid entered");
        }
        double p = sp * dc;
        System.out.println(("You have to pay " + p));
    }
}