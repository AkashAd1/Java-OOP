package AdvanceJava;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, first = 0, second = 1, result;

        System.out.print("Enter the limit: ");
        n = input.nextInt();
        result = first + second;
        System.out.print(first);
        System.out.print(" " + second);
        System.out.print("" + result);
        for (int i = 3; i <= n; i++) {
            first = second;
            second = result;
            result = first + second;
            System.out.print(" " + result);
        }

    }
}
