package bit_manipulation;

// checking if a number is odd or even using bit manipulation 

public class odd_or_even {
    public static void main(String[] args) {

        // note :

        // 0 = 000
        // 1 = 001
        // 2 = 010
        // 3 = 011
        // 4 = 100
        // 5 = 101

        // note : LSB of even nos = 0
        // LSB of odd nos = 0

        EvenOrOdd(5); // Odd number
        EvenOrOdd(11); // Odd number
        EvenOrOdd(4); // Even number

    }

    public static void EvenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("Even number");
        }

        if ((n & bitMask) == 1) {
            // odd number
            System.out.println("Odd number");
        }
    }
}
