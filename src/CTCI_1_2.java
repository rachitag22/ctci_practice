/* Cracking the Coding Interview */
/* Chapter 1: Arrays and Strings */
/* 1.2 - Check Permutation */

public class CTCI_1_2 {

    public static void main(String[] args) {

        String s1, s2;

        s1 = "hello";
        s2 = "olaehl";

        System.out.printf("%s and %s: %s \n", s1, s2, checkPermutation(s1, s2));


        s1 = "hello";
        s2 = "ellho";

        System.out.printf("%s and %s: %s \n", s1, s2, checkPermutation(s1, s2));

        s1 = "hello";
        s2 = "ellasdfho";

        System.out.printf("%s and %s: %s \n", s1, s2, checkPermutation(s1, s2));

    }

    public static boolean checkPermutation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] letters = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            int letterNum = (int) c;
            letters[letterNum] += 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            int letterNum = (int) c;
            letters[letterNum] -= 1;
        }

        for (int i = 0; i < 128; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }

        return true;
    }

}
