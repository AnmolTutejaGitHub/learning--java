package Generics.Basics;

public class BoundedGenericsPrinter<T extends Animal> {
    // if want to bound with interface use extends keyword only
    // can bound it with both class and interface

    // public class BoundedGenericsPrinter<T extends Animal & interfacename{}

    // can bound mutilple interfaces but only one class
    // public class BoundedGenericsPrinter<T extends Animal & interfacename1 &
    // interfacename2{}

    // there could only be bounded by onle class as java does not support multiple
    // inheritance

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
