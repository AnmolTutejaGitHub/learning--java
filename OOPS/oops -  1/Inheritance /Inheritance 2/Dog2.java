// Overriding a method is when you create a method on a subclass, which has the same signature as a method on a super class.
// You override a parent class method, when you want the child class to show different behavior for that method.

// The overridden method can do one of three things: 
// It can implement completely different behavior, overriding the behavior of the parent.
// It can simply call the parent class's method, which is somewhat redundant to do.
//example :
//  @Override
//  public void move(String speed) {
//         super.move(speed);
//     }

// Or the method can call the parent class's method, and include other code to run, 
//so it can extend the functionality for the Dog, for that behavior.

public class Dog2 extends Animal2 {
    private String earShape;
    private String tailShape;

    public Dog2() {
        super("Mutt", "Big", 50);
    }

    public Dog2(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog2(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        // weight < 15 ? "small" : (weight < 35 ? "medium" : "large") doing this here as
        // can't do this before super() as supper must be first in constructor
        // using expression is a way to deal with such problems
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();

        // super.toString() --> calling toString method of superclass (Animal) in
        // subclass(Dog)
    }

    public void makeNoise() {

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
    }
}
