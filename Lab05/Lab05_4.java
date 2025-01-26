import java.util.Scanner;
public class Lab05_4 {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter number1");
        int x = cc.nextInt();
        System.out.println("Enter number2");
        int xx = cc.nextInt();
        System.out.println("Enter number3");
        int xxx = cc.nextInt();
        for (int i = 1; i < 10; i++) {
            if (x > xx) {
                int y = x;
                x = xx;
                xx = y;
            }
            if (xx > xxx) {
                int y = xx;
                xx = xxx;
                xxx = y;
            }
        }
        System.out.println(x);
        System.out.println(xx);
        System.out.println(xxx);
    }
}
