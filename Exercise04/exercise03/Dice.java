package main.java.org.dii.oop.exercise03;
import java.util.Random;
public class Dice {
    int numDice;

    public Dice(int i) {
        numDice = i;
    }

    public int rollDice() {
        Random random = new Random();
        int score = 0;
        for (int i = 1; i <= numDice; i++) {
            score += random.nextInt(6) + 1;
        }
        return score;
    }

    public int getNumDice() {
        return numDice;
    }

    public void setNumDice(int x) {
        numDice = x;
    }
}
