// split method on strings 

import java.util.Arrays;

public class splitMethod {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] parts = str.split(",");

        System.out.println(Arrays.toString(parts)); // [Hello, World, Java]
    }
}
