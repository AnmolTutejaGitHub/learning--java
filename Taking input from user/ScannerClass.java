import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        // creating object
        // className variableName = new className(arguments);
        // eg : String name = new String("Anmol");
        Scanner scanner = new Scanner(System.in);
        // here scanner is variable name
        // scanner is instance / object of Scanner class we created

        // calling nextLine() method on the object we created to read input
        // unlike System.console().realLine("Prompt for user") we can't prompt user it
        // has to be done seperately
        System.out.println("what is ur name");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("What is ur age ");
        int age = Integer.parseInt(scanner.nextLine()); // no need to create Scanner object again
        System.out.println(age);

        // Closing the Scanner to release resources
        scanner.close();

        // scanner.nextLine();

    }
}
