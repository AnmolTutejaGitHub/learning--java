//package Leetcode.781. Rabbits in Forest;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<answers.length;i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            while(value>key+1){
                value-=(key+1);
                count+=key+1;
            }
            count+=(key+1);
        }
        return count;
    }
}
