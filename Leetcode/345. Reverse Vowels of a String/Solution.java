//package Leetcode.345. Reverse Vowels of a String;

class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;

        char str[] = s.toCharArray();

        while (i < j) {
            while (i < str.length
                    && (str[i] != 'a' && str[i] != 'e' && str[i] != 'i' && str[i] != 'o' && str[i] != 'u' &&
                            str[i] != 'A' && str[i] != 'E' && str[i] != 'I' && str[i] != 'O' && str[i] != 'U'))
                i++;

            while (j >= 0 && (str[j] != 'a' && str[j] != 'e' && str[j] != 'i' && str[j] != 'o' && str[j] != 'u' &&
                    str[j] != 'A' && str[j] != 'E' && str[j] != 'I' && str[j] != 'O' && str[j] != 'U'))
                j--;

            if (i <= j) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }

        String ans = new String(str);
        return ans;
    }
}
