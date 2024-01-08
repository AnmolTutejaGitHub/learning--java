// array to string in java -- join method 
package ArrayToString;

public class ArrayToString {
    public static void main(String[] args) {
        String[] array = { "a", "b", "c" };

        String str = String.join("/", array);
        System.out.println(str); // a/b/c

    }
}
