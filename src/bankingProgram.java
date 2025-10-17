import java.util.Scanner;

public class bankingProgram {
    public static void  main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        boolean isRunning = true;
        int choice;
        double depositValue;
        double withdrawValue;


        while (isRunning) {

            menuScreen();

            System.out.print("Enter your choice (Hint: 1-4): ");
            choice = scanner.nextInt();

            if (choice < 5 && choice > 0 ) {
                if (choice == 1) {
                    showBalance();

                    System.out.printf("Current Balance is: R%.2f", balance);
                    System.out.print("\nEnter 4 to EXIT: ");
                    choice = scanner.nextInt();
                    System.out.println("***************");


                } else if (choice == 2) {
                    deposit();

                    System.out.printf("Current Balance is: R%.2f", balance);
                    System.out.print("\nHow much would you like to deposit: ");
                    depositValue = scanner.nextInt();

                    if (depositValue < 0) {
                        System.out.println("Amount can not be negative!");
                        System.out.println("Returning to home page");
                    } else {
                        System.out.println("\nYou have deposited: R" + depositValue);
                        balance = balance + depositValue;
                    }

                    System.out.println("**********************");


                } else if (choice == 3) {
                    withdraw();

                    System.out.printf("Your current balance to withdraw is: R%.2f", balance);
                    System.out.print("\nHow much would you like to withdraw: ");
                    withdrawValue = scanner.nextInt();

                    if (withdrawValue > balance || withdrawValue < 0) {
                        System.out.println("You can not withdraw more then you have available!");
                        System.out.println("Returning to home page");
                    } else {
                        System.out.println("\nYou have withdrew: " + withdrawValue);
                        balance = balance - withdrawValue;
                    }

                    System.out.println("**********************");

                } else {
                    if (choice == 4) {
                        System.out.println("\n*********************************");
                        System.out.println("Thank you for using this program!");
                        System.out.println("*********************************");
                        isRunning = false;
                    }  else {
                        System.out.println("PLEASE PICK A NUMBER BETWEEN 1-4");
                    }
                }
            }
        }


        scanner.close();
    }

    static void menuScreen() {
        System.out.println("\n***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************\n");


    }

    static void showBalance() {
        System.out.println("\n***************");
        System.out.println("SHOW BALANCE");
        System.out.println("***************\n");

    }

    static void deposit() {
        System.out.println("\n***************");
        System.out.println("DEPOSIT PAGE");
        System.out.println("***************\n");

    }

    static void withdraw() {
        System.out.println("\n***************");
        System.out.println("WITHDRAW PAGE");
        System.out.println("***************\n");
    }



}
