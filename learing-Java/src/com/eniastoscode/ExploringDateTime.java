package com.eniastoscode;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ExploringDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate someDate = LocalDate.of(
               2000, Month.SEPTEMBER,1);
        System.out.println(someDate.minus(7, ChronoUnit.YEARS));
        System.out.println(someDate.isAfter(now.toLocalDate()));
        System.out.println(someDate.isBefore(now.toLocalDate()));

        System.out.println(someDate.getYear());
        System.out.println(someDate.getMonth());
        System.out.println(someDate.getDayOfMonth());
        System.out.println(someDate.getDayOfWeek());
    }
}
// DAYS,YEARS & DECADES etc.
//someDate. methods >> DayOfWeek,getMonth,getYear etc
