package python_not_in_java_alternatives;

public class using_loops {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie" };
        String nameToFind = "David";
        boolean found = false;
        for (String name : names) {
            if (name.equals(nameToFind)) {
                found = true;
                break;
            }
        }
        boolean notInArray = !found;
    }

}
