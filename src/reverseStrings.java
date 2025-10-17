public class reverseStrings {
    public static void main(String[] args) {

            ///  take the string that I already have
                ///  extract from back to front
                ///  three methods of acheiving this
                ///

                String str = "ABCD!";
                String ends = "";
                String rev = "";
                boolean endWith = str.endsWith("!");

                int lenStr = str.length();

                if (endWith) {

                    str = str.substring(0, str.length() - 1);
                }


                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }

        System.out.println("The string without the !" + rev);
        System.out.println();

                if (endWith) {
                    rev = rev + "!";
                }

        System.out.println("String with the ! on the end: " + rev);

    }
}
