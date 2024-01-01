
public class Car1 {
    // Creating private fields
    private String make = "Tesla";
    private String model = "Madel X";
    private String color = "Gray";
    private int doors = 2;
    private boolean Covertible = true;

    public void describeCar() {
        System.out.println(
                doors + "-Doors " + color + " " + make + " " + model + " " + (Covertible ? "convertible" : " "));
    }
}
