import java.util.Arrays;

public class detectingAnagrams {
    public static void main(String[] args) {

        String str = "listen silent act cat dog";

        String[] words =str.split(" ");

        for (int i = 0; i < words.length; i++ ) {
            for (int j = i + 1; j < words.length; j++) {
                if ( areAnagrams(words[i], words[j])) {
                    System.out.println("Word '" + words[i] + "' and word '"
                    + words[j] + "' are anagrams");
                }
            }

        }
+
    }

    static boolean areAnagrams(String words1, String words2) {



        if (words1.length() != words2.length()) {
            return false;
        }


        char[] arr1 = words1.toCharArray();
        char[] arr2 = words2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1);
        System.out.println(arr2);

        return Arrays.equals(arr1,arr2);



    }
}
