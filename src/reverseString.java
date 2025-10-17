public class reverseString {
    public static void main(String[] args) {

        String str = "ABCD!";
        String rev = "";


        System.out.println("Original string: " + str);;

        boolean hasEx = str.endsWith("!");

        if (hasEx) {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println(str);

        int len = str.length();

        System.out.println(len);

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("This is the value of the result without !" + rev);

    }
}
