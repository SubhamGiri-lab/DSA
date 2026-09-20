class Solution {
    public int search(int[] nums, int target) {
        int idx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(target == nums[i]){
                idx = i;
                return idx;
            }
        }
        return idx;
    }
}