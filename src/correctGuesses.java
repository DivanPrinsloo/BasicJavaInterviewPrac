import java.util.Scanner;

public class correctGuesses {
    public static void main(String[] arg) {

        // Java quiz game

        String[] questions = {"What is my name?",
                "What is my surname?",
                "What is my fav colour?",
                "What is my age?"};

        String[][] options = {{" 1. Divan\n 2. Sam\n 3. Joe\n 4. John"},
                {" 1. Snyman\n 2. Van Dyk\n 3. Prinsloo\n 4. Albert"},
                {" 1. Green\n 2. Blue\n 3. Black\n 4. Orange"},
                {" 1. 20\n 2. 22\n 3. 25\n 4. 24"}};

        int[] answers = {1, 3, 3, 2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("*****************************");
        System.out.println("Welcome to the guessing game!");
        System.out.println("*****************************");
        System.out.println("");

        for (int i = 0;i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println();
            System.out.print("Enter your guess: (1-4) ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println();
                System.out.println("******************");
                System.out.println("Correct ");
                System.out.println("******************");
                System.out.println();

                score += 1;
            } else {
                System.out.println();
                System.out.println("******************");
                System.out.println("WRONG ");
                System.out.println("******************");
                System.out.println();
            }

        }

        System.out.println("*************************************");
        System.out.println("Your total score is: " + score + "/4");
        System.out.println("*************************************");



        scanner.close();



    }
}
