package AdvanceJava;

import java.util.Scanner;

public class pattern2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nLine;
        System.out.print("Enter number of line: ");
        nLine = input.nextInt();

        for(int row = nLine; row >= 1; row--){
            for(int col = 1; col <= row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
