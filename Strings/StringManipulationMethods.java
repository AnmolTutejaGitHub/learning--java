//string maniplation methods : (2 types)

//The first set of methods, don't actually change the underlying meaning of the text value, but perform some kind of clean up.:
// indent : This method was added in JDK 15, and adds or removes spaces from the beginning of lines in multi-line text.
// strip , stripLeading , stripTrailing , trim : The difference between the strip method and trim method is that the strip() supports a larger set of white space characters. It and the corresponding stripLeading and stripTrailing methods were added in JDK 11.
// toLowerCase , toUpperCase : Returns a new String, either in a lower case or in upper case

//The second set of string manipulation methods, transform the String value, and return a String with a different meaning, than the original String.
// concat : Similar to the plus operator for strings, it concatenates text to the String and returns a new String as the result.
// join : Allows multiple strings to be concatenated together in a single method, specifying a delimiter.
// repeat : Returns the String repeated by the number of times specified in the argument.
// replace , replaceAll , replaceFirst : These methods replace characters or strings in the string, returning a new String with replacements made.
// substring , subSequence : These return a part of the String, its range defined by the start and end index specified.

public class StringManipulationMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        // join method :
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        // concat method does what the plus operator does but less efficiently

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        // method chaining
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-')); // replaces every occurence
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-")); // replaces only first occurence
        System.out.println(newDate.replaceAll("/", "---")); // replace all occurences

        //

        System.out.println("ABC\n".repeat(3));
        // ABC
        // ABC
        // ABC

        System.out.println("-".repeat(20)); // --------------------

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }

    // output :
    // startingIndex = 6
    // Birth year = 1982
    // Month = 11
    // newDate = 25/11/1982
    // newDate = 25/11/1982
    // newDate = 25/11/1982
    // newDate = 25/11/1982
    // 25-11-1982
    // 005/11/19800
    // 25-11/1982
    // 25---11---1982
    // ABC
    // ABC
    // ABC

    // --------------------
    // ABC
    // ABC
    // ABC

    // --------------------
    // ABC
    // ABC
    // ABC

    // --------------------

}
