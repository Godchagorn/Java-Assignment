package main.java.org.dii.oop.exercise02;

import main.java.org.dii.oop.exercise01.Book;

public class Lesson {
    public static void run(){

        System.out.println("Test");

        Book myBook = new Book();

        myBook.title = "Milkman: A Novel"; //ชื่อหนังสือ
        myBook.author = "Anna Burns"; //ผู้แต่ง
        myBook.numberOfPages = 200; //จำนวนหน้า

        System.out.println("The title of the book is " + myBook.title + "\nIts author is " + myBook.author + "\nIt contains " + myBook.numberOfPages);
        System.out.println();

        Book newBook = new Book();

        myBook.title = "The Undefeated"; //ชื่อหนังสือ
        myBook.author = "Kwame Alexander, Kadir Nelson"; //ผู้แต่ง
        myBook.numberOfPages = 300; //จำนวนหน้า

        System.out.println("The title of the book is " + myBook.title + "\nIts author is " + myBook.author + "\nIt contains " + myBook.numberOfPages);



    }
}
