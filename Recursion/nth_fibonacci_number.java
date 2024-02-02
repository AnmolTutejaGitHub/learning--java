package Recursion;

public class nth_fibonacci_number {
    public static void main(String[] args) {
        System.out.println(fibo(6)); // 8 // 6th fibonacci number is 8

    }

    public static int fibo(int n) {

        // base condition :
        // if (n == 0)
        // return 0;
        // if (n == 1)
        // return 1;
        if (n < 2)
            return n;

        return fibo(n - 1) + fibo(n - 2);
    }
}
