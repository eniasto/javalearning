package com.eniastoscode;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 20, 500, 4};
        numbers[3] = 700;    //numbers[4] = 200 will through an error.
        //int[] numbers = new int[4]
        //numbers[0] = 1;
        //numbers[1] = 20;
        //numbers[2] = 500;
        //numbers[3] = 4;
        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));
        for (int number: numbers){
            System.out.println(number);}
// Looping through the array and printing values line by line.
        System.out.println();
         for (int i = 0; i < numbers.length; i++){
             System.out.println(numbers[i]);
        }
    }
}

/*Data structures >> Is way of organizing,maintaining and manupulating data.
   Arrays,
   Lists,
   Stacks,
   Queues,
   Maps,
   Sets   etc
A variable is a box or container you can only store one thing.
Arrays >> A data structure that allows you to store more than one values.
you need to specify the initial size. Once you set the size
can not extend.
The index starts from zero.
Arrays are limited by the fixed size.
Can be Char,String,Double even objects.

*/


