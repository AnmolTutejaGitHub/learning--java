package interfaces.interfacePart2;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move(); // Flaps wings
        // flier.move();
        // tracked.move();

        // flier.takeOff();
        // flier.fly();
        // tracked.track();
        // flier.land();

        inFlight(flier);
        // Bird is taking off
        // Bird is flying
        // --------
        // Bird's coordinates recorded
        // Bird is landing

        inFlight(new Jet());
        // Jet is taking off
        // Jet is flying
        // --------
        // Jet's coordinates recorded
        // Jet is landing

        Trackable truck = new Truck();
        truck.track();
        // Truck's coordinates recorded
        // The truck traveled 100.00 km or 62.14 miles

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);

    }

    private static void inFlight(FlightEnabled flier) { // as Movie movie = new Adeventure())

        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) { // as filer given reference of bird
            System.out.println("--------");
            tracked.track();
        }
        flier.land();
    }

}