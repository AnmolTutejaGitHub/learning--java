class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            StringBuilder a = new StringBuilder(arr[i]);
            ans.append(a.reverse()).append(" ");
        }
        return ans.toString().trim();
    }
}