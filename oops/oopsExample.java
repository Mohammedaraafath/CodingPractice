package oops;

// -------------------- Java OOP Concepts with Explanation --------------------

public class oopsExample {

    // ------------------ Class and Object ------------------
    // What is a class?
    // A class is a blueprint or a template that defines attributes and behaviors.

    // What is an object?
    // An object is an instance of a class that holds real values and can perform actions.

    // Example for class and object
    // class Car {
    //     String color; // field
    //     void drive() { // method
    //         System.out.println("Car is driving");
    //     }
    // }

    // public static void main(String[] args) {
    //     Car car = new Car();
    //     car.color = "red";
    //     car.drive();
    // }

    // ------------------ Inheritance ------------------
    // Inheritance allows a child class to acquire the properties and behavior of another class (parent).

    // Why use Inheritance?
    // - Code reusability
    // - Reduces duplication
    // - Easier maintenance
    // - Supports hierarchical classification

    // Syntax:
    // class Parent {
    //     // fields or methods
    // }
    // class Child extends Parent {
    //     // additional fields or methods
    // }

    // Types of Inheritance:
    // Type            Supported in Java     Description
    // Single          Yes                  One class inherits from another
    // Multilevel      Yes                  Chain of inheritance (A -> B -> C)
    // Hierarchical    Yes                  Multiple classes inherit from one class
    // Multiple        No (with classes)    A class inherits from multiple classes (Not supported)
    // Hybrid          Not directly         Combination of different types

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Example for multilevel inheritance
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

        // Example for hierarchical inheritance
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        // ------------------ Polymorphism ------------------
        // Polymorphism allows objects to take many forms.
        // Compile-time Polymorphism (Static / Method Overloading)
        // Run-time Polymorphism (Dynamic / Method Overriding)

        Animal a = new Dog(); // Parent reference, child object
        a.sound();            // Outputs "Dog sound in Dog class"

        // ------------------ Abstraction ------------------
        // Hide complex details and show only essential information
        // Achieved via abstract classes or interfaces

        Vehicle v1 = new CarVehicle();
        v1.startEngine();
        Vehicle v2 = new Bike();
        v2.startEngine();

        // ------------------ Interface ------------------
        // Interface defines a set of behaviors or capabilities a class must implement
        // Supports multiple inheritance
        Tesla tesla = new Tesla();
        tesla.startEngine();
        tesla.chargeBattery();
    }
}

class Animal {
    void eat() {
        System.out.println("All Animal is eating");
    }

    void sound() {
        System.out.println("Dog sound in Animal class which has sound method");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    void sound() {
        System.out.println("Dog sound in Dog class which has sound method");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("cat meows");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("weeping");
    }
}

// ------------------ Encapsulation ------------------
// Hiding internal details using private variables
// Access through getters and setters
class Person {
    private String name; // Access through getter/setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// ------------------ Abstract Class ------------------
// Common base class with partial implementation
// Defined using abstract method, can have fields, constructors, methods
// Multiple inheritance not supported
abstract class Vehicle {
    abstract void startEngine();
}

class CarVehicle extends Vehicle {
    void startEngine() {
        System.out.println("Car Engine Started only self start");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike Engine Started Via Self and Click");
    }
}

// ------------------ Interface ------------------
// Interface is used to define a set of behaviors or capabilities that a class must implement
// Defined using the interface keyword, cannot have constructors or instance variables
// Supports multiple inheritance

interface VehicleInterface {
    void startEngine();
}

interface Electric {
    void chargeBattery();
}

class Tesla implements VehicleInterface, Electric {
    public void startEngine() {
        System.out.println("Tesla car started silently");
    }

    public void chargeBattery() {
        System.out.println("Tesla car is charging");
    }
}
