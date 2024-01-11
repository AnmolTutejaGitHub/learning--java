package abstraction.abstraction3;

// abstract class Manmmal inheriting from another abstract class Animal 

// note : An Abstract class doesn't have to implement abstract methods
// An abstract class that extends another abstract class has some flexibility.
// It can implement all of the parent's abstract methods.
// It can implement some of them.
// Or it can implement none of them.
// It can also include additional abstract methods, which will force subclasses to implement both Animal's abstract methods, as well as Mammal's.

abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    // we override it to be concrete method than abstract means our Hourse class is
    // now not forced to implement it
    // note : Horce class is forced to implemenet Animal class abstract method
    public void move(String speed) {

        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}

/////////////////

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    // can have concrete method on abstract class; it has method body
    // can use this method on subclasses
    // the subclasses can also override this method
    // to prevent overriding we can use the modifier final
    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
