//package Leetcode.1287. Element Appearing More Than 25% In Sorted Array;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int freq = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    freq++;
            }
            map.put(arr[i], freq);
        }

        int max = 0;
        int whosefreq = 0;
        // for(int ele : map.values()){
        // if(ele>max) {max = ele;
        // }
        // }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (max < value) {
                max = value;
                whosefreq = key;
            }
        }

        return whosefreq;
    }
}
