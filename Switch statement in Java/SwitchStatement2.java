// valid switch types in java 

public class SwitchStatement2 {
    // Switch statement can be used with limited type of datatypes

    // valid switch value types:
    // byte,short,int,char
    // Byte,Short,Integer,Character
    // String
    // enum

    // Important : can't use long , float , double or boolean or their wrapper class

    // In Java, the switch statement traditionally only supports certain primitive
    // data types such as int, char, byte, and short. This limitation arises from
    // the fact that the switch statement was originally designed to efficiently
    // handle simple integer-based cases.

    // The reason you can't directly use long in a switch statement is that long is
    // a 64-bit data type, and handling it in a switch statement would be more
    // complex and less efficient than handling smaller data types.

    // However, starting from Java 7, you can use the switch statement with String
    // values, which is a more flexible approach compared to the traditional
    // integer-based switch. This allows you to achieve similar functionality by
    // converting a long to a String and then using the switch statement with the
    // String cases.

    public static void main(String[] args) {
        long myLong = 42L;
        String longAsString = Long.toString(myLong);

        switch (longAsString) {
            case "42":
                System.out.println("Case 42");
                break;
            case "100":
                System.out.println("Case 100");
                break;
            default:
                System.out.println("Default case");
        }
    }

}
