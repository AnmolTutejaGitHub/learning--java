package python_not_in_java_alternatives;

import java.util.Arrays;
import java.util.List;

public class contains_method {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange");
        String fruitToCheck = "mango";
        boolean notInCollection = !fruits.contains(fruitToCheck);
    }

}
