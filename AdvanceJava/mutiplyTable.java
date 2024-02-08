package AdvanceJava;
import java.util.Scanner;
public class mutiplyTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, m, n, mul=1;

        System.out.print("Enter the initial value: ");
        m = input.nextInt();

        System.out.print("Enter the final value: ");
        n = input.nextInt();

        for(i=m; i<=n; i++){
            for(j=1; j<=10; j++){
            mul = i*j;
            System.out.println(+i +"*" +j+"="+mul);
            }
            System.out.println();
        }
    }
}
