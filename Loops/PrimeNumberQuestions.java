// 1) check whether a given number is prime or not 
//2) print prime nos. between two numbers 
//3) print next prime number

public class PrimeNumberQuestions {

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void PrimeRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static int nextPrime(int a) {
        int i = a + 1;
        // boolean found = false;
        while (true) {
            if ((isPrime(i))) {
                // found = true;
                return i;
            }
            i++;
        }
        // return i;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3)); // true
        System.out.println(isPrime(97)); // true
        System.out.println(isPrime(68));// false

        PrimeRange(0, 100);

        System.out.println(nextPrime(89));

    }
}
