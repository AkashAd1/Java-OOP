package AdvanceJava;
import java.util.Scanner;
public class seriesPrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0;

        System.out.print("Enter the limit n: ");
        n = input.nextInt();

        for(int i=1; i<=n; i=i+2){
            sum = sum + i;
        }
        System.out.println("The summation of n limit: "+sum);

        for(int i=1; i<=n; i++){
            sum = sum + i*i;               ///1^1+2^2...
            System.out.print(" "+i);
        }
        System.out.println("Power sum: "+sum);
    }
}
