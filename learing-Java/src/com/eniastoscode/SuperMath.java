package com.eniastoscode;

public class SuperMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Polymorphism through method overloading.
// We can have the same method name but with different behavior and set of
// parameters being passed into it.

//Run-time polymorphism >> Achieved through method overriding and
//Compile-time polymorphism >> Achieved through method overloading by
//overloading same method name with separate number of arguments ie add method