package AdvanceJava;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp, num;
        System.out.print("Enter the number: ");
        num = input.nextInt();

        int sum = 0;
        temp = num;
        while(temp!=0){
            int r = temp%10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("The summation: "+sum);
    }
}
