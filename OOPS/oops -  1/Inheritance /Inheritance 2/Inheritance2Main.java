
public class Inheritance2Main {
    public static void main(String[] args) {

        Animal2 animal = new Animal2("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");
        // Generic Animal makes some kind of noise
        // Generic Animal moves slow
        // Animal{type='Generic Animal', size='Huge', weight=400.0}
        // _ _ _ _

        Dog2 dog = new Dog2();
        doAnimalStuff(dog, "fast");
        // Mutt moves fast
        // Dogs walk, run and wag their tail
        // Dog{earShape='null', tailShape='null'} Animal{type='Mutt', size='Big',
        // weight=50.0}
        // _ _ _ _

        Dog2 yorkie = new Dog2("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        // Yorkie moves fast
        // Dogs walk, run and wag their tail
        // Dog{earShape='Perky', tailShape='Curled'} Animal{type='Yorkie',
        // size='medium', weight=15.0}
        // _ _ _ _

        Dog2 retriever = new Dog2("Labrador Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
        // Labrador Retriever moves slow
        // Dogs walk, run and wag their tail
        // Dog{earShape='Floppy', tailShape='Swimmer'} Animal{type='Labrador Retriever',
        // size='large', weight=65.0}
        // _ _ _ _
    }

    public static void doAnimalStuff(Animal2 animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
