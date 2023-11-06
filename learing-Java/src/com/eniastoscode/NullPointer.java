package com.eniastoscode;

import java.util.Locale;

public class NullPointer {
    public static void main(String[] args) {
//       var brand = "eniastoscode";
//       System.out.println(brand.toUpperCase());
        Integer number = null; // int Will not work
        String brand = "eniastoscode";         // Use String
     try {
         System.out.println(brand.toUpperCase());
     } catch (NullPointerException e){
         System.out.println("Brand is null");
     }

        System.out.println(brand);
        if (brand != null) {
           System.out.println(brand.toUpperCase());
       } else {
          System.out.println("Brand is null");
        }
    }
}
//  //brand.toUpperCase will through a NullPointerException
// Null value >> Nothing in it. The variable brand has not been set
// NullPointerException >> Whatever you are trying to access hasn't got
// a value. The process finished with exit code 1
// null value can only be on Objects, Reference types, Complex types.
// If you are expecting nulls in integer values, use the
// wrapper class Integer version.
//--------How to handle NullPointerException----------------
// 1. If statement to check the null values
// 2. The preferred way is the Optional.
// 3. Try to avoid using try...catch to handle null values >>> somewhat
//    expensive to the JVM.
