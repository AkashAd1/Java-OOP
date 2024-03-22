package AdvanceJava;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nLine;
        System.out.print("Enter number of line: ");
        nLine = input.nextInt();

        for(int row = 1; row <= nLine; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
