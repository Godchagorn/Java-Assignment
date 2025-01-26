package main.java.org.dii.oop.exercise04;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson {
    public static void run() throws IOException {
        System.out.println("Hello Exercise 4 !!");

        String encryptedFile1;
        encryptedFile1 = "C:\\Users\\Acer\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise04\\o.txt";

        File outputFile1 = new File(encryptedFile1);
        PrintWriter output1 = new PrintWriter(outputFile1);
        if (!outputFile1.exists())
        {
            System.out.println("Error: cannot open " + encryptedFile1);
            System.exit(0);
        }

        String encryptedFile2;
        encryptedFile2 = "C:\\Users\\Acer\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise04\\c.txt";

        File outputFile2 = new File(encryptedFile2);
        PrintWriter output2 = new PrintWriter(outputFile2);
        if (!outputFile2.exists())
        {
            System.out.println("Error: cannot open " + encryptedFile2);
            System.exit(0);
        }

        File M_File = new File("C:\\Users\\Acer\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise04\\m.txt");
        if( ! M_File.exists())
        {
            System.out.println("File m.txt not found ");
            System.exit(0);
        }
        File N_File = new File("C:\\Users\\Acer\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise04\\n.txt");
        if( ! N_File.exists())
        {
            System.out.println("File n.txt not found ");
            System.exit(0);
        }
        File A_File = new File("C:\\Users\\Acer\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise04\\a.txt");
        if( ! A_File.exists())
        {
            System.out.println("File a.txt not found ");
            System.exit(0);
        }
        File B_File = new File("C:\\Users\\Acer\\Documents\\GitHub\\lab01-Godchagorn\\app\\src\\main\\java\\org\\dii\\oop\\exercise04\\b.txt");
        if( ! B_File.exists())
        {
            System.out.println("File b.txt not found ");
            System.exit(0);
        }

        Scanner input1 = new Scanner(M_File);
        Scanner input2 = new Scanner(N_File);
        Scanner input3 = new Scanner(A_File);
        Scanner input4 = new Scanner(B_File);

        while( input1.hasNext() && input2.hasNext()) // encrypt the file line by line
        {
            String line1_M = input1.nextLine();
            String line2_N = input2.nextLine();
            String[] arrOfStr1 = line1_M.split(" ",15);
            String[] arrOfStr2 = line2_N.split(" ",15);
            String encryptedLine1 = "";
            for(int i=0;i<15;i++){
                int x = Integer.valueOf(arrOfStr1[i]);
                int y = Integer.valueOf(arrOfStr2[i]);
                encryptedLine1 = x+y + " ";
                output1.print(encryptedLine1);
            }
            //String encryptedLine = encrypt(line, codeword);
            output1.println("");
        }
        while (input3.hasNext() && input4.hasNext()) // encrypt the file line by line
        {
            String line3_A = input3.nextLine();
            String line4_B = input4.nextLine();
            String[] arrOfStr3 = line3_A.split(" ",1000);
            String[] arrOfStr4 = line4_B.split(" ",1000);
            String encryptedLine2 = "";
            for(int i=0;i<1000;i++){
                int x = Integer.valueOf(arrOfStr3[i]);
                int y = Integer.valueOf(arrOfStr4[i]);
                encryptedLine2 = x+y + " ";
                output2.print(encryptedLine2);
            }
            //String encryptedLine = encrypt(line, codeword);
            output2.println("");
        }

        input1.close();
        input2.close();
        input3.close();
        input4.close();
        output1.close();
        output2.close();
    }
}

