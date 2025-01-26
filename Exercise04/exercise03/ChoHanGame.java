package main.java.org.dii.oop.exercise03;
import java.util.*;

public class ChoHanGame {
    static int numPlayers =0;
    static int total=0;
    int winnings;
    public static int playerCount = 0;

    public ChoHanGame(){
        winnings =0;
    }

    public boolean win(String choice,int sum) {
        if (sum%2 == 0&&(choice.equals("e") || choice.equals("E")))
            return true;
        if (sum%2 != 0&&(!(choice.equals("e") || choice.equals("E"))))
            return true;
        return false;
    }

    private void reportWinnings(){
        if (winnings > 0){
            System.out.println("You won $ "+winnings);
            total -= winnings;
        }
        else if(winnings<0){
            System.out.println("You lost $"+Math.abs(winnings));
            total += winnings;
        }
        else{
            System.out.println("You broke even");
            System.out.println("Thanks for playing");
        }
    }

    public void play() {
        playerCount++;
        Scanner input = new Scanner(System.in);
        Dice dice = new Dice(2);
        String choice;
        String answer;
        int wager;

        do {
            System.out.print("Enter wager: ");
            wager = input.nextInt();
            System.out.print("Enter 'e' for even anything else for odd: ");
            choice = input.next();
            int sum = dice.rollDice();
            System.out.println("You rolled a "+sum);
            if (win(choice,sum)) {
                winnings += wager;
                System.out.println("You won! Winnings so far: " +winnings);
            } else {
                winnings -= wager;
                System.out.println("You lost! Winnings so far: " +winnings);
            }
            System.out.println("Play again? 'y' or 'Y' for 'Yes': ");
            answer = input.next();
            System.out.println();
        } while(answer.equals("Y")|| answer.equals("y"));
        reportWinnings();
    }

    public static int getTotal() {
        return total;
    }

    public static int NumPlayersCount() {
        return playerCount;
    }
}
