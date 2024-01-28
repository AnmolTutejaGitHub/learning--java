package bit_manipulation;

// update ith bit 
public class update_ith_bit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {

        if (newBit == 0)
            return clearIthBit(n, i);
        else
            return setIthBit(n, i);
    }

    // another approach to update ith bit (although same time complexity)
    public static int updateIthBit2ndMethod(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {

    }

}
