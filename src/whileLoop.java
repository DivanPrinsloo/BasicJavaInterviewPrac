import java.util.Random;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] arg) {

        // While loop = repeat some code forever
            // while some condition remains true

      Scanner scanner = new Scanner(System.in);

//        String name = "";
//
//        while (name.isEmpty()) {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);

//        String response = "";
//        int num = 0;
//
//        System.out.println("You are playing a guessing game!");
//
//        System.out.print("Please guess the letter: ");
//        response = scanner.nextLine().toUpperCase();
//
//        while (!response.equals("Q")) {
//            System.out.print("Please Try again: ");
//            response = scanner.nextLine().toUpperCase();
//
//            num = num + 1;
//        }
//
//        if (num > 10) {
//            System.out.println("That took you more then " + (num - 1) + " times, you suck");
//        } else {
//            System.out.println("Well done, you did better then I expected, that toom you: " + num + " times");
//        }

//        int number = 0;

//        while (number < 1 || number > 10) {
//            System.out.print("Enter a number, between 1-10: ");
//            number = scanner.nextInt();
//
//        }

        //Do loop version

//        do {
//            System.out.print("Enter a number, between 1-10: ");
//            number = scanner.nextInt();
//
//        } while (number < 1 || number > 10);
//
//        System.out.println("You picked " + number);

        Random random = new Random();

        int guess;
        int attempts = 1;
        int randomNumber = random.nextInt(1, 11);

        System.out.println("Number guessing game!");
        System.out.print("Please guess a number: ");
        guess = scanner.nextInt();

        while (guess != randomNumber) {

            if (guess < randomNumber) {
                System.out.print("Ouch... Too low, try again!: ");
                guess = scanner.nextInt();
            } else {
                System.out.print("Oof... Too high, try again!: ");
                guess = scanner.nextInt();
            }


            attempts = attempts + 1;
        }

        System.out.println("You got it! The random number was: " + randomNumber);
        System.out.println("and it took you " + attempts + " times to guess it right...");

        scanner.close();
    }

}
