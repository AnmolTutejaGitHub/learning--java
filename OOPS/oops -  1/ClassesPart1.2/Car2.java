//getters 

public class Car2 {
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

    // getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int doors() {
        return doors;
    }

    public boolean isConvertible() {
        return Covertible;
    }
}
