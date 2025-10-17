import java.util.Scanner;

public class Rectangle {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter in a width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + "cm²"); //0178 + alt

        scanner.close();

    }
}
