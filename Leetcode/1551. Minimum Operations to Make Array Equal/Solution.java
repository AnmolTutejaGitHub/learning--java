class Solution {
    public int minOperations(int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=(2*i)+1;
        }
        int mean = sum/n;
        int deviations = 0;

        for(int i=0;i<n;i++){
            int curr = (2*i)+1;
            deviations+=Math.abs(curr-mean);
        }
        return deviations/2;
    }
}