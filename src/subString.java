import java.util.Scanner;

public class subString {
    public static void main(String[] arg) {

        // .substring() = A method used to extract a portion of a string
                // string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;


        System.out.print("Enter your email: ");
        email = scanner.nextLine();


      //  String email = "divanp834@gmail.com";

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("You did not include an @ sign for your email");
        }


        scanner.close();
    }
}
