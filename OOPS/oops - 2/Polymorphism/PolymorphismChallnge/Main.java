// challenge statement : 
// What we want to do in this challenge, is have our runtime code execute different behavior, for different objects.
//show a base class, Car, with one field, description, and three methods, startEngine(), drive() and runEngine(). 
// The first two methods should be declared as public.
// The method runEngine however, is protected, and it will only get called from the drive method in Car.

//  we've given you three types of subclasses, or three types of cars that you might find on the road.
// We have the GasPoweredCar, the ElectricCar, and the HybridCar.
// You can imagine that these three subclasses, might have different ways to start their engine, or drive, depending on their engine type.
// And each of these classes might have different variables or fields, that might be used in those methods.

// And you'll write code in a Main class and main method, that creates an instance of each of these classes, and that executes different behavior for each instance.
// At least one method should print the type of the runtime object.

package Polymorphism.PolymorphismChallnge;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}

// output :
// Car -> startEngine
// Car -> driving, type is Car
// Car -> runEngine
// Gas -> All 6 cylinders are fired up, Ready!
// Car -> driving, type is GasPoweredCar
// Gas -> usage exceeds the average: 15.40
