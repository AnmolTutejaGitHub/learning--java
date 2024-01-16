package Generics.Basics;

public class StringPrinter {

    String thingsToPrint;

    public StringPrinter(String thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print() {
        System.out.println(thingsToPrint);
    }
}