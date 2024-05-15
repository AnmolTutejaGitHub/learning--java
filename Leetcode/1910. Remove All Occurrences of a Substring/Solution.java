// package Leetcode.1910. Remove All Occurrences of a Substring;
class Solution {
    public String removeOccurrences(String s, String part) {
        // StringBuilder ans = new StringBuilder();
        // Stack<Character> st = new Stack<>();
        // Queue<Character> temp = new LinkedList<>();
        // for(int i=0;i<s.length();i++){
        // char curr = s.charAt(i);
        // st.add(curr);
        // if(curr==part.charAt(part.length()-1)) {
        // int idx = part.length()-1;
        // temp.clear();
        // while(idx>=0 && !st.isEmpty()) {
        // if(st.peek()!=part.charAt(idx)){
        // temp.add(st.pop());
        // while(!temp.isEmpty()) st.add(temp.remove());
        // break;
        // }
        // temp.add(st.pop());
        // idx--;
        // }
        // if(idx>=0) while(!temp.isEmpty()) st.add(temp.remove());
        // }
        // }

        // while(!st.isEmpty()) ans.append(st.pop());
        // return ans.reverse().toString();

        while (s.indexOf(part) != -1)
            s = s.replaceFirst(part, "");
        return s;

    }
}
