package Recursion.Power_functions;

// x to power n (optimised)

// time compexity O(log n)
public class optimised_power {
    public static void main(String[] args) {

    }

    public int optimisedPower(int x, int n) {

        // base condition
        if (n == 0)
            return 1;

        // optimisedPower(x, n / 2) is calc 2 times can stored it in a variable
        int halfPower = optimisedPower(x, n / 2);

        if (n % 2 != 0)
            // return x * optimisedPower(x, n / 2) * optimisedPower(x, n / 2);
            return x * halfPower * halfPower;

        // return optimisedPower(x, n / 2) * optimisedPower(x, n / 2);
        return halfPower * halfPower;
    }
}
