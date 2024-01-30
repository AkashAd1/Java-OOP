package AdvanceJava;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, price;
        String tittle, description, category;

        System.out.println("Product id: ");
        id = input.nextInt();
        input.nextLine();
        System.out.println("Enter product title: ");
        tittle = input.nextLine();

        System.out.println("Product type: ");
        category = input.nextLine();

        System.out.println("Product overview: ");
        description = input.nextLine();

        System.out.println("Enter the price: ");
        price = input.nextInt();

        System.out.println("Product ID: " + id);
        System.out.println("Product Title: " + tittle);
        System.out.println("Category: " + category);
        System.out.println("Overview: " + description);
        System.out.println("Price: " + price);
    }
}