package main.java.org.dii.oop.exercise03;
import java.util.Scanner;

public class Lesson {
    public static void run()
    {

        ChoHanGame game = new ChoHanGame();
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name ? ");
        String name = input.next();
        while (!name.equals("DONE"))
        {
            System.out.println("Hello " + name + " Goodluck!\n ");
            game = new ChoHanGame();
            game.play();
            System.out.print("What is your name? ");
            name = input.next();
        }
        System.out.println("Number of players : " + game.NumPlayersCount());
        System.out.println("Casino 's winnings : " + game.getTotal());

    }

}
