import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissors"};
        String playersChoice;
        String computersChoice;
        String playersName;

        int score = 4;
        int playerScore = 0;
        int computerScore = 0;

        String playAgain;

        System.out.println();
        System.out.println("********************************************");
        System.out.println("Welcome to the Rock paper and scissors game!");
        System.out.println("********************************************");
        System.out.println();

        System.out.print("Firstly, what is your name: ");
        playersName = scanner.nextLine();

        System.out.println();

        System.out.println("*******************************");
        System.out.println("Welcome " + playersName + "!");
        System.out.println("Good luck!");
        System.out.println("*******************************");

        System.out.println();


        do {

            System.out.print("Make your play: (rock,paper or scissors) ");
            playersChoice = scanner.nextLine();

            System.out.println();

            computersChoice = choices[random.nextInt(3)];

            System.out.println(options(computersChoice));
            System.out.println();

            if (!playersChoice.equals("rock") &&
                    !playersChoice.equals("paper") &&
                    !playersChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                continue;
            }



                if (playersChoice.equals(computersChoice)) {
                    System.out.println("It is a TIE");
                } else if(playersChoice.equals("rock") && computersChoice.equals("scissors")) {
                    System.out.println("You WON!");
                    playerScore += 1;
                } else if(playersChoice.equals("scissors") && computersChoice.equals("paper")) {
                    System.out.println("You WON!");
                    playerScore += 1;
                } else if(playersChoice.equals("paper") && computersChoice.equals("rock")) {
                    System.out.println("You WON!");
                    playerScore += 1;
                } else if(playersChoice.equals("paper") && computersChoice.equals("scissors")) {
                    System.out.println("You LOST!");
                    computerScore += 1;
                } else if(playersChoice.equals("rock") && computersChoice.equals("paper")) {
                    System.out.println("You LOST!");
                    computerScore += 1;
                } else {
                    System.out.println("You LOST!");
                    computerScore += 1;
                }

            System.out.println();
            System.out.println(playersName + ": " + playerScore +" | " + "Computer score: " + computerScore);
            System.out.println();



        } while (playerScore != 3 && computerScore != 3);

        if (playerScore == 3) {
            System.out.println("Well done you won!");
        } else {
            System.out.println("Unlucky, the computer won!");
        }


        scanner.close();

    }
    static String options (String option) {


        String rock = """
                     Computers play!
                    
                    ██████╗  ██████╗  ██████╗██╗  ██╗
                    ██╔══██╗██╔═══██╗██╔════╝██║ ██╔╝
                    ██████╔╝██║   ██║██║     █████╔╝
                    ██╔══██╗██║   ██║██║     ██╔═██╗
                    ██║  ██║╚██████╔╝╚██████╗██║  ██╗
                    ╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝
                """;

        String paper = """
                     Computers play!
                    
                    ██████╗  █████╗ ██████╗ ███████╗██████╗
                    ██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗
                    ██████╔╝███████║██████╔╝█████╗  ██████╔╝
                    ██╔═══╝ ██╔══██║██╔═══╝ ██╔══╝  ██╔══██╗
                    ██║     ██║  ██║██║     ███████╗██║  ██║
                    ╚═╝     ╚═╝  ╚═╝╚═╝     ╚══════╝╚═╝  ╚═╝
                    """;

        String scissors = """
                     Computers play!
                    
                    ███████╗ ██████╗██╗███████╗███████╗ ██████╗ ██████╗ ███████╗
                    ██╔════╝██╔════╝██║██╔════╝██╔════╝██╔═══██╗██╔══██╗██╔════╝
                    ███████╗██║     ██║███████╗███████╗██║   ██║██████╔╝███████╗
                    ╚════██║██║     ██║╚════██║╚════██║██║   ██║██╔══██╗╚════██║
                    ███████║╚██████╗██║███████║███████║╚██████╔╝██║  ██║███████║
                    ╚══════╝ ╚═════╝╚═╝╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝
                """;

        switch (option) {
            case "scissors" -> option = scissors;
            case "paper" -> option = paper;
            case "rock" -> option = rock;
        }


        return option;
    }
}
