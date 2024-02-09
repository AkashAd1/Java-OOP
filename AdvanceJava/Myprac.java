package AdvanceJava;
import java.util.Scanner;
public class Myprac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n;

        System.out.println("Enter any number: ");
        n = input.nextInt();
        int count = 0;

        for(i=2; i<n; i++){
            if(n%i==0){
                count++;
                break;
            }
            }
            if(count==0){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
    }

