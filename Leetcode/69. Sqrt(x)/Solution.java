//package Leetcode.69. Sqrt(x);

class Solution {
    public int mySqrt(int x) {
        if (x <= 1)
            return x;
        // int [] arr = new int [x/2 +1];

        // for(int i=0;i<arr.length;i++){
        // arr[i]=i;
        // }

        long start = 0;
        long end = x - 1;
        while (start <= end) {
            long mid = start + (end - start) / 2;

            // mid * mid is overflowing for int so use long
            if (mid * mid == x)
                return (int) mid;
            else if (mid * mid > x)
                end = mid - 1;
            else if (mid * mid < x && (mid + 1) * (mid + 1) > x)
                return (int) mid;
            else if (mid * mid < x)
                start = mid + 1;
        }

        return -1;
    }
}
