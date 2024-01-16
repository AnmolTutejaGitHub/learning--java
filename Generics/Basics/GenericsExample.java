package Generics.Basics;

public class GenericsExample {

    public static void main(String[] args) {

        // why need generics

        IntegerPrinter printer = new IntegerPrinter(19);
        printer.print();
    }
}
