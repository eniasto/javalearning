package com.eniastoscode;

public class CustomExceptions {
    public static void main(String[] args) {

        performDivision(1,0);
    }

    static double performDivision(double a , double b) {
        if (b == 0) {
            throw new MyException("Can not divide by zero");
        }
        return a / b;

    }

    static class MyException extends RuntimeException {
        public MyException(String message) { // This is the actual constructor
            super(message);
        }
    }
}



// Custom Exceptions >> Defining our own exceptions.
// Press Shift/Alt Insert > Override methods and invoke the message
// constructor.
// throw keyword is used to throw the exception.
// NB : Need more examples here.