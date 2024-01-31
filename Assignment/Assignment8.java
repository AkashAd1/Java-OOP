package Assignment;
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1, ch2;
        
        System.out.println("Have you passed Master Degree? Y/y or N/n? ");
        ch1 = input.next().charAt(0);

        System.out.println("Are you fluent in English? Y/y or N/n?");
        ch2 = input.next().charAt(0);

        if(ch1 == 'Y' || ch1 == 'y' && ch2 == 'Y' || ch2 == 'y'){
            System.out.println("Congratulations! You're eligible for the job.");
        }
        else{
            System.out.println("You're not eligible for the job.");
        }
        
    }
}
