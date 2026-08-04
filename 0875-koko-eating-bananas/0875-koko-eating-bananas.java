class Solution {
    public boolean canEat(int[] nums, int mid, int h){
        int hrs = 0;
        for(int i : nums){
            hrs += (i + mid - 1) / mid;
        }
        if(hrs <= h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int max = Integer.MIN_VALUE;
        for(int i : piles){
            max = Math.max(max, i);
        }
        int right = max;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(canEat(piles, mid, h)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}