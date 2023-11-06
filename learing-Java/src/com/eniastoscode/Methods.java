package com.eniastoscode;

import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
       var x = incrementNumber(0);
       print(x);
       var now = getCurrentDate();
       var hh = getDateMinusDays(10);
       var xx = getDateMinusDays(100);
        System.out.println(hh);
        System.out.println(now);
        System.out.println(xx);
    }

    private static int incrementNumber(int value){

        return value + 1;
    }

    private static void print(int value){
        System.out.println(value);
    }

    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }

    private static LocalDate getDateMinusDays(int v){
        return LocalDate.now().minusDays(v);
    }
}
// public - access modifier,static - means that this method belongs
// to a class and not an instance. void - return type
// and void does not return anything.
// name - name of the method
// string[] args - arguments are data passed into the method which we
// can work with.
// You can have as many parameters as you want. Void does not return
// anything.