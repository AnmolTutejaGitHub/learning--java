//use of "nested" ternary operator
public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));
    }

    public static void main(String[] args) {
        checkNumber(23);
    }
}
