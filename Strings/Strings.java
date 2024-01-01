//string and string methods in java 

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String myString = "Hello World";

        // String concatenation
        myString += " Say hi";
        System.out.println(myString); // Hello World Say hi

        // can use unicodes in string
        String aim = "I wish I had \u00241,000,000"; // \u0024 is unicode for dollar sign
        System.out.println(aim); // I wish I had $1,000,000

        // length of a string
        System.out.println(aim.length());// 23

        String a1 = "hi";
        String a2 = "hi";
        System.out.println(a1 == a2); // true

        String a3 = "hi ";
        System.out.println(a1 == a3); // false

        // In Java, the == operator is used to compare the references of objects, not
        // their actual content. When you use == to compare two strings, you are
        // checking whether the two string variables refer to the exact same object in
        // memory.

        // To compare the content of two strings in Java, you should use the equals()
        // method:

        System.out.println(a1.equals(a3)); // false

        String str1 = "it is a lovely weather today";
        String str2 = "it is a lovely weather today";
        System.out.println(str1.equals(str2)); // true

        // using new String() creates new string but also gives different reference

        String strr = new String("tony");
        String strr2 = new String("tony");

        System.out.println(strr == strr2); // false

        // concatenate
        String firstName = "tony";
        String secondName = "Stark";

        String fullName = firstName + secondName;
        System.out.println(fullName);

        // charAt
        String str3 = "Hello";
        char characterAtIndexTwo = str3.charAt(2);
        System.out.println(characterAtIndexTwo); // This will print 'l'

        // If you need to perform more complex operations on strings, such as modifying
        // individual characters, you can convert the string to a character array,
        // manipulate the array, and then convert it back to a string. Here's an
        // example:
        String str4 = "Hello";
        char[] charArray = str4.toCharArray();

        // Modify the character at index 2
        charArray[2] = 'x';

        // Convert the character array back to a string
        String modifiedStr = new String(charArray);

        System.out.println(modifiedStr); // This will print "Hexlo"

        // compare
        String name1 = "tony";
        String name2 = "tony";

        if (name1.compareTo(name2) == 0) { // can't do if(name1.compareTo(name2)){} because compareTo returns an int not
                                           // a boolean
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // if s1>s2 : compareTo retuns +ve value
        // if s1==s2 : compareTo retuns 0
        // if s1<s2 : compareTo retuns -ve value

        // compareToIgnoreCase() Compares two strings lexicographically, ignoring case
        // differences

        // substring
        String sentence = "My name in Anmol";
        String name = sentence.substring(11, sentence.length()); // start index , end index for slicing //start index
                                                                 // included end index excluded
        System.out.println(name);// Anmol

        // Strings to integer

        // Method 1: Using parseInt method
        String strNumber1 = "123";
        int number1 = Integer.parseInt(strNumber1);
        System.out.println("Method 1 - Converted Integer: " + number1);

        // Method 2: Using valueOf method
        String strNumber2 = "456";
        Integer number2 = Integer.valueOf(strNumber2);
        System.out.println("Method 2 - Converted Integer: " + number2);
        // String strNumber2 = "123";
        // Integer number2 = Integer.valueOf(strNumber2);
        // int intNumber2 = number2.intValue();

        // System.out.println("Integer: " + number2);
        // System.out.println("int: " + intNumber2);
        // // In this example, number2 is an Integer object, and intNumber2 is an int
        // primitive.

        // integer to string :
        // Method 1: Using Integer.toString()
        int number3 = 123;
        String strNumber3 = Integer.toString(number3);
        System.out.println("Method 1 - Converted String: " + strNumber3);

        // Method 2: Using concatenation with an empty string
        int number4 = 456;
        String strNumber4 = "" + number4;
        System.out.println("Method 2 - Converted String: " + strNumber4);

        // to upper case and to lower case :
        String txt = "Hello World";
        System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase()); // Outputs "hello world"

        // indexOf():The indexOf() method returns the index (the position) of the first
        // occurrence of a specified text in a string (including whitespace):
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        // trim() : Removes whitespace from both ends of a string
        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());

        // replace():Searches a string for a specified value, and returns a new string
        // where the specified values are replaced

        String myStr2 = "Hello";
        System.out.println(myStr2.replace('l', 'p')); // Heppo

        // replaceFirst() : Replaces the first occurrence of a substring that matches
        // the given regular expression with the given replacement

        String str6 = "Hello World! hello";
        String change = "Hey";
        String replacedStr = str6.replaceFirst("Hello", change);
        System.out.println(replacedStr);// Hey World! hello

        // replaceAll() Replaces each substring of this string that matches the given
        // regular expression with the given replacement

        // split():Splits a string into an array of substrings
        String mystr = "Hello,World";
        String[] splitStrings = mystr.split(","); // String[] splitStrings is Array of string
        System.out.println(Arrays.toString(splitStrings));// [Hello, World]

        // String.format()
        String formattedString = String.format("Hello, %s!", "Java");
        System.out.println(formattedString); // Hello, Java!

    }
}
