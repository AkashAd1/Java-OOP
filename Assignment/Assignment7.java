package Assignment;
import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;

        System.out.print("Enter your choiche y/Y or n/N: ");
        ch = input.next().charAt(0);

        if(ch == 'y' || ch == 'Y'){
            System.out.println("You're are a java lover!");
        }
        else if(ch == 'n' || ch == 'N'){
            System.out.println("You're not a java lover!");
        }
        else{
            System.out.println("Invalid option choosen.");
        }
    }
    
}
