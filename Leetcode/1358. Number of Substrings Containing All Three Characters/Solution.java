class Solution {
    public int numberOfSubstrings(String s) {
        int arr[] = { -1, -1, -1 };
        int count = 0;

        for (int end = 0; end < s.length(); end++) {
            arr[s.charAt(end) - 'a'] = end;
            if (arr[0] != -1 && arr[1] != -1 && arr[2] != -1) {
                count += Math.min(arr[0], Math.min(arr[1], arr[2])) + 1;
            }
        }
        return count;
    }
}