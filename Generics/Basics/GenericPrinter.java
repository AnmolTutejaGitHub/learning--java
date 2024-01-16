package Generics.Basics;

public class GenericPrinter<T> {
    // what if we want similar class like TPrinter for doble , string , float
    // etc
    // instead of creating multiple classes we can create one generic class
    // generics allows us one class like this that is flexibe for many many
    // different types

    // T is type parameter in angular bracket
    // we can name type parameter anything
    // <adsfg> will also work

    // Integer thingsToPrint;
    T thingsToPrint; // type of thingsToPrint is T

    public GenericPrinter(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print() {
        System.out.println(thingsToPrint);
    }

}
