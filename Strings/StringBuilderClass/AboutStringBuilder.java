package StringBuilderClass;

//import java.lang.StringBuilder;

public class AboutStringBuilder {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        // String = Hello World
        // length = 11

        printInformation(helloWorldBuilder);
        // StringBuilder = Hello World and Goodbye
        // length = 23
        // capacity = 27

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        // StringBuilder = aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        // length = 57
        // capacity = 57

        printInformation(emptyStart32);
        // StringBuilder = aaaaaaaaaaaaaaaaa
        // length = 17
        // capacity = 32

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);
        // Hello World and goodbye

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);
        // Hello World and Goodbye

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
        // eybdooG

        StringBuilder mutable = new StringBuilder("mutable");

        // mutable.charAt(0)="n"; //error
        // Use setCharAt to replace the character at index 0
        mutable.setCharAt(0, 'n');

        System.out.println(mutable.toString()); // Output: nutable

    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
