//package Leetcode.2491. Divide Players Into Teams of Equal Skill;

import java.util.Arrays;

class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int s = 0;
        int e = skill.length - 1;
        long sum = 0;
        int commonSum = skill[s] + skill[e];

        while (s < e) {
            sum += skill[s] * skill[e];
            ;
            if (commonSum != skill[s] + skill[e])
                return -1;
            s++;
            e--;
        }
        return sum;
    }
}