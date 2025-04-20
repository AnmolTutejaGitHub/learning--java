//package Leetcode.556. Next Greater Element III;

import java.util.Arrays;

class Solution {
    public int nextGreaterElement(int n) {
        int [] arr = new int[(n+"").length()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i] = n%10;
            n=n/10;
        }
        return  nextPermutation(arr);
    }

    public int nextPermutation(int []arr){
        int pivot = -1;
        for(int i=arr.length-1;i>=0;i--){
            if(i+1<arr.length && arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1) return -1;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        Arrays.sort(arr,pivot+1,arr.length);
        long res = 0;
        for (int i : arr) {
            res = res * 10 + i;
        }
        if(res>Integer.MAX_VALUE) return -1;
        return (int)res;
    }

    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
