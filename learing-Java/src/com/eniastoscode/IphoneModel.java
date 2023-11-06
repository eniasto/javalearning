package com.eniastoscode;

public enum IphoneModel {
    //enum > Is a class that allows you to represent a group of constants.
    //Shift/Alt Insert and select enum and define the actual models constants
    // You can actually have all the iphone models in this class.

    IPHONE_7_PLUS("Iphone 7+"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X");

    private String modelStr;
    IphoneModel(String modelStr){
    this.modelStr = modelStr;
    }
    public String getModelStr(){
        return modelStr;
    }
}
