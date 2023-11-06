package com.eniastoscode;

import java.awt.*;

public class PassByValueVsRef {
    public static void main(String[] args) {
     int x = 0;// It passes a copy of the value not the variaable.
     int y = incrementValue(x);
        System.out.println(x);
        System.out.println(y);
        // Reference types or Objects are passed by reference and
        // Primitives are passed by value. If you pass an object it gets
        // mutated as different from primitive.
        Point point = new Point(100,100);
        changePoint(point);
        System.out.println(point);
    }
    static void changePoint(Point point){
        point.x = 0;
        point.y = 1;
    }
    // void means the function does not return anything.
    static int incrementValue(int value){
        return value + 1;
    }
}
