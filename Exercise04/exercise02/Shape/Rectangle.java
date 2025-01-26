package main.java.org.dii.oop.exercise02.Shape;

public class Rectangle {
    private static int rectangleCount = 0;
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        rectangleCount++;
    }
    public static int getRectangleCount() {
        return rectangleCount;
    }


    public double callArea(){
        return width*height;
    }
    public void setWidthHeight(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void displayArea(){
        System.out.println("The rectangle area is "+ callArea());
    }

}