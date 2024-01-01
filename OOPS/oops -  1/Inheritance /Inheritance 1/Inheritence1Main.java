public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");
//        Generic Animal makes some kind of noise
//        Generic Animal moves slow
//        Animal{type='Generic Animal', size='Huge', weight=400.0}
//        _ _ _ _

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
//        Mutt makes some kind of noise
//        Mutt moves fast
//        Animal{type='Mutt', size='Big', weight=50.0}
//        _ _ _ _

    }

    public static void doAnimalStuff(Animal animal, String speed) {

        //here in case of Dog, it inherits all the properties and methods  of Animal
        // so it is perfectly valid to pass dog as first argument
        //we can pass Dog to any method that takes Animal

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
