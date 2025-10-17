import java.util.Scanner;

public class squareMethod {
    public static void main(String[] arg) {


        Scanner scanner = new Scanner(System.in);

        double resultSquare;
        double num;
        double resultCube;
        String firstName;
        String lastName;
        int age;

        System.out.print("Please enter the number you want to use: ");
        num = scanner.nextDouble();

        resultSquare = square(num);
        resultCube = Cube(num);

        System.out.printf("Your number squared is: %.2f\n", resultSquare);
        System.out.printf("Your number Cubed is: %.2f\n", resultCube);


        System.out.println(" ");
        scanner.nextLine();

        System.out.print("Please provide your First name: ");
        firstName = scanner.nextLine();

        System.out.print("Please provide your last name: ");
        lastName = scanner.nextLine();

        System.out.println(" ");

        System.out.println("Your full name is: " + fullName(firstName, lastName));
        System.out.println(" ");

        System.out.print("How old are you, we just want to verify your age: ");
        age = scanner.nextInt();

        scanner.nextLine();
        System.out.println(" ");

        if (ageCheck(age) == true) {
            System.out.println("Okay great, your are valid!");
        } else {
            System.out.println("Awww, you are just a baby....");
        }




        scanner.close();

    }

    static double square(double number){
        return number * number;
    }

    static double Cube(double number) {
        return number * number * number;
    }

    static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
