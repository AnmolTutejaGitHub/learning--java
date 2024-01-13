package interfaces.interfacePart1;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        // flier.move(); // error
        // tracked.move(); // error

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}

// You cannot directly instantiate an abstract class or an interface in Java.
// However, you can create instances of classes that extend the abstract class
// or implement the interface.

// In the provided code, Bird is a concrete class that extends the abstract
// class Animal and implements the interfaces FlightEnabled and Trackable. So,
// when you create an instance of Bird, you are indirectly creating an instance
// of Animal, FlightEnabled, and Trackable. The actual object is of type Bird,
// but it can be treated as an instance of these types due to inheritance and
// interface implementation.

// In the code above, bird is an instance of the concrete class Bird, but you
// can assign it to references of types Animal, FlightEnabled, and Trackable
// because Bird extends Animal and implements both FlightEnabled and Trackable.
// This is a form of polymorphism in Java.