package com.eniastoscode;

import java.time.LocalDate;
import java.util.Locale;

public class ReferenceTypes {
    public static void main (String[] args) {
        String name =  "eniastoscode";
        System.out.println(name.toUpperCase());
        LocalDate nowdate = LocalDate.now();
        System.out.println(nowdate.getMonth());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        String code = "code";
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
    }

}
