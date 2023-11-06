package com.eniastoscode.amigoscode;

import java.util.List;

public class PrimitivesAndTheirObjects {
    public static void main(String[] args) {
        //int number = 1;
        // number.  don't give methods available but
        // if you want to use number as an Object. See below Integer Object version
        //Integer number = new Integer(1); Exact same thing
        //Every single primitive have an Object version
        // Int > Integer, double > Double, boolean > Boolean, long < Long, float > Float etc
        Integer number = 1;
        //
        List <Integer>numbers = null;
        numbers.add(1);
        numbers.add(2);
        // List alone will accept all primitive data types. Intro to generics <> to specify the data type.
        // numbers.add("Jena"); will then not work on above.
        //int num = null; Does not work but if you expecting null use the Object represantation below.
        Integer num = null;



    }
}
