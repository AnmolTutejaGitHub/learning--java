package Recursion;

// 'a'-'a'=0
//'b'-'a'=1
// 'c'-'a'=2
//'z'-'a'=25
// can use this for indexing of map array
// remove duplicte in string using recursion  : this code is for 'a' to 'z' only not 'A' or special chars
public class remove_duplicate_in_str {
    public static void main(String[] args) {
        removeDuplicates("aaabbbcccaaa", 0, new StringBuilder(""), new boolean[26]); // as total chars = 26
    } // abc

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {

        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // means currChar is duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

}
