class Solution {
    public boolean isPossible(int[] arr, int mid, int t){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
              sum += (arr[i] + mid - 1) / mid;

            if (sum > t){
                return false;
            }
        }
        return sum <= t;
    }
    public int smallestDivisor(int[] nums, int t) {
        int n = nums.length;
        int left = 1;
        int right = 0;
        for(int num : nums){
            right = Math.max(right, num);
        }

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(nums, mid, t)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}