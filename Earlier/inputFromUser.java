
//Taking input from user
import java.util.Scanner;

public class inputFromUser {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in); // System.in from where u want to take input
        System.out.print("What is your name:");
        // scanner.nextLine(); // nextline() method used to take string as input from
        // user
        // store it in a variable
        // Read a line of text entered by the user
        String name = scanner.nextLine();
        System.out.println(name);

        // Close the scanner when you're done with it
        // scanner.close();

        // we first create a Scanner object, and then we use the nextLine() method of
        // the Scanner to read a line of text input from the user.
        // You can also use other methods like nextInt(), nextDouble(), etc., to read
        // specific types of input.

        // Make sure to import the java.util.Scanner class at the beginning of your Java
        // program.
        // It's important to close the Scanner object when you're done with it to
        // release any associated resources,
        // which is why we call scanner.close() at the end.

        // //Taking string as input after taking int as input

        System.out.println("What is ur name?");
        String names = scanner.nextLine();
        System.out.println("Enter ur age:");
        int age = scanner.nextInt();
        System.out.println("what's ur favourite language");
        String language = scanner.nextLine();
        System.out.printf("My name is %s . My age is %d and I love %s!\n", names, age, language);
        // // newline qwill be treated as input for language scanner
        // //unlike nextline , nextInt takes only numer as input and puts the newline
        // character in buffer input
        // //there are many ways to deal with this
        // 1) take an extra nextLine as input after nextInt/nextDouble
        // 2) or just typecaste
        // 1)
        System.out.println("What is ur name?");
        String names1 = scanner.nextLine();
        System.out.println("Enter ur age:");
        int age1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what's ur favourite language");
        String language1 = scanner.nextLine();
        System.out.printf("My name is %s . My age is %d and I love %s!", names1, age1, language1);

        //2. another way is type casting like:
        //int age= Integer.parseInt(scanner.nextLine());
        //double gpa=Double.parseDouble(scanner.nextLine());
        scanner.close();


        
    }
}
