package com.eniastoscode;

public class Main {

    public static void main(String[] args) {

        //Animal animal = new Animal("bobby"); No longer valid with abstract
        //Dog dog = new Dog("flex","Bulldog"); below works as well
        AnimalIInterface dog = new Dog("flex","Bulldog");
        AnimalIInterface cat = new Cat("rosie");

        dog.makeSound();// We can have many abstract methods
        cat.makeSound(); // We don't care how the makeSound works internally.


        SuperMath superMath = new SuperMath();
        System.out.println(superMath.add(1,90));
        System.out.println(superMath.add(1,90,2));

        System.out.println("A" + "B"); // Polymorphism
        System.out.println(1 + 2);   //   plus sign has many forms
        //System.out.println(animal.getName());
        //System.out.println(dog.getName()
        //+ " is a " + dog.getBreed()); // getName defined in Super Animal
        System.out.println(dog);

        // Inheritance example above. using the class Animal

        System.out.println("Hi Rumbidzayi Chaduka");
        // Primitive Vs Reference Types
        // The value of a i.e 10 that goes to b is passed by copy.
        // Meaning if we change a, the value of b is untouched.
        // because b is in a different memory address
        int a = 10;
        int b = a;
         a = 100;
        System.out.println("a = " + a + " - b = " + b);
        // Miriam changes because they are pointing to the same reference
        Person alex = new Person("alex");
        Person miriam = alex;

        System.out.println("Before changing alex");
        System.out.println(alex.name + " " + miriam.name);

        alex.name = "Alexandra";
        //miriam.name = "miriam"; This will aso change alex.

        System.out.println("After changing alex");
        System.out.println(alex.name + " " + miriam.name);

        Iphone iphone = new Iphone(
                IphoneModel.IPHONE_7,
                290,
                false);
        //iphone.price = 0 not allowed because of the private access modifier
        // on the Iphone class attributes but can only be accessed through
        // its method setPrice which we can control the usage.
        iphone.setPrice(0);
        System.out.println(iphone.isWaterResistant());
        System.out.println(iphone.getPrice());

    // Accessing internal data of the Iphone class instead of going through
    // its own methods.
    // In your classes you should always hide the data i.e private
    }
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
