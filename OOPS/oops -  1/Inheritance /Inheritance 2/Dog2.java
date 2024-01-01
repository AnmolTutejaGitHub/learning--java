
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
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
    }
}
