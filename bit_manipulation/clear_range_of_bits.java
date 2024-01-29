package bit_manipulation;
// clear range of bits

public class clear_range_of_bits {

    public static void main(String[] args) {

    }

    public static int clearIBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;

        int bitMask = a | b;

        return n & bitMask;
    }
}
