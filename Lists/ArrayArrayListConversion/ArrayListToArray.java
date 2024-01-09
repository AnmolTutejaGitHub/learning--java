package ArrayArrayListConversion;

// ArrayList to Array in java 
import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>(List.of("Apple", "orange", "meat"));
        System.out.println(groceries); // [Apple, orange, meat]
        ;
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray)); // [Apple, orange, meat]
    }
}
