import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayInJava {
    public static void main(String[] arg) {


    String[] fruits = {"Banana","Apple","Orange","Coconut"};

        fruits[0] = "Pineapple";

        Arrays.sort(fruits); /// Used for sorting the array, automatically alphabetical


        int numFruits = fruits.length;

        System.out.println(numFruits);
        System.out.println("");

        System.out.println(fruits[0]); /// Certain position inside the array list
        System.out.println("");


        for (int i = 0; i < fruits.length;i++) {
            System.out.print(fruits[i] + " ");   /// Using a for loop to output each element in the array
        }

        System.out.println(" ");

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        System.out.println(" ");

        Arrays.fill(fruits, "pineapple"); /// Used to fill the array with a cetain value

        for (String pineapple : fruits) {
            System.out.print(pineapple + " "); /// This is an enhanced For loop, State a new
                                                        /// variable acting as i, and go through fruits array
        }





    }
}
