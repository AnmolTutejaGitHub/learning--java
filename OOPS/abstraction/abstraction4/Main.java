package abstraction.abstraction4;

// Abstract class A with abstract methods a and b
abstract class A {
    abstract void a();

    abstract void b();
}

// Abstract class B extending A
abstract class B extends A {
    // B does not need to provide implementations for a and b
    // It can if it wants to, but it's not mandatory
}

// Concrete class C extending B
class C extends B {
    // C must provide concrete implementations for a and b
    void a() {
        System.out.println("Implementation of a in class C");
    }

    void b() {
        System.out.println("Implementation of b in class C");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.a();
        c.b();
    }
}
