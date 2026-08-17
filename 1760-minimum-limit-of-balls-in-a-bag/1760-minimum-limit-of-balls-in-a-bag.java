class Solution {
    public boolean isPossible(int[] nums,int mid,int m){
        int operation = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > mid){
                operation += (nums[i] - 1)/ mid;
            }
            if(operation > m){
                return false;
            }
        }
        return operation <= m;
    }
    public int minimumSize(int[] nums, int m) {
        int left = 1;
        int right = 0;
        for(int num : nums){
            right = Math.max(right, num);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(nums, mid, m)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}