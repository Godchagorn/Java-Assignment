package main.java.org.dii.oop.exercise04;

public class Product {
    public String code;
    public String brand;
    public String name;
    public String taste;
    public String author;
    public int publishedYear;
    public String type;

    //books
    public Product(String code, String name, String author,int publishedYear){
        this.code = code;
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
        this.type = "Book";
    }

    //food
    public Product(String code, String brand, String name, String taste){
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.taste = taste;
        this.type = "Food";
    }

    public String getType(){
        return type;
    }

    public void displayDetails(){
        if (type == "Book") {
            System.out.println("Code: " + code);
            System.out.println("Author: " + author);
            System.out.println("Book name: " + name);
            System.out.println("Published: " + publishedYear);
        } else if (type == "Food") {
            System.out.println("Code: " + code);
            System.out.println("Brand: " + brand);
            System.out.println("Food name: " + name);
            System.out.println("Taste: " + taste);
        }
        System.out.println("-----------------------------");
    }
}
