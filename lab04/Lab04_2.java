import java.util.Scanner;
public class Lab04_2 {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        boolean stik1 = true;
        boolean stik2 = true;
        boolean stik3 = true;
        boolean stik4 = true;
        boolean stik5 = true;
        int countplayer1 = 0, countplayer2 = 0;
        int player1 = 1 , player2 = 1;
        int stik = 0;
        int rounds = 0;
        while (true) {
            do {
                if (player1 != 1 && player1 != 2 && player1 != 3 && player1 != 4 &&
                        player1 != 5) {
                    System.out.println("Error you entered the wrong number. Please enter again");
                }
                System.out.println("Sticks on the table");
                if (stik1 == true) {
                    System.out.println("1:------");
                } else {
                    System.out.println("1:");
                }
                if (stik2 == true) {
                    System.out.println("2:------");
                } else {
                    System.out.println("2:");
                }
                if (stik3 == true) {
                    System.out.println("3:------");
                } else {
                    System.out.println("3:");
                }
                if (stik4 == true) {
                    System.out.println("4:------");
                } else {
                    System.out.println("4:");
                }
                if (stik5 == true) {
                    System.out.println("5:------");
                } else {
                    System.out.println("5:");
                }
                System.out.println("The 1 player turn");
                System.out.print("Please choose the stick number:");
                player1 = ok.nextInt();
            } while (player1 != 1 && player1 != 2 && player1 != 3 && player1 != 4
                    && player1 != 5);
            switch (player1) {
                case 1:
                    stik1 = false;
                    break;
                case 2:
                    stik2 = false;
                    break;
                case 4:
                    stik4 = false;
                    break;
                case 5:
                    stik5 = false;
                    break;
            }
            countplayer1++;
            if (player1 == 3) {
                stik3 = false;
                break;
            }
            do {
                if (player2 != 1 && player2 != 2 && player2 != 3 && player2 !=
                        4 && player2 != 5 ) {
                    System.out.println("Error you entered the wrong number. Please enter again");
                }
                System.out.println("Sticks on the table");
                if (stik1 == true) {
                    System.out.println("1:------");
                } else {
                    System.out.println("1:");
                }
                if (stik2 == true) {
                    System.out.println("2:------");
                } else {
                    System.out.println("2:");
                }
                if (stik3 == true) {
                    System.out.println("3:------");
                } else {
                    System.out.println("3:");
                }
                if (stik4 == true) {
                    System.out.println("4:------");
                } else {
                    System.out.println("4:");
                }
                if (stik5 == true) {
                    System.out.println("5:------");
                } else {
                    System.out.println("5:");
                }
                System.out.println("The 2 player turn");
                System.out.print("Please choose the stick number:");
                player2 = ok.nextInt();
            } while (player2 != 1 && player2 != 2 && player2 != 3 && player2 !=
                    4 && player2 != 5);
            switch (player2) {
                case 1:
                    stik1 = false;
                    break;
                case 2:
                    stik2 = false;
                    break;
                case 4:
                    stik4 = false;
                    break;
                case 5:
                    stik5 = false;
                    break;
            }
            countplayer2++;
            if (player2 == 3) {
                stik3 = false;
                break;
            }
        }
        if (player1 == 3) {
            System.out.println("The loser is Player1");
            System.out.println("the winner is Player2");
        } else {
            System.out.println("The winner is Player1");
            System.out.println("the loser is Player2");
        }
        System.out.println("The total rounds " + (countplayer1 +
                countplayer2));
        System.out.println("player 1 picked " + countplayer1 + " stick(s)");
        System.out.println("player 2 picked " + countplayer2 + " stick(s)");
    }
}