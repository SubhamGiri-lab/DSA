class Solution {
    public boolean isPossible(int[] nums, long mid, long k){
        long count = 0;
        for(int i = 0; i < nums.length; i++){
            count += (long)nums[i] / mid;
        }
        return count >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        long left = 0;
        long sum = 0;
        for(int can : candies){
            sum += can;
        }
        long right = sum / k;
        while(left < right){
            long mid = left + (right - left + 1) / 2;
            if(isPossible(candies, mid, k)){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return (int)left;
    }
}