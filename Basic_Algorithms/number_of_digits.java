package Basic_Algorithms;

// number of digits in a number (optimised)
public class number_of_digits {
    public static void main(String[] args) {
        int n = 89;
        System.out.println((int) Math.log10(n) + 1); // 2 // number of digits

        // if want no. of digits in binary representation of n use log2 instead for
        // octal use log8

    }
}
