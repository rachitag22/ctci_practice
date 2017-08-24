/* Cracking the Coding Interview */
/* Chapter 1: Arrays and Strings */
/* 1.1 - Is Unique */

public class CTCI_1_1 {

    public static void main(String[] args) {

        String s;

        s = "asdfghjk";

        System.out.printf("%s: %s \n", s, isUnique(s));

        s = "aafnlwkqrej";

        System.out.printf("%s: %s \n", s, isUnique(s));

    }

    public static boolean isUnique(String s) {

        char[] letters = new char[128];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int letterNum = (int) c;
            letters[letterNum] += 1;

            if (letters[letterNum] > 1) {
                return false;
            }
        }

        return true;
    }
}
