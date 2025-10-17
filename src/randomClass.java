import java.util.Random;

public class randomClass {
    public static void main(String[] arg) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 101); // between 1 and 5
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println("Int Random numbers: ");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println("");
        System.out.println("Double random number: ");

        double number;
        number = random.nextDouble();

        System.out.println(number);

        boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println(" ");
        System.out.println("Random boolean");

        if (isHeads == true) {
            System.out.println("Coin flip: Heads");
        } else {
            System.out.println("Coin flip: Tails");
        }

    }
}
