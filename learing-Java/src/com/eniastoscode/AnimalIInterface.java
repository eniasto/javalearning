package com.eniastoscode;

public interface AnimalIInterface {

    void makeSound(); // public abstract is redundant and can be removed.
                      //Because we can only have abstract methods.
    String getName();


}

// Interfaces >> Another way of achieving abstraction though in a
//            bit different way.
// The benefit of an abstract class is you can define the properties
// and behaviour. And also the abstract method which does not have
// implementation and let the children classes extend and define
// the actual implementation.

//@override  >>> Override the makeSound method. Mainly used
//for documentation. Can do without but helps us know that we are
// overriding the behavior set in the parent class.ie Animal
// Another example in the string representation of an object >> Overriding
// toString method.

// Remove abstract and replace class with interface. With interfaces, not
// allowed using properties and behaviours, all the methods and the toString.

// We can only have abstract methods withing interfaces.

// Another way of achieving polymorphism ie many forms
// is by using methods overloading.
// We have used method overriding to achieve polymorphism in the example
// of Animal abstract makeSound method.
