package com.eniastoscode;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

public class Statics {
    public static String BRAND;
        // Defining constants using static.
    static List list;
    static {     // Also static block to initialize any static fields.
        BRAND = "eniastoscode";
        list = new List();
        list.add("");
        }

    public static void main(String[] args) {
        // psvm is the entry point of every java program. This has to be
        // static. If you remove static, the run green buttons disappear.
        // static - Methods or variables belong to a class
        // Usually used for some shared data across all the objects.
        Person alex = new Person("alex");
        Person bob = new Person("bob");
        System.out.println(alex.name);
        System.out.println(bob.name);
        System.out.println(Person.createdPeople);
    }
    static class Person{
        static int createdPeople = 0; // This variable shared among all Obj
        String name;                  //Simply defining a way of
        Person(String name){            // creating people
            this.name = name;
            createdPeople++;
        }
    }
}
// static means the class or method belongs to class itself instead of
// object or instances