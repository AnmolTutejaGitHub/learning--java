// Static methods are declared using a static modifier.
// Static methods can't access instance methods and instant variables directly.
// They're usually used for operations that don't require any data from an instance of the class (from 'this').
// the this keyword is the current instance of a class.

// So inside a static method, we can't use the this keyword.
// Whenever you see a method that doesn't use instance variables, that method should probably be declared as a static method.
// For example, main is a static method, and it's called by the Java virtual machine when it starts the Java application.

// static methods are called as ClassName.methodName(); 
//or methodName(); only if in the same class

public class Mains4 {

    public static void main(String[] args) {

        // Calculator1 calc = new Calculator1();
        Calculator1.printSum(5, 10);
        printHello();
    }

    // shorter from of Main. printHello();
    public static void printHello() {
        System.out.println("Hello");
    }

}
