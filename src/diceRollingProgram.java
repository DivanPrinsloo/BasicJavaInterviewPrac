import java.util.Random;
import java.util.Scanner;

public class diceRollingProgram {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numDice;
        int total = 0;

        System.out.print("Please enter the amount of dice to roll: ");
        numDice = scanner.nextInt();

        if (numDice > 0) {
            System.out.println("You roll the " + numDice + " dice...");

            for (int i = 0;i < numDice; i++) {
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                System.out.println("*******************\n");
                total = total + roll;
            }

            System.out.println("Your total is: " + total);

        } else {
            System.out.println("You can not roll a negative amount of dice!");
        }

        scanner.close();
    }

    static void printDie(int roll) {

        String dice1 = """
                *******************
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                *******************
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                *******************
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                *******************
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                *******************
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                *******************
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
        }

    }
}
