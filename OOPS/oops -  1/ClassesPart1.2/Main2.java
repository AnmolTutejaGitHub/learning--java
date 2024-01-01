public class Main2 {

    public static void main(String[] args) {

        Car2 car = new Car2();

        // System.out.println("make = " + car.make); // error as make is declared as
        // private attribute in Car2 class

        System.out.println("make = " + car.getMake()); // make = Tesla
        System.out.println("model = " + car.getModel()); // model = Madel X

        car.describeCar(); // 2-Doors Gray Tesla Madel X convertible

    }
}
