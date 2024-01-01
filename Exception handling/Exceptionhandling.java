//An exception is an error that occur in the code
public class Exceptionhandling {
    public static void main(String[] args) {
        try {
            String name = System.console().readLine("Ur name ?");
            System.out.println(name);
        } catch (NullPointerException e) {
            System.out.println("Exception handled");
        }
    }
}
