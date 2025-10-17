import java.util.Scanner;

public class Maths {
    public static void main(String[] arg) {

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//
//        result = Math.pow(2,4);
//        result = Math.abs(-5);
//        result = Math.sqrt(9);
//        result = Math.round(3.14);
//        result = Math.ceil(3.14);
//        result = Math.floor(3.5);
//        result = Math.max(10, 20);
//        result = Math.min(10,20);
//
//
//        System.out.println(result);

        // Hipothenuse c = Math.sqprt(a2 + b2)

//        Scanner scanner = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the length of side A: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter the length of side B: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The hypothenuse length is equal to: " + c + "cm");
//
//        scanner.close();


        // Exercise Three
        // Circumfernce = 2 * Math.PI * radius
        // Area = (4.0 / 3.o0) * Math.PI * Math.pow(radius, 3)


        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double Volume;
        double Area;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;

        Area = Math.PI * Math.pow(radius, 2);

        Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);


        System.out.printf("The Circumference is: %.2fcm" ,  circumference);

        System.out.printf("\nThe Volume is: %.2fcm³" , Volume);

        System.out.printf("\nThe Area is: %.2fcm²" , Area);   // Printf is for roudning (" dadad %.2fcm" , value)
                                                                //  output will round by 2 and have cm at the end



        scanner.close();
    }
}
