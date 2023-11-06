package com.eniastoscode.amigoscode;

import java.awt.*;

public class PassByValVsRef {
    public static void main (String[] args) {
        
        int x = 0;
        int y = incrementValue(x);
        incrementValue(x);
        System.out.println(x);
        System.out.println(y);
        //
        Point point = new Point(100, 100);
        changePoint(point);
        System.out.println(point);

    }
    static void changePoint(Point point) {
        point.x = 0;
        point.y = 0;
    }
    static int incrementValue(int value) {
       // value++; same as
        return value + 1;
    }

}
