package StringBuilderClass;

public class BasicStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HW");

        System.out.println(sb.toString()); // HW

        // toString() method converts any object to string
        // it converts wrapper class object to string but cant convert a primitive to
        // string

        int a = 10;
        // System.out.println(a.toString()); //error

        Integer b = 10;
        System.out.println(b.toString()); // "10"

        char c = 'c';
        // System.out.println(c.toString()); //primitive

        Character d = 'd';
        System.out.println(d.toString()); // "d"

        // StringBuilder has all methods of string and also has its own methods

        StringBuilder alphabet = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.append(ch);
        }
        System.out.println(alphabet.toString()); // abcdefghijklmnopqrstuvwxyz
        System.out.println(alphabet.length()); // 26

        // note : to conert a char to uppercase()

        char ch = 'a';
        char upper = Character.toUpperCase(ch);
        System.out.println(upper); // A

    }

}
