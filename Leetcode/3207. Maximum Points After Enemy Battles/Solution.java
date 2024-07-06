//package Leetcode.3207. Maximum Points After Enemy Battles;

import java.util.*;

class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        Arrays.sort(enemyEnergies);
        long points = 0;

        int i = 0;
        int j = enemyEnergies.length - 1;
        while (i <= j) {
            if (currentEnergy >= enemyEnergies[i]) {
                // currentEnergy -= enemyEnergies[i];
                // points++;
                points += currentEnergy / enemyEnergies[i];
                currentEnergy = currentEnergy % enemyEnergies[i];
            }
            if (points != 0) {
                currentEnergy = currentEnergy + enemyEnergies[j];
                j--;
            }
            if (points == 0)
                break;
        }
        return points;
    }
}
