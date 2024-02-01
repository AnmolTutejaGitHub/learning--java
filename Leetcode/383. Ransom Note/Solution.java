//package Leetcode.383. Ransom Note;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder rn = new StringBuilder(ransomNote);
        StringBuilder mg = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            boolean found = false;
            for (int j = 0; j < magazine.length(); j++) {
                if (mg.charAt(j) == rn.charAt(i)) {
                    found = true;
                    rn.setCharAt(i, '1');
                    mg.setCharAt(j, '2');
                    break;
                }
            }
            if (!found)
                return false;
        }

        return (rn.toString().equals("1".repeat(rn.length())));

    }
}
