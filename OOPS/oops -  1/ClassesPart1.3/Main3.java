public class Main3 {
    public static void main(String[] args) {

        // Car3 car = null;
        Car3 car = new Car3();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake()); // make = Porsche
        System.out.println("model = " + car.getModel()); // model = Carrera
        car.describeCar();// 2-Door black Porsche Carrera Convertible

        Car3 targa = new Car3();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar(); // 2-Door red Porsche Targa
    }
}
