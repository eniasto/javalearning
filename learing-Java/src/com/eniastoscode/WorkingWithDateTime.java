package com.eniastoscode;

import java.time.*;

public class WorkingWithDateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        LocalDateTime nowLDT = LocalDateTime.now();
        LocalDateTime localDate = LocalDateTime.now(ZoneId.of("Australia/Lindeman"));
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

        System.out.println(localDate);
        System.out.println(LocalDateTime.now());

//        System.out.println(now);
//        System.out.println(nowLDT);
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(instant);

       // for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
        //    System.out.println(availableZoneId);

         //ZoneId.getAvailableZoneIds().forEach(System.out::println);
        }
    }

