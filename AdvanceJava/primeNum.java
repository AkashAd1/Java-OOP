package AdvanceJava;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, count;

        System.out.println("Enter any positive number: ");
        n = input.nextInt();
        count = 0;

        if (n == 0 || n == 1) {
            System.out.println(+n + " is not a prime number.");
        } else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(+n + " is not a prime number.");
            } else {
                System.out.println(+n + " is a prime number.");
            }
        }

    }

}
