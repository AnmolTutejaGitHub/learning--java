package bit_manipulation;

// count set bits 
public class count_set_bits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check out LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
