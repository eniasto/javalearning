package com.eniastoscode;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        //ArrayList numbers = new ArrayList(); It works
        List<Integer> numbers = new ArrayList<>(); //<Object equivalent>
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(100);
        numbers.add(9000);
        //numbers.add("Hello");
        //numbers.add(new Point(10,10));
        //numbers.add('A');

        numbers.remove(1);
        numbers.add(0,-1);

        System.out.println(numbers.contains(9000));

//        numbers.clear();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());

        System.out.println(numbers); //we don't need Arrays.toString
        // Loop
        for(Object number: numbers){     //for Object number in numbers
            System.out.println(number);
            //Above, we can now use int instead of Object because of
            // Generics introduced.
        }
        System.out.println();
        numbers.forEach(System.out::println); // Functional programming.
    }
}

// No longer tied to the fixed size. You can add many elements as you want.
// Generics uses <> for restricting the data type which should be the
// Object version of the primitive. eg int >> Integer, Character for char


