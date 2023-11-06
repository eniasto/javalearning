package com.eniastoscode;

import java.math.BigDecimal;

public class TheBigDecimalClass {
    public static void main(String[] args) {

       /*
        Double numberOne = 0.02;    // or double
        Double numberTwo = 0.03;     // or double
        Double result = numberTwo - numberOne;
        System.out.println(result);   //0.009999999999999998
        */
        BigDecimal numberOne = new BigDecimal("0.04");
        BigDecimal numberTwo = new BigDecimal("0.03");
        BigDecimal result = numberTwo.subtract(numberOne);
        System.out.println(result);  // 0.01

        System.out.println(numberTwo.compareTo(numberOne));
        if (numberTwo.compareTo(numberOne) < 0){ // == 0 or > 0
            // Your logic
            // There are a bunch of methods you can explore and play around.
        }
        // 0  when equal
        // -1 when numberTwo is less
        // 1 when numberTwo is greater.

        /*
        // Comparing BigDecimals
        double a = 1;
        double b = 2;
        System.out.println(a == b);    // a <= b evaluates to true
        // This different with BigDecimal
        */
    }
}

// This teaches the class that will be using when dealing with money.
// The double data type has a certain precision which means that
//sometimes you end up loosing values.
// For this reason you should not use double data type when working
// with money. Neither the Double object.

// The data type that you should  be using when dealing with money is
// the BigDecimal class. >> Values are in double quotes



