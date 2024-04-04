//package Leetcode.1614. Maximum Nesting Depth of the Parentheses;

class Solution {
    public int maxDepth(String s) {
        // Stack<Character> st = new Stack<>();
        // int count = 0;
        // for(char ch : s.toCharArray()){
        // if(ch=='(') st.push('(');
        // else if (ch==')') {
        // count = Math.max(count,st.size());
        // st.pop();
        // }
        // }
        // return count;

        int count = 0;
        int maxCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                count++;
            else if (ch == ')')
                count--;

            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
