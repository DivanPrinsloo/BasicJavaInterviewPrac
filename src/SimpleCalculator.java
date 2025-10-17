import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean aValidOperation = true;

        System.out.print("Enter in the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator: (+ , -, *, /, ^) ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter in the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("You cannot divide by 0");
                    aValidOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("invalid Operator");
                aValidOperation = false;
            }

        }


        if (aValidOperation) {
            System.out.printf("Your output is: %.2f", result);
        }



        scanner.close();
    }
}
