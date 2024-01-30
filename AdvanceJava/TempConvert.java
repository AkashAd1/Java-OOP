package AdvanceJava;
import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float Cels, Farh;

        System.out.println("Celsius value: ");
        Cels = input.nextFloat();

        Farh = (9*Cels)/5 + 32;
        System.out.println("Temp in Farheinheit: "+Farh);
    }
}
