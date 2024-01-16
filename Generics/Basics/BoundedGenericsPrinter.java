package Generics.Basics;

public class BoundedGenericsPrinter<T extends Animal> {
    // can bound T to one class only
    // here not extending Animal class to BoundedGenerics class but defining animal
    // of type T (T==Animal) meeans I can't do super.eat() as BoundedGenerics is not
    // subclass of Animal
    // when I specify T thingsToPrint here I mean Animal thingsToPrint ;

    // here I am restring T to type Anmial
    T thingsToPrint; // type of thingsToPrint is T

    public BoundedGenericsPrinter(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print() {
        System.out.println(thingsToPrint);
    }

    public void eat() {
        thingsToPrint.eat();
    }

}

// I am not extending Animal class to BoundedGenericsPrinter .. I am telling
// type which T can take ;
