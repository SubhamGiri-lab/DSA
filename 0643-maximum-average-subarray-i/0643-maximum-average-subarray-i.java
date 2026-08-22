class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winSum = 0;
        for(int i = 0; i < k; i++){
            winSum += nums[i];
        }
        int maxSum = winSum;
        for(int i = k; i < nums.length; i++){
            winSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, winSum);
        }
        return (double)maxSum / k;
    }
}