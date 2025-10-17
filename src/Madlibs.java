import java.util.Scanner;

public class Madlibs {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.print("Enter an adjective (Description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a Noun (Animal/person: " );
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (Description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a Verb ending with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (Description): ");
        adjective3 = scanner.nextLine();


        System.out.println("\n Today I went to a " + adjective1 + "Zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


        scanner.close();
    }
}
