//package Leetcode.2660. Determine the Winner of a Bowling Game;
class Solution {
    public int isWinner(int[] player1, int[] player2) {

        int sum1 = 0;

        boolean found1 = false;
        int count1 = 0;
        for (int i = 0; i < player1.length; i++) {
            // if(player1[i-1]==10 || player2[i-2]==10) wasperv=true;
            // if(player1[i]==10 ) count1++;
            // if(player1[i]==10 && count1==1) {found1 = true;
            // // count1++;
            // sum1+=player1[i]; continue;}

            // if(found1 && wasprev) sum1+=2*player1[i];
            // else sum1+=player1[i];
            boolean wasprev1 = false;
            if (i - 1 == 0 && (player1[i - 1] == 10))
                wasprev1 = true;
            if (i - 1 >= 0 && i - 2 >= 0 && (player1[i - 1] == 10 || player1[i - 2] == 10))
                wasprev1 = true;
            if (player1[i] == 10)
                count1++;
            if (wasprev1)
                sum1 += 2 * player1[i];
            else
                sum1 += player1[i];

        }

        int sum2 = 0;
        int count2 = 0;
        boolean found2 = false;
        for (int i = 0; i < player2.length; i++) {
            // if(player2[i]==10 && count2==0) {found2 = true;
            // sum2+=player2[i];
            // count2++;
            // continue;}

            // if(found2) sum2+=2*player2[i];
            // else sum2+=player2[i];

            boolean wasprev2 = false;
            if (i - 1 == 0 && (player2[i - 1] == 10))
                wasprev2 = true;
            else if (i - 1 >= 0 && i - 2 >= 0 && (player2[i - 1] == 10 || player2[i - 2] == 10))
                wasprev2 = true;
            if (player2[i] == 10)
                count2++;
            if (wasprev2)
                sum2 += 2 * player2[i];
            else
                sum2 += player2[i];
        }

        if (sum1 == sum2)
            return 0;

        return sum1 > sum2 ? 1 : 2;
    }
}
