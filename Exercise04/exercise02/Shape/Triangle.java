package main.java.org.dii.oop.exercise02.Shape;

public class Triangle{
    private static int triangleCount = 0;
    double base;
double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        triangleCount++;
    }

    public static int getTriangleCount() {
        return triangleCount;
    }

    public double callArea(){
    return base*height*0.5;
}
public void setbaseHeight(double base, double height){
    this.base = base;
    this.height = height;
}
public void displayArea(){
    System.out.println("The triangle area is "+ callArea());
}

}

