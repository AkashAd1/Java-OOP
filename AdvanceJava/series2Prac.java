package AdvanceJava;
import java.util.Scanner;
public class series2Prac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, mul = 1, n;
        
        System.out.print("Enter the limit: ");
        n = input.nextInt();
        /*
        for(i=1; i<=n; i++){
            mul = mul*i;    ///1*2*3*4....n
        }
        System.out.println("1*2*3*4*...n: "+mul);   */

        for(i=1; i<=n; i++){
            mul = mul*(i*i);      ///1^2x2^2x3^2....n^2
        }
        System.out.println("multiplication: "+mul);

    }
    
}
