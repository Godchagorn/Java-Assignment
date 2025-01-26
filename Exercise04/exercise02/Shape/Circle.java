package main.java.org.dii.oop.exercise02.Shape;

public class Circle {
    private static int circleCount = 0;
    double radius;

    public Circle(double radius){
        this.radius = radius;
        circleCount++;
    }

    public static int getCircleCount() {
        return circleCount;
    }

    public double callArea(){
        return Math.pow(radius,2)*3.14;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void displayArea(){
        System.out.println("The circle area is "+ callArea());
    }

}


