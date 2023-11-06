package com.eniastoscode.amigoscode;

public class Iphone {
    private String model;
    private double price;
    private boolean isWaterResistant;
// Alt Shift Insert or Code menu > generate > Getter,setter


    public Iphone(){} // By default every single class comes with a different Constructor.

    public Iphone(String model,
                  double price,
                  boolean isWaterResistant){
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }
    // We can have many constructors as you want but they don't have to be identical

    public Iphone (String model){
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
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

    public void setWaterResistant(boolean waterResistant) {
        this.isWaterResistant = waterResistant;
    }
}
