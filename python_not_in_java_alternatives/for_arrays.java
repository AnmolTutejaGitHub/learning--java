package python_not_in_java_alternatives;

import java.util.Arrays;

public class for_arrays {
    public static void main(String[] args) {
        String[] colors = { "red", "green", "blue" };
        String colorToCheck = "yellow";
        boolean notInArray = !Arrays.asList(colors).contains(colorToCheck);

    }

}
