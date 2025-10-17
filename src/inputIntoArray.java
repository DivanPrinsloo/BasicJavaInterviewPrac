import java.util.Arrays;
import java.util.Scanner;

public class inputIntoArray {
    public static void main(String[] arg) {

      //  String[] foods = {"Pizza", "Taco", "Hamburgers"};

        Scanner scanner = new Scanner(System.in);

        int items;

        System.out.print("Please enter the amount of food items you would Like to purchase: ");
        items = scanner.nextInt();


        if (items > 0) {
            String[] foods = new String[items];

            //        foods[0] = "Pizza";
            //        foods[1] = "Taco";
            //        foods[2] = "Hamburger";

            //        System.out.println(foods.length);


            System.out.println(" ");
            scanner.nextLine();
            //        System.out.println(" ");

            for (int i = 0; i < foods.length; i++) {
                System.out.print("Enter a food: ");
                foods[i] = scanner.nextLine();

            }

            System.out.println("\nThe items you would like to order, are: ");

            Arrays.sort(foods);

            for (String food : foods) {
                System.out.println(food);

            }
        } else {
            System.out.println("You need to order at least one item");
        }

            scanner.close();


    }
}
