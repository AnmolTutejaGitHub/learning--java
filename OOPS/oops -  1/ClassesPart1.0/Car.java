public class Car {

    // Creating private fields
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean Covertible;

    public void describeCar() {
        System.out.println(
                doors + "-Doors " + color + " " + make + " " + model + " " + (Covertible ? "convertible" : " "));
    }
}