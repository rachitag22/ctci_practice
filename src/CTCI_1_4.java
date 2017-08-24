/* Cracking the Coding Interview */
/* Chapter 1: Arrays and Strings */
/* 1.4 - Palindrome Permutation */

import java.util.Arrays;

public class CTCI_1_4 {

    public static void main(String[] args) {

        String s;

        s = "tact coa";
        System.out.printf("%s: %s \n", s, palindromePermutation(s));

        s = "racecarasdfasdf";
        System.out.printf("%s: %s \n", s, palindromePermutation(s));

        s = "tact coal";
        System.out.printf("%s: %s \n", s, palindromePermutation(s));

        s = "tacasfsdf";
        System.out.printf("%s: %s \n", s, palindromePermutation(s));
    }

    public static boolean palindromePermutation(String string) {

        int[] letters = new int[128];

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                continue;
            }
            letters[(int) string.charAt(i)]++;
        }

        int oddCount = 0;

        for (int i = 0; i < 128; i++) {
            if (oddCount > 1) {
                return false;
            }

            if (letters[i] % 2 == 1) {
                oddCount++;
            }
        }

        return true;
    }
}
