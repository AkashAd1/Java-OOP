package AdvanceJava;

public class Arprac {
    public static void main(String[] args) {
        int[] num = new int[10];

        num[0] = 10;
        num[1] = 20;
        num[2] = 30;

        int sum = num[1] + num[2];
        System.out.println("Sumation = "+sum);

        int len = num.length;
        System.out.println("Array size = "+len);
    }
}
