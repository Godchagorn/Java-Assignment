package main.java.org.dii.oop.exercise02;

public class Student {
    String name;
    int age;
    String lastname;

    public Student(){
        name = "Unknown";
        lastname = "Unknown";
        age = 1;
    }

    public Student(String n, String l, int x){
        name = n;
        lastname = l;
        age = x;
    }

    //method getName
    public String getName(){
        return name;
    }
    public void displayInfo(){
        System.out.println("Name: "+name+"\nLastname: "+lastname+"\nAge: "+age);
    }
}
