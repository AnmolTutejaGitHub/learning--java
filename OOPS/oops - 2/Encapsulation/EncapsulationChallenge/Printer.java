// In this challenge, you need to create a class named Printer.
// The fields on this class are going to be:
// tonerLevel, which is the percentage of how much toner level is left.
// pagesPrinted, which is the count of total pages printed by the Printer.
// duplex, which is a boolean indicator.  If true, it can print on 2 sides of a single sheet of paper.
// You'll want to initialize your printer, by specifying a starting toner amount, and whether the printer is duplex or not.

// On the Printer class, you want to create two methods, which the calling code should be able to access.
// These methods are:
// addToner() which takes a tonerAmount argument.
// tonerAmount is added to the tonerLevel field.
// The tonerLevel should never exceed 100 percent, or ever get below 0 percent. 
// If the amount being added makes the level fall outside that range, return a -1 from the method, otherwise return the actual toner level.

// printPages() which should take pages to be printed as the argument.
// It should determine how many sheets of paper, will be printed based on the duplex value, and return this sheet number from the method.
// The sheet number should also be added to the pagesPrinted variable.
// If it's a duplex printer, print a message that it's a duplex printer.

package Encapsulation.EncapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
