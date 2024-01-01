public class MethodSignatures {

    // A method is uniquely defined in a class by its name, and the number and type
    // of parameters that are declared for it.
    // This is called the method signature.
    // You can have multiple methods with the same method name, as long as the
    // method signature (meaning the parameters declared) are different.
    // This will become important in topic overloaded methods.

    public static void name(int age) {
        System.out.println(age);
    }

    public static void name(String age) { // if I pass int a as parameter here it will show error
        System.out.println(age);
    }

    public static void main(String[] args) {
        name(12); // 12
        name("12"); // "12"
    }
}
