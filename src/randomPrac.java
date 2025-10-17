import java.util.Scanner;

public class randomPrac {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String reversed;

        System.out.println("Please enter your name: ");
        name = scanner.nextLine();

        for (int i = 1; i >= name.length();i++) {
            System.out.println(name.charAt(i));
        }


       // System.out.println(reversed);

        scanner.close();



    }
}
