import java.util.Scanner;

public class logticalOperators {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

//        double temp;
//        boolean isSunny = true;

//        System.out.print("What is the Temperature today?: ");
//        temp = scanner.nextDouble();

//        if (temp <= 30 && temp >= 20 && isSunny) {
//            System.out.println("Your temp is between 20 and 30 degrees, it is GOOD");
//            System.out.println("It is sunny today");
//        } else {
//            if (temp <= 19 && temp >= 0) {
//                System.out.println("it is quite chilly today, between 0 and 19 degrees");
//            } else {
//                System.out.println("It is cook hot today");
//            }
//        }

//        if (temp <= 30 && temp >= 20) {
//            if (isSunny) {
//                System.out.println("The sun us out!");
//            } else {
//                System.out.println("It is a cloudy day");
//            }
//            System.out.println("The temperature is lovely today");
//        } else{
//            if (isSunny) {
//                System.out.println("It is cold as, but the sun is out at least");
//            } else {
//                System.out.println("It is cold as today");
//                System.out.println("And the stupid sun is not out");
//            }
//
//        }


//        if (temp >= 30 || isSunny) {
//            System.out.println("It might seem to be a loveley day outside, wear shorts");
//        } else {
//            System.out.println("It is most likely a shit day, stay inside or wear winter fits");
//        }

        //Username rule:
        // Must be between 4-12 chars
        //Username must not contain spaces or _

        String username;

        System.out.println("Your username must obey these rules:\n- No spaces\n- " +
                "No _ used\n- Must be between 4 and 12");
        System.out.print("Please enter your new username: ");
        username = scanner.nextLine();

        if (username.contains("_") || username.contains(" ")) {
            System.out.println("You have used one of the listed characters that can't be used");
        } else if(username.length() > 12 || username.length() < 4) {
            System.out.println("Your username is too long, must be between 4 and 12");
        } else {
            System.out.println("Your username is: " + username);
        }

        scanner.close();

    }
}
