package abstraction.abstraction1;

public class Dog extends Animal {

    // Even though our abstract class won't ever be instantiated , a constructor we
    // ddeclared on it must be called by every subclass constructor. Therefore we
    // are forcing subclasses to also use this constructor

    // as : Any code that uses a subtype of Animal, knows it can call the move
    // method, and the subtype will implement this method with this signature.
    // This is also true for a concrete class, and a concrete method that's
    // overridden.
    // You might be asking, what's the difference, and when would you use an
    // abstract class.

    // If Animal is abstract and it's methods are abstract, subclasses no longer
    // have the options we just talked about.
    // There is no concrete method for a subclass to inherit code from.
    // Instead, the subclass must provide a concrete method for any abstract method
    // declared on its parent.
    // The subclass won't compile if it doesn't implement the abstract methods.
    public Dog(String type, String size, double weight) {

        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {

    }
}