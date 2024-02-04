package Assignment;
import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, fact;

        System.out.print("Enter the number n: ");
        n = input.nextInt();
        fact = 1;
        
        for(i=1; i<= n; i++){
            fact = fact*i;
            System.out.println("factorial = "+fact);
        }
    }

    
}
