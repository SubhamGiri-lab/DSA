class Solution {
    public boolean canSplit(int[] arr, int mid, int k){
        int sum = 0;
        int count = 1;
        for(int i : arr){
            if(sum + i > mid){
                count++;
                sum = i;

                if(count > k){
                    return false;
                }
            }else{
                sum += i;
            }   
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        if(k > nums.length){
            return -1;
        }
        for(int i : nums){
            left = Math.max(left, i);
            right += i;
        }
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canSplit(nums, mid, k)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid+ 1;
            }
        }
        return ans;
    }
}