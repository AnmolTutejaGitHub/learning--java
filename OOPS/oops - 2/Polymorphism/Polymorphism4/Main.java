package Polymorphism.Polymorphism4;

// In Java, when you have a reference variable of a base class type pointing to
// an object of a derived class, the compiler allows you to call methods that
// are declared in the base class. If the derived class has overridden those
// methods, the overridden version in the derived class will be executed at
// runtime. This is polymorphism in action.

// However, when you call a method that is specific to the derived class and not
// declared in the base class, you need to cast the reference variable to the
// derived class type before making the call.

class Base {
    public void baseMethod() {
        System.out.println("Base method");
    }
}

class Derived extends Base {
    public void derivedMethod() {
        System.out.println("Derived method");
    }
}

public class Main {
    public static void main(String[] args) {
        Base baseReference = new Derived();

        // Calling a method declared in the base class
        baseReference.baseMethod(); // This will print "Base method"

        // Calling a method specific to the derived class
        // baseReference.derivedMethod(); // This will result in a compilation error

        // To call the derivedMethod, you need to cast to the derived class type
        if (baseReference instanceof Derived) {
            ((Derived) baseReference).derivedMethod(); // This will print "Derived method"
        }
    }
}

// In the example above, baseReference is of type Base, but it is pointing to an
// object of type Derived. You can call the baseMethod without any issues
// because it's declared in the base class. However, if you try to call
// derivedMethod directly on baseReference, it will result in a compilation
// error. To call derivedMethod, you need to cast baseReference to Derived
// before making the call.

// In summary, while polymorphism allows you to call overridden methods of the
// base class on objects of the derived class, you need explicit casting to call
// methods that are specific to the derived class and not declared in the base
// class.
