package AdvanceJava;

public class continuePrac {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=10; i=i+3){
            if (i==10) {
                continue;
            }
            System.out.println(i);
        }
    }
}
