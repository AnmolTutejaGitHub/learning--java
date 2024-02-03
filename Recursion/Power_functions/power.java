package Recursion.Power_functions;

// x to power n

// time complexity O(n)
public class power {
    public static void main(String[] args) {
        System.out.println(Power(2, 10)); // 1024
    }

    public static int Power(int x, int n) {

        // base case
        if (n == 0)
            return 1;

        return x * Power(x, n - 1);
    }
}
