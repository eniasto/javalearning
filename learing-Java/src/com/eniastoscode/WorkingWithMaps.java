package com.eniastoscode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Hannah");
        map.put(2,"Jamil");
        map.put(3,"Alice");
        map.put(3,"Carla");  // Duplicate not allowed

        System.out.println(map);  // prints the key and the value
        System.out.println(map.get(1)); // prints the value Hannah.
        System.out.println(map.keySet()); // prints all the keys
        System.out.println(map.get(3)); //Will print Carla the latest.
        System.out.println();

        //loop
        for (int key : map.keySet()){
            System.out.println(map.get(key));

//The generics loop to be revisited.
            map.forEach((k, v) -> {
                System.out.println(k + "  " + v);
            });
        }

        String defaultV = map.getOrDefault(
                10,"oops this is a default value");
        System.out.println(defaultV);
        }


    }


// The map interface allows us to store key and value pairs.
// Key/value pair data structure eg {name: "name", age:2}
