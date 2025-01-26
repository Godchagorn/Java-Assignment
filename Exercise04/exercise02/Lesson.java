package main.java.org.dii.oop.exercise02;
import main.java.org.dii.oop.exercise02.Shape.Circle;
import main.java.org.dii.oop.exercise02.Shape.Rectangle;
import main.java.org.dii.oop.exercise02.Shape.Triangle;

import java.util.Scanner;

public class Lesson {
    public static void run() {

        while (true) {
            System.out.print("1. Circle \n2. Rectangle \n3. Triangle\n" +
                    "Please select the shape [1-3] or [0] to exit: ");

            Scanner input = new Scanner((System.in));
            int choice = input.nextInt();
            if (choice == 0){
                System.out.println("The total number of circles is " + Circle.getCircleCount()  +
                                "\nThe total number of rectangle is " + Rectangle.getRectangleCount() +
                                "\nThe total number of triangle is " + Triangle.getTriangleCount());
                break;

            } else if (choice == 1) {
                System.out.print("Enter the radius: ");
                double r = input.nextDouble();
                Circle x = new Circle(r);
                x.setRadius(r);
                x.displayArea();
            } else if (choice == 2) {
                System.out.print("Enter the width: ");
                double width = input.nextDouble();
                System.out.print("Enter the height: ");
                double height = input.nextDouble();
                Rectangle y = new Rectangle(width, height);
                y.setWidthHeight(width, height);
                y.displayArea();
            } else if (choice == 3) {
                System.out.print("Enter the base: ");
                double base = input.nextDouble();
                System.out.print("Enter the height: ");
                double height = input.nextDouble();
                Triangle z = new Triangle(base, height);
                z.setbaseHeight(base, height);
                z.displayArea();
        }
        }
        }
    }

