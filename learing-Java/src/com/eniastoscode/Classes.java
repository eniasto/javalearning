package com.eniastoscode;

public class Classes {
    public static void main(String[] args) {

        Iphone iphone7Plus = new Iphone(IphoneModel.IPHONE_7_PLUS,
                200.00,
                false);
        Iphone iphoneXMax = new Iphone(IphoneModel.IPHONE_X);

//        // You can use the constructor that set the model only
//        iphoneXMax.setModel("X Max");
//        iphoneXMax.setPrice(1300.00);
//        iphoneXMax.setWaterResistant(true);
//
          System.out.println("X Max");
          System.out.println();
          System.out.println(iphoneXMax.getModel());
          System.out.println(iphoneXMax.getPrice());
          System.out.println(iphoneXMax.isWaterResistant());

//        iphone7Plus.setModel("7+");
//        iphone7Plus.setPrice(100.00);
//        iphone7Plus.setWaterResistant(false);
//
       System.out.println("7 Plus");
        System.out.println();
        System.out.println(iphone7Plus.getModel());
        System.out.println(iphone7Plus.getPrice());
        System.out.println(iphone7Plus.isWaterResistant());
 // The toString >> Gives us the string representation of an object.
        System.out.println(iphone7Plus); // Meaningless object
                                         //com.eniastoscode.Iphone@1b28cdfa
        System.out.println(iphoneXMax);
        System.out.println(iphone7Plus.getModel());
        System.out.println(iphone7Plus.getModel().getModelStr());
        // If now run the program with toString the Object representation is
        //Iphone{model='7+', price=200.0, isWaterResistant=false}
        // And you no longer need the println methods.
    }


}
// Class is a blueprint or template for creating anything that you can
// think of in the real world or in terms of software.
// Creating an object iphone7plus or X Max based of a class Iphone.
// You can have as many constructors as you want.
