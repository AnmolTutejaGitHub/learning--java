package Composition.About;

public class ComputerMain {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        thePC.getMonitor().drawPixelAt(10, 10, "red");
        // if want to use drawPixelAt() method on Monitor class with u passed as
        // parameter to thePC object then do like above

        thePC.getMotherboard().loadProgram("Windows OS");

        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp(); // if want encapulation
    }

    // output :
    // Drawing pixel at 10,10 in color red
    // Program Windows OS is now loading...
    // Power button pressed
    // Power button pressed
    // Drawing pixel at 1200,50 in color yellow
}
