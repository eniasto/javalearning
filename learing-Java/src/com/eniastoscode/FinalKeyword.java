package com.eniastoscode;

import java.awt.*;

public class FinalKeyword {
    public static void main(String[] args) {
        // The final keyword tells it not to change the original value
        // once initialised.
        // Also works with Methods and classes
       final var name = "Anna";
        //name = "Alex"; does not work
        //name = "Jamilla"; does not work
        final var number = Math.PI; // use it when you know that
        // number will not change.
        //number++  does not work unless final keyword is removed.
        final Point point = new Point(0,0);
        //point = new Point(100,100); not allowed
        // to re-assign,however you can change
        //the actual content by
        point.x = 100;
        point.y = 100;
    }
}
