package Assignment;
import java.util.Scanner;
public class ArAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] weekdays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.print("Enter day number 1 to 7: ");
        int daynumber = input.nextInt();

        for(int i = 0; i < weekdays.length; i++){
            if(daynumber == i+1){
                System.out.println(weekdays[i]);
            }
        }
    }
}
