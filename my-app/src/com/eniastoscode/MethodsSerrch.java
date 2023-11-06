package com.eniastoscode;

import java.util.Arrays;

public class MethodsSerrch {
    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrances(letters, 'B');
        System.out.println(count);
    }

    public static int countOccurrances(char[] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;

            }
        }
            return count;

    }
}

