public class stringsMethod {
    public static void main(String[] arg) {
        // formatting a string
        String name = "Anmol Tuteja";
        String country = "India";
        int age = 18;
        String profession = "Berojgar";

        String formattedString = String.format("My name is %s . I am from %s and I am %d years old.I am a  %s.", name,
                country, age, profession);
        System.out.println(formattedString);

        // format specifiers :
        // %f -->double,float
        // %c --> character
        // %b --> boolean

        // length of a string
        System.out.println(formattedString.length());

        // check if a string is empty or not
        System.out.println(formattedString.isEmpty()); // false
        System.out.println(formattedString.toLowerCase()); // Don't modify the original string
        System.out.println(formattedString.toUpperCase());

        // note:
        String string1 = new String("abc");
        String string2 = new String("abc");
        String string3 = new String("ABC");

        // == operator checks if object on left side is equal to object on right side
        System.out.println(string1 == string2); // false

        // to compare string u have to use equal method
        System.out.println(string1.equals(string2)); // true

        // Note:
        System.out.println(string1.equals(string3)); // false
        System.out.println(string1.equalsIgnoreCase(string3)); // true

        // You can also replace a string in java using replace method
        String string = "The sky is blue.";
        System.out.println(string.replace("blue", "red")); // The sky is red.
        // replace method does not change the original string . it returns the updated
        // string

        // checks if a string contains a certain word
        System.out.println(string.contains("sky")); // true

    }
}
