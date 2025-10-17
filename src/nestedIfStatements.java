public class nestedIfStatements {
    public static void main(String[] arg) {

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You are a senior and will receive a 20% discount");
                System.out.println("You are also a Student, so you will receive an additional 10% discount");
                price = price * 0.7;
            }
            else {
                System.out.println("You are a Student discount, and will receive a 10% discount");
                price = price * 0.9;
            }
        }
        else {
            if (isSenior) {
                System.out.println("You will receive a Senior discount only, at 20%");
                price = price * 0.8;
            } else {
                System.out.println("You will not be receiving any discount");
                price = price * 1;
            }
        }

        System.out.printf("The price of a ticket us: R%.2f", price);

    }
}
