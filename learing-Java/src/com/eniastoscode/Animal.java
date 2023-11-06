package com.eniastoscode;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    // Anyone that extends this class has to implement this method.
    // An abstract method has no implementation.

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

// Inheritance >> Is a process where an object acquires all the properties
// and behaviour of a parent object

// Abstraction >> Is a process of hiding certain details and showing
// only the essential information to our users.
// This can be done by Abstract classes or Interfaces
// With abstract classes , we can have abstract methods
// Polymorphism >> Means many forms eg the plus sign concatenate strings
// perform arithmetic operation on numbers.