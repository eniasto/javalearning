package com.eniastoscode.amigoscode;

import java.awt.*;

public class FinaKeyword {
    public static void main(String[] args) {
        final var name = "Anna";
        final var number = Math.PI;
        final Point point = new Point(0,0);
      //  point = new Point(100,100)  Re-assigning the object is not allowed with the Final keyword
        // You are still able to change the actual attributes of the object as below without using new keyword.
        point.x = 100;
        point.y = 100;
        System.out.println(point.x + " " + point.y);

    }
}
