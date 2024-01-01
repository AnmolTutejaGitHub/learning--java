// sqrt algo for isPrime

public static boolean isPrime(int wholeNumber) {
    if (wholeNumber <= 1) {
        return false;
    }

    int sqrt = (int) Math.sqrt(wholeNumber); // Convert to int for comparison in the loop

    for (int divisor = 2; divisor <= sqrt; divisor++) {
        if (wholeNumber % divisor == 0) {
            return false;
        }
    }

    return true;
}


