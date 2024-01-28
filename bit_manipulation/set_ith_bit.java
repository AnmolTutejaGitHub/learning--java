package bit_manipulation;

// setting ith bit (to 1)
public class set_ith_bit {
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(5, 3)); // 13
    }
}
