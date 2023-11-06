package com.eniastoscode;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String brand = "eniastoscode";
        //Optional.of(brand); // This will throw NullPointerException
                              // when brand is null.
//        String theBrand = Optional.ofNullable(brand)
//                .orElse("Sumsung");
//        System.out.println(theBrand);
        String theBrand = Optional.ofNullable(brand)
                .map(String::toUpperCase) //Converting toUppercase when not null
                .orElseGet(() -> {
                    //logic
                    return "Sumsung";
                });
        System.out.println(theBrand);
    }
}

// Optional.of() >>> When you are guaranteed that the value will not be null.
// Optional.empty() >>> When you know the value is empty.
// Optional.ofNullable >>> We think that the value may or may not be null.
// Optional.ofNullable(brand) alone will not throw an error.
// This falls in the pattern of functional programming.
// .orElseGet allows you to put some logic.
//  You can map to string before orElseGet.
