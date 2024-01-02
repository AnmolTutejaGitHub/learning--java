//  if the method you want to call in the parent class is not overridden in the child class, 
//you can directly call the method without using super

class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        // Call the parent method directly
        parentMethod();

        System.out.println("Child method");
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();// Parent method
                            // Child method
    }
}
