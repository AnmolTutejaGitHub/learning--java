//indexing of string in java 
public class IndexingOfString {
    public static void main(String[] args) {
        // In Java, you cannot directly use the syntax str[i] to access individual
        // characters of a string. Unlike some other programming languages (like C or
        // C++), Java treats strings as objects, and it provides methods to manipulate
        // them.

        // To access individual characters in a Java string, you can use the charAt
        // method. Here's an example:

        String str = "Hello";
        char characterAtIndexTwo = str.charAt(2);
        System.out.println(characterAtIndexTwo); // This will print 'l'
        // In this example, charAt(2) returns the character at index 2 in the string
        // "Hello," which is 'l'.

        // If you need to perform more complex operations on strings, such as modifying
        // individual characters, you can convert the string to a character array,
        // manipulate the array, and then convert it back to a string. Here's an
        // example:
        String str2 = "Hello";
        char[] charArray = str2.toCharArray();

        // Modify the character at index 2
        charArray[2] = 'x';

        // Convert the character array back to a string
        String modifiedStr = new String(charArray);

        System.out.println(modifiedStr); // This will print "Hexlo"

    }
}
