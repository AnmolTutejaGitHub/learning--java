import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int i = 0;
        List<Boolean> res = new ArrayList<>();

        while (i < l.length) {
            // nums[l[i]] --> nums[r[j]] arithmetic or not
            res.add(isArithmetic(l[i], r[i], nums));
            i++;
        }
        return res;
    }

    public boolean isArithmetic(int s, int e, int[] nums) {
        // An = Ao + (n-1)d
        int[] arr = new int[e - s + 1];
        for (int i = 0; i < arr.length; i++)
            arr[i] = nums[s++];
        Arrays.sort(arr);
        int d = arr[1] - arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i + 1] - arr[i] != d)
                return false;
        }
        return true;
    }
}