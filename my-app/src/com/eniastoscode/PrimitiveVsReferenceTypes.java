package com.eniastoscode;

public class PrimitiveVsReferenceTypes {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a= 100;
        System.out.println("a = " +a + " - b = " +b);

        Person alex = new Person("Alex");
        Person mariam = alex;

        System.out.println("Before changing alex");
        System.out.println(alex.name + " " + mariam.name );

        alex.name = "Alexander";

        System.out.println("After changing alex");
        System.out.println(alex.name + " " + mariam.name );
    }

    static class Person {
        String name;
        Person (String name) {
            this.name = name;
        }
    }
}
