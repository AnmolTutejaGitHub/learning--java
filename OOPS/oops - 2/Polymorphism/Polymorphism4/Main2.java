package Polymorphism.Polymorphism4;

class Base {
    public void baseMethod() {
        System.out.println("Base method");
    }
}

class Derived extends Base {
    @Override
    public void baseMethod() {
        // You can choose to call the base class implementation using super.baseMethod()
        System.out.println("Derived method overriding baseMethod");
    }

    public void derivedMethod() {
        System.out.println("Derived method");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Base baseReference = new Derived();

        // Calling a method declared in the base class
        baseReference.baseMethod(); // This will print "Derived method overriding baseMethod"

        // Calling a method specific to the derived class
        // baseReference.derivedMethod(); // This will result in a compilation error

        // To call the derivedMethod, you need to cast to the derived class type
        if (baseReference instanceof Derived) {
            ((Derived) baseReference).derivedMethod(); // This will print "Derived method"
        }
    }
}

// In the given code, the main method is using a reference of the base class
// (Base) to point to an instance of the derived class (Derived). This is an
// example of polymorphism in Java.

// Let's break down the behavior:

// Base baseReference = new Derived(); - A reference variable baseReference of
// type Base is created and assigned an instance of Derived. This is allowed
// because of polymorphism in Java.

// baseReference.baseMethod(); - The baseMethod is called. Since baseReference
// is pointing to an instance of Derived, the overridden version of baseMethod
// in the Derived class is executed. This is known as dynamic method dispatch or
// runtime polymorphism.

// baseReference.derivedMethod(); - This line would result in a compilation
// error. The reference type Base does not have a method named derivedMethod.
// The compiler sees baseReference as of type Base and does not recognize
// derivedMethod as a valid method on this type.

// (Derived) baseReference).derivedMethod(); - By explicitly casting
// baseReference to Derived, you inform the compiler that the actual object is
// of type Derived, allowing you to call the derivedMethod. This is necessary
// because the reference type Base doesn't include the derivedMethod method.

// So, in summary, the overridden method (baseMethod) is executed based on the
// runtime type of the object (polymorphism), while calling the specific method
// (derivedMethod) requires explicit casting to the derived type.
