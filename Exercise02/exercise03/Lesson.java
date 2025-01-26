package main.java.org.dii.oop.exercise03;

public class Lesson {

    public static void displayPerson(Person p) {
        System.out.println("Name: " + p.fname +" "+ p.lname +"\nAge: " + p.age);
        System.out.println();
    }

    public static void displayShape(Shape x) {
        System.out.println("Width: " + x.width +"\nHeight: " + x.height);
        System.out.println();

    }
    public static void run(){

        Person info1 = new Person();
        info1.fname = "John";
        info1.lname = "Doe";
        info1.age = 24;

        Person info2 = new Person();
        info2.fname = "Jane";
        info2.lname = "Doe";
        info2.age = 25;

        Person info3 = new Person();
        info3.fname = "Julie";
        info3.lname = "Doe";
        info3.age = 15;

        Person info4 = new Person();
        info4.fname = "Jessie";
        info4.lname = "Doe";
        info4.age = 13;

        Person info5 = new Person();
        info5.fname = "Jeff";
        info5.lname = "Doe";
        info5.age = 5;

        Shape details1 = new Shape();
        details1.width = 100;
        details1.height = 200;

        Shape details2 = new Shape();
        details2.width = 50;
        details2.height = 100;

        Shape details3 = new Shape();
        details3.width = 50;
        details3.height = 150;

        Shape details4 = new Shape();
        details4.width = 156;
        details4.height = 400;

        Shape details5 = new Shape();
        details5.width = 200;
        details5.height = 400;

        displayPerson(info1);
        displayPerson(info2);
        displayPerson(info3);
        displayPerson(info4);
        displayPerson(info5);

        displayShape(details1);
        displayShape(details2);
        displayShape(details3);
        displayShape(details4);
        displayShape(details5);

    }

}
