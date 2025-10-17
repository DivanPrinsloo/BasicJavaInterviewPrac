import java.util.Scanner;

public class Scan {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Grabs from the next line, after "Enter your name //Next does not read after any spaces

        System.out.print("Enter your age: " );
        int age = scanner.nextInt();

        System.out.print("What is your average grade?");
        double mark = scanner.nextDouble();

        System.out.print("Are you a student? (true) or (false)");
        boolean isStudent = scanner.nextBoolean();


            /// //////////////////////////
        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Average was: " + mark);
        // System.out.println(isStudent);

        if (isStudent) {
            System.out.println("You are an enrolled student");
        } else {
            System.out.println("You are not an enrolled student");
        }

        // Putting an Integer input and them a string input error


        System.out.print("\n Enter a number between 5 - 10: ");
        int number = scanner.nextInt();

        //Insert buffer to fix
        scanner.nextLine();

        System.out.print("Enter a car brand: ");
        String brand = scanner.nextLine();

        // The reason this error happens, is because after pressing enter on the int input
        //     It still keeps the \n char, which it then accepts as the input for the String

        System.out.println("Your number is " + number);
        System.out.println("Your car brand is " + brand);



        scanner.close();
    }
}
