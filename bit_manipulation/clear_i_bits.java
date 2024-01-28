package bit_manipulation;

// clear i bits in java 
public class clear_i_bits {
    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
}
