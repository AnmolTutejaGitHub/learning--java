import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i))
                ans.add(i);
        }
        return ans;

    }

    public boolean isSelfDividing(int n) {
        int cpyn = n;
        int mod = 10;
        // boolean flag =
        while (cpyn != 0) {
            int rem = cpyn % 10;
            if (rem == 0)
                return false;
            // if(n%rem==0) flag = true ;
            if (n % rem != 0)
                return false;

            cpyn = cpyn / 10;
        }
        return true;
    }
}