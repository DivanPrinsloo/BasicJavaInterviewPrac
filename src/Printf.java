public class Printf {
    public static void main(String[] arg) {

        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        String name  = "Spongebob";
        char firstletter = 's';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        //[Specifier-characters]

        System.out.printf("Hello %s" , name); //Hello Spongebob
        System.out.printf("\nYour name starts with a %c", firstletter);
        System.out.printf("\nYou are %d years old", age);

        System.out.printf("\nYou are %f inches tall", height);
        System.out.printf("\nEmployed: %b", isEmployed);
        System.out.printf("\n%s is %d years old", name, age);

        System.out.println("\n");

        //[.Precision]

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;
        double price4 = 423423;

        System.out.println("Precision");

        System.out.printf("%.1f", price1);
        System.out.printf("\n%.2f", price2);
        System.out.printf("\n%.3f", price3);

        //Flags
        System.out.println("");
        System.out.println("\nFlags");
        System.out.printf("%.3f", price1);
        System.out.printf("\n%+.3f", price2);
        System.out.printf("\n%(+,.3f", price3);
        System.out.printf("\n% .3f", price4);

        //Width

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;  // One digit
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.println("\n");
        System.out.println("Width work: ");

        System.out.println("Using 04 to space");

        System.out.printf("%04d", id1);
        System.out.printf("\n%04d", id2);
        System.out.printf("\n%04d", id3);
        System.out.printf("\n%04d", id4);

        System.out.println("\n");

        System.out.println("Using 4 for left");

        System.out.printf("%4d", id1);
        System.out.printf("\n%4d", id2);
        System.out.printf("\n%4d", id3);
        System.out.printf("\n%4d", id4);

        System.out.println("\n");

        System.out.println("Using - for left");

        System.out.printf("%-4d", id1);
        System.out.printf("\n%-4d", id2);
        System.out.printf("\n%-4d", id3);
        System.out.printf("\n%-4d", id4);

    }
}
