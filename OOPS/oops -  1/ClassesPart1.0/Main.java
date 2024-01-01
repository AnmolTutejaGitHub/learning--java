public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar(); // 0-Doors null null null

        // A field with a primitive type will get assigned a default value by java
        // unlike local variables , fields on classes are assigned default values,
        // intrinsically by java , if not assigned explicitly.
        // For String field , it points to null reference

        // Default values for fields on classes

        // Data type ---------- Default values assigned
        // boolean ---------- false
        // byte/short/int/long/char ---------- 0
        // double, float ---------- 0.0

    }
}