public class FloatIntConversionExample {
    public static void main(String[] args) {
        // Float to Int
        float floatNumber = 123.45F;
        int intNumberFromFloat = (int) floatNumber;
        
        System.out.println("Float: " + floatNumber);
        System.out.println("Converted Int (from float): " + intNumberFromFloat);

        // Int to Float
        int intNumber = 456;
        float floatNumberFromInt = (float) intNumber;
        
        System.out.println("\nInt: " + intNumber);
        System.out.println("Converted Float (from int): " + floatNumberFromInt);

        // Double to Int
        double doubleNumber = 789.123;
        int intNumberFromDouble = (int) doubleNumber;

        System.out.println("\nDouble: " + doubleNumber);
        System.out.println("Converted Int (from double): " + intNumberFromDouble);
        
        // Int to Double
        int anotherIntNumber = 987;
        double doubleNumberFromInt = (double) anotherIntNumber;
        
        System.out.println("\nInt: " + anotherIntNumber);
        System.out.println("Converted Double (from int): " + doubleNumberFromInt);
    }
}


//output 
// Float: 123.45
// Converted Int (from float): 123

// Int: 456
// Converted Float (from int): 456.0

// Double: 789.123
// Converted Int (from double): 789

// Int: 987
// Converted Double (from int): 987.0

