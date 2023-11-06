package com.eniastoscode;

public class Cat implements AnimalIInterface{
    private String name;
    public Cat(String name){
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Miaow Miaow");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

// When to use Abstract classes vs interfaces.
// Interfaces is for scenarios where you may have more than one
// implementation and abstract classes should be used when you have some
// common code that should be used across all sub classes.
// Also with interfaces , you can have class implementing more than one
// interfaces.
// With abstract classes , you can only extend one class.
//, you can have both abstract methods and regular methods.


//NB Interface is a class where you define abstract method that anyone
// who wishes to use this interface must implement all of the methods
//defined inside of the interface.

