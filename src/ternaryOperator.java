import java.sql.SQLOutput;

public class ternaryOperator {
    public static void main(String[] arg) {

        // Ternary operator ?= Return 1 of 2 Vlaues if a condition is true
        // Variable = (Condition) ? ifTure : ifFalse

        int score = 70;

//        if (score >= 60) {
//            System.out.println("PASS");
//        } else {
//            System.out.println("FAIL");
//        }

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";


        System.out.println("Making use of the Tenary operator");
        System.out.println(passOrFail);

        int number = 3;

        String evenOrOdd = (number % 2) == 0 ? "EVEN" : "ODD";

        System.out.println(" ");
        System.out.println("is my number EVEN or ODD: " + evenOrOdd);

        int hours = 13;

        String timeOfDay = (hours < 12) ? "MORNING (AM)" : "EVENING PM";

        System.out.println(" ");
        System.out.println(timeOfDay);

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;


        System.out.println("");
        System.out.println("What is our Tax rate: " + taxRate);
    }
}
