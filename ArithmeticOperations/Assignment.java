package ArithmeticOperations;
import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int PhonePrice,NumberOfInstallment; 
        float InstallmentPerMonth;

        System.out.print("Enter the Price of Phone: ");
        PhonePrice = input.nextInt();

        System.out.print("Enter the number of installment: ");
        NumberOfInstallment = input.nextInt();

        InstallmentPerMonth = (float) PhonePrice / NumberOfInstallment;

        System.out.println("Monthly installment amount: "+InstallmentPerMonth +" Taka");


    }
    
}
