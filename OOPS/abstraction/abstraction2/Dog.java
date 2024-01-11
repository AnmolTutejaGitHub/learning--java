package abstraction.abstraction2;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    // @Override
    // public void move(String speed) {}
    // // even though ou abstract method is forcing us to have move method we can
    // still not put statement in our code
    @Override
    public void move(String speed) {

        if (speed.equals("slow")) {
            System.out.println(type + " walking");
        } else {
            System.out.println(type + " running");
        }

    }

    @Override
    public void makeNoise() {

        if (type == "Wolf") {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }

    }

    // Dog can still have it's own method
    public static void Bark() {
        System.out.println("Barking");
    }
}
