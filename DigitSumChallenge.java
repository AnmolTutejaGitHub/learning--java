// In this challenge, your task is to write a method, with the name sumDigits, that has a single parameter named number, of type int, and it should return an int.
// The method should only take a number that is a positive number. 
// If a negative number is passed, it should return -1, meaning an invalid value was passed.
// The method should parse out each digit from the number, and sum the digits up.
// So if 125 is the value passed to the method, the code should sum each digit, in this case, 1 + 2 + 5, and return 8, as a value.
// And another example, if the value is 1000, the code should sum each digit, 1 + 0 + 0 + 0, and return 1 as a value.
// If the number is a single digit number, simply return the number itself as the result.

public class DigitSumChallenge {

    // sum of digits and reverse a number
    public static void main(String[] args) {
        System.out.println(sumDigits(567)); // 18
        System.out.println(reverse(567)); // 765
        System.out.println(reverse(560)); // 65 //need to work for 065
    }

    public static int sumDigits(int num) {
        if (num < 0)
            return -1;

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {

            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

}
