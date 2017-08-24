/* Cracking the Coding Interview */
/* Chapter 1: Arrays and Strings */
/* 1.6 - String Compression */

import java.util.Arrays;

public class CTCI_1_6 {

    public static void main(String[] args) {

        String s;

        s = "aabbddbbeeedd";
        System.out.printf("%s: %s \n", s, stringCompression(s));

        s = "asdffadjkfsafkdd";
        System.out.printf("%s: %s \n", s, stringCompression(s));

        s = "ppqqqqieeeffbby";
        System.out.printf("%s: %s \n", s, stringCompression(s));
    }

    public static String stringCompression(String string) {

        StringBuilder compressedString = new StringBuilder();

        char currentChar = string.charAt(0);
        int currentCount = 0;

        for (int marker = 0; marker < string.length(); marker++) {
            if (string.charAt(marker) == currentChar) {
                currentCount++;
            } else {
                compressedString.append(currentChar);
                compressedString.append(currentCount);
                currentChar = string.charAt(marker);
                currentCount = 1;
            }
        }

        compressedString.append(currentChar);
        compressedString.append(currentCount);

        if (compressedString.length() > string.length()) {
            return string;
        }

        return compressedString.toString();
    }
}
