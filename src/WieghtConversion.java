import java.util.Scanner;

public class WieghtConversion {
    public static void main(String[] arg) {

        // Weight conversion algorithm

        Scanner scanner = new Scanner(System.in);

        double weight;
        String measurement;
        double converted;

        System.out.print("Welcome to the Weight Conversion calculator");

        System.out.print("\nPlease enter the Weight of the object you have: ");
        weight = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("\nPlease choose which measurement you have (P = Pounds " +
                "/KG = Kilograms): ");
        measurement = scanner.nextLine();


        if (measurement == "KG") {
            System.out.println("\nYour object weighs " + weight + " " + measurement);

            converted = weight * 2.2;
            System.out.println("Your objects weight in pounds is " + converted + " Pounds");
        } else {
            System.out.println("\nYour object weighs " + weight + " Pounds");

            converted = weight / 2.2;
            System.out.printf("Your objects weight in KG is %.2f", converted);
        }

        scanner.close();



    }
}
