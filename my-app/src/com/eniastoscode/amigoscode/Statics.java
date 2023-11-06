package com.eniastoscode.amigoscode;

import java.rmi.AlreadyBoundException;
import java.util.ArrayList;
import java.util.List;

public class Statics {

    // Defining constants
    public static String BRAND ;  // Constants should be all UPPERCASE
    static List list;

    static {
        BRAND = "amigoscode"; // static can also be used initializing static fields.
        list = new ArrayList();
        list.add("");
    }

    public static void main(String[] args) {
        // psvm is the entry point for every Java program. If static is removed from the above
        //you will see that there is no way you can execute the program. Those green arrows will disappear.
        //static means that whether it's a method or a variable it belongs to a class.
        //Usually used to have some shared data across all the objects
        Person alex = new Person("alex");
        Person bob = new Person("bob");
        //System.out.println(alex.createdPeople); This works as well but below is the better way.
        System.out.println(alex.name);
        System.out.println(bob.name);
        // The static value of createPeople is shared among the two objects Bob and Alex
        System.out.println(Person.createdPeople);
    }

    static class Person{
        static int createdPeople = 0;
        //static class person because this will be used directly inside the static method.
        String name;
        Person(String name) {
            //Statics.BRAND Can be accessed in Person class
            this.name = name;
            createdPeople++;
        }
    }
}
