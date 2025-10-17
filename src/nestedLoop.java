import java.util.Scanner;

public class nestedLoop {
    public static void  main(String[] arg) {

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);

        int row;
        int cols;
        char symbol;

        System.out.println("Welcome to the pattern creator!");

        System.out.print("Please enter the Symbol you want to display: (A single char) ");
        symbol = scanner.next().charAt(0);

        System.out.print("Enter the amount of rows you want to display: ");
        row = scanner.nextInt();

        System.out.print("Please enter the amount of columns you would like: ");
        cols = scanner.nextInt();

        System.out.println();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }







        scanner.close();

    }
}
