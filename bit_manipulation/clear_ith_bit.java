package bit_manipulation;

// make ith bit 0
public class clear_ith_bit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1)); // 8
    }

}
