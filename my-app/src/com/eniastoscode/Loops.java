package com.eniastoscode;

public class Loops {
    public static void main (String[] args) {
        //Loops
        int [] numbers = {2,0,1,400,4,90,78,77};
        String [] names = {"Ali","Anna"};
        for (int i = 0; i < numbers.length;i++){
            System.out.println(numbers[i]); {
                System.out.println("Enhanced for loop");
            }
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
