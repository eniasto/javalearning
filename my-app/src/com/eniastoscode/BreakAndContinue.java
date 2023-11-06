package com.eniastoscode;

public class BreakAndContinue {
    public static void main(String[] args) {
        //Loops
        String[] names = {"Ali", "Anna", "Bob", "Mike"};
        for (String name : names) {
            if (name.equals("Bob")) {
                break;
            }
            System.out.println(name);
        }
    }
}
