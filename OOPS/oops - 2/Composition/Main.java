package Composition;

//In Java, Object-Oriented Programming (OOP) is a paradigm that allows you to structure your code using objects, 
//which are instances of classes. Composition is one of the fundamental principles of OOP, and it involves creating 
//relationships between classes by including instances of other classes within one class. This is achieved by composing 
// objects to create more complex ones.

// Here's a simple example to illustrate composition in Java:

// Class representing an Engine
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

// Class representing a Car
class Car {
    // Composition: Car has an Engine
    private Engine engine;

    // Constructor to initialize the Engine
    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        // Delegating the start operation to the Engine object
        engine.start();
        System.out.println("Car started");
    }
}

// Main class to demonstrate composition
public class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car();

        // Starting the car, which internally starts the engine
        myCar.start();
    }
}

// In this example, the Car class has a composition relationship with the Engine
// class. The Car class has an instance variable engine, which is an object of
// the Engine class. The Car class delegates the start operation to the Engine
// object when it starts. This is a simple example, and in real-world scenarios,
// composition can be used to model more complex relationships between classes.

// Remember that composition is one way to achieve code reuse and create more
// maintainable and modular code in an object-oriented system. It promotes the
// "has-a" relationship between classes, where one class has another class as a
// component.