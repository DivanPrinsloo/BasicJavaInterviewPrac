import java.sql.SQLOutput;
import java.sql.SQLSyntaxErrorException;

public class Variable {

    public static void main(String[] arg) {
        // Notes

        // Variable = a reusable container for a value
        //            a varialbe behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the heap

        // Primitive VS Reference
        // --------    ---------
        // int          string
        // double       array
        // char         object
        // boolean

        // 2 Steps to creating a variable
        // -------------------------------
        // 1. Decleration
        // 2. assignment

        int age = 30;
        double ageDouble = 30.5;
        int year = 2025;

        System.out.println(age);
        System.out.println(ageDouble);
        System.out.println("The year is " + year);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(currency);

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        System.out.println(isStudent);

        if (isStudent) {
            System.out.println("You are a student!"); // If True

        }
        else {
            System.out.println("You are not a student!"); // If false
        }

        // Reference data types

        String name = "Divan Prinsloo ";
        String food = "Pizza";
        String email = "Fake@gmai.com";
        String  car = "Mustang";
        String colour = "Red";

        System.out.println(name);

        System.out.println("Hello " + name);

        System.out.println("Your favourtie food is " + food);

        System.out.println("Your email is " + email + " and your name is " + name);

        System.out.println("My future car is " + car);


        // Exerciess

        int price = 50000;

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("My gpa is " + 3.5);

        System.out.println("Your choice is a " + colour + " " + year + " " +  car);

        if (forSale) {
            System.out.println("The " + car + " is for sale, at the price " +
                    "$" + price);
        } else {
            System.out.println("The " + car + " is not for sale");
        }
    }
}

