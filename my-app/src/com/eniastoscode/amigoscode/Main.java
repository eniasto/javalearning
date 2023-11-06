package com.eniastoscode.amigoscode;

public class Main {
    public static void main (String[] args) {
        //Primitive and References Types differences
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a " + a + " -b = " + b);
        Person alex = new Person("alex");
        Person marriam = alex;

        System.out.println("Before changing alex");
        System.out.println(alex.name + " " + marriam.name);

        marriam.name = "Mariam";

        System.out.println("After changing alex");
        System.out.println(alex.name + " " + marriam.name);
    }
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
