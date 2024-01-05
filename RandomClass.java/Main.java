import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Creating a Random object
        Random random = new Random();

        // Generating a random integer
        int randomNumber = random.nextInt();
        System.out.println("Random Integer: " + randomNumber);

        // Generating a random integer between 0 (inclusive) and 100 (exclusive)
        int randomInRange = random.nextInt(100);
        System.out.println("Random Integer in Range: " + randomInRange);

        // Generating a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // range from 0.0 to 10.0
        double randomDoubleInRange = random.nextDouble() * 10.0;
        System.out.println("Random Double in Range: " + randomDoubleInRange);

    }
}

// The nextInt() method without any arguments in the Random class generates a
// random integer in the full range of the int data type in Java. In other
// words, it can generate any 32-bit signed integer value. The range of the
// generated values is from Integer.MIN_VALUE to Integer.MAX_VALUE, inclusive.
