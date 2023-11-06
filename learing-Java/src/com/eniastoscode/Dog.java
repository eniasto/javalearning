package com.eniastoscode;

public class Dog implements AnimalIInterface{
    private String breed;
    private String name;
    public Dog(String name, String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }

    @Override
    public String getName() {
        return this.name;
    }
    // super means the variable name in Dog class will be passed inside our
    // super class i.e Animal. No need to say this.name in Dog class
    // Dog can have its own properties.
}
