package main.java.org.dii.oop.exercise01;

public class Lesson {
    public static void run(){

        System.out.println("Test");

        Book myBook = new Book();

        myBook.title = "Going Down Home with Daddy"; //ชื่อหนังสือ
        myBook.author = "Starling Lyons, Daniel Minter"; //ผู้แต่ง
        myBook.numberOfPages = 400; //จำนวนหน้า

        System.out.println("The title of the book is " + myBook.title + "\nIts author is " + myBook.author + "\nIt contains " + myBook.numberOfPages);


    }
}
