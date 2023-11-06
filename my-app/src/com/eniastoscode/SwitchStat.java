package com.eniastoscode;

public class SwitchStat {
    public static void main(String[] args) {
        // Switch statement
        String gender = "female";
        /*if (gender.equals("FEMALE")) {
        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER NOT SAY")) {

        } else {

        }
    }*/

 switch (gender.toUpperCase())   {
     case "FEMALE":
         System.out.println("I am a feamle");
         break;
     case "MALE":
         System.out.println("I am a male");
         break;
     case "PREFER NOT SAY":
         System.out.println("Prefer not say");
     default:
         System.out.println("unknown gender");
 }
 }
    }