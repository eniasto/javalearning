package com.eniastoscode;

public class WorkingWithExceptions {
    public static void main(String[] args) {
        // Intro to exceptions.
        //String brand = "eniastoscode";
        String brand = null;
        //System.out.println(brand.length());
        try {
            System.out.println(brand.length());
        } catch(Exception e){ // The root Exception will also work
            System.out.println("Brand was null" + e); //Default behaviour when null
        }
    }
}

// Exception handling >> Handling errors with Java allowing applications
// to run even if there are exceptions.
// There is class called Exception and is the root of all exceptions.
// We specified NullPointerException since we know the exception.