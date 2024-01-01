public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // variables

        // integer
        int a = 34;
        System.out.println(a); // 34

        // print vs println vs printf

        System.out.print("No Newline"); // No newline
        System.out.println("New line"); // with newline

        String name = "Anmol";
        int age = 18;
        System.out.printf("name: %s , age: %d", name, age); // used for formatted output //no new line here

        //
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinIntValue); // -2147483648

        // using + sign in System.out.print
        System.out.println("Integer Minimum value =" + myMinIntValue); // nteger Minimum value =-2147483648
        // whatever follows the + sign in System.out.print here , is converted to a
        // string by java and concatenated to string before it

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Busted Max value :" + (myMaxIntValue + 1)); // overflow

        System.out.println("Busted Min value :" + (myMinIntValue - 1)); // underflow

        System.out.println("Integer Value Range :" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE); // Integer Value
                                                                                                      // Range
                                                                                                      // :-2147483648 to
                                                                                                      // 2147483647
        System.out.println("Byte Value Range :" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE); // Byte Value Range :-128
                                                                                             // to 127
        System.out.println("Short Value Range :" + Short.MIN_VALUE + " to " + Short.MAX_VALUE); // Short Value Range
                                                                                                // :-32768 to 32767

        byte b = 100;
        System.out.println(b); // 100

        System.out.println("Long Value Range :" + Long.MIN_VALUE + " to " + Long.MAX_VALUE); // Long Value Range
                                                                                             // :-9223372036854775808 to
                                                                                             // 9223372036854775807

        long c = 100L; // or 100l if it's 100 then by default its an int
        System.out.println(c); // 100

        System.out.printf("A long has a width : %d", Long.SIZE); // A long has a width : 64
        // or can use String.format for formatting
        String formattedString = String.format("A long has a width: %d", Long.SIZE);// A long has a width : 64
        System.out.println(formattedString);

        // if no L then java will assume it to be integer instead of long
        // ig no greater than int , even if declared with long will show an error if L
        // suffix not used

        // this willl also show error
        // short a=4567890;

        // perfect valid syntax :
        int x = 123;
        int y = 458;

        int r = 789, s = 678; // also valid syntax s is also declared with type int

        // casting in java

        // below explanation in NB
        int total = (myMinIntValue / 2);
        System.out.println(total); // -1073741824

        short sa = 100;
        // short myNewShortValue = sa / 2; //error

        short myNewShortValue = 100 / 2;
        System.out.println(myNewShortValue); // 50

        short f = (short) (sa / 2);
        System.out.println(f); // 50

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal); // 50800

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal); // if not type casting here then error

        // Float and double Primitives

        // double is more precise as double range is larger than float

        System.out.printf("Float Value Range : %f to %f\n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double Value Range : %f to %f\n", Double.MIN_VALUE, Double.MAX_VALUE);

        // Precisiion Specifier
        double pie = 3.1478;
        System.out.printf("%.2f\n", pie); // upto 2 decimal places //3.15

        double test = 3.143;
        System.out.printf("%.2f\n", test); // 3.14
        // when we use the format specifier %.2f, it rounds the number to two decimal
        // places.

        float myFloatValue = 5F;
        System.out.println(myFloatValue); // 5.0 (same for Double)

        // float floatVal=5.25; //error as java will interpret 5.25 as double
        float floatVal = 5.25f;
        System.out.println(floatVal); // 5.25

        // can also do this (casting)
        float FloatVal = (float) 5.25;
        System.out.println(FloatVal); // 5.25

        // for irrational numbers
        int myIntValue = 5 / 3;
        float FloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        // System.out.println(myIntValue, myFloatValue, myDoubleValue); error
        System.out.println(myIntValue); // 1
        System.out.println(FloatValue); // 1.6666666 (upto 6 decimal) for n on ending decimals i.e. 1.6bar
        System.out.println(myDoubleValue); // 1.6666666666666667 (upto 16 decimal)

        double DoubleValue = 5 / 3;
        System.out.println(DoubleValue); // 1.0 java will consider 5/3 output to be integer

        DoubleValue = 5.0 / 3;
        System.out.println(DoubleValue);// 1.6666666666666667 now 5.0 is double

        // myfloatval=5.00/3f; error as 5.00 is a double //in my nb detailed

    }

}
