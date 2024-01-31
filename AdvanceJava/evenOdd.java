package AdvanceJava;
import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number: ");
        num = input.nextInt();

        if(num%2 == 0){
            System.out.println("It's even number.");
        }
        else{
            System.out.println("It's odd number.");
        }
    }
    
}
