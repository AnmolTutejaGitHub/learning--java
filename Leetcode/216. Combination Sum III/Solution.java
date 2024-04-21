//package Leetcode.216. Combination Sum III;

import java.util.ArrayList;
import java.util.List;

// class Solution {
//     public List<List<Integer>> combinationSum3(int k, int n) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         List<Integer> list = new ArrayList<>();
//         List<List<Integer>> ans = new ArrayList<>();
//         helper(0, n, arr, list, ans, k);
//         return ans;
//     }

//     public void helper(int idx, int target, int[] arr, List<Integer> list, List<List<Integer>> ans, int k) {
//         if (idx == arr.length) {
//             if (target == 0 && list.size() == k) {
//                 ans.add(new ArrayList(list));
//             }
//             return;
//         }

//         if (arr[idx] <= target) {
//             list.add(arr[idx]);
//             helper(idx + 1, target - arr[idx], arr, list, ans, k);
//             list.remove(list.size() - 1);
//         }
//         helper(idx + 1, target, arr, list, ans, k);
//     }
// }

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(1, n, list, ans, k);
        return ans;
    }

    public void helper(int idx, int target, List<Integer> list, List<List<Integer>> ans, int k) {
        if (target == 0 && list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i <= 9; i++) {
            list.add(i);
            helper(i + 1, target - i, list, ans, k);
            list.remove(list.size() - 1);
        }
    }
}
