import java.util.Random;
import java.util.Scanner;

public class casinoMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;

        String[] row;

        System.out.println();
        System.out.println("*****************************");
        System.out.println(" WELCOME TO JAVA SLOTS");
        System.out.println(" Symbols: ❤️ 🍒 🍋 ⭐ 🍉 🔔");
        System.out.println("*****************************");

        while (balance > 0) {

            System.out.println();
            System.out.println("Current Balance: R" + balance);
            System.out.print("Place you bet amount: R ");
            bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("INSUFFICIENT amount of funds");
                continue;
            } else if (bet < 0) {
                System.out.println("Bet must be bigger then ZERO");
                continue;
            } else {
                balance -= bet;

            }

            System.out.println("SPINNING: ...");
            System.out.println();
            row = spinRow();
            printRow(row);


        }
    }
    static String[] spinRow() {

        String[] symbols = { "❤️", "🍒", "🍋", "⭐", "🍉", "🔔"};
        String[] row = new String[3];
        Random random = new Random();



        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println(" " + String.join(" | ", row));
    }
}