class Solution {
    public boolean isPossible(int[] nums, long mid, int t){
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += mid / nums[i];
            if(sum >= t){
                return true;
            }
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long right = 0;
        for(int qa : time){
            right = Math.max(right, (long)qa*totalTrips);
        }

        while(left <= right){
            long mid = left + (right - left) / 2;
            if(isPossible(time, mid, totalTrips)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}