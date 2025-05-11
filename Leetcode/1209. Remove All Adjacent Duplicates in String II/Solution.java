//package Leetcode.1209. Remove All Adjacent Duplicates in String II;

import java.util.Stack;

class Pair{
    char ch;
    int count;
    Pair(char ch,int count){
        this.ch = ch;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(!st.isEmpty() && st.peek().ch==curr){
                st.peek().count++;
                if(st.peek().count==k) st.pop();
            }else st.push(new Pair(curr,1));
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(String.valueOf(st.peek().ch).repeat(st.pop().count));

        return sb.reverse().toString();
    }
}
