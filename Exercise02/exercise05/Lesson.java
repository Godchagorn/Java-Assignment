package main.java.org.dii.oop.exercise05;

import java.util.*;

public class Lesson {
    public static void run() {
        Vector<Noodle> orders = new Vector<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\n1. Add a new order" +
                    "\n2. Display all orders" +
                    "\n3. Exit" +
                    "\nSelect an option [1-3]: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addOrder(orders, input);
                    break;
                case 2:
                    displayOrders(orders);
                    break;
                case 3:
                    System.out.println("Thank you for using the Ramen Ordering System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addOrder(Vector<Noodle> orders, Scanner input) {
        Noodle order = new Noodle();

        System.out.println("Enter the following preferences for your ramen:");

        System.out.print("Choose noodle texture (extra soft, medium, firm, extra firm): ");
        order.noodleTexture = input.nextLine();

        System.out.print("Does it need onion? (welsh onion, spring onion, all correct, none): ");
        order.onion = input.nextLine();

        System.out.print("Do you want garlic? (no, not too much, yes, yes a lot): ");
        order.garlic = input.nextLine();

        System.out.print("How spicy? (boring, not so hot, hot, x2 hot, x3-x10): ");
        order.spicy = input.nextLine();

        System.out.print("What kind of pork? (fat pork, skinny pork, I don't like pork): ");
        order.porkType = input.nextLine();

        System.out.print("Flavor strength? (strong, medium, light): ");
        order.flavorStrength = input.nextLine();

        System.out.print("Richness? (extra rich, rich, a little, none): ");
        order.rich = input.nextLine();

        orders.add(order);
        System.out.println("Order added successfully!");
    }

    public static void displayOrders(Vector<Noodle> orders) {
        if (orders.isEmpty()) {
            System.out.println("No orders to display.");
            return;
        }

        System.out.println("List of all ramen orders:");
        for (Noodle order : orders) {
            order.displayOrder();
        }
    }
}
