package com.eniastoscode.amigoscode;

import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
    var x = incrementNumber(0);
    print(x);
    var now = getCurrentDate();
    var hh = getDateMinusDays(10);
    var xx = getDateMinusDays(100);

    }
    private static int incrementNumber(int value) {
        return value +1;
    }
    private static void print(int value) {
        System.out.println(value);
    }
    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }
    private static LocalDate getDateMinusDays(int v){
        return LocalDate.now().minusDays(v);}
}
