package enums;

enum Laptop {

    // say want to include price too
    // enum Laptop{
    // Macbook(2000), XPX(2200), Surface(1500),ThinkPad(1800);
    // } // error how java will know 2000 is price for mac we have to define
    // constructor for this

    Macbook(2000), XPX(2200), Surface(1500), ThinkPad(1800);

    private int price;

    // constructor
    private Laptop(int price) {
        this.price = price;
    }

    // can create methods
    public int getPrice() {
        return price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap.getPrice()); // 2000
    }
}

// can do :
// Surface just createw default constructor (no arguments)

enum Laptop2 {

    Macbook(2000), XPX(2200), Surface, ThinkPad(1800);

    private int price;

    // constructor
    private Laptop2(int price) {
        this.price = price;
    }

    private Laptop2() {
        price = 50;
    }

    // can create methods
    public int getPrice() {
        return price;
    }
}