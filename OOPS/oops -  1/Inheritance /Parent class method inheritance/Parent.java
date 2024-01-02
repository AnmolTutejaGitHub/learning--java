// In Java, to call a method from the parent class, you use the super keyword.
// The super keyword is used to refer to the immediate parent class object. You
// can use it to call the parent class's method explicitly.

class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        // Call the parent method using super
        super.parentMethod();

        System.out.println("Child method");
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        // Parent method
        // Child method
    }
}
