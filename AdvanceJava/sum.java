package AdvanceJava;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the value of a: ");
        a = input.nextInt(); 
        System.out.println("Enter the value of b: ");
        b = input.nextInt();
        c= a+b;
        System.out.println("The summation c: " +c);
    }
}
