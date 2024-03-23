package AdvanceJava;
import java.util.Scanner;

public class ArSumAv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        double[] arr = new double[100];
        double sum = 0;

        System.out.print("Enter the value: ");
        for(int i = 0; i < limit; i++){
            arr[i] = input.nextDouble();
        }

        for(int i = 0; i < limit; i++ ){
            sum = sum + arr[i];
        }
        System.out.println("The sum is : "+sum);

        System.out.println("The avarage is : "+sum/limit);
    }
}
