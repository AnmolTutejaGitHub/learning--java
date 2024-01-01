// Palindrome in java
public class Palindrome {
    // write code here
    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        int revnum = reverse(num);
        if (("" + num).equals("" + revnum))
            return true;

        return false;

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

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(990)); // false
        System.out.println(reverse(650)); // 56
        System.out.println(isPalindrome(11212)); // false
        // System.out.println(isPalindrome(0990)); //want to check for leading zero as
        // my reverse doesn't hanle that but in java 0990 showing error as:

        // The error you're encountering with the input 0990 is related to how integers
        // are represented in programming languages, particularly in Java. In Java, if a
        // numeric literal starts with a leading zero, it is treated as an octal
        // (base-8) literal. However, the digit '9' is not valid in octal notation, so
        // the number 0990 is not interpreted as expected.

    }

}