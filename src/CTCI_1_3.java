/* Cracking the Coding Interview */
/* Chapter 1: Arrays and Strings */
/* 1.3 - URLify */

import java.util.Arrays;

public class CTCI_1_3 {

    public static void main(String[] args) {

        char[] string;

        string = new char[]{'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};

        System.out.printf("%s: %s \n", Arrays.toString(string), Arrays.toString(urlify(string, 13)));
    }

    public static char[] urlify(char[] string, int length) {

        int rightMarker = string.length - 1;
        int leftMarker = string.length - 1;

        while (string[leftMarker] == ' ') {
            leftMarker--;
        }

        for (; leftMarker >= 0; leftMarker--) {
            if (string[leftMarker] != ' ') {
                string[rightMarker] = string[leftMarker];
                rightMarker--;
            } else {
                string[rightMarker] = '0';
                string[rightMarker-1] = '2';
                string[rightMarker-2] = '%';
                rightMarker -= 3;
            }
        }

        return string;
    }
}
