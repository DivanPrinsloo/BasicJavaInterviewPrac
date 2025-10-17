public class stringMethods {
    public static void main(String[] arg) {

        String name = "Divan Prinsloo";
        String name2 = "Divan PriNSLOO";
        String name3 = "         Divan Prinsloo          ";
        String name4 = "Divan Prinsloo";
        String password = "Password";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("V");
        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();
        name2 = name2.toLowerCase();
        name3 =name3.trim();
        name4 = name4.replace("o", "a");


        // always start count at 0

        System.out.println("Length of the whole string: " + length);
        System.out.println("\nChatAt to see letter at position: " + letter);
        System.out.println("\nWhat number position is certain letter at: " + index);
        System.out.println("\nWhere is the last index of the letter: " + lastIndex);
        System.out.println("\nUpper case (toUpperCase): " + name);
        System.out.println("\nLower case (toLowerCase): " + name2);
        System.out.println("\nTrim all empty space in string: " + name3);
        System.out.println("\nReplace all letters o with a in name: " + name4);

        System.out.println("\nAll name.is.. operators");
        System.out.println("Checks if string is empty: " + name.isEmpty());

        if (name.isEmpty()) {
            System.out.println("\nYour name is not empty, hello " + name);
        } else {
            System.out.println("\nYour name is empty");
        }


        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name does not contain any spaces");
        }

        if (password.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }

    }
}
