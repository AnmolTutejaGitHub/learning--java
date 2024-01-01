// You'll be using an endless loop which:
// Prompts the user to enter a number, or any character to quit.
// Validates if the user-entered data really is a number, you can choose either an integer, or double validation method.
// If the user-entered data is not a number, quit the loop.
// Keep track of the minimum number entered.
// Keep track of the maximum number entered.
// If the user has previously entered a set of numbers (or even just one), display the minimum, and maximum number, which the user entered.

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }

}
