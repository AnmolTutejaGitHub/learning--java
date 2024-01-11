package abstraction.abstraction2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Animal animal = new Animal("animal", "big", 100); //error as Animal is
        // abstract class

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise(); // we can use Dog anywhere Animal is used
        doAnimalStuff(dog);
        Dog.Bark(); // Barking

        // can hold any kind of Animal which includes Dog and Fish
        // Again remember we didn't create an instance of Animal
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }

    }

    // We can't make instance of Animal because it is abstract class . But that does
    // not prevent us from using that type in methods , declarations and lists . In
    // fact this is what make that code so flexible and scalable . This is
    // abstraction promoting polymorphism technique

    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }

}
