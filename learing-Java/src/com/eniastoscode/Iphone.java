package com.eniastoscode;

public class Iphone {
    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    public Iphone(){} // By default , every class comes with a constructor

    public Iphone(IphoneModel model,
                  double price,
                  boolean isWaterResistant){
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    public Iphone(IphoneModel model){        // Constructors can not be identical
        this(model,0.00,true);//this(); Means we can call out to other constrcts
        this.model = model;     // When you want to specify the default values.
    }

    public Iphone(IphoneModel model,double price){
        this(model,price,false);
        this.model = model;
        this.price = price;
// Using this(); keyword to invoke other constructors.
    }

    public IphoneModel getModel() {
        return model;
   }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean isWaterResistant) {
        this.isWaterResistant = isWaterResistant;
    }
    // toString >> type toString and press enter or Alt/Shift Insert
    // Select all the fields and have it like below
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
// Defining properties.Private >> Encapsulation >> Hiding data from
// the outside world.
// Defining behaviours >> Methods or some functionality.
// Getters and Setters >> Alt/Shift Insert
// Given a phone , i can request to know the model or the current price.
// with the getters. Can also change/set the attributes with the setters.
// This. is referring to the current instance of the current class.
// Two instances of Iphone by new keyword.
// We use constructors to pass the actual values instead of getters & setters
//This()  invokes other constructors and setting default values

// OOP - Object Oriented Programming
//-------------------------------------------
// Is a programming paradigm that involves classes and objects
// Literally , everything involves classes and objects. And
// There are four main concepts
// 1. Encapsulation 2. Inheritance 3. Polymorphism and 4. Abstraction
// 1. Encapsulation - Data of your classes must be hidden from the
//    outside world and can only be accessible through its own methods.


