class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        int n = nums.length;
        int count = 0;
        while(j < n){
            if(i == j){
                j++;
                continue;
            }
            int num = Math.abs(nums[i] - nums[j]);
            if(num == k){
                count++;
                while(i + 1 < n && nums[i] == nums[i + 1]){
                    i++;
                }
                while(j < n - 1 && nums[j] == nums[j + 1]){
                    j++;
                }
                i++;
                j++;
            }else if(num < k){
                j++;
            }else{
                i++;
            }
        }
        return count;
    }
}