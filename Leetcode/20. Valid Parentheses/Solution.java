//package Leetcode.20. Valid Parentheses;

// class Solution {
//     public boolean isValid(String s) {
//         boolean pass = true;
//         while (pass && s.length() != 0) {
//             pass = false;
//             if (s.contains("()")) {
//                 s = s.replace("()", "");
//                 pass = true;
//             }
//             if (s.contains("[]")) {
//                 s = s.replace("[]", "");
//                 pass = true;
//             }
//             if (s.contains("{}")) {
//                 s = s.replace("{}", "");
//                 pass = true;
//             }
//             if (!pass)
//                 break;
//         }
//         return s.length() == 0;
//     }
// }

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char prev;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty())
                    return false;

                prev = stack.pop();
                if (prev != '(')
                    return false;
            }

            else if (s.charAt(i) == '}') {
                if (stack.isEmpty())
                    return false;

                prev = stack.pop();
                if (prev != '{')
                    return false;
            }

            else if (s.charAt(i) == ']') {
                if (stack.isEmpty())
                    return false;

                prev = stack.pop();
                if (prev != '[')
                    return false;
            } else
                stack.push(s.charAt(i));
        }

        return stack.isEmpty();
    }
}
