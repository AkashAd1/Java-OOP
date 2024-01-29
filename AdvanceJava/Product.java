package AdvanceJava;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner ak = new Scanner(System.in);
        int id, price;
        String tittle, description, category;

        System.out.println("Product id: ");
        id = input.nextInt();

        System.out.println("Enter product tittle: ");
        tittle = ak.nextLine();

        System.out.println("Product type: ");
        category = ak.nextLine();

        System.out.println("Product overview: ");
        description = ak.nextLine();

        System.out.println("Enter the price: ");
        price = input.nextInt();

        System.out.println("Product ID: "+id);
        System.out.println("Product Tittle: "+tittle);
        System.out.println("Category: "+category);
        System.out.println("Overview: "+description);
        System.out.println("Price: "+price);

    }

}
