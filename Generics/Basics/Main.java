package Generics.Basics;

public class Main {

    public static void main(String[] args) {

        // why need generics
        IntegerPrinter printer = new IntegerPrinter(19);
        printer.print();

        // if I want for double I need to create another class
        DoublePrinter doubleprint = new DoublePrinter(2.4);
        doubleprint.print();

        StringPrinter strprinter = new StringPrinter("Anmol");
        strprinter.print();

        // how to use generic
        GenericPrinter<Integer> genericprinter1 = new GenericPrinter<>(23);
        genericprinter1.print();

        GenericPrinter<String> genericprinter2 = new GenericPrinter<>("Abc");
        genericprinter2.print();

        // we use generics all the time in java's collection framework
        Animal animal = new Animal();
        GenericPrinter<Animal> genericprinter3 = new GenericPrinter<>(animal);
        genericprinter3.print(); // Generics.Basics.Animal@14dad5dc

        // genericprinter3.eat(); // error can't implement Animal methods directly

        Cat mycat = new Cat();
        BoundedGenericsPrinter<Cat> genericprinter4 = new BoundedGenericsPrinter<>(mycat);
        genericprinter4.print(); // Generics.Basics.Cat@c387f44

        // this eat method must be in BoundedGenericsPrinter as BoundedGenericsPrinter
        // class does not inherit Animal class and
        // genericprinter4.eat(); is calling method on BoundedGenericsPrinter
        genericprinter4.eat(); // cat eating .....

        // BoundedGenericsPrinter<Integer> genericprinter5 = new
        // BoundedGenericsPrinter<>(23); //error as I bounded T to Animal

        shout(1, "Anmol");
        shout(3.6, 2);
        shout(3.6, "b", 2);

    }

    // can have generic method
    private static <T, G> void shout(T a, G b) { // T, G ---> types of generic parameters u want
        System.out.println(a);
        System.out.println(b);
    }

    // if u want to return a generic use T as return type instead of void
    private static <T, G, K> T shout(T a, G b, K c) {
        System.out.println(a);
        System.out.println(b);

        return a;
    }

}
