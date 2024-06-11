//package Leetcode.1122. Relative Sort Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++)
            map.put(arr2[i], i);
        Integer[] arr = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++)
            arr[i] = arr1[i];
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int comp = 0;
                if (map.containsKey(a) && map.containsKey(b))
                    comp = Integer.compare(map.get(a), map.get(b));
                else if (!map.containsKey(a) && !map.containsKey(b))
                    comp = Integer.compare(a, b);
                else if (map.containsKey(a) && !map.containsKey(b))
                    return -1;
                else if (!map.containsKey(a) && map.containsKey(b))
                    return 1;

                return comp;
            }
        });
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = arr[i];
        return arr1;
    }
}
