package Encapsulation.EncapsulationChallenge;

public class PrinterMain {
    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());
    }

    // output :
    // initial page count = 0
    // Current Job Pages: 5, Printer Total: 5
    // Current Job Pages: 10, Printer Total: 15
}
