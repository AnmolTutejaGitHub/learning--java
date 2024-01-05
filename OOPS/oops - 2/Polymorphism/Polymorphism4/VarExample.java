package Polymorphism.Polymorphism4;

// In Java, the var keyword was introduced in Java 10 as part of the local variable type inference feature. 
//It allows you to declare local variables without explicitly specifying their data types. Instead, the compiler infers 
//the type of the variable based on the assigned value.

// In the second declaration (var strWithVar = "Hello, Java!";), the type of the variable strWithVar 
//is inferred to be String because it's initialized with a String value. The var keyword cannot be used for fields,
// method return types, or method parameters; it is limited to local variables.

public class VarExample {
    public static void main(String[] args) {
        // Before Java 10
        String strBeforeJava10 = "Hello, Java!";
        System.out.println(strBeforeJava10); // Hello, Java!

        // With var (Java 10 and later)
        var strWithVar = "Hello, Java!";
        System.out.println(strWithVar); // Hello, Java!
    }
}
