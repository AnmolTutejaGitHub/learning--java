public class EfficientIsPrime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }


//  Loop for Divisibility:
// Start a loop from 5 and increment by 6 in each iteration (i += 6).
//This is based on the observation that all prime numbers greater than 6 can be written in the form 6k ± 1. 
//So, it checks for divisibility by numbers of the form 6k ± 1.
// Check for divisibility by i and i + 2. If the number is divisible, it is not prime, and the function returns false.

  
        int sqrt = (int) Math.sqrt(n) + 1;
        for (int i = 5; i <= sqrt; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test the isPrime function
        int[] numbers = { 2, 3, 11, 16, 17, 19, 23, 29, 31, 37, 41, 43, 47 };

        for (int num : numbers) {
            System.out.println(num + " is prime: " + isPrime(num));
        }
    }
}


//This implementation has a few optimizations:

// It checks for divisibility by 2 and 3 separately before entering the loop.
// It only checks divisibility up to the square root of the number.
// It uses a loop that increments by 6, taking advantage of the fact that all prime numbers greater than 6 can be written in the form 6k ± 1.
// there are even more advanced algorithms for primality testing, such as the Miller-Rabin algorithm, which is used for larger numbers where probabilistic primality testing is acceptable.



////////////////////////////////
// The use of sqrt in the algorithm is a common optimization for primality testing. When checking for divisors of a number n, you don't need to check divisibility by numbers larger than its square root.
// Here's why:

// Suppose n is not a prime number, and it has a divisor d such that 1 < d <= n. 
//If d is greater than the square root of n, then there must be another factor k such that k = n / d and 1 < k <= n. 
//If both d and k are greater than the square root of n, their product d * k would be greater than sqrt(n) * sqrt(n) = n, which contradicts the assumption that n has a divisor less than or equal to its square root.

// Therefore, if you check divisibility up to the square root of n, and you don't find any divisors, you can be confident that n is a prime number.

// By limiting the loop to iterate up to the square root of n, you significantly reduce the number of iterations needed, making the primality test more efficient. In the isPrime algorithm,
//the loop runs up to sqrt(n) + 1 to ensure that the square root is covered, 
//and it checks for divisibility by i and i + 2 in each iteration.




