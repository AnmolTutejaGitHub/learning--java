// class Solution {
//     public int[] frequencySort(int[] nums) {
//         // HashMap<Integer,Integer> freq = new HashMap<>();
//         int[] freqs = new int[nums.length];

//         for (int i = 0; i < nums.length; i++) {
//             int count = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) { // freq.put(nums[i],count);
//                     count++;
//                 }
//             }
//             freqs[i] = count;
//         }
//         // for(int i=0;i<freqs.length;i++){
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 if (j + 1 < nums.length && i + 1 < nums.length && freqs[j] > freqs[j + 1]) {

//                     int temp2 = freqs[j];
//                     freqs[j] = freqs[j + 1];
//                     freqs[j + 1] = temp2;

//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;

//                 }

//                 if (j + 1 < nums.length && freqs[j] == freqs[j + 1]) {
//                     if (nums[j] < nums[j + 1]) {

//                         int temp4 = freqs[j];
//                         freqs[j] = freqs[j + 1];
//                         freqs[j + 1] = temp4;

//                         int temp3 = nums[j];
//                         nums[j] = nums[j + 1];
//                         nums[j + 1] = temp3;

//                     }
//                 }

//             }
//         }
//         return nums;
//     }

// }

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] frequencySort(int[] nums) {
        int freq[] = new int[202];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0)
                freq[nums[i]]++;
            else
                freq[100 + Math.abs(nums[i])]++;
        }

        Integer arr[] = new Integer[nums.length];
        int i = 0;
        for (int n : nums) {
            arr[i++] = n;
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int freqA = a >= 0 ? freq[a] : freq[100 + Math.abs(a)];
                int freqB = b >= 0 ? freq[b] : freq[100 + Math.abs(b)];
                if (freqA != freqB)
                    return freqA - freqB;
                else
                    return b - a;
            }
        });

        int j = 0;
        for (int n : arr)
            nums[j++] = n;
        return nums;
    }
}