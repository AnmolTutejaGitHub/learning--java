
public class Inheritance2Main {
    public static void main(String[] args) {

        Animal2 animal = new Animal2("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog2 dog = new Dog2();
        doAnimalStuff(dog, "fast");

        Dog2 yorkie = new Dog2("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog2 retriever = new Dog2("Labrador Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
    }

    public static void doAnimalStuff(Animal2 animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
