package com.eniastoscode;

public class AccessModifiers {
    private static double PI = Math.PI; //Access modifiers can be used
                                        // with variables.
    public static void main(String[] args) {
        // The first word ie public for methods,class and variables.
        // Means who can actually call this method or class.
        Lens lens = new Lens(); //This works within this class
    }

    public static class Lens{} // The first access modifier is not to have access
                        // access modifier. Means class Lens is package
                        // protected.
                        // public >> accessible by everything
                        // private >> Lens accessible within AccessModifier
                        // class

}
