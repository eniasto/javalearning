package com.eniastoscode;

public class LogicalOperators {
    public static void main (String[] args) {
        Boolean isAdult = false;
        Boolean isStudent = false;
        Boolean isEniastoscodeMember = true;
        System.out.println(isAdult && isStudent);
        System.out.println((!isAdult || isStudent) && !isEniastoscodeMember);
        System.out.println(!isAdult);
        String name = "Milka";
        System.out.println(
                (10 > 8 || 2 <= 2)
                        && !isAdult
                        && name.contains("M"));
    }
}
