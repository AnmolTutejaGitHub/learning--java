//package Leetcode.1816. Truncate Sentence;

// class Solution {
//     public String truncateSentence(String s, int k) {
//         String[] arr = s.split(" ");
//         String ans = "";

//         for (int i = 0; i < k; i++) {
//             if (i == 0)
//                 ans += arr[i];
//             else
//                 ans += " " + arr[i];
//         }
//         return ans;

//     }
// }

class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < k; i++) {
            if (i == 0)
                ans.append(arr[i]);
            else
                ans.append(" ").append(arr[i]);
        }
        return ans.toString();

    }
}
