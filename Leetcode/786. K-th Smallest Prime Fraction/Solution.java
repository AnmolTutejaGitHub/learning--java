import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int ans[] = new int[2];
        ArrayList<Double> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                res.add((double) arr[i] / arr[j]);
            }
        }

        Collections.sort(res);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double curr = (double) arr[i] / arr[j];
                if (curr == res.get(k - 1)) {
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                }
            }
        }
        return ans;

    }
}
