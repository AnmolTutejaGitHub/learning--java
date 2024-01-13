package interfaces.interface1;

// instead of creating abstract class we can create an interface 

// abstract class A{
// public abstract void show();
// public abstract void config();
//}

// an interface is not a class . And by default every method in interface is public abstract 
interface A {
    void show();

    void config();

    // can have variable in interface
    // int age ; // error as variable declared in interface as default are final and
    // static (not case for abstract class). so we need to give it a value

    int age = 18; // final and static
    String location = "panipat";

    // why final and static ?
    // First of al , u can't instantiate an interface , u instantiate a class .
    // u are not doing extend , u implements an interface
    // interface don't have their own memory in heap

    // if u don't have memory how can u have non final variable
}

class B implements A {
    public void show() {
        System.out.println(" in show");
    }

    public void config() {
        System.out.println("in config");
    }
}
// // can do :
// abstract B implements A {} // create B abstract if don't want to implement A

// we can implement more than one interface
interface X {
    void run();
}

class C implements A, X { // must define methods of both A , X
    public void show() {
        System.out.println(" in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("run");
    }
}

interface Y extends X {
} // Y inherits X methods

class D implements A, Y { // must define methods of both A , Y
    // needs to define run() too
    public void show() {
        System.out.println(" in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("run");
    }
}

public class Main {
    // u can't instantiate an interface
    public static void main(String[] args) {
        A obj; // no error (can create reference)
        // obj = new A(); // error can't instantiate an interface

        obj = new B(); // interface reference not class reference
        obj.show();
        obj.config();

        // obj.run(); // error as A has no idea of run

        System.out.println(A.location);
        // A.location= "Rajpura"; //error as we can't change final
    }

}
