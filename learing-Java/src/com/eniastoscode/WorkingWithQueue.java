package com.eniastoscode;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();

        queue.offer(new Person("James"));
        queue.offer(new Person("Jamila"));
        queue.offer(new Person("Abu"));

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);

        // looping
        queue.forEach(person -> System.out.println(person.name));


    }
    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

// Queue uses the FIFO - FIRST IN FIRST OUT.
// peek >>> who is at the front.
//poll will return null and remove will through an exception if the queue
//is empty.
//offer will return false when full whereas add will through an exception.

// There are many other data structures you should familiarise and
// explore. They only differ in the implementation.