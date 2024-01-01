
//The hasNextInt() method is a part of the Scanner class and is typically used to check if the next token in the input stream is an integer.
//This method returns a boolean value (true or false) depending on whether the next token is an integer or not.
import java.util.Scanner;

public class hasNextInt {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");

        // Check if the next token is an integer
        if (scanner.hasNextInt()) {
            // If it is an integer, read and print it
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } else {
            // If it's not an integer, inform the user
            System.out.println("Invalid input. Please enter an integer.");
        }

        // Close the Scanner to free up resources
        scanner.close();
    }
}

//In this example, hasNextInt() is used to check whether the user's input is an integer before attempting to read it with nextInt(). 
//This helps avoid exceptions that could occur if the input is not an integer.






