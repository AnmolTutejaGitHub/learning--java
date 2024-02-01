//package Leetcode.670. Maximum Swap;

// I don't know how I made this fuckin code work . despite getting intution to solve this with two pointers approach 

class Solution {
    public int maximumSwap(int num) {

        char[] charr = ("" + num).toCharArray();
        int[] arr = new int[charr.length];

        for (int i = 0; i < charr.length; i++) {
            arr[i] = Integer.parseInt("" + charr[i]);
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < maxIndex; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        if (minIndex != -1 && max != arr[0]) {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[0];
            arr[0] = temp;
        }

        else if (max == arr[0]) {
            max = Integer.MIN_VALUE;
            maxIndex = -1;

            int a;
            for (a = 1; a < arr.length; a++) {
                if (a + 1 < arr.length && arr[a] != arr[a + 1])
                    break;
            }
            System.out.println(a);

            for (int i = a + 1; i < arr.length; i++) {
                if (max <= arr[i]) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            min = Integer.MAX_VALUE;
            minIndex = -1;

            for (int i = 0; i < maxIndex; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }

            }

            if (minIndex != -1) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans * 10 + arr[i];
        }

        return ans > num ? ans : num;
    }

}
// intution :
// max from rhs
// min indexed
// max > min indexed
