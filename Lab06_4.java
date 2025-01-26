import java.util.Scanner;
public class Lab06_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] name = new String[5];
        double[] heights = new double[5];

        for (int i = 0 ; i < 5 ; i ++) {
            System.out.println("Enter student #" + (i + 1) + " name");
            name[i] = input.next();
            System.out.println("Enter student # "+ (i + 1) + " heights");
            heights[i] = input.nextDouble();
        }
        int index = 0;
        double tallest = 0;
        for (int i = 0 ; i < 5 ; i++){
            if (tallest < heights[i]){
                tallest = heights[i];
                index = i;
            }
        }
        System.out.println("tallest student is #"+(index+1)+" name: "+name[index]+" height: "+heights[index]);
    }
}