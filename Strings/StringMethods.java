// The String has over 60 methods available. 
// The String is a sequence of characters, meaning its characters are ordered and indexed. 

// We can split String's methods up into three basic categories:
// String Inspection Methods.:  they provide some info about the string  
// Methods for Comparing String values. : compares 2 strings , usually returns a boolean 
// String Manipulation Methods : they transform one string value into another

//String Inspection Methods : length,charAt,indexOf,lastindexOf , isEmpty,isBlank 

//String comparison methods : 
// contentEquals :Returns a boolean if the String's value is equal to the value of the argument passed. 
//This method allows for arguments other than String, for any type that is a character sequence.

// equals : Return a boolean if the String's value is equal to the value of the argument passed. 

// equalsIgnoreCase : Return a boolean if the String's value is equal (ignoring case), to the value of the argument passed. 

// contains : Returns a boolean if the String contains the argument passed.

//endsWith , startsWith : These return a boolean, and are much like the contains method, but more specific to the placement of the argument in the String.

// regionMatches : Returns a boolean, if defined sub-regions are matched.

public class StringMethods {
    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l')); // gives index of first occurence
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l',
                3)); // 3
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l',
                8)); // 3 startng from 8th index and moving backwards and looking till it find l

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

        // contentEquals method can be used to compare a StringBuilder's value ,
        // which the equals method doesn't support
    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

    // output:
    // Length = 11
    // First char = H
    // Last char = d
    // Length = 0
    // String is Empty
    // Length = 5
    // String is Blank
    // First char =
    // Last char =

    // index of r = 8
    // index of World = 6
    // index of l = 2
    // index of l = 9
    // index of l = 3
    // index of l = 3
    // Values match ignoring case
    // String starts with Hello
    // String ends with World
    // String contains World
    // Values match exactly
}
