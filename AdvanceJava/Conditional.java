package AdvanceJava;
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, LargerNum;
        System.out.print("Enter any two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        LargerNum = (num1 > num2) ? num1 : num2;

        System.out.println("The largest number is: "+LargerNum);

    }
}
