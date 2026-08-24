class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] frq = new int[50001];
        int[] first = new int[50001];
        int[] last = new int[50001];

        int degree = 0;
        for(int i = 0; i < nums.length; i++){
            if(frq[nums[i]] == 0){
                first[nums[i]] = i;
            }
            frq[nums[i]]++;
            last[nums[i]] = i;
            degree = Math.max(degree, frq[nums[i]]);
        }
        int minLen = nums.length;
        for(int i = 0; i <= 50000; i++){
            if(frq[i] == degree){
                minLen = Math.min(minLen, last[i] - first[i] + 1);
            }
        }
        return minLen;
    }
}