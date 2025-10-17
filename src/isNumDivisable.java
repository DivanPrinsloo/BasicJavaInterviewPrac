import java.util.Scanner;

public class isNumDivisable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Please enter the number you want to check: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("You have provided an even number");
        } else {
            System.out.println("You have provided an odd number");
        }


        scanner.close();
    }
}
