import java.util.Scanner;

public class twodArray {
    public static void main(String[] arg) {

//     //   String[] fruit = {"apple","orange","banana"};
//        String[] vegtables = {"potato","onion","carrot"};
//        String[] meats = {"chicken","pork","fish"};
//
//
//        String[][] groceries = {{"apple","orange","banana"},
//                vegtables,
//                meats};
//
//        groceries[0][0] = "pineapple";
//        groceries[1][0] = "celery";
//        groceries[2][1] = "eggs";
//
//        for (String[] foods : groceries) {
//            for (String items: foods) {
//                System.out.print(items + " ");
//            }
//            System.out.println();
//        }


        Scanner scanner = new Scanner(System.in);

        String input;
        boolean isDone = true;
        String fullPhone = "";

        System.out.println("Welcome to the Phone line ");

        System.out.println();
        String[][] telephones = {{"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"*", "0", "#"}};


        for (String[] row : telephones) {       /// visual : Char[] row -> array that looks like this {'row one', 'row two', 'row three', 'row four'}
            for (String num : row) {                              ///  then we loop like this, foor loop -> row one -> loop through row one eg. 1, 2, 3
                System.out.print(num + " ");                                /// then move to row two and three and do the same and it will output them
            }
            System.out.println();
        }

        while (isDone) {

            System.out.println();
            System.out.println("Type * when you are done!");
            System.out.print("Please enter the first digit you want to output: ");
            input = scanner.nextLine();



           if (input.equals("*")) {
               isDone = false;
           } else {
               System.out.println();
               System.out.println(phonePad(input));
           }

            fullPhone = fullPhone + input;

        }


        System.out.println(fullPhone);
        scanner.close();
    }

    static String phonePad (String input) {

        String output = "";

        String dialTwo = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialOne = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialThree = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialFour = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialFive = """
                1  2  3
                4  Ƽ  6
                7  8  9
                *  0  #
                """;

        String dialSix = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialSeven = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialEight = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialNine = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialStar = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialZero = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        String dialHash = """
                1  2  3
                4  5  6
                7  8  9
                *  0  #
                """;

        switch (input) {
            case "1" -> output = dialOne;
            case "2" -> output = dialTwo;
            case "3" -> output = dialThree;
            case "4" -> output = dialFour;
            case "5" -> output = dialFive;
            case "6" -> output = dialSix;
            case "7" -> output = dialSeven;
            case "8" -> output = dialEight;
            case "9" -> output = dialNine;
            case "*" -> output = dialStar;
            case "0" -> output = dialZero;
            case "#" -> output = dialHash;


        }

        return output;

    }
}
