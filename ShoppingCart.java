import java.util.Scanner;

public class ShoppingCart{
    public static void main(String[] args){
        //Shopping Cart Program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;

        System.out.println("What would you like to buy? ");
        item = scanner.nextLine();

        System.out.println("What is the price of each? ");
        price = scanner.nextDouble();

        System.out.println("How many would you like? ");
        quantity = scanner.nextInt();

        System.out.println("You have brought " + quantity + " " + item);

        total = price * quantity;

        System.out.println("Your total is $" + total);


        scanner.close();

    }
}