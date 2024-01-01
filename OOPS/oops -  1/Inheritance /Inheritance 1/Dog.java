//Extend :
//Using extends specifies the superclass (or the parent class) of the class we're declaring.
//We can say Dog is a subclass, or child class, of Animal.
//We can say Animal is a parent, or super class, of Dog.
//A class can specify one, and only one, class in its extends clause.


//super() :
//super() is a lot like this().
//It's a way to call a constructor on the super class, directly from the sub class's constructor.
//Like this(), it has to be the first statement of the constructor.
//Because of that rule, this() and super() can never be called from the same constructor.

//If you don't make a call to super(), then Java makes it for you, using super's default constructor.
//If your super class doesn't have a default constructor, than you must explicitly call super() in all of your constructors,
// passing the right arguments to that constructor.

public class Dog extends Animal {

    public Dog() {
        super("Mutt", "Big", 50);
    }
    //like in this() we call constructor function
    //super() is a method to call constructor function of parent class
}
