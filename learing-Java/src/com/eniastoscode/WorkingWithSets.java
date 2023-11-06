package com.eniastoscode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set <Character> charactersSet = new HashSet<>();

        charactersSet.add('A');
        charactersSet.add('A');      //Duplicates not allowed.;
        charactersSet.add('B');
        charactersSet.add('C');
        charactersSet.add('D');

        //Using iterator.
        Iterator<Character> iterator = charactersSet.iterator();
        while (iterator.hasNext()){
            Character character = iterator.next();
            System.out.println(character);

        }
         //Loop
        for (char character : charactersSet){
            System.out.println(character);
        }

    }
}

// Very similar to Lists but the sets can not have duplicates and also
// the order is not guaranteed.
// You should never rely on the actual order.
// Use LinkedHashSet if you want the order in which you add
// the elements to be preserved.
// TreeSet also preserves the order.
// The methods are almost the same with lists.