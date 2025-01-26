import java.util.Scanner;
public class Lab05_5 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.println("Enter : ");
        int number = dd.nextInt();
        for (int i = 1 ; i <= number ; i++ ){
            for (int j = number - i ; j > 0 ; j-- ){
                System.out.print("  ");
            }
            for (char x = 'A' ; x < 'A' + i ; x++){
                System.out.print(x + " ");
            }
            for (char x = (char) ('A' + i - 2); x >= 'A'; x--){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
