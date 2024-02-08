package AdvanceJava;
import java.util.Scanner;
public class MultiplyCounting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, mul=1;

        System.out.println("Enter the counting room: ");
        n = input.nextInt();

        for(i=1; i<=10; i++){
            mul = n * i;
            System.out.println(n+ "*" +i+" ="+mul);
        }

    }
}
