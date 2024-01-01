public class figuringout {
    public static void main(String[] arg) {
        int a = 25;
        int b = 2;
        int c = 25 / 2;
        System.out.println(a / b); // 12

        // use printf for using identifiers
        // %d: Represents integers (int, long, etc.).
        // %f: Represents floating-point numbers (float, double).
        // %s: Represents strings.
        // %c: Represents characters.
        // %b: Represents booleans (true or false).
        // %x: Represents integers in hexadecimal format.
        // %o: Represents integers in octal format.
        // %e or %E: Represents numbers in scientific notation.
        // %t: Represents date and time values (used with date and time formatting).
        // %n: Represents a newline character.
        System.out.printf("%d\n", c); // System.out.printf() and System.out.print() doesnt produce newline
                                      // System.out.println() does

        // In Java, you can format strings using various techniques, but one commonly
        // used approach is to use the String.format() method
        // or the printf() method (for printing to the console). Both methods use a
        // syntax similar to the C language's printf() function.
        // Here's how to format strings in Java using String.format():
        String name = "Alice";
        int age = 30;

        String greeting = String.format("Hello, %s!", name);
        // Result: "Hello, Alice!"
        System.out.println(greeting);
        String message = String.format("Next year, %s will be %d years old.", name, age + 1);
        // Result: "Next year, Alice will be 31 years old."
        System.out.println(message);

        // can do this too
        int number = 5;
        number += 10;
        System.out.println(number);

        // && --> and operator
        // || --> or operator
        // not operator !
        boolean isStudent = false;
        System.out.println(!isStudent); // true

        number++;
        System.out.println(number);

        number--;
        System.out.println(number);

        int no = 55;
        System.out.println(no++); // 55
        System.out.println(no); // 56

    }
}
