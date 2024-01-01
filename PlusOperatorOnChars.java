// + operator on chars
public class PlusOperatorOnChars {
    public static void main(String[] args) {
        char firstChar = 'A';
        char secondChar = 'B';

        System.out.println(firstChar + secondChar); // 131

        // chars are stored as 2 byte numbers in memory.
        // When you use the plus operator with chars, it is these numbers in memory that
        // get added together.
        // The character values don't get concatenated.

        // decimal value of 'A' is 65 for 'B' its 66 ,,,, 65+66=131

        // If u want 'A' concatenation with 'B' convert them to strings
        System.out.println("" + firstChar + secondChar); // AB
    }
}
