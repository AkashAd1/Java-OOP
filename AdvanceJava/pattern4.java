package AdvanceJava;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nLine;
        System.out.print("Enter the line: ");
        nLine = input.nextInt();
        
        for(int row = 1; row <= nLine; row++){
            for(int col=1; col <=row; col++){
                System.out.print(" "+row);
            }
            System.out.println();
        }

        for(int row = nLine-1; row >= 1; row--){
            for(int col=1; col <=row; col++){
                System.out.print(" "+row);
            }
            System.out.println();
        } 

    }
}
