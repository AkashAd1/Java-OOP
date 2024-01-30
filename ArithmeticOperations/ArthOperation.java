package ArithmeticOperations;
import java.util.Scanner;
public class ArthOperation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        float result2;

        System.out.print("Enter the num1: ");
        num1 = input.nextInt();
        System.out.print("Enter the num2: ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("Addition: num1 + num2 = "+result);

        result = num1 - num2;
        System.out.println("Subtraction: num1 - num2 = "+result);

        result = num1 * num2;
        System.out.println("Multiplication: num1 * num2 = "+result);

        result2 = (float)num1 / num2;
        System.out.println("Divisor: num1 / num2 = "+result2);

        result = num1 % num2;
        System.out.println("Remainder: num1 % num2 = "+result);

        
    }
    
}
