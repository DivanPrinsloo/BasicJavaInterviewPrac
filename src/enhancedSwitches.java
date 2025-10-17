import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("What day of the week is it? (i.e Monday) ");
        day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday",
                 "Thursday", "Friday" -> System.out.println("It is a week day");

            case "Saturday", "Sunday" -> System.out.println("It is the weekend");

            default -> System.out.println(day + " Does not exist");
        }

        scanner.close();
    }
}
