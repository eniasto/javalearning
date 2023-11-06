package com.eniastoscode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfExceptions {
    public static void main(String[] args){ //throws FileNotFoundException {
// Checked Exceptions
        try {
            FileInputStream inputStream =
                    new FileInputStream(
                            "C:\\Users\\enias.toroveyi\\IdeaProjects" +
                                    "\\learing-Java\\src\\com\\" +
                                    "eniastoscode/example.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
// Unchecked Exceptions
        // You don't have to check the exceptions at compile time.
        // Because there is no way for you to check that the code
        // that you are executing will throw an exception.
        try {
            var result = 10 / 0;
            System.out.println(result);
        }
        catch(ArithmeticException | NullPointerException | NumberFormatException e){
            System.out.println("Cannot divide number by 0");
        }
        /* catch (NumberFormatException e){

        }
        catch (NullPointerException e){

        } */
        finally {
            System.out.println("cleaning up ... ");
        }

    }
}

// In Java, there are two types of exceptions.
// 1.Checked Exceptions
//  - Are exceptions that need to be handled at compile time
//    Which means that if a method is throwing a checked exception we
//    should use a try...catch block or the trows key word
//    Otherwise the program will give you a compilation error.


// FileInputStream is used to read files.

// 1.throws FileNotFoundException  - throws this exception
// 2.try catch block


// 2.Unchecked Exceptions
//  - Are not checked at compile time.
//    This means that if the program is throwing an Unchecked exception
//    And even you don't handle an exception the program won't give you
//    a compilation error.
// var result = 10 / 2 >> there is no way for you to enforce an exception
// to be handled at compilation time.


// finally block executes regardless of the result. Normally used for
// clean up purposes.

// You are also not just limited to catch one exception.