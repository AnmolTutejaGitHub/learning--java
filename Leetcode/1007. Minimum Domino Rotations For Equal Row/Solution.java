//package Leetcode.1007. Minimum Domino Rotations For Equal Row;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        HashMap<Integer,Integer> freq_t = new HashMap<>();
        HashMap<Integer,Integer> freq_b = new HashMap<>();

        for(int i : tops){
            freq_t.put(i,freq_t.getOrDefault(i,0)+1);
        }

        for(int i : bottoms){
            freq_b.put(i,freq_b.getOrDefault(i,0)+1);
        }


        int freq_T_value = 0;
        int freq_T_key = 0;

        for(Map.Entry<Integer,Integer> entry : freq_t.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value>freq_T_value){
                freq_T_key  = key;
                freq_T_value = value;
            }
        }

        int freq_B_value = 0;
        int freq_B_key = 0;

        for(Map.Entry<Integer,Integer> entry : freq_b.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value>freq_B_value){
                freq_B_key  = key;
                freq_B_value = value;
            }
        }

        int freqArr = 0;
        int freq_ele = 0;

        int freq_value = 0;

        if(freq_T_value>freq_B_value){
            freq_ele = freq_T_key;
            freq_value = freq_T_value;
        }else{
            freq_ele = freq_B_key;
            freqArr = 1;
            freq_value = freq_B_value;
        }

        int count = 0;
        
        for(int i=0;i<tops.length;i++){
            if(freqArr==0){
                if(bottoms[i]==freq_ele && bottoms[i]!=tops[i]) count++;
            }else{
                if(tops[i]==freq_ele && tops[i]!=bottoms[i]) count++;
            }
        }

        if(freq_T_value==tops.length || freq_B_value==bottoms.length) return 0;
        if(freq_value + count < tops.length) return -1;
        if(count==0) return -1;
        return count;

    }
}
