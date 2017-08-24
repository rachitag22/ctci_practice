/* Cracking the Coding Interview */
/* Chapter 1: Arrays and Strings */
/* 1.5 - One Away */

import java.util.Arrays;

public class CTCI_1_5 {

    public static void main(String[] args) {

        String s1, s2;

        s1 = "hello";

        s2 = "hello2";
        System.out.printf("%s and %s: %s \n", s1, s2, oneAway(s1, s2));

        s2 = "hell";
        System.out.printf("%s and %s: %s \n", s1, s2, oneAway(s1, s2));

        s2 = "hellp";
        System.out.printf("%s and %s: %s \n", s1, s2, oneAway(s1, s2));

        s2 = "helfd";
        System.out.printf("%s and %s: %s \n", s1, s2, oneAway(s1, s2));

        s2 = "helasdfasdffd";
        System.out.printf("%s and %s: %s \n", s1, s2, oneAway(s1, s2));
    }

    public static boolean oneAway(String string1, String string2) {

        int[] letters = new int[128];

        for (int i = 0; i < string1.length(); i++) {
            letters[(int) string1.charAt(i)] += 1;
        }

        for (int i = 0; i < string2.length(); i++) {
            letters[(int) string2.charAt(i)] -= 1;
        }

        int negCount = 0;
        int posCount = 0;


        for (int i = 0; i < 128; i++) {
            if (letters[i] == -1) {
                negCount++;
            }
            if (letters[i] == 1) {
                posCount++;
            }
        }

        if (negCount > 1 || posCount > 1) {
            return false;
        }

        return true;
    }
}
