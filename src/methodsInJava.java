import java.util.Scanner;

public class methodsInJava {
    public static void main(String[] arg) {
//

        Scanner scanner = new Scanner(System.in);


        String name;
        int age;

        System.out.println("This is a birthday song generator");
        System.out.print("What is your name: ");
        name = scanner.nextLine();

        System.out.print("How old are you turning today: ");
        age = scanner.nextInt();

        System.out.println();

         happyBirthday(name, age);

         scanner.close();

    }


     static void happyBirthday(String name, int age) {
        System.out.println("Happy birthday.... toooo you!");
        System.out.println("Happy birthday.... toooo you!");
        System.out.printf("Happy birthday.... dearrrr %s!\n", name);
        System.out.println("Happy birthday toooo youUUUU!\n");
         System.out.printf("You are %d years old today!\n", age);
    }

}
