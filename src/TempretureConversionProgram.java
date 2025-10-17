import java.util.Scanner;

public class TempretureConversionProgram {
    public static void main(String[] arg) {

        //Tempreture conversion program

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("What is the Tempreture from where you are?: ");
        temp = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Convert to Celcius  or Farenheit? (C OR F): ");
        unit = scanner.next().toUpperCase();

//        System .out.println(temp);
//        System.out.println(unit);

//(unit.equals())


//        if (unit.equals("C")) {
//            newTemp = (temp * 9/5) + 32;
//            System.out.printf("The Tempreture in Farenheit is: %.2fF", newTemp);
//        } else {
//            newTemp = (temp - 35) / 9/5;
//            System.out.printf("The Tempreture in Celcuis is: %.2fC ", newTemp);
//        }

         newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32 ;

        System.out.printf("Your converted temp is: %.2f° %s", newTemp, unit);

        scanner.close();


    }
}
