package main.java.org.dii.oop.exercise04;
import java.util.Scanner;

public class Lesson {
    public static void run() {
        Product[] products = new Product[6];
        products[0] = new Product("363369010", "Democratic Education in a Conservative Age", "Michael W. Apple", 1993);
        products[1] = new Product("366817010", "Giving Teaching Back to the Teachers", "Robin Barrow", 1984);
        products[2] = new Product("355056010", "Learning Beyond The Classroom: Education for a Changing World", "Tom Bentley", 1998);
        products[3] = new Product("386926010", "C-Vitt", "ซีวิท รสเลมอน 140 มล. (แพ็ก 10 ขวด)", "เลมอน");
        products[4] = new Product("383306010", "คิวมินซี", "คิวมินซี เคอร์คิวมิน+แอล-กลูตาไธโอน 150 มล. (แพ็ก 6 ขวด)", "ขมิ้นชัน");
        products[5] = new Product("397208010", "เพรสแอนด์เชค", "เพรสแอนด์เชค คอลลาเจน วิตซี 3.5 กรัม (แพ็ก 12 กล่อง)", "คอลลาเจน วิตามินซี");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("DII shop:" +
                    "\n1. Book" +
                    "\n2. Food");
            System.out.print("Choose the number [1/2] to display product: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < products.length; i++) {
                        Product product = products[i];
                        if ("Book".equals(product.getType())) {
                            product.displayDetails();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < products.length; i++) {
                        Product product = products[i];
                        if ("Food".equals(product.getType())) {
                            product.displayDetails();
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.print("Do you want to continue [y/n]: ");
            char response = input.next().toLowerCase().charAt(0);
            if (response == 'n') {
                break;
            } else if (response != 'y') {
                break;
            }
        }
    }
}
