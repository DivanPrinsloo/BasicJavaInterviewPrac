import java.util.Scanner;

public class compoundInterestCalc {
    public static void main(String[] arg) {


        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;

        double amount;

        System.out.print("What is the principal amount: ");
        principle = scanner.nextDouble();

        System.out.print("What is the interest rate(in a percentage from): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("How many times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is R%.2f", years, amount);



        scanner.close();


    }
}
