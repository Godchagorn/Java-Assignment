package main.java.org.dii.oop.exercise03;
import java.util.*;
import java.io.*;

public class Lesson {
    public static String encrypt(String msg, String cw) {
        String encryptedMessage = new String();
        msg = msg.toUpperCase();
        cw = cw.toUpperCase();
        for (int i =0;i <msg.length(); i++)
        {
            char ch =msg.charAt(i);
            int shift =(cw.charAt(i % cw.length()) -'A');
            int oldPositionInAlphabet =ch -'A';
            int newPositionInAlphabet =(oldPositionInAlphabet +shift) %26;
            encryptedMessage =encryptedMessage +(char) (newPositionInAlphabet +'A');
        }
        return encryptedMessage;
    }

    public static void run() throws IOException {
        System.out.println("Hello Exercise 3 !");

        Scanner input_keyboard = new Scanner(System.in);

        String codeword;
        System.out.print("codeword: ");
        codeword = input_keyboard.next();

        String encryptedFile;
        System.out.print("encryptedFile: ");
        encryptedFile = "C:\\Users\\Acer\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise03\\"+input_keyboard.next();

        File outputFile = new File(encryptedFile);
        PrintWriter output = new PrintWriter(outputFile);
        if (!outputFile.exists())
        {
            System.out.println("Error: cannot open "+ encryptedFile);
            System.exit(0);
        }

        File inputFile = new File("C:\\Users\\Acer\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise03\\message.txt");
        if (!inputFile.exists())
        {
            System.out.println("File message.txt not found");
            System.exit(0);
        }

        Scanner input = new Scanner(inputFile);

        while(input.hasNext())
        {
            String line = input.nextLine();
            String encryptLine = encrypt(line, codeword);
            output.println(encryptLine);
        }

        input.close();
        output.close();

    }
}
