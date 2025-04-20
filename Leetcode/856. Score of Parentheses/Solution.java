//package Leetcode.856. Score of Parentheses;
import java.util.*;
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            String ch = ""+s.charAt(i);

            if(ch.equals("(")) st.push("(");

            else if(ch.equals(")")){

                if(st.peek().equals("(")){
                    st.pop();
                    st.push("1");
                }

                else if(st.peek().equals(")")) st.push(")");

                else {
                    int innersum = 0;
                    while(isInteger(st.peek())){
                        innersum+=Integer.valueOf(st.peek());
                        st.pop();
                    }
                    st.pop();
                    st.push(""+2*innersum);
                }
            }
        }

        int score = 0;
        while(!st.isEmpty()){
            score+=Integer.valueOf(st.pop());
        }
        return score;
    }

    public boolean isInteger(String s){
    return !s.equals("(") && !s.equals(")");
    }
}