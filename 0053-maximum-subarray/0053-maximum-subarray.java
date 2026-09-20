class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ms=Math.max(ms,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ms;
    }
}