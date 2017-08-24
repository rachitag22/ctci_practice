/* Cracking the Coding Interview */
/* Chapter 1: Arrays and Strings */
/* 1.6 - Rotate Matrix */

import java.util.Arrays;

public class CTCI_1_7 {

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];



    }

    public static String rotateMatrix(String string) {

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
