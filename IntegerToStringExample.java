public class IntegerToStringExample {
    public static void main(String[] args) {
        // Method 1: Using Integer.toString()
        int number1 = 123;
        String strNumber1 = Integer.toString(number1);
        System.out.println("Method 1 - Converted String: " + strNumber1);

        // Method 2: Using concatenation with an empty string
        int number2 = 456;
        String strNumber2 = "" + number2;
        System.out.println("Method 2 - Converted String: " + strNumber2);
    }
}
