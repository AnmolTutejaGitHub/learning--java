package bit_manipulation;

// check if a number is power of 2 or not 
public class power_of_two {
    public static boolean powerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(16)); // true
        System.out.println(powerOfTwo(5)); // false
    }
}
