
public class Inheritance3Main {
    public static void main(String[] args) {

        Animal3 animal = new Animal3("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");
        // Generic Animal makes some kind of noise
        // Generic Animal moves slow
        // Animal{type='Generic Animal', size='Huge', weight=400.0}
        // _ _ _ _

        Dog3 dog = new Dog3();
        doAnimalStuff(dog, "fast");
        // Woof!
        // Mutt moves fast
        // Dog Running Woof!
        // Dog{earShape='null', tailShape='null'} Animal{type='Mutt', size='Big',
        // weight=50.0}
        // _ _ _ _

        Dog3 yorkie = new Dog3("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        // Woof!
        // Yorkie moves fast
        // Dog Running Woof!
        // Dog{earShape='Perky', tailShape='Curled'} Animal{type='Yorkie',
        // size='medium', weight=15.0}
        // _ _ _ _

        Dog3 retriever = new Dog3("Labrador Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
        // Woof!
        // Labrador Retriever moves slow
        // Dog Walking Tail Wagging
        // Dog{earShape='Floppy', tailShape='Swimmer'} Animal{type='Labrador Retriever',
        // size='large', weight=65.0}
        // _ _ _ _

        Dog3 wolf = new Dog3("Wolf", 40);
        doAnimalStuff(wolf, "slow");
        // Ow Wooooo! Woof!
        // Wolf moves slow
        // Dog Walking Tail Wagging
        // Dog{earShape='Perky', tailShape='Curled'} Animal{type='Wolf', size='large',
        // weight=40.0}
        // _ _ _ _

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
        // Goldfish makes some kind of noise
        // Goldfish moves fast
        // muscles moving backfin moving
        // Fish{gills=2, fins=3} Animal{type='Goldfish', size='small', weight=0.25}
        // _ _ _ _
    }

    public static void doAnimalStuff(Animal3 animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
