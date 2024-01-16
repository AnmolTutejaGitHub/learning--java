package Generics.Basics;

public class DoublePrinter {
    Double thingsToPrint;

    public DoublePrinter(Double thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print() {
        System.out.println(thingsToPrint);
    }
}
