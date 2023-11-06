package com.eniastoscode.amigoscode;

public class Classes {
    public static void main(String[] args) {
        // A class is a blue print or template for creating anything you can think of in the real
        // world or in terms of software.
        Iphone iphone7Plus = new Iphone("7+");
        //Iphone iphone8XMax = new Iphone();

       // iphone8XMax.setModel("X Max");
        //iphone8XMax.setPrice(200.00);
        //iphone8XMax.setWaterResistant(false);

        //iphone7Plus.setModel("7+");
        iphone7Plus.setPrice(200.00);   // We can use the setter method just to change the price or all fields
        //iphone7Plus.setWaterResistant(true);

        System.out.println("7+");
        System.out.println();
        System.out.println(iphone7Plus.getModel());
        System.out.println(iphone7Plus.getPrice());
        System.out.println(iphone7Plus.isWaterResistant());
        System.out.println();
       // System.out.println("X Max");
        System.out.println();
        //System.out.println(iphone8XMax.getModel());
        //System.out.println(iphone8XMax.getPrice());
        //System.out.println(iphone8XMax.isWaterResistant());


    }
}
