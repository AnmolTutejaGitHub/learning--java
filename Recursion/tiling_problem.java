package Recursion;

// given a 2 X n board and tiles of size 2 X 1 . Cound the number of ways to tile given board using 2 X 1 tiles .
// ( A tile can either be placed horizontally or vertically)
public class tiling_problem {
    public static void main(String[] args) {

    }

    public static int tilingProblem(int n) { // 2 X n is floor size

        // base case
        if (n == 0 || n == 1)
            return 1;

        int totalWays = tilingProblem(n - 1) + tilingProblem(n - 2);
        return totalWays;

    }
}
