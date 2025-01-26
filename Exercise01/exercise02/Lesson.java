package main.java.org.dii.oop.exercise02;
import java.util.*;
import java.io.*;

public class Lesson {

    public static void run()  throws IOException {

        System.out.println("Hello Exercise 2 !");
        File inputFile = new File("C:\\Users\\CAMT\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise02\\sdlc.txt");
        if( ! inputFile.exists())
        {
            System.out.println("File file_name.txt not found ");
            System.exit(0);
        }

        Scanner input = new Scanner(inputFile);

        String line; // to hold one full line from the file
        while (input.hasNext()) // while there is more data
        {
            line = input.nextLine(); // advance to next line, returns all "skipped" data
            System.out.println(line);
        }
        input.close();

    }
}