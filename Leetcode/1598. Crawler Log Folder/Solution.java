//package Leetcode.1598. Crawler Log Folder;

class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (depth == 0)
                    continue;
                depth--;
            } else if (!logs[i].equals("./"))
                depth++;
        }
        return depth;
    }
}
