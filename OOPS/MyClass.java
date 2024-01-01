public class MyClass {
    // Static field
    public static int staticVariable = 0;

    // Instance variable
    public int instanceVariable;

    // Constructor
    public MyClass(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // Method that uses the static variable
    public static void printStaticVariable() {
        System.out.println("Static variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Create instances of MyClass
        MyClass obj1 = new MyClass(1);
        MyClass obj2 = new MyClass(2);

        // Access static variable through the class
        System.out.println("Static variable accessed through the class: " + MyClass.staticVariable);

        // Access static variable through instances (not recommended)
        System.out.println("Static variable accessed through instance (not recommended): " + obj1.staticVariable);
        System.out.println("Static variable accessed through instance (not recommended): " + obj2.staticVariable);

        // Modify static variable through the class
        MyClass.staticVariable = 10;

        // Access static variable through instances after modification
        System.out.println("Static variable accessed through instance after modification: " + obj1.staticVariable);
        System.out.println("Static variable accessed through instance after modification: " + obj2.staticVariable);

        // Call method that uses the static variable
        MyClass.printStaticVariable();
    }
}
