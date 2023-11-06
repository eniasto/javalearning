package com.eniastoscode;

import java.awt.*;
import java.time.LocalDate;
import java.util.Locale;

public class varKeyword {
    public static void main(String[] args) {
       /* String name = "Jamil";
        Point point = new Point(10,10);
        double PI = Math.PI;
        int age = 10;
        LocalDate now = LocalDate.now();*/
        // Using var keyword, the compiler will infer the data type for you.

        var name = "Jamil";
        var point = new Point(10,10);
        var PI = Math.PI;
        var age = 10;
        var now = LocalDate.now();
    }
}
