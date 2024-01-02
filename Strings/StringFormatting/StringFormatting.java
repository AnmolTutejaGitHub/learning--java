public class StringFormatting {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        // \t -->escape sequence for tab

        System.out.println(bulletIt);

        // \u2022 --> unicode for bullet point

        String textBlock = """

                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        // """ textblock """ --> A Text Block is just a special
        // format for multi-line String literals.
        // It's simply a String, with a new representation in the source code.
        // It became part of the official language as of JDK 15.

        System.out.println(textBlock);

        int age = 19;
        System.out.printf("Your age is %d%n", age);
        // System.out.printf() and System.out.format() behaves the same

        // format specifier
        // At their most complex, format specifiers take the form shown here.
        // %[argument_index$][flags][width][.precision]conversion

        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f%n", (float) age);
        // by default %f precision is 6 decimal places

        // formatting width of a number
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
            // 6 specify width
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        // There were time where some of these formatting options were much slower ,
        // than simply using the concatenate operator , the plus time
        // but java continues to make performance enhacements on these methods
    }
}
