import java.util.Scanner;

public class searchElementInArray {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,2,5,7,4,8,3,9};


        String target;

        System.out.print("What is the fruit that you are looking for: ");
        target = scanner.nextLine();


        boolean isFound = false;
        String[] fruits = {"Apple", "Orange", "Banana"};
        String strTarget = "Orange";

        /// Linear search

//        for (int i = 0; i < numbers.length;i++) {
//            if(target == numbers[i]) {
//                System.out.println("Your target is at index: " + i);
//                isFound = true;
//                break;
//            }
//        }
//
//        if (!isFound) {
//            System.out.println("Element not found in the array");
//        }


        for (int j = 0; j < fruits.length;++j) {
            if (fruits[j].equals(strTarget)) {
                System.out.println("The position of " + fruits[j] + " is at index: " + j);

            }
        }


    }
}
