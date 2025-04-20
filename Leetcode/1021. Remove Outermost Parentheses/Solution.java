//package Leetcode.1021. Remove Outermost Parentheses;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(count>0) res.append(ch);
                count++;
            }else if(ch==')'){
                count--;
                if(count>0) res.append(ch);
            }
        }
        return res.toString();
    }
}