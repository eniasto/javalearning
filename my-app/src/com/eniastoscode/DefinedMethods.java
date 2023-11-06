package com.eniastoscode;

import java.util.Arrays;

public class DefinedMethods {
    // User defined methods
    public static void main (String[] args) {
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrances(letters,'D');
        System.out.println(count);
    }
    public static int countOccurrances(char [] letters, char searchLetter) {
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);
        return -1;
    }
}
