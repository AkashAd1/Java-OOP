package Assignment;
import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To select Bengali, Press 1.");
        System.out.println("To select Hindi, Press 2.");
        System.out.println("To select Bengali, Press 3.");

        int num;
        System.out.print("Press: ");
        num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Your selected language is Bengali.");
                break;

            case 2: 
                System.out.println("Your selected language is Hindi.");
                break;

            case 3:
            System.out.println("Your selected language is Urdu.");
                break;
            
                default:
                System.out.println("You selected our default language English.");
                break;
        }
    }
}
