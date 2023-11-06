package com.eniastoscode;

public class ClasesAndObjects {
    public static void main (String[] args){
        // Classes and Objects Intro
        Lens lensOne = new Lens("Sony","85mm",true);
        Lens lensTwo = new Lens("Sony","30mm",true);
        Lens lensThree = new Lens("Cannon","25-70mm",false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println();

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
    }
    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength,boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
