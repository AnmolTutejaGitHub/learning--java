# The abstract class

The abstract class is declared with the abstract modifier.
Here we are declaring an abstract class called Animal.

     abstact class Animal{} // An abstract class is declared with the abstract modifier 

An abstract class is a class that's incomplete.
You can't create an instance of an abstract class.

    Animal a = new Animal(); //INVAlID , an abstract class can never get instantiated

An abstract class can still have a constructor, which will be called by its subclasses, during their construction.

An abstract class's purpose, is to define the behavior it's subclasses are required to have, so it always participates in inheritance.
For the examples , assume that Animal is an abstract class.
Classes extend abstract classes, and can be concrete.
Here, Dog extends Animal, Animal is abstract, but Dog is concrete.

    class Dog extends Animal{} // Animal is abstract ,  Dog is not 

A class that extends an abstract class, can also be abstract itself, as I show with this next example.
Mammal is declared abstract and it extends Animal, which is also abstract.

    abstract class Mammal extends Animal{} // Mammal is abstract , Animal is also abstract  

And finally an abstract class can extend a concrete class.
Here we have BestOfBreed, an abstract class, extending Dog, which is concrete.

    abstract bestOfBreed extends Dog ; // Dog is not abstract , but bestOfBreed is !


# Abstract Method 

An abstract method is declared with the modifier abstract.
You can see on this slide, that we're declaring an abstract method called move, with a void return type.
It simply ends with a semi-colon.
It doesn't have a body, not even curly braces.

    abstract class Animal{
        public abstract void move();
    }

Abstract methods can only be declared on an abstract class or interface.

# What good is an abstract method, if it doesn't have any code in it?

An abstract method tells the outside world, that all Animals will move, in the example we show below.

     abstract class Animal{
        public abstract void move();
    }

Any code that uses a subtype of Animal, knows it can call the move method, and the subtype will implement this method with this signature.
This is also true for a concrete class, and a concrete method that's overridden.
You might be asking, what's the difference, and when would you use an abstract class.

If Animal is abstract and it's methods are abstract, subclasses no longer have the options we just talked about.  
There is no concrete method for a subclass to inherit code from.
Instead, the subclass must provide a concrete method for any abstract method declared on its parent.
The subclass won't compile if it doesn't implement the abstract methods.


