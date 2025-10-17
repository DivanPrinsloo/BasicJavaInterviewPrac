import java.util.Scanner;

import static java.lang.Math.round;

public class shoppingCart {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String item;
        Double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price of the item?: ");
        price = scanner.nextDouble();

        System.out.print("How many of these items do you have?: ");
        quantity = scanner.nextInt();

        System.out.println(" ");
        System.out.println("You want " + item + " as your item");
        System.out.println("The price of your item is " + currency + price);
        System.out.println("and you are buying, " + quantity + " " + item);
        System.out.println(" ");

        total = price * quantity;

        System.out.println("Your total price would be: " + total);

        scanner.close();

    }
}
